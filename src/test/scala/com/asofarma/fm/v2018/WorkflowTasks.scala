package com.asofarma.fm.v2018

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class WorkflowTasks extends Simulation {

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
		"ZK-SID" -> "373")

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
		"ZK-SID" -> "2974")

	val headers_8 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "2975")

	val headers_9 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "2976")

	val headers_10 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "2977")

	val headers_11 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "2978")

	val headers_12 = Map("Accept" -> "image/webp,*/*")

	val headers_13 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "2979")

	val headers_14 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "2980")

	val headers_15 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "2981")

	val headers_16 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "2982")

	val headers_17 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "2983")

	val headers_18 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "2984")

	val headers_19 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "2985")



	val scn = scenario("WorkflowTasks")
		.exec(http("request_0")
			.get("/fm")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(2)
		.exec(http("request_2")
			.post("/fm/zkau")
			.headers(headers_2)
			.formParam("dtid", "z_52e")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "xABP9")
			.formParam("data_0", """{"value":"admin","start":5}""")
			.formParam("cmd_1", "onClick")
			.formParam("uuid_1", "xABPf")
			.formParam("data_1", """{"pageX":921,"pageY":472,"which":1,"x":140,"y":21}""")
			.resources(http("request_3")
			.get("/fm/zkau?dtid=z_52e&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_4")
			.post("/fm/security_check")
			.headers(headers_4)
			.formParam("username", "admin")
			.formParam("password", "TecnofarmaHQ"),
            http("request_5")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd"),
            http("request_6")
			.get("/fm/script/asofarma.js?_=1583927614366")
			.headers(headers_6)))
		.pause(3)
		.exec(http("request_7")
			.post("/fm/zkau")
			.headers(headers_7)
			.formParam("dtid", "z_62e")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "wBCPh2")
			.formParam("data_0", """{"items":["wBCPh2"],"reference":"wBCPh2"}""")
			.formParam("cmd_1", "onAnchorPos")
			.formParam("uuid_1", "wBCPj2")
			.formParam("data_1", """{"top":33,"left":0}""")
			.formParam("cmd_2", "onSelect")
			.formParam("uuid_2", "wBCPj2")
			.formParam("data_2", """{"items":["wBCPm2"],"reference":"wBCPm2","clearFirst":false,"selectAll":false,"pageX":34,"pageY":351,"which":1,"x":33,"y":45}""")
			.formParam("cmd_3", "onClick")
			.formParam("uuid_3", "wBCPm2")
			.formParam("data_3", """{"pageX":34,"pageY":351,"which":1,"x":33,"y":12}"""))
		.pause(4)
		.exec(http("request_8")
			.post("/fm/zkau")
			.headers(headers_8)
			.formParam("dtid", "z_62e")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "wBCPg5")
			.formParam("data_0", """{"value":"Alvaro Vergara","start":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "wBCPg5")
			.formParam("data_1", """{"items":["wBCPj6"],"reference":"wBCPj6"}"""))
		.pause(1)
		.exec(http("request_9")
			.post("/fm/zkau")
			.headers(headers_9)
			.formParam("dtid", "z_62e")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "wBCP55")
			.formParam("data_0", """{"pageX":290,"pageY":189,"which":1,"x":46,"y":13}"""))
		.pause(5)
		.exec(http("request_10")
			.post("/fm/zkau")
			.headers(headers_10)
			.formParam("dtid", "z_62e")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "wBCPi5")
			.formParam("data_0", """{"value":"Kela Rodriguez","start":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "wBCPi5")
			.formParam("data_1", """{"items":["wBCPm4"],"reference":"wBCPm4"}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "wBCP55")
			.formParam("data_2", """{"pageX":262,"pageY":181,"which":1,"x":18,"y":5}"""))
		.pause(1)
		.exec(http("request_11")
			.post("/fm/zkau")
			.headers(headers_11)
			.formParam("dtid", "z_62e")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "wBCP16")
			.formParam("data_0", """{"items":["wBCP27"],"reference":"wBCP27","clearFirst":true,"selectAll":false,"pageX":704,"pageY":354,"which":1,"x":474,"y":49}""")
			.formParam("cmd_1", "onDoubleClick")
			.formParam("uuid_1", "wBCP27")
			.formParam("data_1", """{"pageX":704,"pageY":354,"which":1,"x":474,"y":19}""")
			.resources(http("request_12")
			.get("/fm/img/icon/green.png")
			.headers(headers_12)))
		.pause(9)
		.exec(http("request_13")
			.post("/fm/zkau")
			.headers(headers_13)
			.formParam("dtid", "z_62e")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "wBCP1a")
			.formParam("data_0", """{"items":["wBCP1a"],"reference":"wBCP1a"}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "wBCP3a")
			.formParam("data_1", """{"items":["wBCP3a"],"reference":"wBCP3a"}""")
			.formParam("cmd_2", "onSelect")
			.formParam("uuid_2", "wBCPt9")
			.formParam("data_2", """{"items":["wBCPt9"],"reference":"wBCPt9"}""")
			.formParam("cmd_3", "onClick")
			.formParam("uuid_3", "wBCP0l")
			.formParam("data_3", """{"pageX":252,"pageY":321,"which":1,"x":16,"y":14}""")
			.resources(http("request_14")
			.post("/fm/zkau")
			.headers(headers_14)
			.formParam("dtid", "z_62e")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "wBCPyj")
			.formParam("data_0", """{"pageX":246,"pageY":291,"which":1,"x":5,"y":8}""")))
		.pause(6)
		.exec(http("request_15")
			.post("/fm/zkau")
			.headers(headers_15)
			.formParam("dtid", "z_62e")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "wBCPu9")
			.formParam("data_0", """{"items":["wBCPu9"],"reference":"wBCPu9"}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "wBCPfe")
			.formParam("data_1", """{"items":["wBCPfe"],"reference":"wBCPfe"}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "wBCP6a")
			.formParam("data_2", """{"pageX":411,"pageY":85,"which":1,"x":33,"y":10}"""))
		.pause(4)
		.exec(http("request_16")
			.post("/fm/zkau")
			.headers(headers_16)
			.formParam("dtid", "z_62e")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "wBCPj6")
			.formParam("data_0", """{"value":"Carolina Barreto","start":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "wBCPj6")
			.formParam("data_1", """{"items":["wBCPm8"],"reference":"wBCPm8","prevSeld":"wBCP78"}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "wBCP55")
			.formParam("data_2", """{"pageX":288,"pageY":185,"which":1,"x":44,"y":9}"""))
		.pause(1)
		.exec(http("request_17")
			.post("/fm/zkau")
			.headers(headers_17)
			.formParam("dtid", "z_62e")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "wBCPx5")
			.formParam("data_0", """{"top":165,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "wBCPx5")
			.formParam("data_1", """{"items":["wBCP6a"],"reference":"wBCP6a","clearFirst":true,"selectAll":false,"pageX":334,"pageY":503,"which":1,"x":104,"y":198}""")
			.formParam("cmd_2", "onDoubleClick")
			.formParam("uuid_2", "wBCP6a")
			.formParam("data_2", """{"pageX":334,"pageY":503,"which":1,"x":104,"y":3}"""))
		.pause(4)
		.exec(http("request_18")
			.post("/fm/zkau")
			.headers(headers_18)
			.formParam("dtid", "z_62e")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "wBCPms")
			.formParam("data_0", """{"items":["wBCPms"],"reference":"wBCPms"}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "wBCPos")
			.formParam("data_1", """{"items":["wBCPos"],"reference":"wBCPos"}""")
			.formParam("cmd_2", "onSelect")
			.formParam("uuid_2", "wBCPqs")
			.formParam("data_2", """{"items":["wBCPqs"],"reference":"wBCPqs"}""")
			.formParam("cmd_3", "onSelect")
			.formParam("uuid_3", "wBCPrs")
			.formParam("data_3", """{"items":["wBCPrs"],"reference":"wBCPrs"}""")
			.formParam("cmd_4", "onClick")
			.formParam("uuid_4", "wBCPes")
			.formParam("data_4", """{"pageX":409,"pageY":84,"which":1,"x":31,"y":9}"""))
		.pause(2)
		.exec(http("request_19")
			.post("/fm/zkau")
			.headers(headers_19)
			.formParam("dtid", "z_62e")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "wBCPh")
			.formParam("data_0", """{"pageX":1901,"pageY":45,"which":1,"x":14,"y":16}""")
			.resources(http("request_20")
			.get("/fm/zkau?dtid=z_62e&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3),
            http("request_21")
			.get("/fm/logout.zul")
			.headers(headers_0),
            http("request_22")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))
		.pause(2)
		.exec(http("request_23")
			.get("/fm/zkau?dtid=z_7x4&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_3))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}