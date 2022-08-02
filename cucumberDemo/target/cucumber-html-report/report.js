$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Register.feature");
formatter.feature({
  "line": 2,
  "name": "Register Test",
  "description": "",
  "id": "register-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Hesap Yaratma",
  "description": "",
  "id": "register-test;hesap-yaratma",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Websitesine git",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Sign butonuna tıkla",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "\"\u003cEmail\u003e\" email gir",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Create an Account butonuna tıkla",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "title seç",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "isim \"\u003cfirstname\u003e\" ve soyad \"\u003clastname\u003e\" gir",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "şifre \"\u003cpassword\u003e\" gir",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "şirket \"\u003cCompany\u003e\" gir",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "adres \"\u003caddress\u003e\" gir",
  "keyword": "And "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "register-test;hesap-yaratma;",
  "rows": [
    {
      "cells": [
        "Email",
        "firstname",
        "lastname",
        "password",
        "Company",
        "address"
      ],
      "line": 15,
      "id": "register-test;hesap-yaratma;;1"
    },
    {
      "cells": [
        "bernasalman@gmail.com",
        "Berna",
        "Salman",
        "berna123",
        "study",
        "İstanbul"
      ],
      "line": 17,
      "id": "register-test;hesap-yaratma;;2"
    },
    {
      "cells": [
        "ahmet@gmail.com",
        "Ahmet",
        "Salman",
        "asdf123",
        "Beko",
        "Belçika"
      ],
      "line": 18,
      "id": "register-test;hesap-yaratma;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Hesap Yaratma",
  "description": "",
  "id": "register-test;hesap-yaratma;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Websitesine git",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Sign butonuna tıkla",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "\"bernasalman@gmail.com\" email gir",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Create an Account butonuna tıkla",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "title seç",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "isim \"Berna\" ve soyad \"Salman\" gir",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "şifre \"berna123\" gir",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "şirket \"study\" gir",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "adres \"İstanbul\" gir",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.websitesineGit()"
});
formatter.result({
  "duration": 7547265600,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.signButonunaTıkla()"
});
formatter.result({
  "duration": 2031110900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bernasalman@gmail.com",
      "offset": 1
    }
  ],
  "location": "RegisterSteps.gir(String)"
});
formatter.result({
  "duration": 167782300,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.createAnAccountButonunaTıkla()"
});
formatter.result({
  "duration": 114331000,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.titleSeç()"
});
formatter.result({
  "duration": 1743133900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Berna",
      "offset": 6
    },
    {
      "val": "Salman",
      "offset": 23
    }
  ],
  "location": "RegisterSteps.isimVeSoyadGir(String,String)"
});
formatter.result({
  "duration": 309115100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "berna123",
      "offset": 7
    }
  ],
  "location": "RegisterSteps.şifreGir(String)"
});
formatter.result({
  "duration": 255000300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "study",
      "offset": 8
    }
  ],
  "location": "RegisterSteps.şirketGir(String)"
});
formatter.result({
  "duration": 119873300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "İstanbul",
      "offset": 7
    }
  ],
  "location": "RegisterSteps.adresGir(String)"
});
formatter.result({
  "duration": 171156100,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Hesap Yaratma",
  "description": "",
  "id": "register-test;hesap-yaratma;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Websitesine git",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Sign butonuna tıkla",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "\"ahmet@gmail.com\" email gir",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Create an Account butonuna tıkla",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "title seç",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "isim \"Ahmet\" ve soyad \"Salman\" gir",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "şifre \"asdf123\" gir",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "şirket \"Beko\" gir",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "adres \"Belçika\" gir",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.websitesineGit()"
});
formatter.result({
  "duration": 1296072600,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.signButonunaTıkla()"
});
formatter.result({
  "duration": 2031741200,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: unexpected command response\n  (Session info: chrome\u003d103.0.5060.114)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-5NQB2IN4\u0027, ip: \u0027192.168.43.46\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 103.0.5060.114, chrome: {chromedriverVersion: 102.0.5005.61 (0e59bcc00cc4..., userDataDir: C:\\Users\\Berna\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:50023}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 4e28428fea20d29057a818aaa7ace071\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:489)\r\n\tat ObjectModels.AbstractClass.clickFon(AbstractClass.java:30)\r\n\tat ObjectModels.RegisterPage.clickSignInButton(RegisterPage.java:20)\r\n\tat stepDefinition.RegisterSteps.signButonunaTıkla(RegisterSteps.java:35)\r\n\tat ✽.And Sign butonuna tıkla(src/test/java/Register.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "ahmet@gmail.com",
      "offset": 1
    }
  ],
  "location": "RegisterSteps.gir(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegisterSteps.createAnAccountButonunaTıkla()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegisterSteps.titleSeç()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Ahmet",
      "offset": 6
    },
    {
      "val": "Salman",
      "offset": 23
    }
  ],
  "location": "RegisterSteps.isimVeSoyadGir(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "asdf123",
      "offset": 7
    }
  ],
  "location": "RegisterSteps.şifreGir(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Beko",
      "offset": 8
    }
  ],
  "location": "RegisterSteps.şirketGir(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Belçika",
      "offset": 7
    }
  ],
  "location": "RegisterSteps.adresGir(String)"
});
formatter.result({
  "status": "skipped"
});
});