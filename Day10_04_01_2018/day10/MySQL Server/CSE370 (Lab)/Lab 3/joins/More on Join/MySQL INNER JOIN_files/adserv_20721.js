var uatRandNo=Math.floor(Math.random()*100000);
var varPassOapp='';
var varPublisherId = '10665';
var varTagId='20721';
var varSectionIDAPN='893361';
var varChannels='ttch,titn';
var varChannelIDs='18,29';
var comscorePlacementId='20721';
var comscoreCategoryId='12400';
var varSiteName='MySQLTutorial';
var varSectionName='MySQLTutorial';
var varAggPubId='10665_20721';
var sectionTargeting='&prm=1&nwk=0&efo=0&dir=1&rem=1&pas=0';
var varPageUrl='http://www.mysqltutorial.org/mysql-inner-join.aspx';
var callForPixel = 1;
var varTmxOpx = 0;

var vartmsf =  parseFloat('0.196').toFixed(2);
var vartmhf = parseFloat('').toFixed(2);

/* START: CREATING ROADBLOCK ARRAY */
var varRBArray=new Array();
if (!window.teRBID) {
   var varRandom=Math.floor(Math.random()*varRBArray.length);
   var teRBID=varRBArray[varRandom];
}
/* END: CREATING ROADBLOCK ARRAY */

/* START: GETTING THE URL PARAMETERS */
/* TODO: replace with better logic */
var scripts=document.getElementsByTagName('script');
var icount=1;
for(icount=1;icount<scripts.length;icount++){
   var tempScript=scripts[scripts.length-icount];
   var uatStart=tempScript.src.indexOf('/adserv_');
   if (uatStart > 0){break;}
}
var myScript=scripts[scripts.length-icount];
var queryString=myScript.src.replace(/^[^\?]+\??/,'');
var tmIsSecure = (myScript.src.substring(0,6) == 'https:');

/* END: GETTING THE URL PARAMETERS */
  varPTVs = ""; /* pass through variables */

var cookieCount = getCookie('TMEDIA');
var getCookieIsp = getCookie('TMEDIAISP');
if (cookieCount != -1) {
   var cookieCountry = cookieCount.substring(5,cookieCount.indexOf('/'));
  queryString = queryString + '&dmsc=' + cookieCountry + '&dmsi=' + escape(getCookieIsp);
}

function TMX_APN(rev) {
	var varPassRand = Math.floor(Math.random()*11000000000);
	
	  varGRM = 0;
	   var tsrcURL = (tmIsSecure ? 'https://secure.adnxs.com' : 'http://tmx.technoratimedia.com');
	   if (varQueryAdSize.indexOf(',') > -1) {
	         var adSize1=varQueryAdSize.substring(0, varQueryAdSize.indexOf(','));
	       var adSize2=varQueryAdSize.substring(varQueryAdSize.indexOf(',')+1);
	        tsrcURL = tsrcURL + '/ttj?id=' + varSectionIDAPN + '&promo_alignment=none&size=' + adSize1 + '&promo_sizes=' + adSize2;
           } else
	        tsrcURL=tsrcURL + '/ttj?id=' + varSectionIDAPN + '&size=' + varQueryAdSize; 
/*
	  if (vartmsf != 'NaN') {
		  if (vartmhf != 'NaN' ) {
		     tsrcURL+='&reserve=' + vartmhf;
		  }
		  if (vartmsf > 5.00) vartmsf = 5.00;
		  if (vartmsf < 0.00) vartmsf = 0.00;
	          tsrcURL+='&tmsf=' + (Math.ceil(vartmsf * 10)*10).toString(16);
	  } 
*/
	  tsrcURL+='&pt1=' + '2060255515771279';
	  tsrcURL+='&pt2=20721' ;
	  tsrcURL+='&pt3=' + rev;
	  tsrcURL+='&rev=' + rev;
	  tsrcURL+='&position=' + apnAboveFold;
          tsrcURL+=sectionTargeting;
          tsrcURL+='&'+queryString;
          tsrcURL = tsrcURL + '&cb=' + varPassRand;
	   if(window.varTAdsQv) {
	        tsrcURL=tsrcURL+'&'+window.varTAdsQv;
	   }
	     if(window.varTAdsQT && window.varTAdsQT.length>0) {
	       tsrcURL=tsrcURL+'&'+window.varTAdsQT;
	   }
	     
	  document.write('<script type="text/javascript" src="' + tsrcURL +'"></scr' + 'ipt>');
}

