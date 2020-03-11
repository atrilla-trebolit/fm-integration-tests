package com.asofarma.fm.v2018

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class MassiveRestructureClients extends Simulation {

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
		"ZK-SID" -> "1227")

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
		"ZK-SID" -> "6827")

	val headers_8 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "6828")

	val headers_10 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "6829")

	val headers_12 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "6830")



	val scn = scenario("MassiveRestructure")
		.exec(http("request_0")
			.get("/fm")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(4)
		.exec(http("request_2")
			.post("/fm/zkau")
			.headers(headers_2)
			.formParam("dtid", "z_50h")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "q8BP9")
			.formParam("data_0", """{"value":"admin","start":5}""")
			.formParam("cmd_1", "onChange")
			.formParam("uuid_1", "q8BPa")
			.formParam("data_1", """{"value":"TecnofarmaHQ","start":12}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "q8BPf")
			.formParam("data_2", """{"pageX":989,"pageY":477,"which":1,"x":208,"y":26}""")
			.resources(http("request_3")
			.get("/fm/zkau?dtid=z_50h&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_4")
			.post("/fm/security_check")
			.headers(headers_4)
			.formParam("username", "admin")
			.formParam("password", "TecnofarmaHQ"),
            http("request_5")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd"),
            http("request_6")
			.get("/fm/script/asofarma.js?_=1583840196961")
			.headers(headers_6)))
		.pause(4)
		.exec(http("request_7")
			.post("/fm/zkau")
			.headers(headers_7)
			.formParam("dtid", "z_60h")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "p9CP84")
			.formParam("data_0", """{"items":["p9CP84"],"reference":"p9CP84"}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "p9CPa4")
			.formParam("data_1", """{"items":["p9CPb4"],"reference":"p9CPb4","clearFirst":false,"selectAll":false,"pageX":30,"pageY":468,"which":1,"x":29,"y":17}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "p9CPb4")
			.formParam("data_2", """{"pageX":30,"pageY":468,"which":1,"x":29,"y":17}"""))
		.pause(2)
		.exec(http("request_8")
			.post("/fm/zkau")
			.headers(headers_8)
			.formParam("dtid", "z_60h")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "p9CP05")
			.formParam("data_0", """{"pageX":317,"pageY":119,"which":1,"x":73,"y":8}""")
			.resources(http("request_9")
			.get("/fm/zkau/view/z_60h/dwnmed-0/0521/Clients.zip")
			.headers(headers_0)))
		.pause(10)
		.exec(http("request_10")
			.post("/fm/zkau")
			.headers(headers_10)
			.formParam("dtid", "z_60h")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "p9CP25")
			.formParam("data_0", """{"pageX":420,"pageY":115,"which":1,"x":56,"y":4}""")
			.resources(http("request_11")
			.get("/fm/zkau/view/z_60h/dwnmed-1/rac1/Clientes_Reestructuracion-2020_03_10.zip")
			.headers(headers_0)))
		.pause(7)
		.exec(http("request_12")
			.post("/fm/zkau")
			.headers(headers_12)
			.formParam("dtid", "z_60h")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "p9CPh")
			.formParam("data_0", """{"pageX":1895,"pageY":40,"which":1,"x":8,"y":11}""")
			.resources(http("request_13")
			.get("/fm/zkau?dtid=z_60h&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_14")
			.get("/fm/logout.zul")
			.headers(headers_0),
            http("request_15")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}