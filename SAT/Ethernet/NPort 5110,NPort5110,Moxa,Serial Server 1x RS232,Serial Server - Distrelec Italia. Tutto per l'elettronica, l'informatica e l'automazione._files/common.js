var HEADER_HEIGHT = 58;

    // various positioning of content elements for Internet Explorer
    function setContentDiv()
	{
		if(navigator.userAgent.indexOf("MSIE") > -1)
		{
			var cnt = document.getElementById("contentarea");
			var sdb = document.getElementById("sidebar");
			// var ch = document.body.scrollHeight;
			var ch = document.body.clientHeight;
			// set sidebar height.
			sdb.style.height = (ch - (HEADER_HEIGHT + 6)) + "px";
			
			if(cnt)
			{
				cnt.style.height = (ch - (HEADER_HEIGHT + 6)) + "px";
			}
			
			var pcn = document.getElementById("productcontainer");
			if(pcn)
			{
				var pva = document.getElementById("productviewarea");
				var pta = document.getElementById("producttablearea");
				var ptb = document.getElementById("producttable");
			
				var cnth = ch - (HEADER_HEIGHT + 6) - 26 - 32;
				// alert("containerheight to use: " + cnth);
				pcn.style.height = cnth + "px";
				var pvah = Math.ceil( cnth / 2);
				var ptah = Math.floor( cnth / 2);
				pva.style.height = pvah + "px";
				pta.style.height = ptah + "px";
				ptb.style.height = (ptah - 32) + "px";
			}
			// orderlist content area resizing
			var olc = document.getElementById("orderlistContentContainer");
			if(olc)
			{
				var cnth = ch - (HEADER_HEIGHT + 6) - 110 - 80;
				olc.style.height = cnth + "px";
			}
			// search result content area resizing
			var stc = document.getElementById("searchResultContainer");
			if(stc)
			{
				var cnth = ch - (HEADER_HEIGHT + 6) - 60 - 40;
				stc.style.height = cnth + "px";
			}
		}
	}
	
	// add an OnResize handler for Internet Explorer to reposition content elements
	if(navigator.userAgent.indexOf("MSIE") > -1)
	{
		window.onresize=setContentDiv;
	}
	
	// show and hide the debug information layer.
	function showHideDebug()
	{
		var dbg = document.getElementById("debug");
		if(dbg.style.display == 'none')
		{
			dbg.style.display = '';
		}
		else
		{
			dbg.style.display = 'none';
		}
	}
    
    // create an email link...
    function emailLink(name, domain, tld)
    {
    	var atchar = "@";
    	var dotchar = ".";
    	document.location = "mail" + "to:" + name + atchar + domain + dotchar + tld;
    }
    
    
    // make silly browsers work as well (M$)
    function setDispatch(formName, dispatch)
    {
  		document.forms[formName].dispatch.value = dispatch;  
    }
    
    function setDispatchById(dispatchId, dispatch)
    {
    	document.getElementById(dispatchId).value = dispatch;
	    return document.getElementById(dispatchId);
    }
    
    // opens the disclaimer in a new window
    function disclaimer()
	{
		window.open("/ishopWebFront/disclaimer.do","list_window",'top=80,left=80,width=734,height=500,toolbar=0,location=0,directories=0,status=0,menubar=1,scrollbars=1,resizable=0');
	}
    
    // requests to add a bookmark
    function addBookmark(url, title)
    {
    	if(navigator.userAgent.indexOf("MSIE") > -1)
    	{
    		window.external.AddFavorite(url, title);
    	}
    }
	
	// displays warning message that search is in progress
	// and copies search phrase to hidden field (to disable
	// search input field)
	function prepareSearch(searchForm, msgId) {    
    	document.getElementById(msgId).style.display='inline';
		searchForm['phrase'].value=searchForm['phraseInput'].value;
	  	searchForm['phraseInput'].disabled=true;
	}
	
	// displays warning message that search is in progress
	// and copies search phrase to hidden field (to disable
	// search input field)
	function prepareLuceneSearch(searchForm, msgId) {
    	document.getElementById(msgId).style.display='inline';
    	if(searchForm['artnrPhraseInput'].value != searchForm['artnrPhraseInput'].title) // copy only if the user entered something
    	{
			searchForm['artnrPhrase'].value=searchForm['artnrPhraseInput'].value;
		}
		else
		{
			searchForm['artnrPhrase'].value='';
		}		
	  	searchForm['artnrPhraseInput'].disabled=true;
	  	
    	if(searchForm['typePhraseInput'].value != searchForm['typePhraseInput'].title) // copy only if the user entered something
    	{
			searchForm['typePhrase'].value=searchForm['typePhraseInput'].value;
		}
		else
		{
			searchForm['typePhrase'].value='';
		}		
	  	searchForm['typePhraseInput'].disabled=true;

    	if(searchForm['vendorPhraseInput'].value != searchForm['vendorPhraseInput'].title) // copy only if the user entered something
    	{
			searchForm['vendorPhrase'].value=searchForm['vendorPhraseInput'].value;
		}
		else
		{
			searchForm['vendorPhrase'].value='';
		}		
	  	searchForm['vendorPhraseInput'].disabled=true;

    	if(searchForm['keywordPhraseInput'].value != searchForm['keywordPhraseInput'].title) // copy only if the user entered something
    	{
			searchForm['keywordPhrase'].value=searchForm['keywordPhraseInput'].value;
		}
		else
		{
			searchForm['keywordPhrase'].value='';
		}		
	  	searchForm['keywordPhraseInput'].disabled=true;
	}

    function prepareKplusLuceneSearch(searchForm, msgId) {
        document.getElementById(msgId).style.display='inline';

	    if(searchForm['typePhraseInput'].value != searchForm['typePhraseInput'].title)
	    {
            searchForm['typePhrase'].value=searchForm['typePhraseInput'].value;
	    }
	    else
	    {
		    searchForm['typePhrase'].value='';
	    }
	  	searchForm['typePhraseInput'].disabled=true;

	    searchForm['vendorPhrase'].value = searchForm['vendorPhraseInput'].value;
	    searchForm['vendorPhraseInput'].disabled=true;
    }

	
	function prepareExtendedLuceneSearch(searchForm, msgId, type) {
		if(!type)
		{
			type = 'keyword';
			if(searchForm['artnrPhraseInput'].value != searchForm['artnrPhraseInput'].title)
			{
				type = 'artnr';
			}
			else if(searchForm['typePhraseInput'].value != searchForm['typePhraseInput'].title)
			{
				type = 'type';
			}
			else if(searchForm['vendorPhraseInput'].value != searchForm['vendorPhraseInput'].title)
			{
				type = 'vendor';
			}
		}
		
    	document.getElementById('artnr'+msgId).style.display='inline';
    	document.getElementById('type'+msgId).style.display='inline';
    	document.getElementById('vendor'+msgId).style.display='inline';
    	document.getElementById('keyword'+msgId).style.display='inline';
    	
    	if(searchForm['artnrPhraseInput'].value != searchForm['artnrPhraseInput'].title && type == 'artnr') // copy only if the user entered something
    	{
			searchForm['artnrPhrase'].value=searchForm['artnrPhraseInput'].value;
		}
		else
		{
			searchForm['artnrPhrase'].value='';
		}		
	  	searchForm['artnrPhraseInput'].disabled=true;
	  	
    	if(searchForm['typePhraseInput'].value != searchForm['typePhraseInput'].title && type == 'type') // copy only if the user entered something
    	{
			searchForm['typePhrase'].value=searchForm['typePhraseInput'].value;
		}
		else
		{
			searchForm['typePhrase'].value='';
		}		
	  	searchForm['typePhraseInput'].disabled=true;

    	if(searchForm['vendorPhraseInput'].value != searchForm['vendorPhraseInput'].title && type == 'vendor') // copy only if the user entered something
    	{
			searchForm['vendorPhrase'].value=searchForm['vendorPhraseInput'].value;
		}
		else
		{
			searchForm['vendorPhrase'].value='';
		}		
	  	searchForm['vendorPhraseInput'].disabled=true;

    	if(searchForm['keywordPhraseInput'].value != searchForm['keywordPhraseInput'].title && type == 'keyword') // copy only if the user entered something
    	{
			searchForm['keywordPhrase'].value=searchForm['keywordPhraseInput'].value;
		}
		else
		{
			searchForm['keywordPhrase'].value='';
		}		
	  	searchForm['keywordPhraseInput'].disabled=true;
	}

	// displays warning message that search is in progress
	// and copies search phrase to hidden field (to disable
	// search input field)
	function prepareLuceneFilter(searchForm, msgId) {    
    	document.getElementById(msgId).style.display='inline';
    	if(searchForm['filterPhraseInput'].value != searchForm['filterPhraseInput'].lastvalue && searchForm['filterPhraseInput'].value != searchForm['filterPhraseInput'].title) // copy only if the user entered something
    	{
			searchForm['filterPhraseInput'].lastvalue = searchForm['filterPhraseInput'].value;
			searchForm['filterPhrase'].value += " "+searchForm['filterPhraseInput'].value;
    	}
	  	searchForm['filterPhraseInput'].disabled=true;

		searchForm['filterVendor'].value=searchForm['filterVendorInput'].value;
    	searchForm['filterVendorInput'].disabled=true;
	}
	
	
	// select all text only if box has been edited
	function selectText(textBox, title)
	{
		if(textBox.value == title)
		{
			textBox.select();
		}
	}
	
	// manually submits the form if the browser is IE
	// and enter gets pressed
	function submitOnEnter(e, caller, addAction)
	{
		if(window.event) // only available in IE
		{
			if(window.event.keyCode == 13)
			{
				if(addAction)
				{
					eval(addAction);
				}
				caller.form.submit();
				return false;
			}
		}
		return true;
	}
	
	///////////////////////////////////////////////////////////////
	// Paging for lucene search page numbers
	///////////////////////////////////////////////////////////////
	function getElmById(id)
	{
		if(document.getElementById)
		{
			return document.getElementById(id);
		}
		else if(document.all)
		{
			return document.all[id];
		}
		else
		{
			return false;
		}
	}
	
	function initPaging(parentId,curItem,pageSize)
	{
		var hnd = new Array();
		hnd.parent = getElmById(parentId);
		hnd.pageSize = pageSize;
		hnd.curPage = Math.round((curItem-1)/pageSize-0.5)+1; // round down
		goPage(hnd);
		return hnd;
	}
	
	function goPage(hnd)
	{
		var start = (hnd.curPage-1)*hnd.pageSize;
		var end = start + hnd.pageSize;
		for(i=0,ce=0; i < hnd.parent.childNodes.length; i++)
		{
			var elm = hnd.parent.childNodes[i];
			if(elm.nodeType == 1) // is element node
			{
				if(ce >= start && ce < end)
				{
					elm.style.display = 'inline';
				}
				else
				{
					elm.style.display = 'none';
				}
				ce++;
			}
		}
		updatePagerControls(hnd);
	}
	
	function nextPage(hnd)
	{
		hnd.curPage++;
		goPage(hnd);
	}
	
	function prevPage(hnd)
	{
		hnd.curPage--;
		goPage(hnd);
	}
	
	function updatePagerControls(hnd)
	{
		if(hnd.nextElm && hnd.prevElm)
		{
			if((hnd.pageSize * hnd.curPage+1) > hnd.nrElements)
			{
				hnd.nextElm.style.display='none';
			}
			else
			{
				hnd.nextElm.style.display='inline';
			}
			
			if(hnd.curPage <= 1)
			{
				hnd.prevElm.style.display = 'none';
			}
			else
			{
				hnd.prevElm.style.display = 'inline';
			}
		}
	}
	
	function setUpControls(hnd,prevId,nextId,count)
	{
		hnd.nrElements = count;
		hnd.prevElm = getElmById(prevId);
		hnd.nextElm = getElmById(nextId);
	}
	///////////////////////////////////////////////////////////////
	// end paging
	///////////////////////////////////////////////////////////////
	

	///////////////////////////////////////////////////////////////
	// schuricht techreq functions
	///////////////////////////////////////////////////////////////
	function getNodeText(node)
	{
		var str = "";
		var i = 0;
		for(i=0; i<node.childNodes.length; i++)
		{
			var ccn = node.childNodes[i];
			switch(ccn.nodeType)
			{
				case 3:
				case 4:
					str += ccn.nodeValue;
					break;
				case 5:
					str += "&"+ccn.nodeName+";";
					break;
				case 1:
					str += getNodeText(ccn);
					break;
			}
		}
		return str;
	}
	
	function getPathNode()
	{
		var elms = document.getElementsByTagName("table");
		var i = 0;
		for(i=0; i < elms.length; i++)
		{
			var ce = elms[i];
			if(ce.className == "LinksKatalogNav")
			{
				return ce;
			}
		}

		elms = document.getElementsByTagName("div");
		i = 0;
		var de = false;
		for(i=0; i < elms.length; i++)
		{
			var ce = elms[i];
			if(ce.className == "productNavlist")
			{
				de = ce;
				break;
			}
		}
		
		if(de)
		{
			elms = de.childNodes;
			i = 0;
			for(i=0; i < elms.length; i++)
			{
				var ce = elms[i];
				if(ce.nodeName == "TABLE")
				{
					return ce;
				}
			}
		}
		
		return false;
	}
	
	function getEncodedPath()
	{
		var node = getPathNode();
		if(node)
		{
			var text = getNodeText(node);
			var t2 = "";
			do
			{
				t2 = text;
				text = t2.replace(/[\r\n\t ]+/," ");
			} while(text != t2);
			return encodeURIComponent(text);
		}
		else
		{
			return encodeURIComponent("Shop");
		}
	}
	
	function hijackOnload(newFunc)
	{
		document.body.oldonload = document.body.onload;
		document.body.newonload = newFunc;
		document.body.onload = function(e)
		{
			if(this.oldonload)
			{
				this.oldonload(e);
			}
			this.newonload(e);
		}
	}
	///////////////////////////////////////////////////////////////
	// end schuricht techreq functions
	///////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////
	// lucene filter history
	///////////////////////////////////////////////////////////////

	function showElm(id,x,y)
	{
		var elm = getElmById(id);
		if(elm)
		{
			elm.style.position = 'absolute';
			/*elm.style.left = x+'px';
			elm.style.top = y+'px';*/
			elm.style.display='block';
		}
	}
	
	var performHide = false;
	
	function doHideElm(id)
	{
		if(performHide)
		{
			var elm = getElmById(id);
			if(elm)
			{
				elm.style.display = 'none';
			}
		}
	}
	
	function hideElm(id)
	{
		performHide = true;
		window.setTimeout("doHideElm(\""+id+"\");", 100);
	}
	
	function cancelHide(id)
	{
		performHide = false;
	}
	
	function toggleDisplay(id,e)
	{
		var elm = getElmById(id);
		var x=0;
		var y=0;
		if(elm)
		{
			if(navigator.appName == "Microsoft Internet Explorer")
			{
				x = event.x;
				y = event.y;
			}
			else
			{
				x = e.pageX;
				y = e.pageY;
			}
			if(elm.style.display != 'block')
			{
				showElm(id,parseInt(x)-10,parseInt(y)-10);
			}
			else
			{
				hideElm(id);
			}
		}
	}
	
	var lhForm = false;

	function goFilterPhrase(phrase,msgId)
	{
		lhForm["filterPhraseInput"].gotedited = false;
		lhForm["filterPhrase"].value = phrase;
		prepareLuceneFilter(lhForm,msgId);
		lhForm.submit();
	}

	
	///////////////////////////////////////////////////////////////
	// end lucene filter history
	///////////////////////////////////////////////////////////////
	
	function limitFieldSize(e, field, size)
	{
		var key = null;
		if (window.event)
		   key = window.event.keyCode;
		else if (e)
		   key = e.which;
		   
   		if(field.value.length >= size && (key != 0 && key != 8))
		{
			field.value = field.value.substr(0,size);
			return false;
		}
		return true;
	}

    // make sure Package loader is present
    if(typeof(Package) == "undefined")
    {
	    document.open();
	    document.write("<script type=\"text/javascript\" src=\"/ishop/StaticHTML/shared/js/package.js\"></script>\n");
	    document.close();
    }
