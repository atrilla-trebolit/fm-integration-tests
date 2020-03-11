package com.asofarma.fm.v2018

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class LuminKeyAccounts extends Simulation {

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
		"ZK-SID" -> "2646")

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
		"ZK-SID" -> "5387")

	val headers_8 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "5388")

	val headers_9 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "5389")

	val headers_10 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "5390")

	val headers_11 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "5391")

	val headers_12 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "5392")

	val headers_13 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "5393")

	val headers_14 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "5394")

	val headers_15 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "5395")

	val headers_16 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "5396")

	val headers_17 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "5397")

	val headers_18 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "5398")

	val headers_19 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "5399")

	val headers_20 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "5400")



	val scn = scenario("LuminKeyAccounts")
		.exec(http("request_0")
			.get("/fm")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(2)
		.exec(http("request_2")
			.post("/fm/zkau")
			.headers(headers_2)
			.formParam("dtid", "z_2rr")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "vCAP9")
			.formParam("data_0", """{"value":"admin","start":5}""")
			.formParam("cmd_1", "onClick")
			.formParam("uuid_1", "vCAPf")
			.formParam("data_1", """{"pageX":886,"pageY":465,"which":1,"x":105,"y":14}""")
			.resources(http("request_3")
			.get("/fm/zkau?dtid=z_2rr&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_4")
			.post("/fm/security_check")
			.headers(headers_4)
			.formParam("username", "admin")
			.formParam("password", "TecnofarmaHQ"),
            http("request_5")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd"),
            http("request_6")
			.get("/fm/script/asofarma.js?_=1583928026739")
			.headers(headers_6)))
		.pause(1)
		.exec(http("request_7")
			.post("/fm/zkau")
			.headers(headers_7)
			.formParam("dtid", "z_3rr")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "uDBPw")
			.formParam("data_0", """{"items":["uDBPx"],"reference":"uDBPx","clearFirst":false,"selectAll":false,"pageX":43,"pageY":144,"which":1,"x":42,"y":12}""")
			.formParam("cmd_1", "onClick")
			.formParam("uuid_1", "uDBPx")
			.formParam("data_1", """{"pageX":43,"pageY":144,"which":1,"x":42,"y":12}"""))
		.pause(8)
		.exec(http("request_8")
			.post("/fm/zkau")
			.headers(headers_8)
			.formParam("dtid", "z_3rr")
			.formParam("cmd_0", "onOpen")
			.formParam("uuid_0", "uDBPh5")
			.formParam("data_0", """{"open":true}""")
			.formParam("cmd_1", "onChange")
			.formParam("uuid_1", "uDBPl6")
			.formParam("data_1", """{"value":"Inactivo","start":0}""")
			.formParam("cmd_2", "onSelect")
			.formParam("uuid_2", "uDBPl6")
			.formParam("data_2", """{"items":["uDBPn6"],"reference":"uDBPn6"}""")
			.formParam("cmd_3", "onClick")
			.formParam("uuid_3", "uDBPc5")
			.formParam("data_3", """{"pageX":276,"pageY":186,"which":1,"x":32,"y":10}"""))
		.pause(3)
		.exec(http("request_9")
			.post("/fm/zkau")
			.headers(headers_9)
			.formParam("dtid", "z_3rr")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "uDBPl6")
			.formParam("data_0", """{"value":"Activo","start":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "uDBPl6")
			.formParam("data_1", """{"items":["uDBPm6"],"reference":"uDBPm6","prevSeld":"uDBPn6"}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "uDBPc5")
			.formParam("data_2", """{"pageX":283,"pageY":185,"which":1,"x":39,"y":9}"""))
		.pause(1)
		.exec(http("request_10")
			.post("/fm/zkau")
			.headers(headers_10)
			.formParam("dtid", "z_3rr")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "uDBPu6")
			.formParam("data_0", """{"items":["uDBPl4"],"reference":"uDBPl4","clearFirst":true,"selectAll":false,"pageX":747,"pageY":376,"which":1,"x":517,"y":52}""")
			.formParam("cmd_1", "onDoubleClick")
			.formParam("uuid_1", "uDBPl4")
			.formParam("data_1", """{"pageX":747,"pageY":376,"which":1,"x":517,"y":22}"""))
		.pause(4)
		.exec(http("request_11")
			.post("/fm/zkau")
			.headers(headers_11)
			.formParam("dtid", "z_3rr")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "uDBPla")
			.formParam("data_0", """{"items":["uDBP5f"],"reference":"uDBP5f","clearFirst":true,"selectAll":false,"pageX":372,"pageY":619,"which":1,"x":136,"y":45}""")
			.formParam("cmd_1", "onDoubleClick")
			.formParam("uuid_1", "uDBP5f")
			.formParam("data_1", """{"pageX":372,"pageY":619,"which":1,"x":136,"y":15}"""))
		.pause(7)
		.exec(http("request_12")
			.post("/fm/zkau")
			.headers(headers_12)
			.formParam("dtid", "z_3rr")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "uDBP56")
			.formParam("data_0", """{"items":["uDBP56"],"reference":"uDBP56"}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "uDBP66")
			.formParam("data_1", """{"items":["uDBP66"],"reference":"uDBP66"}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "uDBPt4")
			.formParam("data_2", """{"pageX":265,"pageY":85,"which":1,"x":21,"y":10}"""))
		.pause(8)
		.exec(http("request_13")
			.post("/fm/zkau")
			.headers(headers_13)
			.formParam("dtid", "z_3rr")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "uDBPr7")
			.formParam("data_0", """{"items":["uDBPr7"],"reference":"uDBPr7"}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "uDBPs7")
			.formParam("data_1", """{"items":["uDBPs7"],"reference":"uDBPs7"}""")
			.formParam("cmd_2", "onSelect")
			.formParam("uuid_2", "uDBPt7")
			.formParam("data_2", """{"items":["uDBPt7"],"reference":"uDBPt7"}""")
			.formParam("cmd_3", "onClick")
			.formParam("uuid_3", "uDBPf7")
			.formParam("data_3", """{"pageX":402,"pageY":136,"which":1,"x":36,"y":9}"""))
		.pause(9)
		.exec(http("request_14")
			.post("/fm/zkau")
			.headers(headers_14)
			.formParam("dtid", "z_3rr")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "uDBP05")
			.formParam("data_0", """{"items":["uDBP05"],"reference":"uDBP05"}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "uDBP_5")
			.formParam("data_1", """{"items":["uDBP_5"],"reference":"uDBP_5"}""")
			.formParam("cmd_2", "onSelect")
			.formParam("uuid_2", "uDBP05")
			.formParam("data_2", """{"items":["uDBP05"],"reference":"uDBP05"}""")
			.formParam("cmd_3", "onSelect")
			.formParam("uuid_3", "uDBPx6")
			.formParam("data_3", """{"items":["uDBP8j"],"reference":"uDBP8j","clearFirst":true,"selectAll":false,"pageX":292,"pageY":333,"which":1,"x":56,"y":48}""")
			.formParam("cmd_4", "onDoubleClick")
			.formParam("uuid_4", "uDBP8j")
			.formParam("data_4", """{"pageX":292,"pageY":333,"which":1,"x":56,"y":18}"""))
		.pause(2)
		.exec(http("request_15")
			.post("/fm/zkau")
			.headers(headers_15)
			.formParam("dtid", "z_3rr")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "uDBPcg")
			.formParam("data_0", """{"items":["uDBPy7"],"reference":"uDBPy7","clearFirst":true,"selectAll":false,"pageX":501,"pageY":691,"which":1,"x":259,"y":44}""")
			.formParam("cmd_1", "onDoubleClick")
			.formParam("uuid_1", "uDBPy7")
			.formParam("data_1", """{"pageX":501,"pageY":691,"which":1,"x":259,"y":14}"""))
		.pause(3)
		.exec(http("request_16")
			.post("/fm/zkau")
			.headers(headers_16)
			.formParam("dtid", "z_3rr")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "uDBPw4")
			.formParam("data_0", """{"pageX":372,"pageY":134,"which":1,"x":71,"y":7}"""))
		.pause(3)
		.exec(http("request_17")
			.post("/fm/zkau")
			.headers(headers_17)
			.formParam("dtid", "z_3rr")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "uDBP29")
			.formParam("data_0", """{"pageX":419,"pageY":188,"which":1,"x":27,"y":11}"""))
		.pause(1)
		.exec(http("request_18")
			.post("/fm/zkau")
			.headers(headers_18)
			.formParam("dtid", "z_3rr")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "uDBPwf")
			.formParam("data_0", """{"pageX":274,"pageY":139,"which":1,"x":30,"y":12}"""))
		.pause(2)
		.exec(http("request_19")
			.post("/fm/zkau")
			.headers(headers_19)
			.formParam("dtid", "z_3rr")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "uDBPdj")
			.formParam("data_0", """{"pageX":333,"pageY":131,"which":1,"x":24,"y":4}"""))
		.pause(8)
		.exec(http("request_20")
			.post("/fm/zkau")
			.headers(headers_20)
			.formParam("dtid", "z_3rr")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "uDBPh")
			.formParam("data_0", """{"pageX":1901,"pageY":40,"which":1,"x":14,"y":11}""")
			.resources(http("request_21")
			.get("/fm/zkau?dtid=z_3rr&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_22")
			.get("/fm/logout.zul")
			.headers(headers_0),
            http("request_23")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(2)
		.exec(http("request_24")
			.get("/fm/zkau?dtid=z_snw&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}