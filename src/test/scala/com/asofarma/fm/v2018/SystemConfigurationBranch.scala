package com.asofarma.fm.v2018

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class SystemConfigurationBranch extends Simulation {

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
		"ZK-SID" -> "6248")

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
		"ZK-SID" -> "8942")

	val headers_8 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "8943")

	val headers_9 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "8944")



	val scn = scenario("SystemConfigurationBranch")
		.exec(http("request_0")
			.get("/fm")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(2)
		.exec(http("request_2")
			.post("/fm/zkau")
			.headers(headers_2)
			.formParam("dtid", "z_wk4")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "lWIQ9")
			.formParam("data_0", """{"value":"admin","start":5}""")
			.formParam("cmd_1", "onClick")
			.formParam("uuid_1", "lWIQf")
			.formParam("data_1", """{"pageX":863,"pageY":481,"which":1,"x":82,"y":30}""")
			.resources(http("request_3")
			.get("/fm/zkau?dtid=z_wk4&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_4")
			.post("/fm/security_check")
			.headers(headers_4)
			.formParam("username", "admin")
			.formParam("password", "TecnofarmaHQ"),
            http("request_5")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd"),
            http("request_6")
			.get("/fm/script/asofarma.js?_=1583927470346")
			.headers(headers_6)))
		.pause(3)
		.exec(http("request_7")
			.post("/fm/zkau")
			.headers(headers_7)
			.formParam("dtid", "z_xk4")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "kXJQb3")
			.formParam("data_0", """{"items":["kXJQb3"],"reference":"kXJQb3"}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "kXJQd3")
			.formParam("data_1", """{"items":["kXJQe3"],"reference":"kXJQe3","clearFirst":false,"selectAll":false,"pageX":54,"pageY":409,"which":1,"x":53,"y":16}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "kXJQe3")
			.formParam("data_2", """{"pageX":54,"pageY":409,"which":1,"x":53,"y":16}"""))
		.pause(4)
		.exec(http("request_8")
			.post("/fm/zkau")
			.headers(headers_8)
			.formParam("dtid", "z_xk4")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "kXJQ35")
			.formParam("data_0", """{"value":"Nolver Uruguay","start":0}""")
			.formParam("cmd_1", "onClick")
			.formParam("uuid_1", "kXJQw4")
			.formParam("data_1", """{"pageX":332,"pageY":133,"which":1,"x":23,"y":6}"""))
		.pause(1)
		.exec(http("request_9")
			.post("/fm/zkau")
			.headers(headers_9)
			.formParam("dtid", "z_xk4")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "kXJQh")
			.formParam("data_0", """{"pageX":1907,"pageY":41,"which":1,"x":20,"y":12}""")
			.resources(http("request_10")
			.get("/fm/zkau?dtid=z_xk4&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_11")
			.get("/fm/logout.zul")
			.headers(headers_0),
            http("request_12")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}