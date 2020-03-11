package com.asofarma.fm.v2018

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class SystemConfigurationBranches extends Simulation {

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
		"ZK-SID" -> "9005")

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
		"ZK-SID" -> "3367")

	val headers_8 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3368")

	val headers_9 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3369")

	val headers_10 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3370")

	val headers_11 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3371")

	val headers_12 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3372")

	val headers_13 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3373")

	val headers_14 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3374")

	val headers_15 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3375")

	val headers_16 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3376")

	val headers_17 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3377")

	val headers_18 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3378")

	val headers_19 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3379")



	val scn = scenario("SystemConfigurationBranches")
		.exec(http("request_0")
			.get("/fm")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(2)
		.exec(http("request_2")
			.post("/fm/zkau")
			.headers(headers_2)
			.formParam("dtid", "z_ixl")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "q05Q9")
			.formParam("data_0", """{"value":"admin","start":5}""")
			.formParam("cmd_1", "onClick")
			.formParam("uuid_1", "q05Qf")
			.formParam("data_1", """{"pageX":884,"pageY":462,"which":1,"x":103,"y":11}""")
			.resources(http("request_3")
			.get("/fm/zkau?dtid=z_ixl&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_4")
			.post("/fm/security_check")
			.headers(headers_4)
			.formParam("username", "admin")
			.formParam("password", "TecnofarmaHQ"),
            http("request_5")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(1)
		.exec(http("request_6")
			.get("/fm/script/asofarma.js?_=1583927364780")
			.headers(headers_6))
		.pause(3)
		.exec(http("request_7")
			.post("/fm/zkau")
			.headers(headers_7)
			.formParam("dtid", "z_jxl")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "p16Qb3")
			.formParam("data_0", """{"items":["p16Qb3"],"reference":"p16Qb3"}""")
			.formParam("cmd_1", "onAnchorPos")
			.formParam("uuid_1", "p16Qd3")
			.formParam("data_1", """{"top":33,"left":0}""")
			.formParam("cmd_2", "onSelect")
			.formParam("uuid_2", "p16Qd3")
			.formParam("data_2", """{"items":["p16Qg3"],"reference":"p16Qg3","clearFirst":false,"selectAll":false,"pageX":47,"pageY":437,"which":1,"x":46,"y":44}""")
			.formParam("cmd_3", "onClick")
			.formParam("uuid_3", "p16Qg3")
			.formParam("data_3", """{"pageX":47,"pageY":437,"which":1,"x":46,"y":11}"""))
		.pause(2)
		.exec(http("request_8")
			.post("/fm/zkau")
			.headers(headers_8)
			.formParam("dtid", "z_jxl")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "p16Qt5")
			.formParam("data_0", """{"items":["p16Q86"],"reference":"p16Q86","clearFirst":true,"selectAll":false,"pageX":341,"pageY":291,"which":1,"x":111,"y":46}""")
			.formParam("cmd_1", "onDoubleClick")
			.formParam("uuid_1", "p16Q86")
			.formParam("data_1", """{"pageX":341,"pageY":291,"which":1,"x":111,"y":16}"""))
		.pause(3)
		.exec(http("request_9")
			.post("/fm/zkau")
			.headers(headers_9)
			.formParam("dtid", "z_jxl")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "p16Qs6")
			.formParam("data_0", """{"value":"Sucursal Montevideo","start":0}""")
			.resources(http("request_10")
			.post("/fm/zkau")
			.headers(headers_10)
			.formParam("dtid", "z_jxl")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "p16Q1o")
			.formParam("data_0", """{"items":["p16Qqp"],"reference":"p16Qqp","clearFirst":true,"selectAll":false,"pageX":540,"pageY":333,"which":1,"x":310,"y":39}""")
			.formParam("cmd_1", "onDoubleClick")
			.formParam("uuid_1", "p16Qqp")
			.formParam("data_1", """{"pageX":540,"pageY":333,"which":1,"x":310,"y":9}""")))
		.pause(11)
		.exec(http("request_11")
			.post("/fm/zkau")
			.headers(headers_11)
			.formParam("dtid", "z_jxl")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "p16Qu4")
			.formParam("data_0", """{"pageX":333,"pageY":88,"which":1,"x":24,"y":13}"""))
		.pause(1)
		.exec(http("request_12")
			.post("/fm/zkau")
			.headers(headers_12)
			.formParam("dtid", "z_jxl")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "p16Qk6")
			.formParam("data_0", """{"value":"Sucursal Montevideo","start":0}""")
			.formParam("cmd_1", "onAnchorPos")
			.formParam("uuid_1", "p16Qun")
			.formParam("data_1", """{"top":99,"left":0}""")
			.formParam("cmd_2", "onSelect")
			.formParam("uuid_2", "p16Qun")
			.formParam("data_2", """{"items":["p16Quo"],"reference":"p16Quo","clearFirst":true,"selectAll":false,"pageX":521,"pageY":433,"which":1,"x":291,"y":139}""")
			.resources(http("request_13")
			.post("/fm/zkau")
			.headers(headers_13)
			.formParam("dtid", "z_jxl")
			.formParam("cmd_0", "onDoubleClick")
			.formParam("uuid_0", "p16Quo")
			.formParam("data_0", """{"pageX":521,"pageY":433,"which":1,"x":291,"y":10}""")))
		.pause(2)
		.exec(http("request_14")
			.post("/fm/zkau")
			.headers(headers_14)
			.formParam("dtid", "z_jxl")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "p16Qpp")
			.formParam("data_0", """{"pageX":339,"pageY":85,"which":1,"x":30,"y":10}"""))
		.pause(6)
		.exec(http("request_15")
			.post("/fm/zkau")
			.headers(headers_15)
			.formParam("dtid", "z_jxl")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "p16Q56")
			.formParam("data_0", """{"value":"Sucursal Montevideo","start":0}""")
			.formParam("cmd_1", "onAnchorPos")
			.formParam("uuid_1", "p16Qmn")
			.formParam("data_1", """{"top":165,"left":0}""")
			.formParam("cmd_2", "onSelect")
			.formParam("uuid_2", "p16Qmn")
			.formParam("data_2", """{"items":["p16Qeq"],"reference":"p16Qeq","clearFirst":true,"selectAll":false,"pageX":516,"pageY":500,"which":1,"x":286,"y":206}""")
			.resources(http("request_16")
			.post("/fm/zkau")
			.headers(headers_16)
			.formParam("dtid", "z_jxl")
			.formParam("cmd_0", "onDoubleClick")
			.formParam("uuid_0", "p16Qeq")
			.formParam("data_0", """{"pageX":516,"pageY":500,"which":1,"x":286,"y":11}""")))
		.pause(3)
		.exec(http("request_17")
			.post("/fm/zkau")
			.headers(headers_17)
			.formParam("dtid", "z_jxl")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "p16Qeo")
			.formParam("data_0", """{"pageX":349,"pageY":80,"which":1,"x":40,"y":5}"""))
		.pause(13)
		.exec(http("request_18")
			.post("/fm/zkau")
			.headers(headers_18)
			.formParam("dtid", "z_jxl")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "p16Qe6")
			.formParam("data_0", """{"value":"Sucursal Montevideo","start":0}""")
			.formParam("cmd_1", "onClick")
			.formParam("uuid_1", "p16Qt5")
			.formParam("data_1", """{"pageX":343,"pageY":81,"which":1,"x":34,"y":6}"""))
		.pause(4)
		.exec(http("request_19")
			.post("/fm/zkau")
			.headers(headers_19)
			.formParam("dtid", "z_jxl")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "p16Qh")
			.formParam("data_0", """{"pageX":1903,"pageY":42,"which":1,"x":16,"y":13}""")
			.resources(http("request_20")
			.get("/fm/zkau?dtid=z_jxl&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_21")
			.get("/fm/logout.zul")
			.headers(headers_0),
            http("request_22")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}