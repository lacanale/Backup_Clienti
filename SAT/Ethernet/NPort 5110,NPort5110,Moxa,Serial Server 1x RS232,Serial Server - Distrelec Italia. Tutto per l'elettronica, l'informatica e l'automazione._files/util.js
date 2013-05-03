if(typeof(scripts) != "undefined")
{
	scripts.provide("ch.imis.ishop.js.util");
}

/**
 * parses the url and returns the sessionid string
 * as ";jsessionid=36D3F2066920A17A8A2CB7379CE1AF87.chdist51"
 */
function extractSessionId(url)
{
	var sessionid = "";
	var start = url.indexOf(";jsessionid");
	if(start != -1)
	{
		sessionid = url.substring(start);
		var end = sessionid.indexOf("?");
		if(end != -1)
		{
			sessionid = sessionid.substring(0, end);
		}
	}
	return sessionid;
}

/**
 * return the element with the given id
 */
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
	return false;
}

var byId = getElmById;

/**
 * helper function to set attribute nodes
 */
function attr(name,value)
{
	var attr = document.createAttribute(name);
	attr.nodeValue = value;
	return attr;
}

/**
 * helper function to add onload events
 */
function addOnload(newEvent)
{
	if(window.onload)
	{
		var _oldOnload = window.onload;
		window.onload = function(event)
		{
			_oldOnload(event);
			newEvent(event);
		}
	}
	else
	{
		window.onload = function()
		{
			newEvent();
		}
	}
}

/**
 * helper function to use firebug logging
 */
function fblog(message)
{
	if(console && typeof(console.log) == "function")
		console.log(message);
}

var	css = {
	readCssClasses : function(elm)
	{
		if(elm && elm.className)
		{
			var classes = elm.className.split(/[ ]+/);
			return classes;
		}
		return new Array();
	},

	writeCssClasses : function(elm, classes)
	{
		var str = classes.join(" ");
		elm.className = str;
	},

	hasCssClass : function(elm, className)
	{
		var classes = this.readCssClasses(elm);
		var ucn = className.toUpperCase();
		for(var i = 0; i < classes.length; ++i)
		{
			if(ucn == classes[i].toUpperCase())
			{
				return true;
			}
		}
		return false;
	},

	addCssClass : function(elm, className)
	{
		if(!this.hasCssClass(elm, className))
		{
			var classes = this.readCssClasses(elm);
			classes.push(className);
			this.writeCssClasses(elm, classes);
		}
	},

	removeCssClass : function(elm, className)
	{
		var oldclasses = this.readCssClasses(elm);
		var newclasses = new Array();
		var ucn = className.toUpperCase();
		for(var i = 0; i < oldclasses.length; ++i)
		{
			if(ucn != oldclasses[i].toUpperCase())
			{
				newclasses.push(oldclasses[i]);
			}
		}
		if(newclasses.length != oldclasses.length)
		{
			this.writeCssClasses(elm, newclasses);
		}
	}
};

/*****************************************************
 * enable <tab> in textareas
 *****************************************************/
function insertAtCursor(elm, val)
{
	//IE support
	if(document.selection)
	{
		elm.focus();
		var sel = document.selection.createRange();
		sel.text = val;
	}
	//MOZILLA/NETSCAPE support
	else if(elm.selectionStart || elm.selectionStart == 0)
	{
		var startPos = elm.selectionStart;
		var endPos = elm.selectionEnd;
		var restoreTop = elm.scrollTop;
		elm.value = elm.value.substring(0, startPos) + val + elm.value.substring(endPos, elm.value.length);
		elm.selectionStart = startPos + val.length;
		elm.selectionEnd = startPos + val.length;
		if(restoreTop > 0)
		{
			elm.scrollTop = restoreTop;
		}
	}
	else
	{
		elm.value += val;
	}
}

function interceptTabs(e, control)
{
	key = e.keyCode ? e.keyCode : e.which ? e.which : e.charCode;
	if(key == 9)
	{
		insertAtCursor(control, '\t');
		return false;
	}
	else
	{
		return key;
	}
}
