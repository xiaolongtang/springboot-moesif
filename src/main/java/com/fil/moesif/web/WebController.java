package com.fil.moesif.web;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "api", produces = MediaType.APPLICATION_JSON_VALUE)
public class WebController {

    @RequestMapping(value = "/first", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Object helloWorld(){
        return "{\"msg\":\"hello world\"}";
    }

    @RequestMapping(value = "/error", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Object errorAPI(){
        throw new NullPointerException();
    }
}
