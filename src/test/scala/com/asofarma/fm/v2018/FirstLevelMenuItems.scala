package com.asofarma.fm.v2018

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class FirstLevelMenuItems extends Simulation {

	val httpProtocol = http
		.baseUrl("http://fm.trebolit.com.ar:8080")
		.inferHtmlResources()
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:73.0) Gecko/20100101 Firefox/73.0")

	val headers_0 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_1 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_2 = Map("Accept" -> "text/css,*/*;q=0.1")

	val headers_12 = Map("Accept" -> "image/webp,*/*")

	val headers_15 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "8705")

	val headers_17 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_26 = Map(
		"Accept" -> "text/javascript, application/javascript, application/ecmascript, application/x-ecmascript, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_27 = Map(
		"Accept" -> "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8",
		"Accept-Encoding" -> "identity")

	val headers_29 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3095")

	val headers_31 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3096")

	val headers_32 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3097")

	val headers_33 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3098")

	val headers_34 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3099")

	val headers_35 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3100")

	val headers_36 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3101")

	val headers_37 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3102")

	val headers_38 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3103")

	val headers_39 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3104")

	val headers_40 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3105")

	val headers_41 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3106")

	val headers_43 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3107")

	val headers_44 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3108")

	val headers_45 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3109")

	val headers_46 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3110")

	val headers_47 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3111")

	val headers_48 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3112")

	val headers_49 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3113")

	val headers_50 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3114")

	val headers_51 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3115")

	val headers_52 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3116")

	val headers_53 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3117")

	val headers_54 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3118")

	val headers_55 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3119")

	val headers_56 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3120")

	val headers_57 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3121")

	val headers_60 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3122")

	val headers_61 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3123")

	val headers_62 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3124")

	val headers_63 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3125")

	val headers_64 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3126")

	val headers_65 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3127")

	val headers_66 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3128")

	val headers_67 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3129")

	val headers_68 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3130")

	val headers_69 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3131")

	val headers_70 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3132")

	val headers_71 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3133")

	val headers_72 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3134")

	val headers_73 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3135")

	val headers_74 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3136")

	val headers_75 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3137")

	val headers_76 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3138")

	val headers_77 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3139")

	val headers_78 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3140")

	val headers_79 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3141")

	val headers_80 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3142")

	val headers_81 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3143")

	val headers_82 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3144")

	val headers_83 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3145")

	val headers_84 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3146")

	val headers_85 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3147")

	val headers_86 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3148")

	val headers_87 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3149")

	val headers_88 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3150")

	val headers_89 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3151")

	val headers_90 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3152")

	val headers_91 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3153")

	val headers_92 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3154")

	val headers_93 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3155")

	val headers_94 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3156")

	val headers_95 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3157")

	val headers_96 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3158")

	val headers_98 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3159")

	val headers_99 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3160")

	val headers_100 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3161")

	val headers_102 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3162")

	val headers_103 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3163")

	val headers_104 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3164")

	val headers_105 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "http://fm.trebolit.com.ar:8080",
		"ZK-SID" -> "3165")

    val uri1 = "http://ciscobinary.openh264.org/openh264-win64-2e1774ab6dc6c43debb0b5b628bdf122a391d521.zip"
    val uri3 = "http://repository.trebolit.com.ar:8080/fm/zkau"

	val scn = scenario("FocusSimulation")
		.exec(http("FocusSimulation_0")
			.get(uri3 + "?dtid=z_bss&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_0)
			.resources(http("FocusSimulation_1")
			.get("/fm")
			.headers(headers_1),
            http("FocusSimulation_2")
			.get("/fm/style/asofarma.css")
			.headers(headers_2),
            http("FocusSimulation_3")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd"),
            http("FocusSimulation_4")
			.get("/fm/zkau/web/79565750/zul/css/zk.wcs")
			.headers(headers_2),
            http("FocusSimulation_5")
			.get("/fm/zkau/web/79565750/js/zk.wpd"),
            http("FocusSimulation_6")
			.get("/fm/zkau/web/_zv2014090212/js/zul.box.wpd"),
            http("FocusSimulation_7")
			.get("/fm/zkau/web/_zv2014090212/js/zul.wnd.wpd"),
            http("FocusSimulation_8")
			.get("/fm/zkau/web/_zv2014090212/js/zhtml.wpd"),
            http("FocusSimulation_9")
			.get("/fm/zkau/web/_zv2014090212/js/zul.inp.wpd"),
            http("FocusSimulation_10")
			.get("/fm/zkau/web/_zv2014090212/js/zul.utl.wpd"),
            http("FocusSimulation_11")
			.get("/fm/zkau/web/_zv2014090212/js/zk.fmt.wpd"),
            http("FocusSimulation_12")
			.get("/fm/img/faro.ico")
			.headers(headers_12),
            http("FocusSimulation_13")
			.get("/fm/zkau/web/79565750/zul/img/misc/progress.gif")
			.headers(headers_12),
            http("FocusSimulation_14")
			.get("/fm/img/blue-image.png")
			.headers(headers_12)))
		.pause(33)
		.exec(http("FocusSimulation_15")
			.post("/fm/zkau")
			.headers(headers_15)
			.formParam("dtid", "z_ah5")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "t7wP9")
			.formParam("data_0", """{"value":"admin","start":5}""")
			.formParam("cmd_1", "onChange")
			.formParam("uuid_1", "t7wPa")
			.formParam("data_1", """{"value":"TecnofarmaHQ","start":12}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "t7wPf")
			.formParam("data_2", """{"pageX":426,"pageY":475,"which":1,"x":161,"y":24}""")
			.resources(http("FocusSimulation_16")
			.get("/fm/zkau?dtid=z_ah5&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_0),
            http("FocusSimulation_17")
			.post("/fm/security_check")
			.headers(headers_17)
			.formParam("username", "admin")
			.formParam("password", "TecnofarmaHQ"),
            http("FocusSimulation_18")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd"),
            http("FocusSimulation_19")
			.get("/fm/zkau/web/_zv2014090212/js/zul.tab.wpd"),
            http("FocusSimulation_20")
			.get("/fm/zkau/web/_zv2014090212/js/zul.layout.wpd"),
            http("FocusSimulation_21")
			.get("/fm/zkau/web/_zv2014090212/js/zul.sel.wpd"),
            http("FocusSimulation_22")
			.get("/fm/zkau/web/_zv2014090212/js/zul.mesh.wpd"),
            http("FocusSimulation_23")
			.get("/fm/zkau/web/_zv2014090212/js/zul.menu.wpd"),
            http("FocusSimulation_24")
			.get("/fm/style/themify-icons.css")
			.headers(headers_2),
            http("FocusSimulation_25")
			.get("/fm/img/white-logo-test.png")
			.headers(headers_12),
            http("FocusSimulation_26")
			.get("/fm/script/asofarma.js?_=1583764580792")
			.headers(headers_26),
            http("FocusSimulation_27")
			.get("/fm/zkau/web/79565750/zul/less/font/fontawesome-webfont.woff?v=4.0.1")
			.headers(headers_27),
            http("FocusSimulation_28")
			.get("/fm/style/fonts/themify.woff?-fvbane")
			.headers(headers_27)))
		.pause(12)
		.exec(http("FocusSimulation_29")
			.post("/fm/zkau")
			.headers(headers_29)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "s8xPw")
			.formParam("data_0", """{"items":["s8xPx"],"reference":"s8xPx","clearFirst":false,"selectAll":false,"pageX":64,"pageY":143,"which":1,"x":63,"y":11}""")
			.formParam("cmd_1", "onClick")
			.formParam("uuid_1", "s8xPx")
			.formParam("data_1", """{"pageX":64,"pageY":143,"which":1,"x":63,"y":11}""")
			.resources(http("FocusSimulation_30")
			.get("/fm/zkau/web/_zv2014090212/js/zul.grid.wpd")))
		.pause(7)
		.exec(http("FocusSimulation_31")
			.post("/fm/zkau")
			.headers(headers_31)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPw")
			.formParam("data_0", """{"top":33,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPw")
			.formParam("data_1", """{"items":["s8xPz"],"reference":"s8xPz","clearFirst":false,"selectAll":false,"pageX":37,"pageY":182,"which":1,"x":36,"y":50}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPz")
			.formParam("data_2", """{"pageX":37,"pageY":182,"which":1,"x":36,"y":17}"""))
		.pause(1)
		.exec(http("FocusSimulation_32")
			.post("/fm/zkau")
			.headers(headers_32)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPw")
			.formParam("data_0", """{"top":66,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPw")
			.formParam("data_1", """{"items":["s8xP00"],"reference":"s8xP00","clearFirst":false,"selectAll":false,"pageX":51,"pageY":213,"which":1,"x":50,"y":81}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xP00")
			.formParam("data_2", """{"pageX":51,"pageY":213,"which":1,"x":50,"y":15}"""))
		.pause(1)
		.exec(http("FocusSimulation_33")
			.post("/fm/zkau")
			.headers(headers_33)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPw")
			.formParam("data_0", """{"top":99,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPw")
			.formParam("data_1", """{"items":["s8xP20"],"reference":"s8xP20","clearFirst":false,"selectAll":false,"pageX":68,"pageY":239,"which":1,"x":67,"y":107}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xP20")
			.formParam("data_2", """{"pageX":68,"pageY":239,"which":1,"x":67,"y":8}"""))
		.pause(1)
		.exec(http("FocusSimulation_34")
			.post("/fm/zkau")
			.headers(headers_34)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPw")
			.formParam("data_0", """{"top":132,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPw")
			.formParam("data_1", """{"items":["s8xP40"],"reference":"s8xP40","clearFirst":false,"selectAll":false,"pageX":72,"pageY":273,"which":1,"x":71,"y":141}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xP40")
			.formParam("data_2", """{"pageX":72,"pageY":273,"which":1,"x":71,"y":9}"""))
		.pause(1)
		.exec(http("FocusSimulation_35")
			.post("/fm/zkau")
			.headers(headers_35)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPw")
			.formParam("data_0", """{"top":165,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPw")
			.formParam("data_1", """{"items":["s8xP60"],"reference":"s8xP60","clearFirst":false,"selectAll":false,"pageX":67,"pageY":310,"which":1,"x":66,"y":178}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xP60")
			.formParam("data_2", """{"pageX":67,"pageY":310,"which":1,"x":66,"y":13}"""))
		.pause(2)
		.exec(http("FocusSimulation_36")
			.post("/fm/zkau")
			.headers(headers_36)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "s8xP80")
			.formParam("data_0", """{"items":["s8xP80"],"reference":"s8xP80"}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPa0")
			.formParam("data_1", """{"items":["s8xPb0"],"reference":"s8xPb0","clearFirst":false,"selectAll":false,"pageX":40,"pageY":181,"which":1,"x":39,"y":20}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPb0")
			.formParam("data_2", """{"pageX":40,"pageY":181,"which":1,"x":39,"y":20}"""))
		.pause(1)
		.exec(http("FocusSimulation_37")
			.post("/fm/zkau")
			.headers(headers_37)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPa0")
			.formParam("data_0", """{"top":33,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPa0")
			.formParam("data_1", """{"items":["s8xPd0"],"reference":"s8xPd0","clearFirst":false,"selectAll":false,"pageX":50,"pageY":210,"which":1,"x":49,"y":49}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPd0")
			.formParam("data_2", """{"pageX":50,"pageY":210,"which":1,"x":49,"y":16}""")
			.resources(http("FocusSimulation_38")
			.post("/fm/zkau")
			.headers(headers_38)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPa0")
			.formParam("data_0", """{"top":66,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPa0")
			.formParam("data_1", """{"items":["s8xPf0"],"reference":"s8xPf0","clearFirst":false,"selectAll":false,"pageX":45,"pageY":240,"which":1,"x":44,"y":79}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPf0")
			.formParam("data_2", """{"pageX":45,"pageY":240,"which":1,"x":44,"y":13}""")))
		.pause(4)
		.exec(http("FocusSimulation_39")
			.post("/fm/zkau")
			.headers(headers_39)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "s8xPh0")
			.formParam("data_0", """{"items":["s8xPh0"],"reference":"s8xPh0"}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPj0")
			.formParam("data_1", """{"items":["s8xPk0"],"reference":"s8xPk0","clearFirst":false,"selectAll":false,"pageX":38,"pageY":207,"which":1,"x":37,"y":17}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPk0")
			.formParam("data_2", """{"pageX":38,"pageY":207,"which":1,"x":37,"y":17}"""))
		.pause(1)
		.exec(http("FocusSimulation_40")
			.post("/fm/zkau")
			.headers(headers_40)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPj0")
			.formParam("data_0", """{"top":33,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPj0")
			.formParam("data_1", """{"items":["s8xPm0"],"reference":"s8xPm0","clearFirst":false,"selectAll":false,"pageX":38,"pageY":233,"which":1,"x":37,"y":43}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPm0")
			.formParam("data_2", """{"pageX":38,"pageY":233,"which":1,"x":37,"y":10}"""))
		.pause(1)
		.exec(http("FocusSimulation_41")
			.post("/fm/zkau")
			.headers(headers_41)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPj0")
			.formParam("data_0", """{"top":66,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPj0")
			.formParam("data_1", """{"items":["s8xPo0"],"reference":"s8xPo0","clearFirst":false,"selectAll":false,"pageX":40,"pageY":275,"which":1,"x":39,"y":85}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPo0")
			.formParam("data_2", """{"pageX":40,"pageY":275,"which":1,"x":39,"y":19}""")
			.resources(http("FocusSimulation_42")
			.get("/fm/zkau/web/_zv2014090212/js/zul.db.wpd"),
            http("FocusSimulation_43")
			.post("/fm/zkau")
			.headers(headers_43)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPj0")
			.formParam("data_0", """{"top":99,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPj0")
			.formParam("data_1", """{"items":["s8xPq0"],"reference":"s8xPq0","clearFirst":false,"selectAll":false,"pageX":34,"pageY":307,"which":1,"x":33,"y":117}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPq0")
			.formParam("data_2", """{"pageX":34,"pageY":307,"which":1,"x":33,"y":18}""")))
		.pause(1)
		.exec(http("FocusSimulation_44")
			.post("/fm/zkau")
			.headers(headers_44)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPj0")
			.formParam("data_0", """{"top":132,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPj0")
			.formParam("data_1", """{"items":["s8xPs0"],"reference":"s8xPs0","clearFirst":false,"selectAll":false,"pageX":35,"pageY":332,"which":1,"x":34,"y":142}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPs0")
			.formParam("data_2", """{"pageX":35,"pageY":332,"which":1,"x":34,"y":10}"""))
		.pause(43)
		.exec(http("FocusSimulation_45")
			.post("/fm/zkau")
			.headers(headers_45)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "s8xPu0")
			.formParam("data_0", """{"items":["s8xPu0"],"reference":"s8xPu0"}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPw0")
			.formParam("data_1", """{"items":["s8xPx0"],"reference":"s8xPx0","clearFirst":false,"selectAll":false,"pageX":44,"pageY":233,"which":1,"x":43,"y":14}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPx0")
			.formParam("data_2", """{"pageX":44,"pageY":233,"which":1,"x":43,"y":14}"""))
		.pause(2)
		.exec(http("FocusSimulation_46")
			.post("/fm/zkau")
			.headers(headers_46)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPw0")
			.formParam("data_0", """{"top":33,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPw0")
			.formParam("data_1", """{"items":["s8xPz0"],"reference":"s8xPz0","clearFirst":false,"selectAll":false,"pageX":24,"pageY":266,"which":1,"x":23,"y":47}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPz0")
			.formParam("data_2", """{"pageX":24,"pageY":266,"which":1,"x":23,"y":14}"""))
		.pause(1)
		.exec(http("FocusSimulation_47")
			.post("/fm/zkau")
			.headers(headers_47)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPw0")
			.formParam("data_0", """{"top":66,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPw0")
			.formParam("data_1", """{"items":["s8xP01"],"reference":"s8xP01","clearFirst":false,"selectAll":false,"pageX":40,"pageY":299,"which":1,"x":39,"y":80}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xP01")
			.formParam("data_2", """{"pageX":40,"pageY":299,"which":1,"x":39,"y":14}""")
			.resources(http("FocusSimulation_48")
			.post("/fm/zkau")
			.headers(headers_48)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPw0")
			.formParam("data_0", """{"top":99,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPw0")
			.formParam("data_1", """{"items":["s8xP21"],"reference":"s8xP21","clearFirst":false,"selectAll":false,"pageX":52,"pageY":333,"which":1,"x":51,"y":114}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xP21")
			.formParam("data_2", """{"pageX":52,"pageY":333,"which":1,"x":51,"y":15}"""),
            http("FocusSimulation_49")
			.post("/fm/zkau")
			.headers(headers_49)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPw0")
			.formParam("data_0", """{"top":132,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPw0")
			.formParam("data_1", """{"items":["s8xP41"],"reference":"s8xP41","clearFirst":false,"selectAll":false,"pageX":48,"pageY":364,"which":1,"x":47,"y":145}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xP41")
			.formParam("data_2", """{"pageX":48,"pageY":364,"which":1,"x":47,"y":13}""")))
		.pause(1)
		.exec(http("FocusSimulation_50")
			.post("/fm/zkau")
			.headers(headers_50)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPw0")
			.formParam("data_0", """{"top":165,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPw0")
			.formParam("data_1", """{"items":["s8xP61"],"reference":"s8xP61","clearFirst":false,"selectAll":false,"pageX":89,"pageY":398,"which":1,"x":88,"y":179}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xP61")
			.formParam("data_2", """{"pageX":89,"pageY":398,"which":1,"x":88,"y":14}""")
			.resources(http("FocusSimulation_51")
			.post("/fm/zkau")
			.headers(headers_51)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPw0")
			.formParam("data_0", """{"top":198,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPw0")
			.formParam("data_1", """{"items":["s8xP81"],"reference":"s8xP81","clearFirst":false,"selectAll":false,"pageX":64,"pageY":433,"which":1,"x":63,"y":214}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xP81")
			.formParam("data_2", """{"pageX":64,"pageY":433,"which":1,"x":63,"y":16}""")))
		.pause(1)
		.exec(http("FocusSimulation_52")
			.post("/fm/zkau")
			.headers(headers_52)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPw0")
			.formParam("data_0", """{"top":231,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPw0")
			.formParam("data_1", """{"items":["s8xPa1"],"reference":"s8xPa1","clearFirst":false,"selectAll":false,"pageX":77,"pageY":469,"which":1,"x":76,"y":250}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPa1")
			.formParam("data_2", """{"pageX":77,"pageY":469,"which":1,"x":76,"y":19}"""))
		.pause(1)
		.exec(http("FocusSimulation_53")
			.post("/fm/zkau")
			.headers(headers_53)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPw0")
			.formParam("data_0", """{"top":264,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPw0")
			.formParam("data_1", """{"items":["s8xPc1"],"reference":"s8xPc1","clearFirst":false,"selectAll":false,"pageX":73,"pageY":492,"which":1,"x":72,"y":273}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPc1")
			.formParam("data_2", """{"pageX":73,"pageY":492,"which":1,"x":72,"y":9}""")
			.resources(http("FocusSimulation_54")
			.post("/fm/zkau")
			.headers(headers_54)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPw0")
			.formParam("data_0", """{"top":297,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPw0")
			.formParam("data_1", """{"items":["s8xPe1"],"reference":"s8xPe1","clearFirst":false,"selectAll":false,"pageX":85,"pageY":534,"which":1,"x":84,"y":315}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPe1")
			.formParam("data_2", """{"pageX":85,"pageY":534,"which":1,"x":84,"y":18}""")))
		.pause(2)
		.exec(http("FocusSimulation_55")
			.post("/fm/zkau")
			.headers(headers_55)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "s8xPg1")
			.formParam("data_0", """{"items":["s8xPg1"],"reference":"s8xPg1"}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPi1")
			.formParam("data_1", """{"items":["s8xPj1"],"reference":"s8xPj1","clearFirst":false,"selectAll":false,"pageX":41,"pageY":266,"which":1,"x":40,"y":18}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPj1")
			.formParam("data_2", """{"pageX":41,"pageY":266,"which":1,"x":40,"y":18}"""))
		.pause(1)
		.exec(http("FocusSimulation_56")
			.post("/fm/zkau")
			.headers(headers_56)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPi1")
			.formParam("data_0", """{"top":33,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPi1")
			.formParam("data_1", """{"items":["s8xPl1"],"reference":"s8xPl1","clearFirst":false,"selectAll":false,"pageX":41,"pageY":294,"which":1,"x":40,"y":46}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPl1")
			.formParam("data_2", """{"pageX":41,"pageY":294,"which":1,"x":40,"y":13}""")
			.resources(http("FocusSimulation_57")
			.post("/fm/zkau")
			.headers(headers_57)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPi1")
			.formParam("data_0", """{"top":66,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPi1")
			.formParam("data_1", """{"items":["s8xPn1"],"reference":"s8xPn1","clearFirst":false,"selectAll":false,"pageX":59,"pageY":334,"which":1,"x":58,"y":86}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPn1")
			.formParam("data_2", """{"pageX":59,"pageY":334,"which":1,"x":58,"y":20}"""),
            http("FocusSimulation_58")
			.get(uri1),
            http("FocusSimulation_59")
			.get(uri1),
            http("FocusSimulation_60")
			.post("/fm/zkau")
			.headers(headers_60)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPi1")
			.formParam("data_0", """{"top":99,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPi1")
			.formParam("data_1", """{"items":["s8xPp1"],"reference":"s8xPp1","clearFirst":false,"selectAll":false,"pageX":52,"pageY":363,"which":1,"x":51,"y":115}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPp1")
			.formParam("data_2", """{"pageX":52,"pageY":363,"which":1,"x":51,"y":16}"""),
            http("FocusSimulation_61")
			.post("/fm/zkau")
			.headers(headers_61)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPi1")
			.formParam("data_0", """{"top":132,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPi1")
			.formParam("data_1", """{"items":["s8xPr1"],"reference":"s8xPr1","clearFirst":false,"selectAll":false,"pageX":75,"pageY":397,"which":1,"x":74,"y":149}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPr1")
			.formParam("data_2", """{"pageX":75,"pageY":397,"which":1,"x":74,"y":17}"""),
            http("FocusSimulation_62")
			.post("/fm/zkau")
			.headers(headers_62)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPi1")
			.formParam("data_0", """{"top":165,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPi1")
			.formParam("data_1", """{"items":["s8xPt1"],"reference":"s8xPt1","clearFirst":false,"selectAll":false,"pageX":100,"pageY":424,"which":1,"x":99,"y":176}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPt1")
			.formParam("data_2", """{"pageX":100,"pageY":424,"which":1,"x":99,"y":11}"""),
            http("FocusSimulation_63")
			.post("/fm/zkau")
			.headers(headers_63)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPi1")
			.formParam("data_0", """{"top":198,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPi1")
			.formParam("data_1", """{"items":["s8xPv1"],"reference":"s8xPv1","clearFirst":false,"selectAll":false,"pageX":93,"pageY":459,"which":1,"x":92,"y":211}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPv1")
			.formParam("data_2", """{"pageX":93,"pageY":459,"which":1,"x":92,"y":13}"""),
            http("FocusSimulation_64")
			.post("/fm/zkau")
			.headers(headers_64)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPi1")
			.formParam("data_0", """{"top":231,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPi1")
			.formParam("data_1", """{"items":["s8xPx1"],"reference":"s8xPx1","clearFirst":false,"selectAll":false,"pageX":108,"pageY":492,"which":1,"x":107,"y":244}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPx1")
			.formParam("data_2", """{"pageX":108,"pageY":492,"which":1,"x":107,"y":13}"""),
            http("FocusSimulation_65")
			.post("/fm/zkau")
			.headers(headers_65)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPi1")
			.formParam("data_0", """{"top":264,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPi1")
			.formParam("data_1", """{"items":["s8xPz1"],"reference":"s8xPz1","clearFirst":false,"selectAll":false,"pageX":124,"pageY":528,"which":1,"x":123,"y":280}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPz1")
			.formParam("data_2", """{"pageX":124,"pageY":528,"which":1,"x":123,"y":16}""")))
		.pause(1)
		.exec(http("FocusSimulation_66")
			.post("/fm/zkau")
			.headers(headers_66)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPi1")
			.formParam("data_0", """{"top":297,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPi1")
			.formParam("data_1", """{"items":["s8xP02"],"reference":"s8xP02","clearFirst":false,"selectAll":false,"pageX":115,"pageY":554,"which":1,"x":114,"y":306}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xP02")
			.formParam("data_2", """{"pageX":115,"pageY":554,"which":1,"x":114,"y":9}""")
			.resources(http("FocusSimulation_67")
			.post("/fm/zkau")
			.headers(headers_67)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPi1")
			.formParam("data_0", """{"top":330,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPi1")
			.formParam("data_1", """{"items":["s8xP22"],"reference":"s8xP22","clearFirst":false,"selectAll":false,"pageX":89,"pageY":595,"which":1,"x":88,"y":347}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xP22")
			.formParam("data_2", """{"pageX":89,"pageY":595,"which":1,"x":88,"y":17}"""),
            http("FocusSimulation_68")
			.post("/fm/zkau")
			.headers(headers_68)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPi1")
			.formParam("data_0", """{"top":363,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPi1")
			.formParam("data_1", """{"items":["s8xP42"],"reference":"s8xP42","clearFirst":false,"selectAll":false,"pageX":95,"pageY":624,"which":1,"x":94,"y":376}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xP42")
			.formParam("data_2", """{"pageX":95,"pageY":624,"which":1,"x":94,"y":13}"""),
            http("FocusSimulation_69")
			.post("/fm/zkau")
			.headers(headers_69)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPi1")
			.formParam("data_0", """{"top":396,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPi1")
			.formParam("data_1", """{"items":["s8xP62"],"reference":"s8xP62","clearFirst":false,"selectAll":false,"pageX":93,"pageY":657,"which":1,"x":92,"y":409}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xP62")
			.formParam("data_2", """{"pageX":93,"pageY":657,"which":1,"x":92,"y":13}"""),
            http("FocusSimulation_70")
			.post("/fm/zkau")
			.headers(headers_70)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPi1")
			.formParam("data_0", """{"top":429,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPi1")
			.formParam("data_1", """{"items":["s8xP82"],"reference":"s8xP82","clearFirst":false,"selectAll":false,"pageX":90,"pageY":691,"which":1,"x":89,"y":443}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xP82")
			.formParam("data_2", """{"pageX":90,"pageY":691,"which":1,"x":89,"y":14}"""),
            http("FocusSimulation_71")
			.post("/fm/zkau")
			.headers(headers_71)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPi1")
			.formParam("data_0", """{"top":462,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPi1")
			.formParam("data_1", """{"items":["s8xPa2"],"reference":"s8xPa2","clearFirst":false,"selectAll":false,"pageX":87,"pageY":723,"which":1,"x":86,"y":475}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPa2")
			.formParam("data_2", """{"pageX":87,"pageY":723,"which":1,"x":86,"y":13}""")))
		.pause(4)
		.exec(http("FocusSimulation_72")
			.post("/fm/zkau")
			.headers(headers_72)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "s8xPc2")
			.formParam("data_0", """{"items":["s8xPc2"],"reference":"s8xPc2"}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPe2")
			.formParam("data_1", """{"items":["s8xPf2"],"reference":"s8xPf2","clearFirst":false,"selectAll":false,"pageX":82,"pageY":296,"which":1,"x":81,"y":19}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPf2")
			.formParam("data_2", """{"pageX":82,"pageY":296,"which":1,"x":81,"y":19}"""))
		.pause(3)
		.exec(http("FocusSimulation_73")
			.post("/fm/zkau")
			.headers(headers_73)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "s8xPh2")
			.formParam("data_0", """{"items":["s8xPh2"],"reference":"s8xPh2"}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPj2")
			.formParam("data_1", """{"items":["s8xPk2"],"reference":"s8xPk2","clearFirst":false,"selectAll":false,"pageX":49,"pageY":313,"which":1,"x":48,"y":7}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPk2")
			.formParam("data_2", """{"pageX":49,"pageY":313,"which":1,"x":48,"y":7}"""))
		.pause(1)
		.exec(http("FocusSimulation_74")
			.post("/fm/zkau")
			.headers(headers_74)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPj2")
			.formParam("data_0", """{"top":33,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPj2")
			.formParam("data_1", """{"items":["s8xPm2"],"reference":"s8xPm2","clearFirst":false,"selectAll":false,"pageX":48,"pageY":355,"which":1,"x":47,"y":49}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPm2")
			.formParam("data_2", """{"pageX":48,"pageY":355,"which":1,"x":47,"y":16}"""))
		.pause(3)
		.exec(http("FocusSimulation_75")
			.post("/fm/zkau")
			.headers(headers_75)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "s8xPo2")
			.formParam("data_0", """{"items":["s8xPo2"],"reference":"s8xPo2"}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPq2")
			.formParam("data_1", """{"items":["s8xPr2"],"reference":"s8xPr2","clearFirst":false,"selectAll":false,"pageX":54,"pageY":357,"which":1,"x":53,"y":22}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPr2")
			.formParam("data_2", """{"pageX":54,"pageY":357,"which":1,"x":53,"y":22}"""))
		.pause(1)
		.exec(http("FocusSimulation_76")
			.post("/fm/zkau")
			.headers(headers_76)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPq2")
			.formParam("data_0", """{"top":33,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPq2")
			.formParam("data_1", """{"items":["s8xPt2"],"reference":"s8xPt2","clearFirst":false,"selectAll":false,"pageX":60,"pageY":384,"which":1,"x":59,"y":49}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPt2")
			.formParam("data_2", """{"pageX":60,"pageY":384,"which":1,"x":59,"y":16}"""))
		.pause(21)
		.exec(http("FocusSimulation_77")
			.post("/fm/zkau")
			.headers(headers_77)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPq2")
			.formParam("data_0", """{"top":66,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPq2")
			.formParam("data_1", """{"items":["s8xPv2"],"reference":"s8xPv2","clearFirst":false,"selectAll":false,"pageX":63,"pageY":417,"which":1,"x":62,"y":82}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPv2")
			.formParam("data_2", """{"pageX":63,"pageY":417,"which":1,"x":62,"y":16}"""))
		.pause(1)
		.exec(http("FocusSimulation_78")
			.post("/fm/zkau")
			.headers(headers_78)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPq2")
			.formParam("data_0", """{"top":99,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPq2")
			.formParam("data_1", """{"items":["s8xPx2"],"reference":"s8xPx2","clearFirst":false,"selectAll":false,"pageX":58,"pageY":446,"which":1,"x":57,"y":111}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPx2")
			.formParam("data_2", """{"pageX":58,"pageY":446,"which":1,"x":57,"y":12}""")
			.resources(http("FocusSimulation_79")
			.post("/fm/zkau")
			.headers(headers_79)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPq2")
			.formParam("data_0", """{"top":132,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPq2")
			.formParam("data_1", """{"items":["s8xPz2"],"reference":"s8xPz2","clearFirst":false,"selectAll":false,"pageX":72,"pageY":483,"which":1,"x":71,"y":148}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPz2")
			.formParam("data_2", """{"pageX":72,"pageY":483,"which":1,"x":71,"y":16}"""),
            http("FocusSimulation_80")
			.post("/fm/zkau")
			.headers(headers_80)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPq2")
			.formParam("data_0", """{"top":165,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPq2")
			.formParam("data_1", """{"items":["s8xP03"],"reference":"s8xP03","clearFirst":false,"selectAll":false,"pageX":71,"pageY":512,"which":1,"x":70,"y":177}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xP03")
			.formParam("data_2", """{"pageX":71,"pageY":512,"which":1,"x":70,"y":12}""")))
		.pause(3)
		.exec(http("FocusSimulation_81")
			.post("/fm/zkau")
			.headers(headers_81)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "s8xP23")
			.formParam("data_0", """{"items":["s8xP23"],"reference":"s8xP23"}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xP43")
			.formParam("data_1", """{"items":["s8xP53"],"reference":"s8xP53","clearFirst":false,"selectAll":false,"pageX":34,"pageY":380,"which":1,"x":33,"y":16}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xP53")
			.formParam("data_2", """{"pageX":34,"pageY":380,"which":1,"x":33,"y":16}"""))
		.pause(1)
		.exec(http("FocusSimulation_82")
			.post("/fm/zkau")
			.headers(headers_82)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xP43")
			.formParam("data_0", """{"top":33,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xP43")
			.formParam("data_1", """{"items":["s8xP73"],"reference":"s8xP73","clearFirst":false,"selectAll":false,"pageX":43,"pageY":413,"which":1,"x":42,"y":49}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xP73")
			.formParam("data_2", """{"pageX":43,"pageY":413,"which":1,"x":42,"y":16}"""))
		.pause(1)
		.exec(http("FocusSimulation_83")
			.post("/fm/zkau")
			.headers(headers_83)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xP43")
			.formParam("data_0", """{"top":66,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xP43")
			.formParam("data_1", """{"items":["s8xP93"],"reference":"s8xP93","clearFirst":false,"selectAll":false,"pageX":47,"pageY":442,"which":1,"x":46,"y":78}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xP93")
			.formParam("data_2", """{"pageX":47,"pageY":442,"which":1,"x":46,"y":12}"""))
		.pause(4)
		.exec(http("FocusSimulation_84")
			.post("/fm/zkau")
			.headers(headers_84)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "s8xPbl5")
			.formParam("data_0", """{"value":"","start":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPb3")
			.formParam("data_1", """{"items":["s8xPb3"],"reference":"s8xPb3"}"""))
		.pause(1)
		.exec(http("FocusSimulation_85")
			.post("/fm/zkau")
			.headers(headers_85)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "s8xPd3")
			.formParam("data_0", """{"items":["s8xPe3"],"reference":"s8xPe3","clearFirst":false,"selectAll":false,"pageX":27,"pageY":410,"which":1,"x":26,"y":17}""")
			.formParam("cmd_1", "onClick")
			.formParam("uuid_1", "s8xPe3")
			.formParam("data_1", """{"pageX":27,"pageY":410,"which":1,"x":26,"y":17}"""))
		.pause(1)
		.exec(http("FocusSimulation_86")
			.post("/fm/zkau")
			.headers(headers_86)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onChange")
			.formParam("uuid_0", "s8xPzl5")
			.formParam("data_0", """{"value":"Nolver Uruguay","start":0}""")
			.formParam("cmd_1", "onAnchorPos")
			.formParam("uuid_1", "s8xPd3")
			.formParam("data_1", """{"top":33,"left":0}""")
			.formParam("cmd_2", "onSelect")
			.formParam("uuid_2", "s8xPd3")
			.formParam("data_2", """{"items":["s8xPg3"],"reference":"s8xPg3","clearFirst":false,"selectAll":false,"pageX":42,"pageY":443,"which":1,"x":41,"y":50}""")
			.formParam("cmd_3", "onClick")
			.formParam("uuid_3", "s8xPg3")
			.formParam("data_3", """{"pageX":42,"pageY":443,"which":1,"x":41,"y":17}""")
			.resources(http("FocusSimulation_87")
			.post("/fm/zkau")
			.headers(headers_87)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPd3")
			.formParam("data_0", """{"top":66,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPd3")
			.formParam("data_1", """{"items":["s8xPi3"],"reference":"s8xPi3","clearFirst":false,"selectAll":false,"pageX":45,"pageY":469,"which":1,"x":44,"y":76}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPi3")
			.formParam("data_2", """{"pageX":45,"pageY":469,"which":1,"x":44,"y":10}"""),
            http("FocusSimulation_88")
			.post("/fm/zkau")
			.headers(headers_88)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPd3")
			.formParam("data_0", """{"top":99,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPd3")
			.formParam("data_1", """{"items":["s8xPk3"],"reference":"s8xPk3","clearFirst":false,"selectAll":false,"pageX":45,"pageY":503,"which":1,"x":44,"y":110}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPk3")
			.formParam("data_2", """{"pageX":45,"pageY":503,"which":1,"x":44,"y":11}"""),
            http("FocusSimulation_89")
			.post("/fm/zkau")
			.headers(headers_89)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPd3")
			.formParam("data_0", """{"top":132,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPd3")
			.formParam("data_1", """{"items":["s8xPm3"],"reference":"s8xPm3","clearFirst":false,"selectAll":false,"pageX":49,"pageY":538,"which":1,"x":48,"y":145}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPm3")
			.formParam("data_2", """{"pageX":49,"pageY":538,"which":1,"x":48,"y":13}"""),
            http("FocusSimulation_90")
			.post("/fm/zkau")
			.headers(headers_90)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPd3")
			.formParam("data_0", """{"top":165,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPd3")
			.formParam("data_1", """{"items":["s8xPo3"],"reference":"s8xPo3","clearFirst":false,"selectAll":false,"pageX":60,"pageY":582,"which":1,"x":59,"y":189}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPo3")
			.formParam("data_2", """{"pageX":60,"pageY":582,"which":1,"x":59,"y":24}"""),
            http("FocusSimulation_91")
			.post("/fm/zkau")
			.headers(headers_91)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPd3")
			.formParam("data_0", """{"top":198,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPd3")
			.formParam("data_1", """{"items":["s8xPq3"],"reference":"s8xPq3","clearFirst":false,"selectAll":false,"pageX":64,"pageY":606,"which":1,"x":63,"y":213}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPq3")
			.formParam("data_2", """{"pageX":64,"pageY":606,"which":1,"x":63,"y":15}""")))
		.pause(2)
		.exec(http("FocusSimulation_92")
			.post("/fm/zkau")
			.headers(headers_92)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "s8xPs3")
			.formParam("data_0", """{"items":["s8xPs3"],"reference":"s8xPs3"}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPu3")
			.formParam("data_1", """{"items":["s8xPv3"],"reference":"s8xPv3","clearFirst":false,"selectAll":false,"pageX":65,"pageY":442,"which":1,"x":64,"y":20}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPv3")
			.formParam("data_2", """{"pageX":65,"pageY":442,"which":1,"x":64,"y":20}"""))
		.pause(1)
		.exec(http("FocusSimulation_93")
			.post("/fm/zkau")
			.headers(headers_93)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPu3")
			.formParam("data_0", """{"top":33,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPu3")
			.formParam("data_1", """{"items":["s8xPx3"],"reference":"s8xPx3","clearFirst":false,"selectAll":false,"pageX":85,"pageY":472,"which":1,"x":84,"y":50}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPx3")
			.formParam("data_2", """{"pageX":85,"pageY":472,"which":1,"x":84,"y":17}""")
			.resources(http("FocusSimulation_94")
			.post("/fm/zkau")
			.headers(headers_94)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPu3")
			.formParam("data_0", """{"top":66,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPu3")
			.formParam("data_1", """{"items":["s8xPz3"],"reference":"s8xPz3","clearFirst":false,"selectAll":false,"pageX":86,"pageY":503,"which":1,"x":85,"y":81}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPz3")
			.formParam("data_2", """{"pageX":86,"pageY":503,"which":1,"x":85,"y":15}"""),
            http("FocusSimulation_95")
			.post("/fm/zkau")
			.headers(headers_95)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPu3")
			.formParam("data_0", """{"top":99,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPu3")
			.formParam("data_1", """{"items":["s8xP04"],"reference":"s8xP04","clearFirst":false,"selectAll":false,"pageX":93,"pageY":535,"which":1,"x":92,"y":113}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xP04")
			.formParam("data_2", """{"pageX":93,"pageY":535,"which":1,"x":92,"y":14}"""),
            http("FocusSimulation_96")
			.post("/fm/zkau")
			.headers(headers_96)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPu3")
			.formParam("data_0", """{"top":132,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPu3")
			.formParam("data_1", """{"items":["s8xP24"],"reference":"s8xP24","clearFirst":false,"selectAll":false,"pageX":91,"pageY":572,"which":1,"x":90,"y":150}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xP24")
			.formParam("data_2", """{"pageX":91,"pageY":572,"which":1,"x":90,"y":18}"""),
            http("FocusSimulation_97")
			.get("/fm/img/icon/info.png")
			.headers(headers_12),
            http("FocusSimulation_98")
			.post("/fm/zkau")
			.headers(headers_98)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPu3")
			.formParam("data_0", """{"top":165,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPu3")
			.formParam("data_1", """{"items":["s8xP44"],"reference":"s8xP44","clearFirst":false,"selectAll":false,"pageX":92,"pageY":604,"which":1,"x":91,"y":182}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xP44")
			.formParam("data_2", """{"pageX":92,"pageY":604,"which":1,"x":91,"y":17}"""),
            http("FocusSimulation_99")
			.post("/fm/zkau")
			.headers(headers_99)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPu3")
			.formParam("data_0", """{"top":198,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPu3")
			.formParam("data_1", """{"items":["s8xP64"],"reference":"s8xP64","clearFirst":false,"selectAll":false,"pageX":88,"pageY":631,"which":1,"x":87,"y":209}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xP64")
			.formParam("data_2", """{"pageX":88,"pageY":631,"which":1,"x":87,"y":11}""")))
		.pause(1)
		.exec(http("FocusSimulation_100")
			.post("/fm/zkau")
			.headers(headers_100)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onSelect")
			.formParam("uuid_0", "s8xP84")
			.formParam("data_0", """{"items":["s8xP84"],"reference":"s8xP84"}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPa4")
			.formParam("data_1", """{"items":["s8xPb4"],"reference":"s8xPb4","clearFirst":false,"selectAll":false,"pageX":42,"pageY":468,"which":1,"x":41,"y":17}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPb4")
			.formParam("data_2", """{"pageX":42,"pageY":468,"which":1,"x":41,"y":17}""")
			.resources(http("FocusSimulation_101")
			.get("/fm/img/semaforo2-vacio.png")
			.headers(headers_12),
            http("FocusSimulation_102")
			.post("/fm/zkau")
			.headers(headers_102)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPa4")
			.formParam("data_0", """{"top":33,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPa4")
			.formParam("data_1", """{"items":["s8xPd4"],"reference":"s8xPd4","clearFirst":false,"selectAll":false,"pageX":47,"pageY":498,"which":1,"x":46,"y":47}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPd4")
			.formParam("data_2", """{"pageX":47,"pageY":498,"which":1,"x":46,"y":14}"""),
            http("FocusSimulation_103")
			.post("/fm/zkau")
			.headers(headers_103)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPa4")
			.formParam("data_0", """{"top":66,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPa4")
			.formParam("data_1", """{"items":["s8xPf4"],"reference":"s8xPf4","clearFirst":false,"selectAll":false,"pageX":58,"pageY":534,"which":1,"x":57,"y":83}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPf4")
			.formParam("data_2", """{"pageX":58,"pageY":534,"which":1,"x":57,"y":17}""")))
		.pause(1)
		.exec(http("FocusSimulation_104")
			.post("/fm/zkau")
			.headers(headers_104)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onAnchorPos")
			.formParam("uuid_0", "s8xPa4")
			.formParam("data_0", """{"top":99,"left":0}""")
			.formParam("cmd_1", "onSelect")
			.formParam("uuid_1", "s8xPa4")
			.formParam("data_1", """{"items":["s8xPh4"],"reference":"s8xPh4","clearFirst":false,"selectAll":false,"pageX":40,"pageY":563,"which":1,"x":39,"y":112}""")
			.formParam("cmd_2", "onClick")
			.formParam("uuid_2", "s8xPh4")
			.formParam("data_2", """{"pageX":40,"pageY":563,"which":1,"x":39,"y":13}"""))
		.pause(5)
		.exec(http("FocusSimulation_105")
			.post("/fm/zkau")
			.headers(headers_105)
			.formParam("dtid", "z_bh5")
			.formParam("cmd_0", "onClick")
			.formParam("uuid_0", "s8xPh")
			.formParam("data_0", """{"pageX":1910,"pageY":38,"which":1,"x":23,"y":9}""")
			.resources(http("FocusSimulation_106")
			.get("/fm/zkau?dtid=z_bh5&cmd_0=rmDesktop&opt_0=i")
			.headers(headers_0),
            http("FocusSimulation_107")
			.get("/fm/logout.zul")
			.headers(headers_1),
            http("FocusSimulation_108")
			.get("/fm/zkau/web/79565750/js/zul.lang.wpd")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}