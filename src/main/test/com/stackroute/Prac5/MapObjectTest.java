package com.stackroute.Prac5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class MapObjectTest {
    MapObject mo;

    @Before
    public void setup() {
        //arrange
        mo = new MapObject();
    }

    @After
    public void tearDown() {
        //arrange
        mo = null;
    }

    @Test
    public void mapObject_string_shouldreturnnewvalue() {
        Map actual=new LinkedHashMap();
        actual.put("val1","Java");
        actual.put("val2","C++");

        Map expected=new LinkedHashMap();
        expected.put("val1","");
        expected.put("val2","Java");

        assertEquals(expected,mo.mapObject(actual));


    }
}
