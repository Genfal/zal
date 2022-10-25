package com.example.zal1.http;

import com.example.zal1.model.CameraPosition;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.InetAddress;

/**
 * @author Kharitonov Andrei
 * @since 25.10.2022
 */
@Component
public class B16HttpProtocol {

    private static final String CONTEXT_PATH = "/recock/b16/v1/api";

    private static final RestTemplate restTemplate = new RestTemplate();

    public void savePosition(CameraPosition cameraPosition, String ip) {
        System.out.println("Сохранена позиция - " + cameraPosition);
    }

    public int getX(String ip) {
        return restTemplate.getForObject(ip + CONTEXT_PATH + "/getX", Integer.class);
    }

    public int getY(String ip) {
        return restTemplate.getForObject(ip + CONTEXT_PATH + "/getY", Integer.class);
    }

    public int zoom(String ip) {
        return restTemplate.getForObject(ip + CONTEXT_PATH + "/getZoom", Integer.class);
    }
}
