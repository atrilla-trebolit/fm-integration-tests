package com.asofarma.fm.v2018

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class ReportsAverage extends Simulation {

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
		"ZK-SID" -> "9716")

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
		"ZK-SID" -> "3911")

	val headers_8 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3912")

	val headers_9 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3913")

	val headers_11 = Map("Accept" -> "image/webp,*/*")

	val headers_13 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3914")

	val headers_15 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3915")

	val headers_17 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3916")

	val headers_18 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3917")

	val headers_22 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3918")

	val headers_24 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3919")

	val headers_26 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3920")



	val scn = scenario("ReportsAverage")
		.exec(http("request_0")
			.get("/fm")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(3)
		.exec(http("request_2")
			.post("/fm/zkau")
			.headers(headers_2)
			.formParam("dtid", "z_5oo")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "aCDP9")
			.formParam("data_0", """{"value":"admin","start":5}""")
			.formParam("cmd_1", "onChange")
			.formParam("uuid_1", "aCDPa")
			.formParam("data_1", """{"value":"TecnofarmaHQ","start":12}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "aCDPf")
			.formParam("data_2", """{"pageX":974,"pageY":463,"which":1,"x":193,"y":12}""")
			.resources(http("request_3")
			.get("/fm/zkau?dtid=z_5oo&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_4")
			.post("/fm/security_check")
			.headers(headers_4)
			.formParam("username", "admin")
			.formParam("password", "TecnofarmaHQ"),
            http("request_5")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd"),
            http("request_6")
			.get("/fm/script/asofarma.js?_=1583768181249")
			.headers(headers_6)))
		.pause(3)
		.exec(http("request_7")
			.post("/fm/zkau")
			.headers(headers_7)
			.formParam("dtid", "z_6oo")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "zCEPg1")
			.formParam("data_0", """{"items":["zCEPg1"],"reference":"zCEPg1"}""")
			.formParam("cmd_1", "onAnchorPos")
			.formParam("uuid_1", "zCEPi1")
			.formParam("data_1", """{"top":99,"left":0}""")
			.formParam("cmd_2", "onSelect")
			.formParam("uuid_2", "zCEPi1")
			.formParam("data_2", """{"items":["zCEPp1"],"reference":"zCEPp1","clearFirst":false,"selectAll":false,"pageX":53,"pageY":362,"which":1,"x":52,"y":114}""")
			.formParam("cmd_3", "onClick")
			.formParam("uuid_3", "zCEPp1")
			.formParam("data_3", """{"pageX":53,"pageY":362,"which":1,"x":52,"y":15}"""))
		.pause(6)
		.exec(http("request_8")
			.post("/fm/zkau")
			.headers(headers_8)
			.formParam("dtid", "z_6oo")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "zCEPc5")
			.formParam("data_0", """{"value":"CICLO 201911","start":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "zCEPc5")
			.formParam("data_1", """{"items":["zCEPw6"],"reference":"zCEPw6"}""")
			.formParam("cmd_2", "onChange")
			.formParam("uuid_2", "zCEPe5")
			.formParam("data_2", """{"value":"Ole","start":0}""")
			.formParam("cmd_3", "onSelect")
			.formParam("uuid_3", "zCEPe5")
			.formParam("data_3", """{"items":["zCEPha"],"reference":"zCEPha"}"""))
		.pause(1)
		.exec(http("request_9")
			.post("/fm/zkau")
			.headers(headers_9)
			.formParam("dtid", "z_6oo")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "zCEP15")
			.formParam("data_0", """{"pageX":286,"pageY":190,"which":1,"x":42,"y":14}""")
			.resources(http("request_10")
			.get("/fm/run?__report=promedio.rptdesign&jndi_name=java:jboss/fm.conf.ds.report&ciclo=196&corporativeLine=1&userState=0")
			.headers(headers_0),
            http("request_11")
			.get("/fm/Reportes/file5b118302170bff0c7891.png")
			.headers(headers_11),
            http("request_12")
			.get("/fm/Reportes/file5b118302170bff0c7892.png")
			.headers(headers_11)))
		.pause(1)
		.exec(http("request_13")
			.post("/fm/zkau")
			.headers(headers_13)
			.formParam("dtid", "z_6oo")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "zCEPu4")
			.formParam("data_0", """{"pageX":256,"pageY":137,"which":1,"x":12,"y":10}""")
			.resources(http("request_14")
			.get("/fm/run?__report=promedio.rptdesign&corporativeLine=1&jndi_name=java:jboss/fm.conf.ds.report&ciclo=196&userState=0&__format=pdf")
			.headers(headers_0)))
		.pause(3)
		.exec(http("request_15")
			.post("/fm/zkau")
			.headers(headers_15)
			.formParam("dtid", "z_6oo")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "zCEPw4")
			.formParam("data_0", """{"pageX":298,"pageY":137,"which":1,"x":25,"y":10}""")
			.resources(http("request_16")
			.get("/fm/run?__report=promedio.rptdesign&corporativeLine=1&jndi_name=java:jboss/fm.conf.ds.report&ciclo=196&userState=0&__format=xls")
			.headers(headers_0)))
		.pause(6)
		.exec(http("request_17")
			.post("/fm/zkau")
			.headers(headers_17)
			.formParam("dtid", "z_6oo")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "zCEPe5")
			.formParam("data_0", """{"value":"Farma","start":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "zCEPe5")
			.formParam("data_1", """{"items":["zCEPia"],"reference":"zCEPia","prevSeld":"zCEPha"}"""))
		.pause(1)
		.exec(http("request_18")
			.post("/fm/zkau")
			.headers(headers_18)
			.formParam("dtid", "z_6oo")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "zCEP15")
			.formParam("data_0", """{"pageX":286,"pageY":180,"which":1,"x":42,"y":4}""")
			.resources(http("request_19")
			.get("/fm/run?__report=promedio.rptdesign&jndi_name=java:jboss/fm.conf.ds.report&ciclo=196&corporativeLine=0&userState=0")
			.headers(headers_0),
            http("request_20")
			.get("/fm/Reportes/file5c8a1765170bff101f52.png")
			.headers(headers_11),
            http("request_21")
			.get("/fm/Reportes/file5c8a1765170bff101f51.png")
			.headers(headers_11)))
		.pause(1)
		.exec(http("request_22")
			.post("/fm/zkau")
			.headers(headers_22)
			.formParam("dtid", "z_6oo")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "zCEPu4")
			.formParam("data_0", """{"pageX":256,"pageY":135,"which":1,"x":12,"y":8}""")
			.resources(http("request_23")
			.get("/fm/run?__report=promedio.rptdesign&corporativeLine=0&jndi_name=java:jboss/fm.conf.ds.report&ciclo=196&userState=0&__format=pdf")
			.headers(headers_0)))
		.pause(2)
		.exec(http("request_24")
			.post("/fm/zkau")
			.headers(headers_24)
			.formParam("dtid", "z_6oo")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "zCEPw4")
			.formParam("data_0", """{"pageX":288,"pageY":138,"which":1,"x":15,"y":11}""")
			.resources(http("request_25")
			.get("/fm/run?__report=promedio.rptdesign&corporativeLine=0&jndi_name=java:jboss/fm.conf.ds.report&ciclo=196&userState=0&__format=xls")
			.headers(headers_0)))
		.pause(3)
		.exec(http("request_26")
			.post("/fm/zkau")
			.headers(headers_26)
			.formParam("dtid", "z_6oo")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "zCEPh")
			.formParam("data_0", """{"pageX":1908,"pageY":36,"which":1,"x":21,"y":7}""")
			.resources(http("request_27")
			.get("/fm/zkau?dtid=z_6oo&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_28")
			.get("/fm/logout.zul")
			.headers(headers_0),
            http("request_29")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(1)
		.exec(http("request_30")
			.get("/fm/zkau?dtid=z_bf8&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}