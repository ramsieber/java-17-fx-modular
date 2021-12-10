package com.example.graphics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectangularTest {

    Rectangular actualRectangular;

    @BeforeEach
    void setUp(){
        actualRectangular = new Rectangular(1.0,2.0,3.0,4.0);
    }

    @Test
    void computeAreaTest(){
        assertEquals(12.0,actualRectangular.computeArea());
    }

    @Test
    void computeCircumferenceTest(){
        assertEquals(14.0,actualRectangular.computeCircumference());
    }
}
