package com.asofarma.fm.v2018

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class PromotionalStructurePromotionalLines extends Simulation {

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
		"ZK-SID" -> "9791")

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
		"ZK-SID" -> "3475")

	val headers_8 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3476")

	val headers_9 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3477")

	val headers_10 = Map("Accept" -> "image/webp,*/*")

	val headers_11 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3478")

	val headers_12 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3479")

	val headers_13 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3480")

	val headers_14 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3481")



	val scn = scenario("PromotionalStructurePromotionalLines")
		.exec(http("request_0")
			.get("/fm")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(3)
		.exec(http("request_2")
			.post("/fm/zkau")
			.headers(headers_2)
			.formParam("dtid", "z_8xc")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "ePGP9")
			.formParam("data_0", """{"value":"admin","start":5}""")
			.formParam("cmd_1", "onChange")
			.formParam("uuid_1", "ePGPa")
			.formParam("data_1", """{"value":"TecnofarmaHQ","start":12}""")
			.formParam("cmd_2", "onOK")
			.formParam("uuid_2", "ePGPa")
			.formParam("data_2", """{"reference":"ePGPa","keyCode":13,"charCode":0,"which":13}""")
			.resources(http("request_3")
			.get("/fm/zkau?dtid=z_8xc&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_4")
			.post("/fm/security_check")
			.headers(headers_4)
			.formParam("username", "admin")
			.formParam("password", "TecnofarmaHQ"),
            http("request_5")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd"),
            http("request_6")
			.get("/fm/script/asofarma.js?_=1583840713556")
			.headers(headers_6)))
		.pause(5)
		.exec(http("request_7")
			.post("/fm/zkau")
			.headers(headers_7)
			.formParam("dtid", "z_9xc")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "dQHPu0")
			.formParam("data_0", """{"items":["dQHPu0"],"reference":"dQHPu0"}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "dQHPw0")
			.formParam("data_1", """{"items":["dQHPx0"],"reference":"dQHPx0","clearFirst":false,"selectAll":false,"pageX":98,"pageY":232,"which":1,"x":97,"y":13}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "dQHPx0")
			.formParam("data_2", """{"pageX":98,"pageY":232,"which":1,"x":97,"y":13}"""))
		.pause(6)
		.exec(http("request_8")
			.post("/fm/zkau")
			.headers(headers_8)
			.formParam("dtid", "z_9xc")
			.formParam("cmd_0", "onOpen")
			.formParam("uuid_0", "dQHPc5")
			.formParam("data_0", """{"open":true}""")
			.formParam("cmd_1", "onChange")
			.formParam("uuid_1", "dQHPi5")
			.formParam("data_1", """{"value":"Ole","start":0}""")
			.formParam("cmd_2", "onSelect")
			.formParam("uuid_2", "dQHPi5")
			.formParam("data_2", """{"items":["dQHPk5"],"reference":"dQHPk5"}""")
			.formParam("cmd_3", "onClick")
			.formParam("uuid_3", "dQHP75")
			.formParam("data_3", """{"pageX":274,"pageY":183,"which":1,"x":30,"y":7}"""))
		.pause(2)
		.exec(http("request_9")
			.post("/fm/zkau")
			.headers(headers_9)
			.formParam("dtid", "z_9xc")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "dQHP_6")
			.formParam("data_0", """{"top":66,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "dQHP_6")
			.formParam("data_1", """{"items":["dQHPq6"],"reference":"dQHPq6","clearFirst":false,"selectAll":true,"pageX":244,"pageY":419,"which":1,"x":14,"y":112}""")
			.formParam("cmd_2", "onSelect")
			.formParam("uuid_2", "dQHP_6")
			.formParam("data_2", """{"items":[],"reference":"dQHPq6","clearFirst":true,"selectAll":"","pageX":244,"pageY":419,"which":1,"x":14,"y":112}""")
			.formParam("cmd_3", "onDoubleClick")
			.formParam("uuid_3", "dQHPq6")
			.formParam("data_3", """{"pageX":244,"pageY":419,"which":1,"x":14,"y":16}""")
			.resources(http("request_10")
			.get("/fm/zkau/web/79565750/zul/img/msgbox/info-btn.png")
			.headers(headers_10)))
		.pause(1)
		.exec(http("request_11")
			.post("/fm/zkau")
			.headers(headers_11)
			.formParam("dtid", "z_9xc")
			.formParam("cmd_0", "onMove")
			.formParam("opt_0", "i")
			.formParam("uuid_0", "dQHPy6")
			.formParam("data_0", """{"left":"786px","top":"100px"}""")
			.formParam("cmd_1", "onZIndex")
			.formParam("opt_1", "i")
			.formParam("uuid_1", "dQHPy6")
			.formParam("data_1", """{"":1800}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "dQHPq7")
			.formParam("data_2", """{"pageX":961,"pageY":206,"which":1,"x":25,"y":6}"""))
		.pause(2)
		.exec(http("request_12")
			.post("/fm/zkau")
			.headers(headers_12)
			.formParam("dtid", "z_9xc")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "dQHP_6")
			.formParam("data_0", """{"items":["dQHPq6"],"reference":"dQHPq6","clearFirst":false,"selectAll":true,"pageX":241,"pageY":422,"which":1,"x":11,"y":115}""")
			.formParam("cmd_1", "onDoubleClick")
			.formParam("uuid_1", "dQHPq6")
			.formParam("data_1", """{"pageX":263,"pageY":418,"which":1,"x":33,"y":15}"""))
		.pause(10)
		.exec(http("request_13")
			.post("/fm/zkau")
			.headers(headers_13)
			.formParam("dtid", "z_9xc")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "dQHPj7")
			.formParam("data_0", """{"pageX":334,"pageY":86,"which":1,"x":25,"y":11}"""))
		.pause(4)
		.exec(http("request_14")
			.post("/fm/zkau")
			.headers(headers_14)
			.formParam("dtid", "z_9xc")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "dQHPh")
			.formParam("data_0", """{"pageX":1901,"pageY":45,"which":1,"x":14,"y":16}""")
			.resources(http("request_15")
			.get("/fm/zkau?dtid=z_9xc&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_16")
			.get("/fm/logout.zul")
			.headers(headers_0),
            http("request_17")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}