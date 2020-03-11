package com.asofarma.fm.v2018

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class ReportsCoverage extends Simulation {

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
		"ZK-SID" -> "6924")

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
		"ZK-SID" -> "2824")

	val headers_8 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "2825")

	val headers_9 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "2826")

	val headers_10 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "2827")

	val headers_12 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "2828")

	val headers_14 = Map("Accept" -> "image/webp,*/*")

	val headers_16 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "2829")

	val headers_18 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "2830")

	val headers_19 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "2831")

	val headers_22 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "2832")

	val headers_24 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "2833")



	val scn = scenario("ReportsCoverage")
		.exec(http("ReportsCoverage_0")
			.get("/fm")
			.headers(headers_0)
			.resources(http("ReportsCoverage_1")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(5)
		.exec(http("ReportsCoverage_2")
			.post("/fm/zkau")
			.headers(headers_2)
			.formParam("dtid", "z_wjh")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "gXIQ9")
			.formParam("data_0", """{"value":"admin","start":5}""")
			.formParam("cmd_1", "onChange")
			.formParam("uuid_1", "gXIQa")
			.formParam("data_1", """{"value":"TecnofarmaHQ","start":12}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "gXIQf")
			.formParam("data_2", """{"pageX":1036,"pageY":477,"which":1,"x":255,"y":26}""")
			.resources(http("ReportsCoverage_3")
			.get("/fm/zkau?dtid=z_wjh&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("ReportsCoverage_4")
			.post("/fm/security_check")
			.headers(headers_4)
			.formParam("username", "admin")
			.formParam("password", "TecnofarmaHQ"),
            http("ReportsCoverage_5")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd"),
            http("ReportsCoverage_6")
			.get("/fm/script/asofarma.js?_=1583767190259")
			.headers(headers_6)))
		.pause(4)
		.exec(http("ReportsCoverage_7")
			.post("/fm/zkau")
			.headers(headers_7)
			.formParam("dtid", "z_xjh")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "fYJQg1")
			.formParam("data_0", """{"items":["fYJQg1"],"reference":"fYJQg1"}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "fYJQi1")
			.formParam("data_1", """{"items":["fYJQj1"],"reference":"fYJQj1","clearFirst":false,"selectAll":false,"pageX":46,"pageY":261,"which":1,"x":45,"y":13}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "fYJQj1")
			.formParam("data_2", """{"pageX":46,"pageY":261,"which":1,"x":45,"y":13}"""))
		.pause(7)
		.exec(http("ReportsCoverage_8")
			.post("/fm/zkau")
			.headers(headers_8)
			.formParam("dtid", "z_xjh")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "fYJQc5")
			.formParam("data_0", """{"value":"CICLO 201911","start":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "fYJQc5")
			.formParam("data_1", """{"items":["fYJQw6"],"reference":"fYJQw6"}""")
			.formParam("cmd_2", "onChange")
			.formParam("uuid_2", "fYJQe5")
			.formParam("data_2", """{"value":"Ole","start":0}""")
			.formParam("cmd_3", "onSelect")
			.formParam("uuid_3", "fYJQe5")
			.formParam("data_3", """{"items":["fYJQja"],"reference":"fYJQja"}"""))
		.pause(2)
		.exec(http("ReportsCoverage_9")
			.post("/fm/zkau")
			.headers(headers_9)
			.formParam("dtid", "z_xjh")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "fYJQj5")
			.formParam("data_0", """{"value":"OLE","start":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "fYJQj5")
			.formParam("data_1", """{"items":["fYJQf5"],"reference":"fYJQf5"}"""))
		.pause(6)
		.exec(http("ReportsCoverage_10")
			.post("/fm/zkau")
			.headers(headers_10)
			.formParam("dtid", "z_xjh")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "fYJQu4")
			.formParam("data_0", """{"pageX":255,"pageY":139,"which":1,"x":11,"y":12}""")
			.resources(http("ReportsCoverage_11")
			.get("/fm/run?__report=cobertura.rptdesign&jndi_name=java:jboss/fm.conf.ds.report&ciclo=196&lineapromocion=6&corporativeLine=1&userState=0&__format=pdf")
			.headers(headers_0)))
		.pause(7)
		.exec(http("ReportsCoverage_12")
			.post("/fm/zkau")
			.headers(headers_12)
			.formParam("dtid", "z_xjh")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "fYJQ15")
			.formParam("data_0", """{"pageX":285,"pageY":185,"which":1,"x":41,"y":9}""")
			.resources(http("ReportsCoverage_13")
			.get("/fm/run?__report=cobertura.rptdesign&jndi_name=java:jboss/fm.conf.ds.report&ciclo=196&lineapromocion=6&corporativeLine=1&userState=0")
			.headers(headers_0),
            http("ReportsCoverage_14")
			.get("/fm/Reportes/file3f8a7c3170bfe220a92.png")
			.headers(headers_14),
            http("ReportsCoverage_15")
			.get("/fm/Reportes/file3f8a7c3170bfe220a91.png")
			.headers(headers_14)))
		.pause(1)
		.exec(http("ReportsCoverage_16")
			.post("/fm/zkau")
			.headers(headers_16)
			.formParam("dtid", "z_xjh")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "fYJQw4")
			.formParam("data_0", """{"pageX":287,"pageY":141,"which":1,"x":14,"y":14}""")
			.resources(http("ReportsCoverage_17")
			.get("/fm/run?__report=cobertura.rptdesign&corporativeLine=1&jndi_name=java:jboss/fm.conf.ds.report&ciclo=196&lineapromocion=6&userState=0&__format=xls")
			.headers(headers_0)))
		.pause(8)
		.exec(http("ReportsCoverage_18")
			.post("/fm/zkau")
			.headers(headers_18)
			.formParam("dtid", "z_xjh")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "fYJQm5")
			.formParam("data_0", """{"value":"Alvaro Vergara","start":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "fYJQm5")
			.formParam("data_1", """{"items":["fYJQba"],"reference":"fYJQba"}"""))
		.pause(7)
		.exec(http("ReportsCoverage_19")
			.post("/fm/zkau")
			.headers(headers_19)
			.formParam("dtid", "z_xjh")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "fYJQo5")
			.formParam("data_0", """{"value":"Kela Rodriguez","start":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "fYJQo5")
			.formParam("data_1", """{"items":["fYJQda"],"reference":"fYJQda"}""")
			.formParam("cmd_2", "onChange")
			.formParam("uuid_2", "fYJQ46")
			.formParam("data_2", """{"value":"Profesional Salud","start":0}""")
			.formParam("cmd_3", "onSelect")
			.formParam("uuid_3", "fYJQ46")
			.formParam("data_3", """{"items":["fYJQ76"],"reference":"fYJQ76"}""")
			.formParam("cmd_4", "onClick")
			.formParam("uuid_4", "fYJQ15")
			.formParam("data_4", """{"pageX":277,"pageY":192,"which":1,"x":33,"y":16}""")
			.resources(http("ReportsCoverage_20")
			.get("/fm/run?__report=cobertura.rptdesign&jndi_name=java:jboss/fm.conf.ds.report&ciclo=196&supervisor=23&representante=62&lineapromocion=6&tipocliente=1&corporativeLine=1&userState=0")
			.headers(headers_0),
            http("ReportsCoverage_21")
			.get("/fm/Reportes/file66242350170bfe285361.png")
			.headers(headers_14)))
		.pause(3)
		.exec(http("ReportsCoverage_22")
			.post("/fm/zkau")
			.headers(headers_22)
			.formParam("dtid", "z_xjh")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "fYJQw4")
			.formParam("data_0", """{"pageX":292,"pageY":140,"which":1,"x":19,"y":13}""")
			.resources(http("ReportsCoverage_23")
			.get("/fm/run?__report=cobertura.rptdesign&tipocliente=1&corporativeLine=1&supervisor=23&representante=62&jndi_name=java:jboss/fm.conf.ds.report&ciclo=196&lineapromocion=6&userState=0&__format=xls")
			.headers(headers_0)))
		.pause(8)
		.exec(http("ReportsCoverage_24")
			.post("/fm/zkau")
			.headers(headers_24)
			.formParam("dtid", "z_xjh")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "fYJQh")
			.formParam("data_0", """{"pageX":1908,"pageY":36,"which":1,"x":21,"y":7}""")
			.resources(http("ReportsCoverage_25")
			.get("/fm/zkau?dtid=z_xjh&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("ReportsCoverage_26")
			.get("/fm/logout.zul")
			.headers(headers_0),
            http("ReportsCoverage_27")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}