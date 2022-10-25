package com.example.zal1.rest;

import com.example.zal1.service.B16Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kharitonov Andrei
 * @since 25.10.2022
 */
@RestController
@RequestMapping("/b16")
public class B16Controller {

    private final B16Service b16Service;

    public B16Controller(B16Service b16Service) {
        this.b16Service = b16Service;
    }

    @PostMapping("/savePosition")
    public void savePosition(@RequestBody String ip) {
        b16Service.savePosition(ip);
    }
}
