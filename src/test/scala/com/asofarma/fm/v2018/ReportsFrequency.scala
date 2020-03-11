package com.asofarma.fm.v2018

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class ReportsFrequency extends Simulation {

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
		"ZK-SID" -> "6426")

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
		"ZK-SID" -> "1700")

	val headers_8 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "1701")

	val headers_9 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "1702")

	val headers_10 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "1703")

	val headers_11 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "1704")

	val headers_13 = Map("Accept" -> "image/webp,*/*")

	val headers_14 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "1705")

	val headers_16 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "1706")

	val headers_18 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "1707")

	val headers_21 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "1708")

	val headers_23 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "1709")

	val headers_25 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "1710")



	val scn = scenario("ReportsFrequency")
		.exec(http("request_0")
			.get("/fm")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(4)
		.exec(http("request_2")
			.post("/fm/zkau")
			.headers(headers_2)
			.formParam("dtid", "z_qbh")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "yHCQ9")
			.formParam("data_0", """{"value":"admin","start":5}""")
			.formParam("cmd_1", "onClick")
			.formParam("uuid_1", "yHCQf")
			.formParam("data_1", """{"pageX":935,"pageY":469,"which":1,"x":154,"y":18}""")
			.resources(http("request_3")
			.get("/fm/zkau?dtid=z_qbh&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_4")
			.post("/fm/security_check")
			.headers(headers_4)
			.formParam("username", "admin")
			.formParam("password", "TecnofarmaHQ"),
            http("request_5")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd"),
            http("request_6")
			.get("/fm/script/asofarma.js?_=1583767779076")
			.headers(headers_6)))
		.pause(3)
		.exec(http("request_7")
			.post("/fm/zkau")
			.headers(headers_7)
			.formParam("dtid", "z_rbh")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "xIDQg1")
			.formParam("data_0", """{"items":["xIDQg1"],"reference":"xIDQg1"}""")
			.formParam("cmd_1", "onAnchorPos")
			.formParam("uuid_1", "xIDQi1")
			.formParam("data_1", """{"top":33,"left":0}""")
			.formParam("cmd_2", "onSelect")
			.formParam("uuid_2", "xIDQi1")
			.formParam("data_2", """{"items":["xIDQl1"],"reference":"xIDQl1","clearFirst":false,"selectAll":false,"pageX":60,"pageY":299,"which":1,"x":59,"y":51}""")
			.formParam("cmd_3", "onClick")
			.formParam("uuid_3", "xIDQl1")
			.formParam("data_3", """{"pageX":60,"pageY":299,"which":1,"x":59,"y":18}"""))
		.pause(3)
		.exec(http("request_8")
			.post("/fm/zkau")
			.headers(headers_8)
			.formParam("dtid", "z_rbh")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "xIDQc5")
			.formParam("data_0", """{"value":"Ole","start":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "xIDQc5")
			.formParam("data_1", """{"items":["xIDQt7"],"reference":"xIDQt7"}"""))
		.pause(2)
		.exec(http("request_9")
			.post("/fm/zkau")
			.headers(headers_9)
			.formParam("dtid", "z_rbh")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "xIDQh5")
			.formParam("data_0", """{"value":"OLE","start":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "xIDQh5")
			.formParam("data_1", """{"items":["xIDQd5"],"reference":"xIDQd5"}"""))
		.pause(1)
		.exec(http("request_10")
			.post("/fm/zkau")
			.headers(headers_10)
			.formParam("dtid", "z_rbh")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "xIDQj5")
			.formParam("data_0", """{"value":"Alvaro Vergara","start":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "xIDQj5")
			.formParam("data_1", """{"items":["xIDQf5"],"reference":"xIDQf5"}"""))
		.pause(4)
		.exec(http("request_11")
			.post("/fm/zkau")
			.headers(headers_11)
			.formParam("dtid", "z_rbh")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "xIDQm5")
			.formParam("data_0", """{"value":"Kela Rodriguez","start":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "xIDQm5")
			.formParam("data_1", """{"items":["xIDQm7"],"reference":"xIDQm7"}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "xIDQ15")
			.formParam("data_2", """{"pageX":281,"pageY":185,"which":1,"x":37,"y":9}""")
			.resources(http("request_12")
			.get("/fm/run?__report=frecuencia.rptdesign&jndi_name=java:jboss/fm.conf.ds.report&supervisor=23&representante=62&lineapromocion=6&corporativeLine=1&userState=0")
			.headers(headers_0),
            http("request_13")
			.get("/fm/Reportes/file7d3679e9170bfeab44b1.png")
			.headers(headers_13)))
		.pause(1)
		.exec(http("request_14")
			.post("/fm/zkau")
			.headers(headers_14)
			.formParam("dtid", "z_rbh")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "xIDQu4")
			.formParam("data_0", """{"pageX":258,"pageY":135,"which":1,"x":14,"y":8}""")
			.resources(http("request_15")
			.get("/fm/run?__report=frecuencia.rptdesign&corporativeLine=1&supervisor=23&representante=62&jndi_name=java:jboss/fm.conf.ds.report&lineapromocion=6&userState=0&__format=pdf")
			.headers(headers_0)))
		.pause(3)
		.exec(http("request_16")
			.post("/fm/zkau")
			.headers(headers_16)
			.formParam("dtid", "z_rbh")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "xIDQw4")
			.formParam("data_0", """{"pageX":288,"pageY":138,"which":1,"x":15,"y":11}""")
			.resources(http("request_17")
			.get("/fm/run?__report=frecuencia.rptdesign&corporativeLine=1&supervisor=23&representante=62&jndi_name=java:jboss/fm.conf.ds.report&lineapromocion=6&userState=0&__format=xls")
			.headers(headers_0)))
		.pause(9)
		.exec(http("request_18")
			.post("/fm/zkau")
			.headers(headers_18)
			.formParam("dtid", "z_rbh")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "xIDQm5")
			.formParam("data_0", """{"value":"Carolina Barreto","start":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "xIDQm5")
			.formParam("data_1", """{"items":["xIDQl7"],"reference":"xIDQl7","prevSeld":"xIDQm7"}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "xIDQ15")
			.formParam("data_2", """{"pageX":261,"pageY":189,"which":1,"x":17,"y":13}""")
			.resources(http("request_19")
			.get("/fm/run?__report=frecuencia.rptdesign&jndi_name=java:jboss/fm.conf.ds.report&supervisor=23&representante=22&lineapromocion=6&corporativeLine=1&userState=0")
			.headers(headers_0),
            http("request_20")
			.get("/fm/Reportes/file73a035d0170bfeb342e1.png")
			.headers(headers_13)))
		.pause(2)
		.exec(http("request_21")
			.post("/fm/zkau")
			.headers(headers_21)
			.formParam("dtid", "z_rbh")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "xIDQu4")
			.formParam("data_0", """{"pageX":251,"pageY":132,"which":1,"x":7,"y":5}""")
			.resources(http("request_22")
			.get("/fm/run?__report=frecuencia.rptdesign&corporativeLine=1&supervisor=23&representante=22&jndi_name=java:jboss/fm.conf.ds.report&lineapromocion=6&userState=0&__format=pdf")
			.headers(headers_0)))
		.pause(3)
		.exec(http("request_23")
			.post("/fm/zkau")
			.headers(headers_23)
			.formParam("dtid", "z_rbh")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "xIDQw4")
			.formParam("data_0", """{"pageX":290,"pageY":134,"which":1,"x":17,"y":7}""")
			.resources(http("request_24")
			.get("/fm/run?__report=frecuencia.rptdesign&corporativeLine=1&supervisor=23&representante=22&jndi_name=java:jboss/fm.conf.ds.report&lineapromocion=6&userState=0&__format=xls")
			.headers(headers_0)))
		.pause(4)
		.exec(http("request_25")
			.post("/fm/zkau")
			.headers(headers_25)
			.formParam("dtid", "z_rbh")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "xIDQh")
			.formParam("data_0", """{"pageX":1908,"pageY":47,"which":1,"x":21,"y":18}""")
			.resources(http("request_26")
			.get("/fm/zkau?dtid=z_rbh&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_27")
			.get("/fm/logout.zul")
			.headers(headers_0),
            http("request_28")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}