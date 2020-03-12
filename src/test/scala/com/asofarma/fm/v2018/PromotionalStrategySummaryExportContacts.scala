package com.asofarma.fm.v2018

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class PromotionalStrategySummaryExportContacts extends Simulation {

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
		"ZK-SID" -> "871")

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
		"ZK-SID" -> "3977")

	val headers_8 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3978")

	val headers_9 = Map("Accept" -> "image/webp,*/*")

	val headers_10 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3979")

	val headers_12 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3980")

	val headers_13 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3981")

	val headers_14 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3982")

	val headers_15 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3983")



	val scn = scenario("PromotionalStrategyExportContacts")
		.exec(http("request_0")
			.get("/fm")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(3)
		.exec(http("request_2")
			.post("/fm/zkau")
			.headers(headers_2)
			.formParam("dtid", "z_j7d")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "uV3Q9")
			.formParam("data_0", """{"value":"admin","start":5}""")
			.formParam("cmd_1", "onClick")
			.formParam("uuid_1", "uV3Qf")
			.formParam("data_1", """{"pageX":875,"pageY":467,"which":1,"x":94,"y":16}""")
			.resources(http("request_3")
			.get("/fm/zkau?dtid=z_j7d&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_4")
			.post("/fm/security_check")
			.headers(headers_4)
			.formParam("username", "admin")
			.formParam("password", "TecnofarmaHQ"),
            http("request_5")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd"),
            http("request_6")
			.get("/fm/script/asofarma.js?_=1584022315893")
			.headers(headers_6)))
		.pause(5)
		.exec(http("request_7")
			.post("/fm/zkau")
			.headers(headers_7)
			.formParam("dtid", "z_k7d")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "tW4Qu0")
			.formParam("data_0", """{"items":["tW4Qu0"],"reference":"tW4Qu0"}""")
			.formParam("cmd_1", "onAnchorPos")
			.formParam("uuid_1", "tW4Qw0")
			.formParam("data_1", """{"top":132,"left":0}""")
			.formParam("cmd_2", "onSelect")
			.formParam("uuid_2", "tW4Qw0")
			.formParam("data_2", """{"items":["tW4Q41"],"reference":"tW4Q41","clearFirst":false,"selectAll":false,"pageX":105,"pageY":367,"which":1,"x":104,"y":148}""")
			.formParam("cmd_3", "onClick")
			.formParam("uuid_3", "tW4Q41")
			.formParam("data_3", """{"pageX":105,"pageY":367,"which":1,"x":104,"y":16}"""))
		.pause(3)
		.exec(http("request_8")
			.post("/fm/zkau")
			.headers(headers_8)
			.formParam("dtid", "z_k7d")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "tW4Q55")
			.formParam("data_0", """{"pageX":669,"pageY":137,"which":1,"x":45,"y":10}""")
			.resources(http("request_9")
			.get("/fm/img/icon/down.png")
			.headers(headers_9)))
		.pause(1)
		.exec(http("request_10")
			.post("/fm/zkau")
			.headers(headers_10)
			.formParam("dtid", "z_k7d")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "tW4Qd8")
			.formParam("data_0", """{"pageX":333,"pageY":84,"which":1,"x":89,"y":9}""")
			.resources(http("request_11")
			.get("/fm/zkau/view/z_k7d/dwnmed-0/k8r/Contactos%20Sin%20Plan.csv")
			.headers(headers_0)))
		.pause(8)
		.exec(http("request_12")
			.post("/fm/zkau")
			.headers(headers_12)
			.formParam("dtid", "z_k7d")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "tW4Qeo")
			.formParam("data_0", """{"pageX":404,"pageY":94,"which":1,"x":28,"y":18}"""))
		.pause(3)
		.exec(http("request_13")
			.post("/fm/zkau")
			.headers(headers_13)
			.formParam("dtid", "z_k7d")
			.formParam("cmd_0", "onOpen")
			.formParam("uuid_0", "tW4Qsa")
			.formParam("data_0", """{"open":true,"reference":"tW4Qvv"}""")
			.resources(http("request_14")
			.post("/fm/zkau")
			.headers(headers_14)
			.formParam("dtid", "z_k7d")
			.formParam("cmd_0", "onOpen")
			.formParam("uuid_0", "tW4Qsa")
			.formParam("data_0", """{"open":false}"""),
            http("request_15")
			.post("/fm/zkau")
			.headers(headers_15)
			.formParam("dtid", "z_k7d")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "tW4Qh")
			.formParam("data_0", """{"pageX":1885,"pageY":42,"which":1,"x":15,"y":13}"""),
            http("request_16")
			.get("/fm/zkau?dtid=z_k7d&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_17")
			.get("/fm/logout.zul")
			.headers(headers_0),
            http("request_18")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(1)
		.exec(http("request_19")
			.get("/fm/zkau?dtid=z_sc30&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}