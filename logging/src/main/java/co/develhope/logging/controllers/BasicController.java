package co.develhope.logging.controllers;

import co.develhope.logging.services.BasicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {


    @Autowired
    BasicService basicService;


    @GetMapping("/")
    public String welcomeMsg(){
        return basicService.welcomeMsg();
    }

    @GetMapping("/get_exp")
    public Integer getPower(){
        return basicService.getPower();
    }

    @GetMapping("/get-errors")
    public String getError(){
       return basicService.getError();
    }




}