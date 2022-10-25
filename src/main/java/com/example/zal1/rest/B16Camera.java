package com.example.zal1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kharitonov Andrei
 * @since 25.10.2022
 */
@RestController
@RequestMapping("/recock/b16/v1/api")
public class B16Camera {

    @GetMapping("/getX")
    public int getX() {
        return 12;
    }

    @GetMapping("/getY")
    public int getY() {
        return 15;
    }

    @GetMapping("/getZoom")
    public int getZoom() {
        return 17;
    }
}
