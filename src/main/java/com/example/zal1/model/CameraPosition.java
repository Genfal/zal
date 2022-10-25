package com.example.zal1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Kharitonov Andrei
 * @since 25.10.2022
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CameraPosition {
    private int x;

    private int y;

    private int zoom;
}
