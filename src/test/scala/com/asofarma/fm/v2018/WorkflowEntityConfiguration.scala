package com.asofarma.fm.v2018

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class WorkflowEntityConfiguration extends Simulation {

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
		"ZK-SID" -> "6242")

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
		"ZK-SID" -> "8649")

	val headers_8 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "8650")

	val headers_9 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "8651")

	val headers_10 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "8652")

	val headers_11 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "8653")

	val headers_12 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "8654")

	val headers_13 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "8655")

	val headers_14 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "8656")

	val headers_15 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "8657")

	val headers_16 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "8658")

	val headers_17 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "8659")

	val headers_18 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "8660")

	val headers_19 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "8661")

	val headers_20 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "8662")

	val headers_21 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "8663")

	val headers_22 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "8664")

	val headers_23 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "8665")

	val headers_24 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "8666")

	val headers_25 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "8667")



	val scn = scenario("WorkflowEntityConfiguration")
		.exec(http("request_0")
			.get("/fm")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(2)
		.exec(http("request_2")
			.post("/fm/zkau")
			.headers(headers_2)
			.formParam("dtid", "z_fk7")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "fG1Q9")
			.formParam("data_0", """{"value":"admin","start":5}""")
			.formParam("cmd_1", "onClick")
			.formParam("uuid_1", "fG1Qf")
			.formParam("data_1", """{"pageX":854,"pageY":471,"which":1,"x":73,"y":20}""")
			.resources(http("request_3")
			.get("/fm/zkau?dtid=z_fk7&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_4")
			.post("/fm/security_check")
			.headers(headers_4)
			.formParam("username", "admin")
			.formParam("password", "TecnofarmaHQ"),
            http("request_5")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd"),
            http("request_6")
			.get("/fm/script/asofarma.js?_=1583927540045")
			.headers(headers_6)))
		.pause(11)
		.exec(http("request_7")
			.post("/fm/zkau")
			.headers(headers_7)
			.formParam("dtid", "z_gk7")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "eH2Qh2")
			.formParam("data_0", """{"items":["eH2Qh2"],"reference":"eH2Qh2"}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "eH2Qj2")
			.formParam("data_1", """{"items":["eH2Qk2"],"reference":"eH2Qk2","clearFirst":false,"selectAll":false,"pageX":48,"pageY":320,"which":1,"x":47,"y":14}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "eH2Qk2")
			.formParam("data_2", """{"pageX":48,"pageY":320,"which":1,"x":47,"y":14}"""))
		.pause(7)
		.exec(http("request_8")
			.post("/fm/zkau")
			.headers(headers_8)
			.formParam("dtid", "z_gk7")
			.formParam("cmd_0", "onOpen")
			.formParam("uuid_0", "eH2Q45")
			.formParam("data_0", """{"open":true}""")
			.formParam("cmd_1", "onChange")
			.formParam("uuid_1", "eH2Qa5")
			.formParam("data_1", """{"value":"Cartera","start":0}""")
			.formParam("cmd_2", "onSelect")
			.formParam("uuid_2", "eH2Qa5")
			.formParam("data_2", """{"items":["eH2Qc5"],"reference":"eH2Qc5"}""")
			.formParam("cmd_3", "onClick")
			.formParam("uuid_3", "eH2Q_5")
			.formParam("data_3", """{"pageX":286,"pageY":183,"which":1,"x":42,"y":7}"""))
		.pause(4)
		.exec(http("request_9")
			.post("/fm/zkau")
			.headers(headers_9)
			.formParam("dtid", "z_gk7")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "eH2Qz5")
			.formParam("data_0", """{"items":["eH2Ql4"],"reference":"eH2Ql4","clearFirst":true,"selectAll":false,"pageX":397,"pageY":314,"which":1,"x":167,"y":40}""")
			.formParam("cmd_1", "onDoubleClick")
			.formParam("uuid_1", "eH2Ql4")
			.formParam("data_1", """{"pageX":397,"pageY":314,"which":1,"x":167,"y":10}"""))
		.pause(1)
		.exec(http("request_10")
			.post("/fm/zkau")
			.headers(headers_10)
			.formParam("dtid", "z_gk7")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "eH2Qh6")
			.formParam("data_0", """{"items":["eH2Qh6"],"reference":"eH2Qh6"}"""))
		.pause(1)
		.exec(http("request_11")
			.post("/fm/zkau")
			.headers(headers_11)
			.formParam("dtid", "z_gk7")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "eH2Qi6")
			.formParam("data_0", """{"items":["eH2Qi6"],"reference":"eH2Qi6"}"""))
		.pause(3)
		.exec(http("request_12")
			.post("/fm/zkau")
			.headers(headers_12)
			.formParam("dtid", "z_gk7")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "eH2Q29")
			.formParam("data_0", """{"value":"","start":0}""")
			.resources(http("request_13")
			.post("/fm/zkau")
			.headers(headers_13)
			.formParam("dtid", "z_gk7")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "eH2Qh6")
			.formParam("data_0", """{"items":["eH2Qh6"],"reference":"eH2Qh6"}""")))
		.pause(4)
		.exec(http("request_14")
			.post("/fm/zkau")
			.headers(headers_14)
			.formParam("dtid", "z_gk7")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "eH2Q38")
			.formParam("data_0", """{"value":"","start":0}""")
			.resources(http("request_15")
			.post("/fm/zkau")
			.headers(headers_15)
			.formParam("dtid", "z_gk7")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "eH2Qf8")
			.formParam("data_0", """{"value":"","start":0}""")))
		.pause(1)
		.exec(http("request_16")
			.post("/fm/zkau")
			.headers(headers_16)
			.formParam("dtid", "z_gk7")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "eH2Qp8")
			.formParam("data_0", """{"value":"","start":0}""")
			.resources(http("request_17")
			.post("/fm/zkau")
			.headers(headers_17)
			.formParam("dtid", "z_gk7")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "eH2Qg6")
			.formParam("data_0", """{"items":["eH2Qg6"],"reference":"eH2Qg6"}""")))
		.pause(1)
		.exec(http("request_18")
			.post("/fm/zkau")
			.headers(headers_18)
			.formParam("dtid", "z_gk7")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "eH2Qc6")
			.formParam("data_0", """{"pageX":339,"pageY":81,"which":1,"x":30,"y":6}"""))
		.pause(5)
		.exec(http("request_19")
			.post("/fm/zkau")
			.headers(headers_19)
			.formParam("dtid", "z_gk7")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "eH2Qp5")
			.formParam("data_0", """{"value":"Contacto de farmacia","start":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "eH2Qp5")
			.formParam("data_1", """{"items":["eH2Qs5"],"reference":"eH2Qs5","prevSeld":"eH2Qr5"}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "eH2Qe5")
			.formParam("data_2", """{"pageX":268,"pageY":185,"which":1,"x":24,"y":9}"""))
		.pause(1)
		.exec(http("request_20")
			.post("/fm/zkau")
			.headers(headers_20)
			.formParam("dtid", "z_gk7")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "eH2Q59")
			.formParam("data_0", """{"items":["eH2Qp4"],"reference":"eH2Qp4","clearFirst":true,"selectAll":false,"pageX":332,"pageY":321,"which":1,"x":102,"y":47}""")
			.formParam("cmd_1", "onDoubleClick")
			.formParam("uuid_1", "eH2Qp4")
			.formParam("data_1", """{"pageX":332,"pageY":321,"which":1,"x":102,"y":17}"""))
		.pause(1)
		.exec(http("request_21")
			.post("/fm/zkau")
			.headers(headers_21)
			.formParam("dtid", "z_gk7")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "eH2Qh6")
			.formParam("data_0", """{"items":["eH2Qh6"],"reference":"eH2Qh6"}""")
			.resources(http("request_22")
			.post("/fm/zkau")
			.headers(headers_22)
			.formParam("dtid", "z_gk7")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "eH2Qi6")
			.formParam("data_0", """{"items":["eH2Qi6"],"reference":"eH2Qi6"}""")))
		.pause(2)
		.exec(http("request_23")
			.post("/fm/zkau")
			.headers(headers_23)
			.formParam("dtid", "z_gk7")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "eH2Q29")
			.formParam("data_0", """{"value":"","start":0}"""))
		.pause(1)
		.exec(http("request_24")
			.post("/fm/zkau")
			.headers(headers_24)
			.formParam("dtid", "z_gk7")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "eH2Qc6")
			.formParam("data_0", """{"pageX":347,"pageY":82,"which":1,"x":38,"y":7}"""))
		.pause(3)
		.exec(http("request_25")
			.post("/fm/zkau")
			.headers(headers_25)
			.formParam("dtid", "z_gk7")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "eH2Qh")
			.formParam("data_0", """{"pageX":1902,"pageY":49,"which":1,"x":15,"y":20}""")
			.resources(http("request_26")
			.get("/fm/zkau?dtid=z_gk7&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_27")
			.get("/fm/logout.zul")
			.headers(headers_0),
            http("request_28")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(3)
		.exec(http("request_29")
			.get("/fm/zkau?dtid=z_y22&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}