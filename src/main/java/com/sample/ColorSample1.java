package com.sample;

import java.awt.*;

public class ColorSample1 {
    String getColor(int i) {
        if (i == 1) {
            return "赤";
        } else if (i == 2) {
            return "青";
        } else {
            return "1or2を入力して下さい";
        }
    }
    Color1 color1 = new Color1();
    String result = color1.getColor(1);
}
