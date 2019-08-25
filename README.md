EA Coding Challenge Solution using Spring Java application
============================================================
IDE Used: Eclipse IDE
Language : Java 1.8
Log4j : Logger Framework

Steps to run the project:
------------------------
a. Clone the project

b. Use Maven to build and run project


Sample output after running project:
-----------------------------------

14:04:38.712 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Application Started.
14:04:38.719 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Reading data from Api. API==[http://eacodingtest.digital.energyaustralia.com.au/api/v1/festivals]
14:04:39.210 [main] DEBUG org.springframework.web.client.RestTemplate - HTTP GET http://eacodingtest.digital.energyaustralia.com.au/api/v1/festivals
14:04:39.247 [main] DEBUG org.springframework.web.client.RestTemplate - Accept=[application/json, application/*+json]
14:04:39.417 [main] DEBUG org.springframework.web.client.RestTemplate - Response 200 OK
14:04:39.444 [main] DEBUG org.springframework.web.client.RestTemplate - Reading to [java.util.List<com.ea.eacodechallenge.model.Festival>]
14:04:39.569 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Response from Api is [<200,[Festival[name=LOL-palooza,bands=[Band[name=Jill Black,recordLabel=Fourth Woman Records], Band[name=Frank Jupiter,recordLabel=Pacific Records], Band[name=Werewolf Weekday,recordLabel=XS Recordings], Band[name=Winter Primates,recordLabel=]]], Festival[name=Small Night In,bands=[Band[name=Wild Antelope,recordLabel=Marner Sis. Recording], Band[name=The Black Dashes,recordLabel=Fourth Woman Records], Band[name=Squint-281,recordLabel=Outerscope], Band[name=Green Mild Cold Capsicum,recordLabel=Marner Sis. Recording], Band[name=Yanke East,recordLabel=MEDIOCRE Music]]], Festival[name=Trainerella,bands=[Band[name=Manish Ditch,recordLabel=ACR], Band[name=Wild Antelope,recordLabel=Still Bottom Records], Band[name=YOUKRANE,recordLabel=Anti Records], Band[name=Adrian Venti,recordLabel=Monocracy Records]]], Festival[name=Twisted Tour,bands=[Band[name=Squint-281,recordLabel=<null>], Band[name=Summon,recordLabel=Outerscope], Band[name=Auditones,recordLabel=Marner Sis. Recording]]], Festival[name=<null>,bands=[Band[name=Critter Girls,recordLabel=ACR], Band[name=Propeller,recordLabel=Pacific Records]]]],[X-Powered-By:"Express", Content-Type:"application/json; charset=utf-8", Content-Length:"1108", ETag:"W/"454-8pt8eWoNEHwfUSggs9IfBuZXrPc"", Date:"Sun, 25 Aug 2019 04:04:42 GMT", Connection:"keep-alive"]>]
14:04:39.587 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Response body==[[Festival[name=LOL-palooza,bands=[Band[name=Jill Black,recordLabel=Fourth Woman Records], Band[name=Frank Jupiter,recordLabel=Pacific Records], Band[name=Werewolf Weekday,recordLabel=XS Recordings], Band[name=Winter Primates,recordLabel=]]], Festival[name=Small Night In,bands=[Band[name=Wild Antelope,recordLabel=Marner Sis. Recording], Band[name=The Black Dashes,recordLabel=Fourth Woman Records], Band[name=Squint-281,recordLabel=Outerscope], Band[name=Green Mild Cold Capsicum,recordLabel=Marner Sis. Recording], Band[name=Yanke East,recordLabel=MEDIOCRE Music]]], Festival[name=Trainerella,bands=[Band[name=Manish Ditch,recordLabel=ACR], Band[name=Wild Antelope,recordLabel=Still Bottom Records], Band[name=YOUKRANE,recordLabel=Anti Records], Band[name=Adrian Venti,recordLabel=Monocracy Records]]], Festival[name=Twisted Tour,bands=[Band[name=Squint-281,recordLabel=<null>], Band[name=Summon,recordLabel=Outerscope], Band[name=Auditones,recordLabel=Marner Sis. Recording]]], Festival[name=<null>,bands=[Band[name=Critter Girls,recordLabel=ACR], Band[name=Propeller,recordLabel=Pacific Records]]]]]
14:04:39.590 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - FestivalList is [[Festival[name=LOL-palooza,bands=[Band[name=Jill Black,recordLabel=Fourth Woman Records], Band[name=Frank Jupiter,recordLabel=Pacific Records], Band[name=Werewolf Weekday,recordLabel=XS Recordings], Band[name=Winter Primates,recordLabel=]]], Festival[name=Small Night In,bands=[Band[name=Wild Antelope,recordLabel=Marner Sis. Recording], Band[name=The Black Dashes,recordLabel=Fourth Woman Records], Band[name=Squint-281,recordLabel=Outerscope], Band[name=Green Mild Cold Capsicum,recordLabel=Marner Sis. Recording], Band[name=Yanke East,recordLabel=MEDIOCRE Music]]], Festival[name=Trainerella,bands=[Band[name=Manish Ditch,recordLabel=ACR], Band[name=Wild Antelope,recordLabel=Still Bottom Records], Band[name=YOUKRANE,recordLabel=Anti Records], Band[name=Adrian Venti,recordLabel=Monocracy Records]]], Festival[name=Twisted Tour,bands=[Band[name=Squint-281,recordLabel=<null>], Band[name=Summon,recordLabel=Outerscope], Band[name=Auditones,recordLabel=Marner Sis. Recording]]], Festival[name=<null>,bands=[Band[name=Critter Girls,recordLabel=ACR], Band[name=Propeller,recordLabel=Pacific Records]]]]]
14:04:39.595 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Printing data from festival list. Size==[5]
14:04:39.596 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.596 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Festival==[LOL-palooza] Bands==[4]
14:04:39.596 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	Band==[Jill Black] Label==[Fourth Woman Records]
14:04:39.596 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	Band==[Frank Jupiter] Label==[Pacific Records]
14:04:39.596 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	Band==[Werewolf Weekday] Label==[XS Recordings]
14:04:39.596 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	Band==[Winter Primates] Label==[]
14:04:39.596 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.596 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.596 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Festival==[Small Night In] Bands==[5]
14:04:39.596 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	Band==[Wild Antelope] Label==[Marner Sis. Recording]
14:04:39.596 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	Band==[The Black Dashes] Label==[Fourth Woman Records]
14:04:39.597 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	Band==[Squint-281] Label==[Outerscope]
14:04:39.597 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	Band==[Green Mild Cold Capsicum] Label==[Marner Sis. Recording]
14:04:39.597 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	Band==[Yanke East] Label==[MEDIOCRE Music]
14:04:39.597 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.597 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.597 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Festival==[Trainerella] Bands==[4]
14:04:39.597 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	Band==[Manish Ditch] Label==[ACR]
14:04:39.597 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	Band==[Wild Antelope] Label==[Still Bottom Records]
14:04:39.597 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	Band==[YOUKRANE] Label==[Anti Records]
14:04:39.597 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	Band==[Adrian Venti] Label==[Monocracy Records]
14:04:39.597 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.597 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.597 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Festival==[Twisted Tour] Bands==[3]
14:04:39.597 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	Band==[Squint-281] Label==[null]
14:04:39.597 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	Band==[Summon] Label==[Outerscope]
14:04:39.597 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	Band==[Auditones] Label==[Marner Sis. Recording]
14:04:39.597 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.597 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.598 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Festival==[null] Bands==[2]
14:04:39.598 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	Band==[Critter Girls] Label==[ACR]
14:04:39.598 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	Band==[Propeller] Label==[Pacific Records]
14:04:39.598 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.598 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Transforming Festival data.
14:04:39.599 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.599 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Transforming data for Festival==[LOL-palooza] Band==[Jill Black] Label==[Fourth Woman Records]
14:04:39.600 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.600 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.600 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Transforming data for Festival==[LOL-palooza] Band==[Frank Jupiter] Label==[Pacific Records]
14:04:39.600 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.600 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.600 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Transforming data for Festival==[LOL-palooza] Band==[Werewolf Weekday] Label==[XS Recordings]
14:04:39.600 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.600 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.600 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Transforming data for Festival==[LOL-palooza] Band==[Winter Primates] Label==[]
14:04:39.600 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.600 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.600 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Transforming data for Festival==[Small Night In] Band==[Wild Antelope] Label==[Marner Sis. Recording]
14:04:39.600 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.600 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.600 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Transforming data for Festival==[Small Night In] Band==[The Black Dashes] Label==[Fourth Woman Records]
14:04:39.600 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.600 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.600 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Transforming data for Festival==[Small Night In] Band==[Squint-281] Label==[Outerscope]
14:04:39.601 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.601 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.601 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Transforming data for Festival==[Small Night In] Band==[Green Mild Cold Capsicum] Label==[Marner Sis. Recording]
14:04:39.601 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.601 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.601 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Transforming data for Festival==[Small Night In] Band==[Yanke East] Label==[MEDIOCRE Music]
14:04:39.601 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.601 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.601 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Transforming data for Festival==[Trainerella] Band==[Manish Ditch] Label==[ACR]
14:04:39.601 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.601 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.601 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Transforming data for Festival==[Trainerella] Band==[Wild Antelope] Label==[Still Bottom Records]
14:04:39.601 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.601 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.601 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Transforming data for Festival==[Trainerella] Band==[YOUKRANE] Label==[Anti Records]
14:04:39.601 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.602 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.602 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Transforming data for Festival==[Trainerella] Band==[Adrian Venti] Label==[Monocracy Records]
14:04:39.602 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.602 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.602 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Transforming data for Festival==[Twisted Tour] Band==[Squint-281] Label==[[NULL]]
14:04:39.602 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.602 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.603 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Transforming data for Festival==[Twisted Tour] Band==[Summon] Label==[Outerscope]
14:04:39.603 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.603 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.603 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Transforming data for Festival==[Twisted Tour] Band==[Auditones] Label==[Marner Sis. Recording]
14:04:39.603 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.603 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.603 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Transforming data for Festival==[null] Band==[Critter Girls] Label==[ACR]
14:04:39.603 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.603 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.603 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Transforming data for Festival==[null] Band==[Propeller] Label==[Pacific Records]
14:04:39.603 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.603 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Transformed Festival data...
14:04:39.603 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - =============[{={Winter Primates=[LOL-palooza]}, ACR={Critter Girls=[null], Manish Ditch=[Trainerella]}, Anti Records={YOUKRANE=[Trainerella]}, Fourth Woman Records={Jill Black=[LOL-palooza], The Black Dashes=[Small Night In]}, MEDIOCRE Music={Yanke East=[Small Night In]}, Marner Sis. Recording={Auditones=[Twisted Tour], Green Mild Cold Capsicum=[Small Night In], Wild Antelope=[Small Night In]}, Monocracy Records={Adrian Venti=[Trainerella]}, Outerscope={Squint-281=[Small Night In], Summon=[Twisted Tour]}, Pacific Records={Frank Jupiter=[LOL-palooza], Propeller=[null]}, Still Bottom Records={Wild Antelope=[Trainerella]}, XS Recordings={Werewolf Weekday=[LOL-palooza]}, [NULL]={Squint-281=[Twisted Tour]}}]===========
14:04:39.604 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Printing Transformed data in json.
14:04:39.643 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Json data...
14:04:39.643 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - =============[{"":{"Winter Primates":["LOL-palooza"]},"ACR":{"Critter Girls":[null],"Manish Ditch":["Trainerella"]},"Anti Records":{"YOUKRANE":["Trainerella"]},"Fourth Woman Records":{"Jill Black":["LOL-palooza"],"The Black Dashes":["Small Night In"]},"MEDIOCRE Music":{"Yanke East":["Small Night In"]},"Marner Sis. Recording":{"Auditones":["Twisted Tour"],"Green Mild Cold Capsicum":["Small Night In"],"Wild Antelope":["Small Night In"]},"Monocracy Records":{"Adrian Venti":["Trainerella"]},"Outerscope":{"Squint-281":["Small Night In"],"Summon":["Twisted Tour"]},"Pacific Records":{"Frank Jupiter":["LOL-palooza"],"Propeller":[null]},"Still Bottom Records":{"Wild Antelope":["Trainerella"]},"XS Recordings":{"Werewolf Weekday":["LOL-palooza"]},"[NULL]":{"Squint-281":["Twisted Tour"]}}]===========
14:04:39.643 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - Printing Transformed data as Required Format in LOGGER/TERMINAL.
14:04:39.643 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.643 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - []
14:04:39.644 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	[Winter Primates]
14:04:39.644 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 		[LOL-palooza]
14:04:39.644 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.644 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - [ACR]
14:04:39.644 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	[Critter Girls]
14:04:39.644 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 		[null]
14:04:39.644 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	[Manish Ditch]
14:04:39.644 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 		[Trainerella]
14:04:39.644 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.644 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - [Anti Records]
14:04:39.644 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	[YOUKRANE]
14:04:39.644 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 		[Trainerella]
14:04:39.644 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.644 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - [Fourth Woman Records]
14:04:39.644 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	[Jill Black]
14:04:39.644 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 		[LOL-palooza]
14:04:39.644 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	[The Black Dashes]
14:04:39.644 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 		[Small Night In]
14:04:39.644 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.644 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - [MEDIOCRE Music]
14:04:39.645 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	[Yanke East]
14:04:39.645 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 		[Small Night In]
14:04:39.645 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.645 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - [Marner Sis. Recording]
14:04:39.645 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	[Auditones]
14:04:39.645 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 		[Twisted Tour]
14:04:39.645 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	[Green Mild Cold Capsicum]
14:04:39.645 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 		[Small Night In]
14:04:39.645 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	[Wild Antelope]
14:04:39.645 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 		[Small Night In]
14:04:39.645 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.645 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - [Monocracy Records]
14:04:39.645 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	[Adrian Venti]
14:04:39.645 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 		[Trainerella]
14:04:39.645 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.645 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - [Outerscope]
14:04:39.645 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	[Squint-281]
14:04:39.645 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 		[Small Night In]
14:04:39.645 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	[Summon]
14:04:39.646 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 		[Twisted Tour]
14:04:39.646 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.646 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - [Pacific Records]
14:04:39.646 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	[Frank Jupiter]
14:04:39.646 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 		[LOL-palooza]
14:04:39.646 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	[Propeller]
14:04:39.646 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 		[null]
14:04:39.646 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.646 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - [Still Bottom Records]
14:04:39.646 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	[Wild Antelope]
14:04:39.646 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 		[Trainerella]
14:04:39.646 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.646 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - [XS Recordings]
14:04:39.646 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	[Werewolf Weekday]
14:04:39.646 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 		[LOL-palooza]
14:04:39.646 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - ***************************************************************************
14:04:39.646 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - [[NULL]]
14:04:39.646 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 	[Squint-281]
14:04:39.646 [main] INFO com.ea.eacodechallenge.EacodechallengeApplication - 		[Twisted Tour]
