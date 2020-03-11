package com.asofarma.fm.v2018

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class ReportsSyncronization extends Simulation {

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
		"ZK-SID" -> "426")

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
		"ZK-SID" -> "5616")

	val headers_8 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "5617")

	val headers_9 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "5618")

	val headers_11 = Map("Accept" -> "image/webp,*/*")

	val headers_12 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "5619")

	val headers_14 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "5620")

	val headers_16 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "5621")

	val headers_19 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "5622")

	val headers_21 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "5623")

	val headers_23 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "5624")



	val scn = scenario("ReportsSyncronization")
		.exec(http("request_0")
			.get("/fm")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(4)
		.exec(http("request_2")
			.post("/fm/zkau")
			.headers(headers_2)
			.formParam("dtid", "z_22t")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "p88P9")
			.formParam("data_0", """{"value":"admin","start":5}""")
			.formParam("cmd_1", "onChange")
			.formParam("uuid_1", "p88Pa")
			.formParam("data_1", """{"value":"TecnofarmaHQ","start":12}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "p88Pf")
			.formParam("data_2", """{"pageX":922,"pageY":474,"which":1,"x":141,"y":23}""")
			.resources(http("request_3")
			.get("/fm/zkau?dtid=z_22t&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_4")
			.post("/fm/security_check")
			.headers(headers_4)
			.formParam("username", "admin")
			.formParam("password", "TecnofarmaHQ"),
            http("request_5")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd"),
            http("request_6")
			.get("/fm/script/asofarma.js?_=1583768122959")
			.headers(headers_6)))
		.pause(4)
		.exec(http("request_7")
			.post("/fm/zkau")
			.headers(headers_7)
			.formParam("dtid", "z_32t")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "o99Pg1")
			.formParam("data_0", """{"items":["o99Pg1"],"reference":"o99Pg1"}""")
			.formParam("cmd_1", "onAnchorPos")
			.formParam("uuid_1", "o99Pi1")
			.formParam("data_1", """{"top":66,"left":0}""")
			.formParam("cmd_2", "onSelect")
			.formParam("uuid_2", "o99Pi1")
			.formParam("data_2", """{"items":["o99Pn1"],"reference":"o99Pn1","clearFirst":false,"selectAll":false,"pageX":59,"pageY":329,"which":1,"x":58,"y":81}""")
			.formParam("cmd_3", "onClick")
			.formParam("uuid_3", "o99Pn1")
			.formParam("data_3", """{"pageX":59,"pageY":329,"which":1,"x":58,"y":15}"""))
		.pause(7)
		.exec(http("request_8")
			.post("/fm/zkau")
			.headers(headers_8)
			.formParam("dtid", "z_32t")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "o99Pc5")
			.formParam("data_0", """{"value":"Alvaro Vergara","start":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "o99Pc5")
			.formParam("data_1", """{"items":["o99Po5"],"reference":"o99Po5"}""")
			.formParam("cmd_2", "onChange")
			.formParam("uuid_2", "o99Pe5")
			.formParam("data_2", """{"value":"CICLO 201911","start":0}""")
			.formParam("cmd_3", "onSelect")
			.formParam("uuid_3", "o99Pe5")
			.formParam("data_3", """{"items":["o99P26"],"reference":"o99P26"}"""))
		.pause(1)
		.exec(http("request_9")
			.post("/fm/zkau")
			.headers(headers_9)
			.formParam("dtid", "z_32t")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "o99P15")
			.formParam("data_0", """{"pageX":278,"pageY":185,"which":1,"x":34,"y":9}""")
			.resources(http("request_10")
			.get("/fm/run?__report=sincronizacion.rptdesign&jndi_name=java:jboss/fm.conf.ds.report&ciclo=196&supervisor=23&userState=0")
			.headers(headers_0),
            http("request_11")
			.get("/fm/Reportes/custom4e66c18c170bfefe9e31.png")
			.headers(headers_11)))
		.pause(1)
		.exec(http("request_12")
			.post("/fm/zkau")
			.headers(headers_12)
			.formParam("dtid", "z_32t")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "o99Pu4")
			.formParam("data_0", """{"pageX":253,"pageY":142,"which":1,"x":9,"y":15}""")
			.resources(http("request_13")
			.get("/fm/run?__report=sincronizacion.rptdesign&supervisor=23&jndi_name=java:jboss/fm.conf.ds.report&ciclo=196&userState=0&__format=pdf")
			.headers(headers_0)))
		.pause(2)
		.exec(http("request_14")
			.post("/fm/zkau")
			.headers(headers_14)
			.formParam("dtid", "z_32t")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "o99Pw4")
			.formParam("data_0", """{"pageX":286,"pageY":134,"which":1,"x":13,"y":7}""")
			.resources(http("request_15")
			.get("/fm/run?__report=sincronizacion.rptdesign&supervisor=23&jndi_name=java:jboss/fm.conf.ds.report&ciclo=196&userState=0&__format=xls")
			.headers(headers_0)))
		.pause(5)
		.exec(http("request_16")
			.post("/fm/zkau")
			.headers(headers_16)
			.formParam("dtid", "z_32t")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "o99Pc5")
			.formParam("data_0", """{"value":"Diego Martinez","start":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "o99Pc5")
			.formParam("data_1", """{"items":["o99Pp5"],"reference":"o99Pp5","prevSeld":"o99Po5"}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "o99P15")
			.formParam("data_2", """{"pageX":273,"pageY":185,"which":1,"x":29,"y":9}""")
			.resources(http("request_17")
			.get("/fm/run?__report=sincronizacion.rptdesign&jndi_name=java:jboss/fm.conf.ds.report&ciclo=196&supervisor=24&userState=0")
			.headers(headers_0),
            http("request_18")
			.get("/fm/Reportes/custom47f81688170bff013e51.png")
			.headers(headers_11)))
		.pause(1)
		.exec(http("request_19")
			.post("/fm/zkau")
			.headers(headers_19)
			.formParam("dtid", "z_32t")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "o99Pu4")
			.formParam("data_0", """{"pageX":252,"pageY":137,"which":1,"x":8,"y":10}""")
			.resources(http("request_20")
			.get("/fm/run?__report=sincronizacion.rptdesign&supervisor=24&jndi_name=java:jboss/fm.conf.ds.report&ciclo=196&userState=0&__format=pdf")
			.headers(headers_0)))
		.pause(2)
		.exec(http("request_21")
			.post("/fm/zkau")
			.headers(headers_21)
			.formParam("dtid", "z_32t")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "o99Pw4")
			.formParam("data_0", """{"pageX":292,"pageY":132,"which":1,"x":19,"y":5}""")
			.resources(http("request_22")
			.get("/fm/run?__report=sincronizacion.rptdesign&supervisor=24&jndi_name=java:jboss/fm.conf.ds.report&ciclo=196&userState=0&__format=xls")
			.headers(headers_0)))
		.pause(4)
		.exec(http("request_23")
			.post("/fm/zkau")
			.headers(headers_23)
			.formParam("dtid", "z_32t")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "o99Ph")
			.formParam("data_0", """{"pageX":1906,"pageY":38,"which":1,"x":19,"y":9}""")
			.resources(http("request_24")
			.get("/fm/zkau?dtid=z_32t&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_25")
			.get("/fm/logout.zul")
			.headers(headers_0),
            http("request_26")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(2)
		.exec(http("request_27")
			.get("/fm/zkau?dtid=z_n5a&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}