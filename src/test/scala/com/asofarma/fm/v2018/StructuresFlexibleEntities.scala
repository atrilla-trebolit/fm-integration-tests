package com.asofarma.fm.v2018

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class StructuresFlexibleEntities extends Simulation {

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
		"ZK-SID" -> "3863")

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
		"ZK-SID" -> "7943")

	val headers_8 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "7944")

	val headers_9 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "7945")

	val headers_10 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "7946")

	val headers_11 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "7947")

	val headers_12 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "7948")

	val headers_13 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "7949")

	val headers_14 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "7950")

	val headers_15 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "7951")

	val headers_16 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "7952")

	val headers_17 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "7953")

	val headers_18 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "7954")



	val scn = scenario("StructuresFlexibleEntities")
		.exec(http("request_0")
			.get("/fm")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(3)
		.exec(http("request_2")
			.post("/fm/zkau")
			.headers(headers_2)
			.formParam("dtid", "z_c2t")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "sJwP9")
			.formParam("data_0", """{"value":"admin","start":5}""")
			.formParam("cmd_1", "onChange")
			.formParam("uuid_1", "sJwPa")
			.formParam("data_1", """{"value":"TecnofarmaHQ","start":12}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "sJwPf")
			.formParam("data_2", """{"pageX":1001,"pageY":472,"which":1,"x":220,"y":21}""")
			.resources(http("request_3")
			.get("/fm/zkau?dtid=z_c2t&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_4")
			.post("/fm/security_check")
			.headers(headers_4)
			.formParam("username", "admin")
			.formParam("password", "TecnofarmaHQ"),
            http("request_5")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd"),
            http("request_6")
			.get("/fm/script/asofarma.js?_=1583840997997")
			.headers(headers_6)))
		.pause(6)
		.exec(http("request_7")
			.post("/fm/zkau")
			.headers(headers_7)
			.formParam("dtid", "z_d2t")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "rKxPo2")
			.formParam("data_0", """{"items":["rKxPo2"],"reference":"rKxPo2"}""")
			.formParam("cmd_1", "onAnchorPos")
			.formParam("uuid_1", "rKxPq2")
			.formParam("data_1", """{"top":33,"left":0}""")
			.formParam("cmd_2", "onSelect")
			.formParam("uuid_2", "rKxPq2")
			.formParam("data_2", """{"items":["rKxPt2"],"reference":"rKxPt2","clearFirst":false,"selectAll":false,"pageX":86,"pageY":385,"which":1,"x":85,"y":50}""")
			.formParam("cmd_3", "onClick")
			.formParam("uuid_3", "rKxPt2")
			.formParam("data_3", """{"pageX":86,"pageY":385,"which":1,"x":85,"y":17}"""))
		.pause(2)
		.exec(http("request_8")
			.post("/fm/zkau")
			.headers(headers_8)
			.formParam("dtid", "z_d2t")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "rKxPy4")
			.formParam("data_0", """{"items":["rKxPg6"],"reference":"rKxPg6","clearFirst":false,"selectAll":false,"pageX":308,"pageY":216,"which":1,"x":78,"y":44}""")
			.formParam("cmd_1", "onDoubleClick")
			.formParam("uuid_1", "rKxPg6")
			.formParam("data_1", """{"pageX":308,"pageY":216,"which":1,"x":78,"y":14}"""))
		.pause(2)
		.exec(http("request_9")
			.post("/fm/zkau")
			.headers(headers_9)
			.formParam("dtid", "z_d2t")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "rKxPf5")
			.formParam("data_0", """{"items":["rKxPf5"],"reference":"rKxPf5"}"""))
		.pause(1)
		.exec(http("request_10")
			.post("/fm/zkau")
			.headers(headers_10)
			.formParam("dtid", "z_d2t")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "rKxPg5")
			.formParam("data_0", """{"items":["rKxPg5"],"reference":"rKxPg5"}"""))
		.pause(1)
		.exec(http("request_11")
			.post("/fm/zkau")
			.headers(headers_11)
			.formParam("dtid", "z_d2t")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "rKxPh5")
			.formParam("data_0", """{"items":["rKxPh5"],"reference":"rKxPh5"}"""))
		.pause(2)
		.exec(http("request_12")
			.post("/fm/zkau")
			.headers(headers_12)
			.formParam("dtid", "z_d2t")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "rKxPca")
			.formParam("data_0", """{"value":"","start":0}"""))
		.pause(1)
		.exec(http("request_13")
			.post("/fm/zkau")
			.headers(headers_13)
			.formParam("dtid", "z_d2t")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "rKxP75")
			.formParam("data_0", """{"pageX":351,"pageY":80,"which":1,"x":42,"y":5}"""))
		.pause(4)
		.exec(http("request_14")
			.post("/fm/zkau")
			.headers(headers_14)
			.formParam("dtid", "z_d2t")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "rKxPy4")
			.formParam("data_0", """{"top":396,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "rKxPy4")
			.formParam("data_1", """{"items":["rKxPbc"],"reference":"rKxPbc","clearFirst":false,"selectAll":false,"pageX":349,"pageY":615,"which":1,"x":119,"y":443}""")
			.formParam("cmd_2", "onDoubleClick")
			.formParam("uuid_2", "rKxPbc")
			.formParam("data_2", """{"pageX":349,"pageY":615,"which":1,"x":119,"y":17}"""))
		.pause(1)
		.exec(http("request_15")
			.post("/fm/zkau")
			.headers(headers_15)
			.formParam("dtid", "z_d2t")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "rKxPf5")
			.formParam("data_0", """{"items":["rKxPf5"],"reference":"rKxPf5"}""")
			.resources(http("request_16")
			.post("/fm/zkau")
			.headers(headers_16)
			.formParam("dtid", "z_d2t")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "rKxPg5")
			.formParam("data_0", """{"items":["rKxPg5"],"reference":"rKxPg5"}"""),
            http("request_17")
			.post("/fm/zkau")
			.headers(headers_17)
			.formParam("dtid", "z_d2t")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "rKxPh5")
			.formParam("data_0", """{"items":["rKxPh5"],"reference":"rKxPh5"}""")))
		.pause(1)
		.exec(http("request_18")
			.post("/fm/zkau")
			.headers(headers_18)
			.formParam("dtid", "z_d2t")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "rKxPh")
			.formParam("data_0", """{"pageX":1909,"pageY":40,"which":1,"x":22,"y":11}""")
			.resources(http("request_19")
			.get("/fm/zkau?dtid=z_d2t&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_20")
			.get("/fm/logout.zul")
			.headers(headers_0),
            http("request_21")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(3)
		.exec(http("request_22")
			.get("/fm/zkau?dtid=z_en5&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}