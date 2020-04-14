package com.openclassroom.watchlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class WatchlistApplication {

    public static void main(String[] args) {
        SpringApplication.run(WatchlistApplication.class, args);
    }
}
