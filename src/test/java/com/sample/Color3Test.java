package com.sample;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Color3Test {

    @Test
    public void testGetColor1() {
        Color3 c1 = new Color3();
        String t1 = c1.getColor(5);
        assertThat(t1,is("赤"));
    }
    @Test
    public void testGetColor2() {
        Color3 c1 = new Color3();
        String t1 = c1.getColor(6);
        assertThat(t1,is("青"));
    }
    @Test
    public void testGetColor3() {
        Color3 c1 = new Color3();
        String t1 = c1.getColor(7);
        assertThat(t1,is("5or6を入力して下さい"));
    }
}
