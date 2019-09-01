package com.fil.moesif.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;

@CrossOrigin
@RestController
@RequestMapping(value = "api", produces = MediaType.APPLICATION_JSON_VALUE)
public class WebController {

    @RequestMapping(value = "/first", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Object helloWorld(){
        return "{\"msg\":\"hello world\"}";
    }

    @RequestMapping(value = "/code/{code}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Object errorAPI(@PathVariable int code){
        switch(code){
            case 404 :
                throw new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "404 not found"
                );
            case 500 :
                throw new ResponseStatusException(
                        HttpStatus.SERVICE_UNAVAILABLE, "500 "
                );
            case 401 :
                throw new ResponseStatusException(
                        HttpStatus.UNAUTHORIZED, "401"
                );
            case 403 :
                throw new ResponseStatusException(
                        HttpStatus.FORBIDDEN, "403"
                );
                default:
                    return "{\"msg\":\"hello world\"}";
        }
    }

    @RequestMapping(value = "/error", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Object errorException(){
        throw new ArrayIndexOutOfBoundsException();
    }
}
