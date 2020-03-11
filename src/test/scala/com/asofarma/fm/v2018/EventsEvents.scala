package com.asofarma.fm.v2018

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class EventsEvents extends Simulation {

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
		"ZK-SID" -> "3560")

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
		"ZK-SID" -> "6907")

	val headers_8 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "6908")

	val headers_9 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "6909")

	val headers_10 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "6910")

	val headers_11 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "6911")

	val headers_12 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "6912")

	val headers_13 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "6913")



	val scn = scenario("EventsEvents")
		.exec(http("request_0")
			.get("/fm")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(3)
		.exec(http("request_2")
			.post("/fm/zkau")
			.headers(headers_2)
			.formParam("dtid", "z_5i40")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "v4NW9")
			.formParam("data_0", """{"value":"admin","start":5}""")
			.formParam("cmd_1", "onClick")
			.formParam("uuid_1", "v4NWf")
			.formParam("data_1", """{"pageX":969,"pageY":473,"which":1,"x":188,"y":22}""")
			.resources(http("request_3")
			.get("/fm/zkau?dtid=z_5i40&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_4")
			.post("/fm/security_check")
			.headers(headers_4)
			.formParam("username", "admin")
			.formParam("password", "TecnofarmaHQ"),
            http("request_5")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd"),
            http("request_6")
			.get("/fm/script/asofarma.js?_=1583927718286")
			.headers(headers_6)))
		.pause(6)
		.exec(http("request_7")
			.post("/fm/zkau")
			.headers(headers_7)
			.formParam("dtid", "z_6i40")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "qYsWc2")
			.formParam("data_0", """{"items":["qYsWc2"],"reference":"qYsWc2"}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "qYsWe2")
			.formParam("data_1", """{"items":["qYsWf2"],"reference":"qYsWf2","clearFirst":false,"selectAll":false,"pageX":88,"pageY":295,"which":1,"x":87,"y":18}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "qYsWf2")
			.formParam("data_2", """{"pageX":88,"pageY":295,"which":1,"x":87,"y":18}"""))
		.pause(6)
		.exec(http("request_8")
			.post("/fm/zkau")
			.headers(headers_8)
			.formParam("dtid", "z_6i40")
			.formParam("cmd_0", "onOpen")
			.formParam("uuid_0", "qYsWc5")
			.formParam("data_0", """{"open":true}""")
			.formParam("cmd_1", "onChange")
			.formParam("uuid_1", "qYsWi5")
			.formParam("data_1", """{"value":"Corporativo","start":0}""")
			.formParam("cmd_2", "onSelect")
			.formParam("uuid_2", "qYsWi5")
			.formParam("data_2", """{"items":["qYsWj5"],"reference":"qYsWj5"}""")
			.formParam("cmd_3", "onClick")
			.formParam("uuid_3", "qYsW75")
			.formParam("data_3", """{"pageX":271,"pageY":183,"which":1,"x":27,"y":7}"""))
		.pause(6)
		.exec(http("request_9")
			.post("/fm/zkau")
			.headers(headers_9)
			.formParam("dtid", "z_6i40")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "qYsWi5")
			.formParam("data_0", """{"value":"No Corporativo","start":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "qYsWi5")
			.formParam("data_1", """{"items":["qYsWk5"],"reference":"qYsWk5","prevSeld":"qYsWj5"}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "qYsW75")
			.formParam("data_2", """{"pageX":282,"pageY":187,"which":1,"x":38,"y":11}"""))
		.pause(11)
		.exec(http("request_10")
			.post("/fm/zkau")
			.headers(headers_10)
			.formParam("dtid", "z_6i40")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "qYsWi5")
			.formParam("data_0", """{"value":"Corporativo","start":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "qYsWi5")
			.formParam("data_1", """{"items":["qYsWj5"],"reference":"qYsWj5","prevSeld":"qYsWk5"}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "qYsW75")
			.formParam("data_2", """{"pageX":268,"pageY":181,"which":1,"x":24,"y":5}"""))
		.pause(3)
		.exec(http("request_11")
			.post("/fm/zkau")
			.headers(headers_11)
			.formParam("dtid", "z_6i40")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "qYsWt5")
			.formParam("data_0", """{"items":["qYsWu5"],"reference":"qYsWu5","clearFirst":true,"selectAll":false,"pageX":1006,"pageY":272,"which":1,"x":3,"y":13}""")
			.formParam("cmd_1", "onClick")
			.formParam("uuid_1", "qYsW75")
			.formParam("data_1", """{"pageX":289,"pageY":190,"which":1,"x":45,"y":14}"""))
		.pause(13)
		.exec(http("request_12")
			.post("/fm/zkau")
			.headers(headers_12)
			.formParam("dtid", "z_6i40")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "qYsWr5")
			.formParam("data_0", """{"value":"SAN","start":3}""")
			.formParam("cmd_1", "onClick")
			.formParam("uuid_1", "qYsW75")
			.formParam("data_1", """{"pageX":289,"pageY":186,"which":1,"x":45,"y":10}"""))
		.pause(1)
		.exec(http("request_13")
			.post("/fm/zkau")
			.headers(headers_13)
			.formParam("dtid", "z_6i40")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "qYsW75")
			.formParam("data_0", """{"pageX":289,"pageY":186,"which":1,"x":45,"y":10}"""))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}