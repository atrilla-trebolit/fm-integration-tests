package com.asofarma.fm.v2018

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class ClientsInstitutions extends Simulation {

	val httpProtocol = http
		.baseUrl("http://fm.trebolit.com.ar:8080")
		.inferHtmlResources()
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:73.0) Gecko/20100101 Firefox/73.0")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_2 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "7587")

	val headers_3 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_4 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_6 = Map(
		"Accept" -> "text/javascript, application/javascript, application/ecmascript, application/x-ecmascript, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_7 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "46")

	val headers_8 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "47")

	val headers_9 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "48")

	val headers_10 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "49")

	val headers_11 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "50")

	val headers_12 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "51")

	val headers_13 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "52")

	val headers_14 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "53")

	val headers_15 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "54")

	val headers_16 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "55")

	val headers_17 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "56")

	val headers_18 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "57")

	val headers_19 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "58")

	val headers_20 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "59")

	val headers_21 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "60")

	val headers_22 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "61")

	val headers_23 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "62")

	val headers_24 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "63")

	val headers_25 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "64")

	val headers_26 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "65")

	val headers_27 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "66")

	val headers_28 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "67")

	val headers_29 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "68")



	val scn = scenario("ClientsInstitutions")
		.exec(http("request_0")
			.get("/fm")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(2)
		.exec(http("request_2")
			.post("/fm/zkau")
			.headers(headers_2)
			.formParam("dtid", "z_nd6")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "nF9Q9")
			.formParam("data_0", """{"value":"admin","start":5}""")
			.formParam("cmd_1", "onClick")
			.formParam("uuid_1", "nF9Qf")
			.formParam("data_1", """{"pageX":894,"pageY":475,"which":1,"x":113,"y":24}""")
			.resources(http("request_3")
			.get("/fm/zkau?dtid=z_nd6&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_4")
			.post("/fm/security_check")
			.headers(headers_4)
			.formParam("username", "admin")
			.formParam("password", "TecnofarmaHQ"),
            http("request_5")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd"),
            http("request_6")
			.get("/fm/script/asofarma.js?_=1583927931406")
			.headers(headers_6)))
		.pause(2)
		.exec(http("request_7")
			.post("/fm/zkau")
			.headers(headers_7)
			.formParam("dtid", "z_od6")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "mGAQ80")
			.formParam("data_0", """{"items":["mGAQ80"],"reference":"mGAQ80"}""")
			.formParam("cmd_1", "onAnchorPos")
			.formParam("uuid_1", "mGAQa0")
			.formParam("data_1", """{"top":66,"left":0}""")
			.formParam("cmd_2", "onSelect")
			.formParam("uuid_2", "mGAQa0")
			.formParam("data_2", """{"items":["mGAQf0"],"reference":"mGAQf0","clearFirst":false,"selectAll":false,"pageX":51,"pageY":235,"which":1,"x":50,"y":74}""")
			.formParam("cmd_3", "onClick")
			.formParam("uuid_3", "mGAQf0")
			.formParam("data_3", """{"pageX":51,"pageY":235,"which":1,"x":50,"y":8}"""))
		.pause(7)
		.exec(http("request_8")
			.post("/fm/zkau")
			.headers(headers_8)
			.formParam("dtid", "z_od6")
			.formParam("cmd_0", "onOpen")
			.formParam("uuid_0", "mGAQk5")
			.formParam("data_0", """{"open":true}""")
			.formParam("cmd_1", "onChange")
			.formParam("uuid_1", "mGAQ16")
			.formParam("data_1", """{"value":"NO","start":0}""")
			.formParam("cmd_2", "onSelect")
			.formParam("uuid_2", "mGAQ16")
			.formParam("data_2", """{"items":["mGAQ26"],"reference":"mGAQ26"}""")
			.formParam("cmd_3", "onClick")
			.formParam("uuid_3", "mGAQd5")
			.formParam("data_3", """{"pageX":393,"pageY":182,"which":1,"x":27,"y":6}"""))
		.pause(4)
		.exec(http("request_9")
			.post("/fm/zkau")
			.headers(headers_9)
			.formParam("dtid", "z_od6")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "mGAQ16")
			.formParam("data_0", """{"value":"SI","start":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "mGAQ16")
			.formParam("data_1", """{"items":["mGAQ36"],"reference":"mGAQ36","prevSeld":"mGAQ26"}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "mGAQd5")
			.formParam("data_2", """{"pageX":392,"pageY":186,"which":1,"x":26,"y":10}"""))
		.pause(1)
		.exec(http("request_10")
			.post("/fm/zkau")
			.headers(headers_10)
			.formParam("dtid", "z_od6")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "mGAQq7")
			.formParam("data_0", """{"items":["mGAQzp"],"reference":"mGAQzp","clearFirst":true,"selectAll":false,"pageX":402,"pageY":352,"which":1,"x":172,"y":47}""")
			.formParam("cmd_1", "onDoubleClick")
			.formParam("uuid_1", "mGAQzp")
			.formParam("data_1", """{"pageX":402,"pageY":352,"which":1,"x":172,"y":17}"""))
		.pause(2)
		.exec(http("request_11")
			.post("/fm/zkau")
			.headers(headers_11)
			.formParam("dtid", "z_od6")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "mGAQjf")
			.formParam("data_0", """{"value":"1727","start":0}"""))
		.pause(4)
		.exec(http("request_12")
			.post("/fm/zkau")
			.headers(headers_12)
			.formParam("dtid", "z_od6")
			.formParam("cmd_0", "onError")
			.formParam("uuid_0", "mGAQme")
			.formParam("data_0", """{"value":"","message":"No se permite vacio o espacios en blanco.\nDebe especificar un valor diferente"}""")
			.formParam("cmd_1", "onClick")
			.formParam("uuid_1", "mGAQlf")
			.formParam("data_1", """{"pageX":355,"pageY":115,"which":1,"x":42,"y":9}""")
			.resources(http("request_13")
			.post("/fm/zkau")
			.headers(headers_13)
			.formParam("dtid", "z_od6")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "mGAQoc")
			.formParam("data_0", """{"value":"1727 LA BLANQUEADA","start":0}""")
			.formParam("cmd_1", "onClick")
			.formParam("uuid_1", "mGAQqc")
			.formParam("data_1", """{"pageX":355,"pageY":115,"which":1,"x":44,"y":10}""")))
		.pause(1)
		.exec(http("request_14")
			.post("/fm/zkau")
			.headers(headers_14)
			.formParam("dtid", "z_od6")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "mGAQt9")
			.formParam("data_0", """{"value":"1727 PRADO","start":0}""")
			.formParam("cmd_1", "onClick")
			.formParam("uuid_1", "mGAQ4a")
			.formParam("data_1", """{"pageX":355,"pageY":115,"which":1,"x":44,"y":10}"""))
		.pause(3)
		.exec(http("request_15")
			.post("/fm/zkau")
			.headers(headers_15)
			.formParam("dtid", "z_od6")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "mGAQrv")
			.formParam("data_0", """{"value":"AMSJ","start":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "mGAQcu")
			.formParam("data_1", """{"items":["mGAQ0u"],"reference":"mGAQ0u","clearFirst":false,"selectAll":false,"pageX":555,"pageY":496,"which":1,"x":310,"y":40}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "mGAQ0u")
			.formParam("data_2", """{"pageX":555,"pageY":496,"which":1,"x":310,"y":10}""")
			.resources(http("request_16")
			.post("/fm/zkau")
			.headers(headers_16)
			.formParam("dtid", "z_od6")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "mGAQ0u")
			.formParam("data_0", """{"pageX":555,"pageY":496,"which":1,"x":310,"y":10}""")
			.formParam("cmd_1", "onDoubleClick")
			.formParam("uuid_1", "mGAQ0u")
			.formParam("data_1", """{"pageX":555,"pageY":496,"which":1,"x":310,"y":10}""")))
		.pause(2)
		.exec(http("request_17")
			.post("/fm/zkau")
			.headers(headers_17)
			.formParam("dtid", "z_od6")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "mGAQ2w")
			.formParam("data_0", """{"pageX":335,"pageY":118,"which":1,"x":24,"y":13}"""))
		.pause(1)
		.exec(http("request_18")
			.post("/fm/zkau")
			.headers(headers_18)
			.formParam("dtid", "z_od6")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "mGAQws")
			.formParam("data_0", """{"value":"ANCAP","start":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "mGAQhr")
			.formParam("data_1", """{"items":["mGAQ5r"],"reference":"mGAQ5r","clearFirst":false,"selectAll":false,"pageX":554,"pageY":505,"which":1,"x":309,"y":49}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "mGAQ5r")
			.formParam("data_2", """{"pageX":554,"pageY":505,"which":1,"x":309,"y":19}""")
			.resources(http("request_19")
			.post("/fm/zkau")
			.headers(headers_19)
			.formParam("dtid", "z_od6")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "mGAQ5r")
			.formParam("data_0", """{"pageX":554,"pageY":505,"which":1,"x":309,"y":19}""")
			.formParam("cmd_1", "onDoubleClick")
			.formParam("uuid_1", "mGAQ5r")
			.formParam("data_1", """{"pageX":554,"pageY":505,"which":1,"x":309,"y":19}""")))
		.pause(5)
		.exec(http("request_20")
			.post("/fm/zkau")
			.headers(headers_20)
			.formParam("dtid", "z_od6")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "mGAQit")
			.formParam("data_0", """{"pageX":412,"pageY":83,"which":1,"x":103,"y":8}"""))
		.pause(2)
		.exec(http("request_21")
			.post("/fm/zkau")
			.headers(headers_21)
			.formParam("dtid", "z_od6")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "mGAQat")
			.formParam("data_0", """{"pageX":487,"pageY":83,"which":1,"x":33,"y":7}"""))
		.pause(2)
		.exec(http("request_22")
			.post("/fm/zkau")
			.headers(headers_22)
			.formParam("dtid", "z_od6")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "mGAQy6")
			.formParam("data_0", """{"top":66,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "mGAQy6")
			.formParam("data_1", """{"items":["mGAQpp"],"reference":"mGAQpp","clearFirst":true,"selectAll":false,"pageX":291,"pageY":418,"which":1,"x":61,"y":113}""")
			.formParam("cmd_2", "onDoubleClick")
			.formParam("uuid_2", "mGAQpp")
			.formParam("data_2", """{"pageX":291,"pageY":418,"which":1,"x":61,"y":17}"""))
		.pause(2)
		.exec(http("request_23")
			.post("/fm/zkau")
			.headers(headers_23)
			.formParam("dtid", "z_od6")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "mGAQj8")
			.formParam("data_0", """{"value":"1727 PRADO","start":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "mGAQpe")
			.formParam("data_1", """{"items":["mGAQde"],"reference":"mGAQde","clearFirst":false,"selectAll":false,"pageX":618,"pageY":506,"which":1,"x":373,"y":50}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "mGAQde")
			.formParam("data_2", """{"pageX":618,"pageY":506,"which":1,"x":373,"y":20}""")
			.resources(http("request_24")
			.post("/fm/zkau")
			.headers(headers_24)
			.formParam("dtid", "z_od6")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "mGAQde")
			.formParam("data_0", """{"pageX":618,"pageY":506,"which":1,"x":373,"y":20}"""),
            http("request_25")
			.post("/fm/zkau")
			.headers(headers_25)
			.formParam("dtid", "z_od6")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "mGAQde")
			.formParam("data_0", """{"pageX":618,"pageY":506,"which":1,"x":373,"y":20}""")
			.formParam("cmd_1", "onDoubleClick")
			.formParam("uuid_1", "mGAQde")
			.formParam("data_1", """{"pageX":618,"pageY":506,"which":1,"x":373,"y":20}""")))
		.pause(9)
		.exec(http("request_26")
			.post("/fm/zkau")
			.headers(headers_26)
			.formParam("dtid", "z_od6")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "mGAQ48")
			.formParam("data_0", """{"pageX":471,"pageY":84,"which":1,"x":28,"y":8}"""))
		.pause(4)
		.exec(http("request_27")
			.post("/fm/zkau")
			.headers(headers_27)
			.formParam("dtid", "z_od6")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "mGAQnd")
			.formParam("data_0", """{"pageX":705,"pageY":139,"which":1,"x":43,"y":12}"""))
		.pause(1)
		.exec(http("request_28")
			.post("/fm/zkau")
			.headers(headers_28)
			.formParam("dtid", "z_od6")
			.formParam("cmd_0", "onMove")
			.formParam("opt_0", "i")
			.formParam("uuid_0", "mGAQu5")
			.formParam("data_0", """{"left":"786px","top":"100px"}""")
			.formParam("cmd_1", "onZIndex")
			.formParam("opt_1", "i")
			.formParam("uuid_1", "mGAQu5")
			.formParam("data_1", """{"":1800}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "mGAQ16")
			.formParam("data_2", """{"pageX":967,"pageY":218,"which":1,"x":31,"y":18}"""))
		.pause(2)
		.exec(http("request_29")
			.post("/fm/zkau")
			.headers(headers_29)
			.formParam("dtid", "z_od6")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "mGAQh")
			.formParam("data_0", """{"pageX":1904,"pageY":34,"which":1,"x":17,"y":5}""")
			.resources(http("request_30")
			.get("/fm/zkau?dtid=z_od6&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_31")
			.get("/fm/logout.zul")
			.headers(headers_0),
            http("request_32")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(1)
		.exec(http("request_33")
			.get("/fm/zkau?dtid=z_6c9&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}