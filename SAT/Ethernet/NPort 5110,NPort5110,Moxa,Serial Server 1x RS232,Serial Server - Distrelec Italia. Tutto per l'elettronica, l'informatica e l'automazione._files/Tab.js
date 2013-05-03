scripts.provide("ch.imis.ishop.js.Tab");

scripts.require("ch.imis.ishop.js.util");

function Tab(elmId,title)
{
	this.elmId = elmId;
	this.element = getElmById(elmId);
	this.title = title;
	this.selector = undefined;
	this.manager = undefined;
	this.container = undefined;
}

Tab.prototype.selMouseOver = function(e)
{
	this.selector.setAttributeNode(attr("class","tabSelectorHighlighted"));
}

Tab.prototype.selMouseOut = function(e)
{
	if(this.manager.activeTab != this)
		this.selector.setAttributeNode(attr("class","tabSelector"));
}

Tab.prototype.selOnClick = function(e)
{
	this.manager.switchTab(this);
}

Tab.prototype.registerTabSelector = function(sel)
{
	this.selector = sel;
	var _tab = this;
	sel.onmouseover = function(e) { _tab.selMouseOver(e); }
	sel.onmouseout = function(e) { _tab.selMouseOut(e); }
	sel.onclick = function(e) { _tab.selOnClick(e); }
	sel.innerHTML = this.title;
}

function TabManager(parentId)
{
	this.parentId = parentId
	this.parentElm = getElmById(parentId);
	this.tabs = new Array();
	this.activeTab = undefined;
}

TabManager.prototype.addTab = function(tab)
{
	this.tabs.push(tab);
	tab.manager = this;
}

TabManager.prototype.add = function(elmId, title)
{
	this.addTab(new Tab(elmId, title));
}

TabManager.prototype.build = function()
{

	var container = document.createElement("div");
	container.setAttributeNode(attr("class","tabContainer"));
	var i;
	for(i=0; i<this.tabs.length; ++i)
	{
		var tab = this.tabs[i];
		var div = document.createElement("div");
		div.setAttributeNode(attr("class","tabSelector"));
		this.parentElm.appendChild(div);
		tab.registerTabSelector(div);
		tab.element.parentNode.removeChild(tab.element);
		tab.element.style.display = "none";
		container.appendChild(tab.element);
	}
	this.parentElm.appendChild(container);
	this.switchTab(this.tabs[0]);
	this.container = container;
}

TabManager.prototype.switchTab = function(tab)
{
	var i;
	this.activeTab = tab;
	for(i=0; i<this.tabs.length; ++i)
	{
		if(this.tabs[i] == tab)
		{
			this.tabs[i].element.style.display = "block";
			this.tabs[i].selMouseOver();
		}
		else
		{
			this.tabs[i].element.style.display = "none";
			this.tabs[i].selMouseOut();
		}
	}
}