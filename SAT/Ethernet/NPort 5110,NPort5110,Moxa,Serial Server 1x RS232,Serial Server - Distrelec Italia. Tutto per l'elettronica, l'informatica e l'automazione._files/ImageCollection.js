scripts.provide("ch.imis.ishop.js.ImageCollection");
scripts.require("ch.imis.ishop.js.util");

/**
 * Create ImageCollection
 * @param viewId id of image tag which needs to be changed
 * @param controlId	id of div where navigation needs to be placed
 * @param titleId id of div where title needs to be placed. If not set, no title will be shown.
 * @param enableZoom enable zoom feature
 * @param enableArrows enable arrow navigation feature
 * @return
 */
function ImageCollection(viewId, controlId, titleId, enableZoom, enableArrows)
{
	this.view = getElmById(viewId);
	this.viewId = viewId;

	this.control = getElmById(controlId)
	this.controlId = controlId;
	
	this.title = getElmById(titleId)
	this.titleId = titleId;
	
	this.enableZoom = enableZoom;
	this.enableArrows = enableArrows;

	this.images = new Array();

	// number of images per page
	this.pageCount = 10;
	this.curImage = 1;

	this.handles = new Array();
}

/**
 * Add picture to collection
 */
ImageCollection.prototype.add = function(src, title, zoom)
{
	this.images.push({"src":src, "title":title, "alt":title, "zoom":zoom});
}

/**
 * Add picture to collection at beginning
 */
ImageCollection.prototype.addFront = function(src, title, zoom)
{
	this.images = this.images.reverse();
	this.images.push({"src":src, "title":title, "alt":title, "zoom":zoom});
	this.images = this.images.reverse();
}

ImageCollection.prototype.getIndices = function()
{
	var ret = new Array();
	
	// show arrows for navigation
	if(this.enableArrows)
	{
		// links to jump to first or previous image
		ret.push("F");	// first
		ret.push("P");	// previous
		
		// create image number links
		var pageNr = Math.ceil(this.curImage / this.pageCount - 1);
		for(i = pageNr * this.pageCount + 1; i < this.curImage; ++i)
		{
			ret.push(i);
		}
		ret.push(this.curImage);
		for(i = (this.curImage + 1); (ret.length - 2) < this.pageCount && i <= this.images.length; ++i)
		{
			ret.push(i);
		}
		
		// links to jump to next or last image
		ret.push("N");	// next
		ret.push("L");	// last
	}
	else // only show numbers (no arrows)
	{
		var i;
		for(i = 0; i < this.images.length; ++i)
		{
			ret.push(i+1);
		}
	}

	return ret;
}

ImageCollection.prototype.wrapAction = function(functionName, param)
{
	var _this = this;
	return function()
	{
		eval("_this."+functionName+"("+param+")");
		return false;
	}
}

ImageCollection.prototype.buildZoom = function()
{
	/*
	<a href="javascript:picV('{$prodImgPath}', 650, 420)">
		<img src="/ishop/Images/Application/search.gif" border="0"/>
	</a>
	*/
	if(this.enableZoom)
	{
		var zoomLink = document.createElement("a");
		zoomLink.style.margin = "5px";
		zoomLink.setAttributeNode(
				attr("href","javascript:picV('"+this.images[this.curImage-1].zoom+"',650,420);"));
		zoomLink.innerHTML = "<img src=\"/ishop/Images/Application/search.gif\" border=\"0\"/>";
		this.control.appendChild(zoomLink);
		this.handles.push(zoomLink);
	}
}

ImageCollection.prototype.buildTitle = function()
{
	if(this.title != null)
	{
		this.title.innerHTML = this.view.title;
	}
}

ImageCollection.prototype.build = function()
{
	var i;
	for(i = this.handles.length; i > 0; --i)
	{
		var elm = this.handles.pop();
		this.control.removeChild(elm);
	}

	var imgIdx = this.getIndices();

	for(i = 0; i < imgIdx.length; ++i)
	{
		var link = document.createElement("a");
		link.style.margin = "5px";
		if(imgIdx[i] == "P")	// previous
		{
			if(this.curImage > 1)
			{
				link.setAttributeNode(attr("href", "#"));
				link.onclick = this.wrapAction("go", this.curImage - 1);
			}
			link.innerHTML = "<";
		}
		else if(imgIdx[i] == "N")	// next
		{
			if(this.curImage < this.images.length)
			{
				link.setAttributeNode(attr("href", "#"));
				link.onclick = this.wrapAction("go", this.curImage + 1);
			}
			link.innerHTML = ">";
		}
		else if(imgIdx[i] == "L")	// last
		{
			if(this.curImage < this.images.length)
			{
				link.setAttributeNode(attr("href", "#"));
				link.onclick = this.wrapAction("go", this.images.length);
			}
			link.innerHTML = ">>";
		}
		else if(imgIdx[i] == "F")	// first
		{
			if(this.curImage > 1)
			{
				link.setAttributeNode(attr("href", "#"));
				link.onclick = this.wrapAction("go", 1);
			}
			link.innerHTML = "<<";
		}
		else
		{
			if(imgIdx[i] != this.curImage)
			{
				link.setAttributeNode(attr("href", "#"));
				link.onclick = this.wrapAction("go", imgIdx[i]);
			}
			link.innerHTML = ""+imgIdx[i];
		}
		this.control.appendChild(link);
		this.handles.push(link);
	}
	
	this.buildZoom();
	this.buildTitle();
}

/**
 * Make sure text size is ok
 * @param text
 */
ImageCollection.prototype.fitText = function(text)
{
    var max=69;
    if(text.length > max)
        text = text.substr(0,max-2)+"...";
    return text;
}

/**
 * Show image of given number and adjust navigation
 */
ImageCollection.prototype.go = function(imageNr)
{
    if(this.images.length < 1)
    {
        return;
    }
    imageNr = ((imageNr-1) % this.images.length)+1;
	this.view.src = this.images[imageNr-1].src;
	this.view.title = this.fitText(this.images[imageNr-1].title);
	this.view.alt = this.fitText(this.images[imageNr-1].alt);
	
	if(this.enableZoom)
	{
		var _this = this;
		this.view.onclick = function() {
			picV(_this.images[imageNr-1].zoom,650,420);
		};
		this.view.style.cursor = "pointer";
	}

	this.curImage = imageNr;
	this.build();
}