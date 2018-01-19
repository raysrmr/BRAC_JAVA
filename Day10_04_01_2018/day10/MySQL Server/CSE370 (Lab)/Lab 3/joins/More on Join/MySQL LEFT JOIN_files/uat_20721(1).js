var varDivRand = Math.floor(Math.random() * 11000);
document.write('<div id="uat' + varDivRand + '"></div>');
var scripts = document.getElementsByTagName("script");
var validURLPattern = /^[A-Za-z0-9_\-]/;
var serverName = "uat-net.technoratimedia.com";
var icount = 1;
for (icount = 1; icount < scripts.length; icount++) {
	var tempScript = scripts[scripts.length - icount];
	var uatStart = tempScript.src.indexOf("/uat_");
	if (uatStart > 0) {
		break
	}
}

function isArray(a) {
	return Object.prototype.toString.call(a) === "[object Array]"
}

function parseQuery(p, n) {
	var o = new Object();
	if (!p) {
		return o
	}
	var k = p.split(/[;&]/);
	for (var q = 0; q < k.length; q++) {
		var l = k[q].split("=");
		if (!l || l.length != 2) {
			continue
		}
		var j = unescape(l[0]);
		var m = unescape(l[1]);
		m = m.replace(/\+/g, " ");
		o[j] = m;
		if (j.toLowerCase() == n.toLowerCase()) {
			return m
		}
	}
	return false
}

