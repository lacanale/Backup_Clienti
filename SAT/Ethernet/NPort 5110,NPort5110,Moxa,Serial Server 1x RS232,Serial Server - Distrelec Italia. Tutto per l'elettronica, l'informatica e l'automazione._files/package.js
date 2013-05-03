function Package()
{
	this.path = new Array();
	this.packagePrefix = "ch.imis.ishop.js.";
	this.path.push("/ishop/StaticHTML/shared/js");
	this.registeredPackages = new Array();
}

/**
 * @param scriptFile name of the scriptFile to include
 * @param contains function or varname to check on script presence
 */
Package.prototype.load = function(scriptFile, contains)
{
	var check;
	try
	{
		check = eval(contains);
	}
	catch(e){}
	if(typeof(check) == "undefined")
	{
		document.open();
		var i;
		for(i=0; i < this.path.length; ++i)
		{
			document.write("<script type=\"text/javascript\" src=\""+this.path[i]+"/"+scriptFile+"\"></script>\n");
		}
		document.close();
	}
}

/**
 * @param pkg the dotted name of the package
 */
Package.prototype.provide = function(pkg)
{
	this.registeredPackages.push(pkg);
}

/**
 * @param pkg the dotted name of the package
 */
Package.prototype.require = function(pkg)
{
	if(!this.available(pkg))
	{
		var script = pkg.substring(this.packagePrefix.length).replace(/\./,"/")+".js";
		this.load(script,"undefined");
	}
}

/**
 * @param pkg the dotted name of the package
 */
Package.prototype.available = function(pkg)
{
	var i;
	for(i=0; i<this.registeredPackages.length; ++i)
	{
		if(this.registeredPackages[i] == pkg)
		{
			return true;
		}
	}
	return false;
}

var scripts = new Package();