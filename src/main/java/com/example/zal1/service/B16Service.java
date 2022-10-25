package com.example.zal1.service;

import com.example.zal1.http.B16HttpProtocol;
import com.example.zal1.model.CameraPosition;
import org.springframework.stereotype.Component;

/**
 * @author Kharitonov Andrei
 * @since 25.10.2022
 */
@Component
public class B16Service {

    private final B16HttpProtocol httpProtocol;

    public B16Service(B16HttpProtocol httpProtocol) {
        this.httpProtocol = httpProtocol;
    }

    public void savePosition(String ip) {
        CameraPosition cameraPosition = CameraPosition.builder()
                .x(httpProtocol.getX(ip))
                .y(httpProtocol.getY(ip))
                .zoom(httpProtocol.zoom(ip))
                .build();

        httpProtocol.savePosition(cameraPosition, ip);
    }
}
