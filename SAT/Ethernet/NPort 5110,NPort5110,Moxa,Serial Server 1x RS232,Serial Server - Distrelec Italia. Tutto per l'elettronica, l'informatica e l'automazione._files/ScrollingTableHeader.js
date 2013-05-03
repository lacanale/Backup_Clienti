if(typeof(scripts) != "undefined")
{
	scripts.provide("ch.imis.ishop.js.ScrollingTableHeader");
	scripts.require("ch.imis.ishop.js.util");
}

function getStyle(el,styleProp)
{
	var x = el;
	if (x.currentStyle)
		var y = x.currentStyle[styleProp];
	else if (window.getComputedStyle)
		var y = document.defaultView.getComputedStyle(x,null).getPropertyValue(styleProp);
	return y;
}

function fixWidth(tda, tdb)
{
	for(var i = 0; i < tda.length; ++i)
	{
		var a = tda[i];
		var b = tdb[i];
		b.style.height = getStyle(a,"height");
		b.style.width = getStyle(a,"width");
		if(b.style.width == "auto")
			b.style.width = (a.offsetWidth-3)+"px";
	}
	debugWidth(tda);
}

function debugWidth(tda)
{
	return;
	for(var i = 0; i < tda.length; ++i)
	{
		var a = tda[i];
		a.innerHTML += " "+getStyle(a,"width")+" "+a.offsetWidth;
	}
}

var scrollTasks = [];


function getRowPos(row,scroller)
{
	var x = row.offsetLeft;
	var y = row.offsetTop;
	var n = row;
	var o = row.offsetParent;
	do
	{
		n = n.parentNode;
		if(n == o) {
			x += n.offsetLeft;
			y += n.offsetTop;
			o = n.offsetParent;
		}
	} while(o && n && n != scroller);

	return { 'x': x, 'y': y }
}

function isIE()
{
	return navigator.appName == "Microsoft Internet Explorer";
}

function fixIt(h,scroller)
{
	var fh = h.cloneNode(true);
	fh.setAttribute("id","free"+fh.id);
	var tb = h.parentNode.cloneNode(false);
	//tb.style.width = getStyle(h.parentNode,"width");
	tb.style.width = h.parentNode.offsetWidth+"px";
	tb.appendChild(fh);
	var ins = h.parentNode.parentNode.parentNode;
	tb.style.position = "absolute";
	var htr = h.getElementsByTagName("TR")[0];
	//fblog(getRowPos(htr,scroller).x+"\n"+getRowPos(htr,scroller).y+"\n"+htr.offsetParent.tagName+"\n"+htr.offsetParent.offsetParent.tagName);
	tb.style.left = getRowPos(htr,scroller).x+(isIE()?1:2)+"px";
	var updateTop = function(sc) {
		var nt = (getRowPos(htr,scroller).y-sc.scrollTop);
		tb.ntpre = nt;
		if(nt < sc.offsetTop)
			nt = sc.offsetTop;
		if(tb.offsetHeight > 0)
			tb.visibleHeight = Math.round(tb.offsetHeight*1.5);
		tb.ntpo = nt;
		tb.sco = sc.offsetTop
		tb.delt = nt - sc.offsetTop;
		if((nt - sc.offsetTop) > (tb.visibleHeight)
                || (sc.scrollTop == 0
                    && (tb.offsetHeight-htr.parentNode.offsetHeight) > 3))
		{
			if(!tb.orgDisp && tb.style.display != "none")
			{
				tb.orgDisp = tb.style.display;
			}
			tb.style.display = "none";
		}
		else
		{
			if(tb.style.display == "none")
			{
				tb.style.display = tb.orgDisp;
				if(!tb.debugViewEnabled)
				{
					tb.debugViewEnabled = true;
					debugWidth(fh.getElementsByTagName("TD"));
					debugWidth(fh.getElementsByTagName("TH"));
				}
			}
		}
		tb.style.top = nt+1+"px";
	}

	fixWidth(h.getElementsByTagName("TD"),fh.getElementsByTagName("TD"));
	fixWidth(h.getElementsByTagName("TH"),fh.getElementsByTagName("TH"));

	scrollTasks.push(updateTop);
	scroller.onscroll = function()
	{
		for(var i = 0; i < scrollTasks.length; ++i)
		{
			scrollTasks[i](this);
		}
	}
	scroller.onscroll(); // avoid flicker
	ins.appendChild(tb);
	scroller.onscroll();
}

var preventScrollingHeaderInit = false;

function initHeaders(tblid,scrlid)
{
	if(preventScrollingHeaderInit) return;
	var tbl = byId(tblid);
	var scroll = byId(scrlid);
	var heads = tbl.getElementsByTagName("THEAD");
	for(var i = 0; i < heads.length; ++i)
	{
		fixIt(heads[i],scroll);
	}
}
