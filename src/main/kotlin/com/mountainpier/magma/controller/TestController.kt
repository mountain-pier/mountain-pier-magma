package com.mountainpier.magma


import org.springframework.core.io.ClassPathResource
import org.springframework.util.ResourceUtils
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.io.File
import java.net.URL

@RestController
@RequestMapping("/test")
class TestController{
    @GetMapping("/hello")
    fun TestHello():String{
       var inputStream= ClassPathResource("test.xml").inputStream;
       var test= XmlSerial(Tests::class.java).fromXML(inputStream)
       var size= test.test?.count();
        return "test.xml "+size;
    }
}