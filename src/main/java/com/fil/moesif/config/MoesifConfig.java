package com.fil.moesif.config;

import com.moesif.servlet.MoesifFilter;

import javax.servlet.Filter;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.http.converter.*;

@Configuration
public class MoesifConfig extends WebMvcConfigurerAdapter {
    @Bean
    public Filter moesifFilter() {
        return new MoesifFilter("eyJhcHAiOiI0ODc6ODAiLCJ2ZXIiOiIyLjAiLCJvcmciOiIyOTE6OTkiLCJpYXQiOjE1NjcwMzY4MDB9.RwHAZHFDR28flT6OF_-cbotMYecqByR-oZTQiUul4bc");
    }
}