function IsIE8Browser() {
	var g = -1;
	var f = navigator.userAgent;
	var d = new RegExp("Trident/([0-9]{1,}[.0-9]{0,})");
	if (d.exec(f) != null) {
		g = parseFloat(RegExp.$1)
	}
	return (g == 4)
}
var browserversion = "bru";
var ie = false;
if (/MSIE (\d+\.\d+);/.test(navigator.userAgent)) {
	ie = true;
	var ieversion = new Number(RegExp.$1);
	if (ieversion >= 9) {
		browserversion = "ie9"
	} else {
		if (ieversion >= 8) {
			browserversion = "ie8"
		} else {
			if (ieversion >= 7) {
				if (IsIE8Browser()) {
					browserversion = "ie8"
				} else {
					browserversion = "ie7"
				}
			} else {
				if (ieversion >= 6) {
					browserversion = "ie6"
				} else {
					if (ieversion >= 5) {
						browserversion = "ie5"
					} else {
						browserversion = "ieu"
					}
				}
			}
		}
	}
} else {
	if (/Opera[\/\s](\d+\.\d+)/.test(navigator.userAgent)) {
		var oprversion = new Number(RegExp.$1);
		if (oprversion >= 10) {
			browserversion = "op10"
		} else {
			if (oprversion >= 9) {
				browserversion = "op9"
			} else {
				if (oprversion >= 8) {
					browserversion = "op8"
				} else {
					if (oprversion >= 7) {
						browserversion = "op7"
					} else {
						browserversion = "opu"
					}
				}
			}
		}
	} else {
		if (/Chrome[\/\s](\d+\.\d+)/.test(navigator.userAgent)) {
			var chromeversion = new Number(RegExp.$1);
			if (chromeversion >= 3) {
				browserversion = "cr3"
			} else {
				if (chromeversion >= 2) {
					browserversion = "cr2"
				} else {
					if (chromeversion >= 1) {
						browserversion = "cr1"
					} else {
						browserversion = "cru"
					}
				}
			}
		} else {
			if (/Safari[\/\s](\d+\.\d+)/.test(navigator.userAgent)) {
				var oprversion = new Number(RegExp.$1);
				if (oprversion >= 5) {
					browserversion = "sf5"
				} else {
					if (oprversion >= 4) {
						browserversion = "sf4"
					} else {
						if (oprversion >= 3) {
							browserversion = "sf3"
						} else {
							if (oprversion >= 2) {
								browserversion = "sf2"
							} else {
								browserversion = "sfu"
							}
						}
					}
				}
			} else {
				if (/Firefox[\/\s](\d+\.\d+)/.test(navigator.userAgent)) {
					var ffversion = new Number(RegExp.$1);
					if (ffversion >= 3) {
						browserversion = "ff3"
					} else {
						if (ffversion >= 2) {
							browserversion = "ff2"
						} else {
							if (ffversion >= 1) {
								browserversion = "ff1"
							} else {
								browserversion = "ffu"
							}
						}
					}
				} else {
					browserversion = "bru"
				}
			}
		}
	}
}
var osname = "unk";
var OS = navigator.appVersion;
if (!ie) {
	OS = navigator.userAgent
}
if (OS.indexOf("Win") != -1) {
	if ((OS.indexOf("Windows NT 5.1") != -1) || (OS.indexOf("Windows XP") != -1)) {
		osname = "wxp"
	} else {
		if ((OS.indexOf("Windows NT 7.0") != -1) || (OS.indexOf("Windows NT 6.1") != -1)) {
			osname = "wn7"
		} else {
			if ((OS.indexOf("Windows NT 6.0") != -1)) {
				osname = "wvs"
			} else {
				if (OS.indexOf("Windows ME") != -1) {
					osname = "wme"
				} else {
					if ((OS.indexOf("Windows NT 4.0") != -1) || (OS.indexOf("WinNT4.0") != -1) || (OS.indexOf("WinNT") != -1)) {
						osname = "wnt"
					} else {
						if ((OS.indexOf("Windows NT 5.2") != -1)) {
							osname = "ws3"
						} else {
							if ((OS.indexOf("Windows NT 5.0") != -1) || (OS.indexOf("Windows 2000") != -1)) {
								osname = "w2k"
							} else {
								if ((OS.indexOf("Windows 98") != -1) || (OS.indexOf("Win98") != -1)) {
									osname = "w98"
								} else {
									if ((OS.indexOf("Windows 95") != -1) || (OS.indexOf("Win95") != -1) || (OS.indexOf("Windows_95") != -1)) {
										osname = "w95"
									} else {
										if ((OS.indexOf("Win16") != -1)) {
											osname = "w31"
										} else {
											osname = "wun"
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
} else {
	if (OS.indexOf("Mac") != -1) {
		osname = "mac"
	} else {
		if (OS.indexOf("X11") != -1) {
			osname = "unx"
		} else {
			if (OS.indexOf("Linux") != -1) {
				osname = "lnx"
			}
		}
	}
}
var _pattern = new Array();
_pattern.iph = /iPhone\sOS\s([\d\_]+)/ig;
_pattern.ipa = /iPad;\sCPU\sOS\s([\d\_]+)/ig;
_pattern.and = /Android\s([\d\.]+);/ig;
try {
	for (var key in _pattern) {
		var v = _pattern[key].exec(OS);
		if (v && isArray(v) && v.length > 1) {
			osname = key + v[1];
			break
		}
	}
} catch (e) {}

function WindowGetHeight() {
	var b = 0;
	if (self.innerHeight) {
		b = self.innerHeight
	} else {
		if (document.documentElement && document.documentElement.clientHeight) {
			b = document.documentElement.clientHeight
		} else {
			if (document.body) {
				b = document.body.clientHeight
			}
		}
	}
	return b
}

function findPosition(f) {
	if (typeof (f) != "undefined") {
		for (var g = 0, d = 0; f; f = f.offsetParent) {
			g += f.offsetLeft;
			d += f.offsetTop
		}
		return d
	} else {
		return 0
	}
}

function getWidth(d) {
	var g = d.search("x");
	var f = d.substring(0, g);
	return f
}

function getHeight(d) {
	var g = d.search("x");
	var f = d.substring(g + 1, d.length);
	return f
}

function getURLParam(m) {
	var n = "323WERKJKLDSJFlk23ididfj42342";
	var o = window.location.href;
	if (o.indexOf("?") > -1) {
		var h = o.substr(o.indexOf("?")).toLowerCase();
		var l = h.split("&");
		for (var j = 0; j < l.length; j++) {
			if (l[j].indexOf(m.toLowerCase() + "=") > -1) {
				var k = l[j].split("=");
				n = k[1];
				break
			}
		}
	}
	return unescape(n)
}

function getUrlVars() {
	var l = [],
		m;
	var o = 0;
	var p = "ara,ask,as_q,B1,begriff,cadena,Claus,cq,DTqb1,eingabe,general,GoogleSearch,heureka,in,jump,item,k,KERESES,key,keyword,Keywords,kw,look_for,MT,p,PA,palabras,palavra,q,qry,query,query_1,Q1,q1,qkw,qr,qry,qs,qt,qu,query,oldquery,query0,QueryString,queryterm,queryText,question,qw,r,request,requete,s,sb,sc,search,search_for,searchfor,SearchString,searchtext,searchWord,search_string,search_term,soegeord,SP,srch,srchKey,sTerm,str,string,su,suche,suchstr,szukaj,T,term,terml,terms,text,u,w,what,word,words,x";
	var j = document.referrer.slice(document.referrer.indexOf("?") + 1).split("&");
	for (var q = 0; q < j.length; q++) {
		m = j[q].split("=");
		var n = "," + m[0] + ",";
		var k = p.search(n);
		if (k > 0) {
			l.push(m[0]);
			l[m[0]] = m[1];
			o = 1;
			break
		}
	}
	if (o == 0) {
		m[0] = -1;
		m[1] = -1;
		l.push(m[0]);
		l[m[0]] = m[1]
	}
	return l
}

function getDomainName() {
	var k = document.referrer.indexOf("?");
	if (k > -1) {
		var j = document.referrer.substring(0, document.referrer.indexOf("?"))
	} else {
		j = document.referrer
	}
	var g = j.search("http://");
	if (g > -1) {
		var h = j.substring(7)
	} else {
		var g = j.search("https://");
		if (g > -1) {
			h = j.substring(8)
		} else {
			h = j
		}
	}
	var m = h.indexOf("/");
	if (m > -1) {
		var l = h.substring(0, m)
	} else {
		var l = h
	}
	return l
}

function getCookie(k) {
	var j = document.cookie.split(";");
	var h = "";
	var m = "";
	var l = "";
	var g = false;
	for (i = 0; i < j.length; i++) {
		h = j[i].split("=");
		m = h[0].replace(/^\s+|\s+$/g, "");
		if (m.toLowerCase() == k.toLowerCase()) {
			g = true;
			if (h.length > 1) {
				l = unescape(h[1].replace(/^\s+|\s+$/g, ""))
			}
			return l;
			break
		}
		h = null;
		m = ""
	}
	if (!g) {
		return -1
	}
}

function getHostName(c) {
	try {
		varDomain = c.toString().match(/:\/\/(.[^/]+)/)[1]
	} catch (d) {
		return c
	}
	varDomainSplit = varDomain.split(".");
	varDomainName = "";
	if (varDomainSplit.length == 3) {
		varCount = 1
	} else {
		if (varDomainSplit.length == 2) {
			varCount = 0
		} else {
			if (varDomainSplit.length > 3) {
				varCount = 2
			} else {
				varDomain = " " + c.toString();
				return varDomain.toLowerCase()
			}
		}
	}
	for (i = varDomainSplit.length - 1; i >= varCount; i--) {
		if (varDomainName = "") {
			varDomainName = varDomainSplit[i]
		} else {
			varDomainName = varDomainSplit[i] + "." + varDomainName
		}
	}
	return varDomainName.toLowerCase()
}

function getDocReferrer(f) {
	window.varNSafe = "general";
	window.varDocRef = "none";
	window.varReferrer = "";
	window.varDocRefType = "none";
	window.varDisp = "iframe";
	if (f != false && validURLPattern.test(f)) {
		varDocRef = f;
		window.varDocRef = f;
		window.varDisp = "iframe"
	} else {
		window.parentAllowed = false;
		window.current = window;
		try {
			for (i = 0; i <= 10; i++) {
				if ((window.current.parent != null) && (window.current.parent != window.current)) {
					var h = window.current.parent.location.toString();
					var g = h.length;
					if (g > 0) {
						window.current = window.current.parent;
						window.parentAllowed = true
					} else {
						window.parentAllowed = false;
						break
					}
				} else {
					if (i == 0) {
						window.parentAllowed = true
					}
					break
				}
			}
		} catch (j) {
			window.parentAllowed = false
		}
		if (window.current.document.referrer.length == 0) {
			varDocRef = window.current.location;
			window.varDisp = "none"
		} else {
			if (window.parentAllowed) {
				varDocRef = window.current.location;
				window.varDisp = "none"
			} else {
				varDocRef = window.current.document.referrer
			}
		}
	}
	varDomainName = getHostName(varDocRef);
	varUrlDomains = "jeetyetmedia.com,adnxs.com,rubiconproject.com,admeld.com,yieldmanager.com,udmserve.net,lijit.com,liftdna.com,doubleclick.net,mediadakine.com,afy11.net,brandaffinity.net,adtiger.de,technoratimedia.net,adjunky.com,iicdn.com,meviodisplayads.com,pubmatic.com,contextweb.com,alphabirdnetwork.com,openx.com,baronsoffers.com,888media.net,adk2.com,andomedia.com,adserve.com,oadsrv.com,adap.tv,adfrontiers.com,adjug.com,adjuggler.com,adjuggler.net,adshost1.com,adtechus.com,advertising.com,atdmt.com,auditude.com,buysellads.com,casalemedia.com,criteo.com,cubics.com,fastclick.net,fmpub.net,googleadservices.com,harrenmedianetwork.com,havamedia.net,indieclick.com,intellitxt.com,interclick.com,liverail.com,lqw.me,monkeybroker.net,openx.net,openx.org,picadmedia.com,publisheradnetwork.com,realmedia.com,revfusion.net,shinobi.jp,specificclick.net,tradepub.com,video-loader.com,videoegg.com,wahoha.com,xdev.info,xtendmedia.com,yadomedia.com,zedo.com";
	varSearchFor = varUrlDomains.indexOf(varDomainName);
	varUrlKeywords = "xxx|porn|sex|explicita|gay|horny|bdsm|milf|hentai|nude|shemale|boobs|fuck|anal|ass|xmovie|dick|cock|cunt|pussy|gloryhole|orgy|lesbian|bonner|3xhd|7797.info|adult|asianforumer.com|animetake.com|acidcow.com|7797.info|whore|tit|cum";
	varSearchExcKey = varDocRef.toString().search(varUrlKeywords);
	if (varSearchExcKey > -1) {
		window.varNSafe = "adult"
	}
	if (varSearchFor > -1) {
		window.varDocRefType = "adnetwork"
	}
	window.varReferrer = varDocRef;
	if (f != false) {
		varDocReturn = "&nsafe=" + window.varNSafe + "&reftype=" + window.varDocRefType + "&disp=" + window.varDisp
	} else {
		varDocReturn = "referrer=" + escape(varDocRef) + "&nsafe=" + window.varNSafe + "&reftype=" + window.varDocRefType + "&disp=" + window.varDisp
	}
	return varDocReturn
}
var myScript = scripts[scripts.length - icount];
var newBaseURL = myScript.src.replace(/^(https?):\/\/[^\/]*(.*\/\d+\/\d+\/\d+\/)uat_(\d+).js\??.*/, "$1://" + serverName + "$2adserv_$3.js");
var queryString = myScript.src.replace(/^[^\?]+\??/, "");
varQueryReferrer = parseQuery(queryString, "referrer");
varDocReferrer = getDocReferrer(varQueryReferrer);
if (!validURLPattern.test(varQueryReferrer)) {
	queryString = queryString.replace(varQueryReferrer, window.varReferrer)
}
var divID = document.getElementById("uat" + varDivRand);
var adStartHeight = findPosition(divID);
varQueryAdSize = parseQuery(queryString, "ad_size");
varQueryReferrer = parseQuery(queryString, "referrer");
varQueryDisp = parseQuery(queryString, "disp");
var adWidth = getWidth(varQueryAdSize);
var adHeight = getHeight(varQueryAdSize);
if (varQueryAdSize.indexOf(",") > -1) {
	var arrAdSize = varQueryAdSize.split(",");
	adWidth = getWidth(arrAdSize[0]);
	adHeight = getHeight(arrAdSize[0])
}
var windowHeight = WindowGetHeight();
var adEndHeight = parseInt(adStartHeight) + parseInt(adHeight / 2);
if (adEndHeight > windowHeight) {
	apnAboveFold = "below";
	tagPosition = "BTF"
} else {
	apnAboveFold = "above";
	tagPosition = "ATF"
}
window.tmiv = 1;
queryString = queryString + "&" + varDocReferrer + "&tmiv=" + window.tmiv;
var tcb = Math.random();
var uatUrl = newBaseURL + "?" + queryString + "&tcb=" + tcb + "&abv=" + tagPosition;
document.write('<script type="text/javascript" src=' + uatUrl + "><\/script>");