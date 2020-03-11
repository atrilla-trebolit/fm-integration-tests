package com.asofarma.fm.v2018

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class MassiveRestructureContacts extends Simulation {

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
		"ZK-SID" -> "339")

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
		"ZK-SID" -> "4540")

	val headers_8 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "4541")

	val headers_10 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "4542")

	val headers_12 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "4543")



	val scn = scenario("MassiveRestructure")
		.exec(http("request_0")
			.get("/fm")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(3)
		.exec(http("request_2")
			.post("/fm/zkau")
			.headers(headers_2)
			.formParam("dtid", "z_eb1")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "h40Q9")
			.formParam("data_0", """{"value":"admin","start":5}""")
			.formParam("cmd_1", "onChange")
			.formParam("uuid_1", "h40Qa")
			.formParam("data_1", """{"value":"TecnofarmaHQ","start":12}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "h40Qf")
			.formParam("data_2", """{"pageX":890,"pageY":478,"which":1,"x":109,"y":27}""")
			.resources(http("request_3")
			.get("/fm/zkau?dtid=z_eb1&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_4")
			.post("/fm/security_check")
			.headers(headers_4)
			.formParam("username", "admin")
			.formParam("password", "TecnofarmaHQ"),
            http("request_5")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd"),
            http("request_6")
			.get("/fm/script/asofarma.js?_=1583840304660")
			.headers(headers_6)))
		.pause(2)
		.exec(http("request_7")
			.post("/fm/zkau")
			.headers(headers_7)
			.formParam("dtid", "z_fb1")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "g51Q84")
			.formParam("data_0", """{"items":["g51Q84"],"reference":"g51Q84"}""")
			.formParam("cmd_1", "onAnchorPos")
			.formParam("uuid_1", "g51Qa4")
			.formParam("data_1", """{"top":33,"left":0}""")
			.formParam("cmd_2", "onSelect")
			.formParam("uuid_2", "g51Qa4")
			.formParam("data_2", """{"items":["g51Qd4"],"reference":"g51Qd4","clearFirst":false,"selectAll":false,"pageX":49,"pageY":501,"which":1,"x":48,"y":50}""")
			.formParam("cmd_3", "onClick")
			.formParam("uuid_3", "g51Qd4")
			.formParam("data_3", """{"pageX":49,"pageY":501,"which":1,"x":48,"y":17}"""))
		.pause(1)
		.exec(http("request_8")
			.post("/fm/zkau")
			.headers(headers_8)
			.formParam("dtid", "z_fb1")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "g51Q05")
			.formParam("data_0", """{"pageX":296,"pageY":113,"which":1,"x":52,"y":2}""")
			.resources(http("request_9")
			.get("/fm/zkau/view/z_fb1/dwnmed-0/qvd/Contacts.zip")
			.headers(headers_0)))
		.pause(2)
		.exec(http("request_10")
			.post("/fm/zkau")
			.headers(headers_10)
			.formParam("dtid", "z_fb1")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "g51Q25")
			.formParam("data_0", """{"pageX":404,"pageY":121,"which":1,"x":40,"y":10}""")
			.resources(http("request_11")
			.get("/fm/zkau/view/z_fb1/dwnmed-1/ork1/Contactos_Reestructuracion-2020_03_10.zip")
			.headers(headers_0)))
		.pause(6)
		.exec(http("request_12")
			.post("/fm/zkau")
			.headers(headers_12)
			.formParam("dtid", "z_fb1")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "g51Qh")
			.formParam("data_0", """{"pageX":1895,"pageY":42,"which":1,"x":8,"y":13}""")
			.resources(http("request_13")
			.get("/fm/zkau?dtid=z_fb1&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_14")
			.get("/fm/logout.zul")
			.headers(headers_0),
            http("request_15")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}