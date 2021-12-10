package com.example.graphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {
    Circle actualCircle;

    @BeforeEach
    void setUp(){
        actualCircle = new Circle(1.0,2.0,5.0);
    }

    @Test
    void computeAreaTest(){
        assertEquals(Math.PI*25,actualCircle.computeArea());
    }

    @Test
    void computeCircumferenceTest(){
        assertEquals(Math.PI*10,actualCircle.computeCircumference());
    }
}