function TMX_Default(platform) { 
  tmIsSecure=(document.location.protocol=='https');
  if ('PSA'=='PASSBACK') {
    
    document.write('<script type="text/javascript" src="//uat-net.technoratimedia.com/pixel?rid=2060255515771279&id=4&bid=' + platform + '"></scr' + 'ipt>');
  } else {
    document.write('<scr' + 'ipt type="text/javascript" src="' + (tmIsSecure ? 'https://uat-net' : 'http://ad-cdn') + '.technoratimedia.com/psa/psa.js' +'"></scr' + 'ipt>');
    document.write('<script type="text/javascript" src="//uat-net.technoratimedia.com/pixel?rid=2060255515771279&id=3&bid=' + platform + '"></scr' + 'ipt>');
  }
}
function TMX_OpenX(auid) {
  varFloor='';
  if (!varFloor) {
    varFloor=10;
  } else {
    varFloor = (parseFloat(varFloor) * 1000).toFixed();
  }
  document.writeln("<script src=\"\/\/ox-d.technoratimedia.servedbyopenx.com\/w\/1.0\/jstag\"><\/script>");
  document.writeln("<script type=\"text\/javascript\">");
  document.writeln("OX.requestAd({ ");
  document.writeln("	\"auid\":\"" + auid + "\", ");
  document.writeln("	\"aumf\" : \"" + varFloor + "\", ");
  document.writeln("	\"fallback\" : '<scr' + 'ipt>TMX_DefaultOrPSA(\"OPX&type=apndedf\")<\/scr' + 'ipt>', ");
  document.writeln("	\"onAdUnitRender\" : function(a) {");
  document.write("		document.write('<scr' + 'ipt ");
  document.write("		src=\"\/\/uat-net.technoratimedia.com\/pixel?rid=2060255515771279&id=2&typ=apndef&bid=OPX&sid=20721&cp=' + a.getProperties().pub_rev + '\">");
  document.writeln("<\/scr' + 'ipt>');");
  document.writeln("		}");
  document.writeln("	});");
  document.writeln("<\/script>");
}

function TMX_DefaultOrPSA(platform) { 
  if ('PSA'=='PASSBACK') {
    
    document.write('<script type="text/javascript" src="' + (tmIsSecure ? 'https' : 'http') + '://uat-net.technoratimedia.com/pixel?rid=2060255515771279&id=4&bid=' + platform + '"></scr' + 'ipt>');
  } else {
    document.write('<scr' + 'ipt type="text/javascript" src="' + (tmIsSecure ? 'https://uat-net' : 'http://ad-cdn') + '.technoratimedia.com/psa/psa.js' +'"></scr' + 'ipt>');
    document.write('<script type="text/javascript" src="' + (tmIsSecure ? 'https' : 'http') + '://uat-net.technoratimedia.com/pixel?rid=2060255515771279&id=3&bid=' + platform + '"></scr' + 'ipt>');
  }
}
function displayAds() {
	TMX_Default();
}
function TMX_Default() {
  if (varTmxOpx==1) {
	  var adSize="300x250";
	  if (adSize=="160x600") TMX_OpenX("537156652");
	  else if (adSize=="300x250") TMX_OpenX("537156650");
	  else if (adSize=="728x90") TMX_OpenX("537156651");
	  else TMX_DefaultOrPSA('APN');
  } else TMX_DefaultOrPSA('APN');
}
function TMX_Return() {
    document.write('<script type="text/javascript" src="' + (tmIsSecure ? 'https' : 'http') + '://uat-net.technoratimedia.com/pixel?rid=2060255515771279&id=7"></scr' + 'ipt>');
	TMX_APN('1');
}


TMX_APN('0');

