package com.asofarma.fm.v2018

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class PromotionalStructureCycles extends Simulation {

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
		"ZK-SID" -> "6079")

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
		"ZK-SID" -> "946")

	val headers_8 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "947")

	val headers_9 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "948")

	val headers_10 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "949")

	val headers_11 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "950")

	val headers_12 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "951")

	val headers_13 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "952")

	val headers_14 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "953")



	val scn = scenario("Record")
		.exec(http("request_0")
			.get("/fm")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(3)
		.exec(http("request_2")
			.post("/fm/zkau")
			.headers(headers_2)
			.formParam("dtid", "z_44n")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "rCAP9")
			.formParam("data_0", """{"value":"admin","start":5}""")
			.formParam("cmd_1", "onChange")
			.formParam("uuid_1", "rCAPa")
			.formParam("data_1", """{"value":"TecnofarmaHQ","start":12}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "rCAPf")
			.formParam("data_2", """{"pageX":940,"pageY":480,"which":1,"x":159,"y":29}""")
			.resources(http("request_3")
			.get("/fm/zkau?dtid=z_44n&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_4")
			.post("/fm/security_check")
			.headers(headers_4)
			.formParam("username", "admin")
			.formParam("password", "TecnofarmaHQ"),
            http("request_5")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd"),
            http("request_6")
			.get("/fm/script/asofarma.js?_=1583840401057")
			.headers(headers_6)))
		.pause(15)
		.exec(http("request_7")
			.post("/fm/zkau")
			.headers(headers_7)
			.formParam("dtid", "z_54n")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "qDBPu0")
			.formParam("data_0", """{"items":["qDBPu0"],"reference":"qDBPu0"}""")
			.formParam("cmd_1", "onAnchorPos")
			.formParam("uuid_1", "qDBPw0")
			.formParam("data_1", """{"top":33,"left":0}""")
			.formParam("cmd_2", "onSelect")
			.formParam("uuid_2", "qDBPw0")
			.formParam("data_2", """{"items":["qDBPz0"],"reference":"qDBPz0","clearFirst":false,"selectAll":false,"pageX":38,"pageY":265,"which":1,"x":37,"y":46}""")
			.formParam("cmd_3", "onClick")
			.formParam("uuid_3", "qDBPz0")
			.formParam("data_3", """{"pageX":38,"pageY":265,"which":1,"x":37,"y":13}"""))
		.pause(10)
		.exec(http("request_8")
			.post("/fm/zkau")
			.headers(headers_8)
			.formParam("dtid", "z_54n")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "qDBP76")
			.formParam("data_0", """{"items":["qDBPws"],"reference":"qDBPws","clearFirst":true,"selectAll":false,"pageX":270,"pageY":287,"which":1,"x":40,"y":42}""")
			.formParam("cmd_1", "onDoubleClick")
			.formParam("uuid_1", "qDBPws")
			.formParam("data_1", """{"pageX":319,"pageY":294,"which":1,"x":89,"y":19}"""))
		.pause(2)
		.exec(http("request_9")
			.post("/fm/zkau")
			.headers(headers_9)
			.formParam("dtid", "z_54n")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "qDBPa7")
			.formParam("data_0", """{"value":"CICLO 202012","start":0}""")
			.resources(http("request_10")
			.post("/fm/zkau")
			.headers(headers_10)
			.formParam("dtid", "z_54n")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "qDBP_7")
			.formParam("data_0", """{"items":["qDBP_7"],"reference":"qDBP_7"}""")))
		.pause(2)
		.exec(http("request_11")
			.post("/fm/zkau")
			.headers(headers_11)
			.formParam("dtid", "z_54n")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "qDBP07")
			.formParam("data_0", """{"items":["qDBP07"],"reference":"qDBP07"}"""))
		.pause(1)
		.exec(http("request_12")
			.post("/fm/zkau")
			.headers(headers_12)
			.formParam("dtid", "z_54n")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "qDBP17")
			.formParam("data_0", """{"items":["qDBP17"],"reference":"qDBP17"}"""))
		.pause(5)
		.exec(http("request_13")
			.post("/fm/zkau")
			.headers(headers_13)
			.formParam("dtid", "z_54n")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "qDBPo6")
			.formParam("data_0", """{"pageX":345,"pageY":86,"which":1,"x":36,"y":11}"""))
		.pause(9)
		.exec(http("request_14")
			.post("/fm/zkau")
			.headers(headers_14)
			.formParam("dtid", "z_54n")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "qDBPh")
			.formParam("data_0", """{"pageX":1906,"pageY":41,"which":1,"x":19,"y":12}""")
			.resources(http("request_15")
			.get("/fm/zkau?dtid=z_54n&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_16")
			.get("/fm/logout.zul")
			.headers(headers_0),
            http("request_17")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}