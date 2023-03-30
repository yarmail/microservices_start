package com.example.eureka_client.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class TestController {

    //получаем id из настроек
    @Value("${eureka.instance.instance-id}")
    private String id;

    //возврат id покажет какой именно сервис отозвался
    @GetMapping("/test")
    public String test() {
        return id;
    }
}