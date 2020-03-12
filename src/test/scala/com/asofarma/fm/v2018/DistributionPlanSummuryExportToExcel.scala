package com.asofarma.fm.v2018

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class DistributionPlanSummuryExportToExcel extends Simulation {

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
		"ZK-SID" -> "1538")

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
		"ZK-SID" -> "3784")

	val headers_8 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3785")

	val headers_9 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3786")

	val headers_11 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3787")

	val headers_12 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3788")

	val headers_13 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3789")

	val headers_15 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3790")



	val scn = scenario("DistributionPlanSummuryExportToExcel")
		.exec(http("request_0")
			.get("/fm")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(1)
		.exec(http("request_2")
			.post("/fm/zkau")
			.headers(headers_2)
			.formParam("dtid", "z_al6")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "oCwP9")
			.formParam("data_0", """{"value":"admin","start":5}""")
			.formParam("cmd_1", "onClick")
			.formParam("uuid_1", "oCwPf")
			.formParam("data_1", """{"pageX":905,"pageY":468,"which":1,"x":124,"y":17}""")
			.resources(http("request_3")
			.get("/fm/zkau?dtid=z_al6&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_4")
			.post("/fm/security_check")
			.headers(headers_4)
			.formParam("username", "admin")
			.formParam("password", "TecnofarmaHQ"),
            http("request_5")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd"),
            http("request_6")
			.get("/fm/script/asofarma.js?_=1584022565678")
			.headers(headers_6)))
		.pause(4)
		.exec(http("request_7")
			.post("/fm/zkau")
			.headers(headers_7)
			.formParam("dtid", "z_bl6")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "nDxPu0")
			.formParam("data_0", """{"items":["nDxPu0"],"reference":"nDxPu0"}""")
			.formParam("cmd_1", "onAnchorPos")
			.formParam("uuid_1", "nDxPw0")
			.formParam("data_1", """{"top":165,"left":0}""")
			.formParam("cmd_2", "onSelect")
			.formParam("uuid_2", "nDxPw0")
			.formParam("data_2", """{"items":["nDxP61"],"reference":"nDxP61","clearFirst":false,"selectAll":false,"pageX":100,"pageY":397,"which":1,"x":99,"y":178}""")
			.formParam("cmd_3", "onClick")
			.formParam("uuid_3", "nDxP61")
			.formParam("data_3", """{"pageX":100,"pageY":397,"which":1,"x":99,"y":13}"""))
		.pause(3)
		.exec(http("request_8")
			.post("/fm/zkau")
			.headers(headers_8)
			.formParam("dtid", "z_bl6")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "nDxP9b")
			.formParam("data_0", """{"items":["nDxPob"],"reference":"nDxPob","clearFirst":false,"selectAll":true,"pageX":243,"pageY":292,"which":1,"x":13,"y":48}""")
			.formParam("cmd_1", "onClick")
			.formParam("uuid_1", "nDxP15")
			.formParam("data_1", """{"pageX":571,"pageY":139,"which":1,"x":39,"y":12}"""))
		.pause(1)
		.exec(http("request_9")
			.post("/fm/zkau")
			.headers(headers_9)
			.formParam("dtid", "z_bl6")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "nDxPib")
			.formParam("data_0", """{"pageX":270,"pageY":88,"which":1,"x":26,"y":13}""")
			.resources(http("request_10")
			.get("/fm/zkau/view/z_bl6/nDxPo4/c5j/1/Plan%20de%20distribucion.xls")
			.headers(headers_0)))
		.pause(2)
		.exec(http("request_11")
			.post("/fm/zkau")
			.headers(headers_11)
			.formParam("dtid", "z_bl6")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "nDxPpb")
			.formParam("data_0", """{"pageX":318,"pageY":84,"which":1,"x":35,"y":8}"""))
		.pause(3)
		.exec(http("request_12")
			.post("/fm/zkau")
			.headers(headers_12)
			.formParam("dtid", "z_bl6")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "nDxPbb")
			.formParam("data_0", """{"top":99,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "nDxPbb")
			.formParam("data_1", """{"items":["nDxPkc"],"reference":"nDxPkc","clearFirst":true,"selectAll":false,"pageX":380,"pageY":394,"which":1,"x":150,"y":150}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "nDxP35")
			.formParam("data_2", """{"pageX":572,"pageY":130,"which":1,"x":40,"y":3}"""))
		.pause(1)
		.exec(http("request_13")
			.post("/fm/zkau")
			.headers(headers_13)
			.formParam("dtid", "z_bl6")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "nDxPib")
			.formParam("data_0", """{"pageX":275,"pageY":93,"which":1,"x":31,"y":18}""")
			.resources(http("request_14")
			.get("/fm/zkau/view/z_bl6/nDxPo4/uju1/1/Plan%20de%20distribucion.xls")
			.headers(headers_0)))
		.pause(5)
		.exec(http("request_15")
			.post("/fm/zkau")
			.headers(headers_15)
			.formParam("dtid", "z_bl6")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "nDxPh")
			.formParam("data_0", """{"pageX":1903,"pageY":45,"which":1,"x":16,"y":16}""")
			.resources(http("request_16")
			.get("/fm/zkau?dtid=z_bl6&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_17")
			.get("/fm/logout.zul")
			.headers(headers_0),
            http("request_18")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(1)
		.exec(http("request_19")
			.get("/fm/zkau?dtid=z_w2q&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}