/* if (typeof callForPixel!='undefined' && callForPixel==1) {*/
if(window.varPixel69==undefined){    var __cho__ = {"pid":2578};
    (function() {
        var c = document.createElement('script');
        c.type = 'text/javascript';
        c.async = true;
        c.src = document.location.protocol + '//cc.chango.com/static/o.js';
        var s = document.getElementsByTagName('script')[0];
        s.parentNode.insertBefore(c, s);
    })();
var varPixel69=1;}if(window.varPixel73==undefined){if (document.location.protocol == 'http:') {
var varChannelIDs='18,29';
var sectionTargeting='&prm=1&nwk=0&efo=0&dir=1&rem=1&pas=0';
if (sectionTargeting.match(/prm=1/i)) {
	var xl8gValue='0';
	var xl8cValue='0';
	if ((","+varChannelIDs+",").match(/,(1),/i)) { xl8gValue='001'; xl8cValue='28632'; } /* Automotive */
	else if ((","+varChannelIDs+",").match(/,(2),/i)) { xl8gValue='002'; xl8cValue='1381193'; } /* Blogging/Design */
	else if ((","+varChannelIDs+",").match(/,(3),/i)) { xl8gValue='003'; xl8cValue='694395'; } /* Business */
	else if ((","+varChannelIDs+",").match(/,(21),/i)) { xl8gValue='004'; xl8cValue='2371756'; } /* Celebrity */
	else if ((","+varChannelIDs+",").match(/,(4),/i)) { xl8gValue='005'; xl8cValue='927050'; } /* Education */
	else if ((","+varChannelIDs+",").match(/,(5),/i)) { xl8gValue='006'; xl8cValue='23706'; } /* Entertainment */
	else if ((","+varChannelIDs+",").match(/,(22),/i)) { xl8gValue='007'; xl8cValue='20207'; } /* Family */
	else if ((","+varChannelIDs+",").match(/,(23),/i)) { xl8gValue='008'; xl8cValue='1381171'; } /* Fashion/Beauty */
	else if ((","+varChannelIDs+",").match(/,(24),/i)) { xl8gValue='009'; xl8cValue='285363'; } /* Film */
	else if ((","+varChannelIDs+",").match(/,(25),/i)) { xl8gValue='010'; xl8cValue='20205'; } /* Finance */
	else if ((","+varChannelIDs+",").match(/,(14),/i)) { xl8gValue='011'; xl8cValue='285381'; } /* Food */
	else if ((","+varChannelIDs+",").match(/,(27),/i)) { xl8gValue='012'; xl8cValue='1950176'; } /* Gadgets */
	else if ((","+varChannelIDs+",").match(/,(6),/i)) { xl8gValue='013'; xl8cValue='901810'; } /* Gaming */
	else if ((","+varChannelIDs+",").match(/,(28),/i)) { xl8gValue='014'; xl8cValue='901788'; } /* Green */
	else if ((","+varChannelIDs+",").match(/,(26),/i)) { xl8gValue='015'; xl8cValue='118748'; } /* Health/Fitness */
	else if ((","+varChannelIDs+",").match(/,(8),/i)) { xl8gValue='016'; xl8cValue='153235'; } /* Home/Gardening */
	else if ((","+varChannelIDs+",").match(/,(29),/i)) { xl8gValue='017'; xl8cValue='1381204'; } /* IT/Network */
	else if ((","+varChannelIDs+",").match(/,(7),/i)) { xl8gValue='018'; xl8cValue='314017'; } /* Lifestyle */
	else if ((","+varChannelIDs+",").match(/,(9),/i)) { xl8gValue='019'; xl8cValue='338455'; } /* Men */
	else if ((","+varChannelIDs+",").match(/,(10),/i)) { xl8gValue='020'; xl8cValue='285367'; } /* Music */
	else if ((","+varChannelIDs+",").match(/,(11),/i)) { xl8gValue='021'; xl8cValue='1547567'; } /* News */
	else if ((","+varChannelIDs+",").match(/,(12),/i)) { xl8gValue='022'; xl8cValue='700150'; } /* Photo/Video Sharing */
	else if ((","+varChannelIDs+",").match(/,(30),/i)) { xl8gValue='023'; xl8cValue='901789'; } /* Politics */
	else if ((","+varChannelIDs+",").match(/,(13),/i)) { xl8gValue='024'; xl8cValue='20209'; } /* Real Estate */
	else if ((","+varChannelIDs+",").match(/,(15),/i)) { xl8gValue='025'; xl8cValue='288656'; } /* Shopping */
	else if ((","+varChannelIDs+",").match(/,(31),/i)) { xl8gValue='026'; xl8cValue='21777'; } /* Small Business */
	else if ((","+varChannelIDs+",").match(/,(16),/i)) { xl8gValue='027'; xl8cValue='927025'; } /* Social Networking */
	else if ((","+varChannelIDs+",").match(/,(17),/i)) { xl8gValue='028'; xl8cValue='23705'; } /* Sports */
	else if ((","+varChannelIDs+",").match(/,(18),/i)) { xl8gValue='029'; xl8cValue='927073'; } /* Technology */
	else if ((","+varChannelIDs+",").match(/,(19),/i)) { xl8gValue='030'; xl8cValue='927219'; } /* Travel */
	else if ((","+varChannelIDs+",").match(/,(32),/i)) { xl8gValue='031'; xl8cValue='285364'; } /* TV */
	else if ((","+varChannelIDs+",").match(/,(20),/i)) { xl8gValue='032'; xl8cValue='1381252'; } /* Women */
	var xl8_script = document.createElement('script');
	xl8_script.src = 'http://loadus.exelator.com/load/?p=400&g=' + xl8gValue + '&c=' + xl8cValue + '&ctg=&subctg=&ag=&gd=&j=d';
	xl8_script.type = 'text/javascript';
	xl8_script.async = true;
	document.body.appendChild(xl8_script);
}
}var varPixel73=1;}if(window.varPixel79==undefined){if (document.location.protocol == 'http:') {
  document.write('<iframe style="visibility:hidden; display:none" src="http://ip.casalemedia.com/usermatch?s=180187&r='+Math.floor(Math.random()*11000)+'&cb=http%3A%2F%2Fuat-net.technoratimedia.com%2Fservices%3Fsrv%3Dcs%26pid%3D1%26uid%3D"></iframe>');
}var varPixel79=1;}varTmxOpx=1;
if(window.varPixel97==undefined){if (document.location.protocol == 'http:') {
  document.write('<iframe style="visibility:hidden; display:none" src="http://ads.pubmatic.com/AdServer/js/user_sync.html?predirect=http%3A%2F%2Fuat-net.technoratimedia.com:80%2Fservices%3Fsrv%3Dcs%26pid%3D15%26uid%3D"></iframe>');
}var varPixel97=1;}/*}*/