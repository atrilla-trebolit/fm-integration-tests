package com.asofarma.fm.v2018

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class ClientsProfesionals extends Simulation {

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
		"ZK-SID" -> "9096")

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
		"ZK-SID" -> "1379")

	val headers_8 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "1380")

	val headers_9 = Map("Accept" -> "image/webp,*/*")

	val headers_10 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "1381")

	val headers_11 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "1382")

	val headers_12 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "1383")

	val headers_13 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "1384")

	val headers_14 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "1385")

	val headers_15 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "1386")

	val headers_16 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "1387")

	val headers_17 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "1388")

	val headers_18 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "1389")

	val headers_19 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "1390")

	val headers_20 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "1391")

	val headers_21 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "1392")

	val headers_22 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "1393")

	val headers_23 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "1394")



	val scn = scenario("ClientsProfesionals")
		.exec(http("request_0")
			.get("/fm")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(1)
		.exec(http("request_2")
			.post("/fm/zkau")
			.headers(headers_2)
			.formParam("dtid", "z_hv00")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "tKlW9")
			.formParam("data_0", """{"value":"admin","start":5}""")
			.formParam("cmd_1", "onChange")
			.formParam("uuid_1", "tKlWa")
			.formParam("data_1", """{"value":"TecnofarmaHQ","start":12}""")
			.formParam("cmd_2", "onOK")
			.formParam("uuid_2", "tKlWa")
			.formParam("data_2", """{"reference":"tKlWa","keyCode":13,"charCode":0,"which":13}""")
			.resources(http("request_3")
			.get("/fm/zkau?dtid=z_hv00&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_4")
			.post("/fm/security_check")
			.headers(headers_4)
			.formParam("username", "admin")
			.formParam("password", "TecnofarmaHQ"),
            http("request_5")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd"),
            http("request_6")
			.get("/fm/script/asofarma.js?_=1583840811449")
			.headers(headers_6)))
		.pause(4)
		.exec(http("request_7")
			.post("/fm/zkau")
			.headers(headers_7)
			.formParam("dtid", "z_iv00")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "oEHX80")
			.formParam("data_0", """{"items":["oEHX80"],"reference":"oEHX80"}""")
			.formParam("cmd_1", "onAnchorPos")
			.formParam("uuid_1", "oEHXa0")
			.formParam("data_1", """{"top":33,"left":0}""")
			.formParam("cmd_2", "onSelect")
			.formParam("uuid_2", "oEHXa0")
			.formParam("data_2", """{"items":["oEHXd0"],"reference":"oEHXd0","clearFirst":false,"selectAll":false,"pageX":81,"pageY":212,"which":1,"x":80,"y":51}""")
			.formParam("cmd_3", "onClick")
			.formParam("uuid_3", "oEHXd0")
			.formParam("data_3", """{"pageX":81,"pageY":212,"which":1,"x":80,"y":18}"""))
		.pause(24)
		.exec(http("request_8")
			.post("/fm/zkau")
			.headers(headers_8)
			.formParam("dtid", "z_iv00")
			.formParam("cmd_0", "onOpen")
			.formParam("uuid_0", "oEHXo5")
			.formParam("data_0", """{"open":true}""")
			.formParam("cmd_1", "onChange")
			.formParam("uuid_1", "oEHXa7")
			.formParam("data_1", """{"value":"Activo","start":0}""")
			.formParam("cmd_2", "onSelect")
			.formParam("uuid_2", "oEHXa7")
			.formParam("data_2", """{"items":["oEHXb7"],"reference":"oEHXb7"}""")
			.formParam("cmd_3", "onClick")
			.formParam("uuid_3", "oEHXh5")
			.formParam("data_3", """{"pageX":400,"pageY":184,"which":1,"x":34,"y":8}""")
			.resources(http("request_9")
			.get("/fm/zkau/web/79565750/zul/img/msgbox/question-btn.png")
			.headers(headers_9)))
		.pause(3)
		.exec(http("request_10")
			.post("/fm/zkau")
			.headers(headers_10)
			.formParam("dtid", "z_iv00")
			.formParam("cmd_0", "onMove")
			.formParam("opt_0", "i")
			.formParam("uuid_0", "oEHXl4")
			.formParam("data_0", """{"left":"786px","top":"100px"}""")
			.formParam("cmd_1", "onZIndex")
			.formParam("opt_1", "i")
			.formParam("uuid_1", "oEHXl4")
			.formParam("data_1", """{"":1800}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "oEHXaz2")
			.formParam("data_2", """{"pageX":989,"pageY":224,"which":1,"x":27,"y":9}"""))
		.pause(6)
		.exec(http("request_11")
			.post("/fm/zkau")
			.headers(headers_11)
			.formParam("dtid", "z_iv00")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "oEHXy5")
			.formParam("data_0", """{"value":"Médico","start":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "oEHXy5")
			.formParam("data_1", """{"items":["oEHX46"],"reference":"oEHX46"}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "oEHXh5")
			.formParam("data_2", """{"pageX":391,"pageY":181,"which":1,"x":25,"y":5}"""))
		.pause(2)
		.exec(http("request_12")
			.post("/fm/zkau")
			.headers(headers_12)
			.formParam("dtid", "z_iv00")
			.formParam("cmd_0", "onMove")
			.formParam("opt_0", "i")
			.formParam("uuid_0", "oEHXl4")
			.formParam("data_0", """{"left":"786px","top":"100px"}""")
			.formParam("cmd_1", "onZIndex")
			.formParam("opt_1", "i")
			.formParam("uuid_1", "oEHXl4")
			.formParam("data_1", """{"":1800}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "oEHXaz2")
			.formParam("data_2", """{"pageX":992,"pageY":226,"which":1,"x":30,"y":11}"""))
		.pause(6)
		.exec(http("request_13")
			.post("/fm/zkau")
			.headers(headers_13)
			.formParam("dtid", "z_iv00")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "oEHXw5")
			.formParam("data_0", """{"value":"Lopez","start":5}""")
			.formParam("cmd_1", "onClick")
			.formParam("uuid_1", "oEHXh5")
			.formParam("data_1", """{"pageX":390,"pageY":186,"which":1,"x":24,"y":10}"""))
		.pause(4)
		.exec(http("request_14")
			.post("/fm/zkau")
			.headers(headers_14)
			.formParam("dtid", "z_iv00")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "oEHXw9")
			.formParam("data_0", """{"items":["oEHXl4"],"reference":"oEHXl4","clearFirst":false,"selectAll":true,"pageX":241,"pageY":560,"which":1,"x":11,"y":49}""")
			.formParam("cmd_1", "onClick")
			.formParam("uuid_1", "oEHXw4")
			.formParam("data_1", """{"pageX":341,"pageY":143,"which":1,"x":45,"y":16}""")
			.resources(http("request_15")
			.post("/fm/zkau")
			.headers(headers_15)
			.formParam("dtid", "z_iv00")
			.formParam("cmd_0", "echo")
			.formParam("opt_0", "i")
			.formParam("uuid_0", "oEHXed2")
			.formParam("data_0", """{"":["onChange"]}""")))
		.pause(7)
		.exec(http("request_16")
			.post("/fm/zkau")
			.headers(headers_16)
			.formParam("dtid", "z_iv00")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "oEHX0y2")
			.formParam("data_0", """{"value":"OSCAR","start":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "oEHX9b2")
			.formParam("data_1", """{"items":["oEHXza2"],"reference":"oEHXza2","clearFirst":false,"selectAll":false,"pageX":713,"pageY":865,"which":1,"x":462,"y":63}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "oEHXza2")
			.formParam("data_2", """{"pageX":713,"pageY":865,"which":1,"x":462,"y":33}""")
			.resources(http("request_17")
			.post("/fm/zkau")
			.headers(headers_17)
			.formParam("dtid", "z_iv00")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "oEHXza2")
			.formParam("data_0", """{"pageX":713,"pageY":865,"which":1,"x":462,"y":33}"""),
            http("request_18")
			.post("/fm/zkau")
			.headers(headers_18)
			.formParam("dtid", "z_iv00")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "oEHXza2")
			.formParam("data_0", """{"pageX":713,"pageY":865,"which":1,"x":462,"y":33}""")
			.formParam("cmd_1", "onDoubleClick")
			.formParam("uuid_1", "oEHXza2")
			.formParam("data_1", """{"pageX":713,"pageY":865,"which":1,"x":462,"y":33}""")))
		.pause(7)
		.exec(http("request_19")
			.post("/fm/zkau")
			.headers(headers_19)
			.formParam("dtid", "z_iv00")
			.formParam("cmd_0", "onError")
			.formParam("uuid_0", "oEHXcc2")
			.formParam("data_0", """{"value":"","message":"No se permite vacio o espacios en blanco.\nDebe especificar un valor diferente"}""")
			.formParam("cmd_1", "onClick")
			.formParam("uuid_1", "oEHXqy2")
			.formParam("data_1", """{"pageX":369,"pageY":118,"which":1,"x":56,"y":12}""")
			.resources(http("request_20")
			.post("/fm/zkau")
			.headers(headers_20)
			.formParam("dtid", "z_iv00")
			.formParam("cmd_0", "echo")
			.formParam("opt_0", "i")
			.formParam("uuid_0", "oEHXdi1")
			.formParam("data_0", """{"":["onChange"]}""")))
		.pause(1)
		.exec(http("request_21")
			.post("/fm/zkau")
			.headers(headers_21)
			.formParam("dtid", "z_iv00")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "oEHXj22")
			.formParam("data_0", """{"value":"ADEMAR","start":0}""")
			.resources(http("request_22")
			.post("/fm/zkau")
			.headers(headers_22)
			.formParam("dtid", "z_iv00")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "oEHX132")
			.formParam("data_0", """{"pageX":461,"pageY":81,"which":1,"x":18,"y":5}""")))
		.pause(2)
		.exec(http("request_23")
			.post("/fm/zkau")
			.headers(headers_23)
			.formParam("dtid", "z_iv00")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "oEHXh")
			.formParam("data_0", """{"pageX":1913,"pageY":44,"which":1,"x":26,"y":15}""")
			.resources(http("request_24")
			.get("/fm/zkau?dtid=z_iv00&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_25")
			.get("/fm/logout.zul")
			.headers(headers_0),
            http("request_26")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(2)
		.exec(http("request_27")
			.get("/fm/zkau?dtid=z_qq2&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}