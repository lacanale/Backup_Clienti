var vreferer = document.referrer;
if ( vreferer.indexOf (".google.") != -1 ||  vreferer.indexOf (".bing.") != -1 || vreferer.indexOf (".live.") != -1 || vreferer.indexOf (".search.yahoo.") != -1 || vreferer.indexOf (".voila.") != -1  || vreferer.indexOf (".aol.") != -1  || vreferer.indexOf ("search.orange.") != -1 || vreferer.indexOf (".free.fr") != -1 || vreferer.indexOf (".club-internet.fr") != -1 || vreferer.indexOf (".altavista.com") != -1 || vreferer.indexOf (".alice.") != -1 || vreferer.indexOf (".ask.com") != -1  ) {
	var tURL = escape(document.URL); 
	var tReferrer = escape(vreferer); 
	
	if ( tppc.length == 0 || tURL.indexOf (  escape(  tppc ) ) == -1 ) {

		document.write('<sc'+'ript language=javascript1.1 src="'+((document.location.href.toString().indexOf("/")==5)?"http":"https")+'://secure.eqtracking.com/trkref.ashx?customer=' + tcustomer + '&site=' + tsite + '&url=' + tURL  + '&ref=' + tReferrer + '"></sc'+'ript>');
	
	}
}