package com.stackroute.Prac5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertEquals;

public class ArrayOfStringsTest {
    ArrayOfStrings aos;

    @Before
    public void setup() {
        //arrange
        aos = new ArrayOfStrings();
    }

    @After
    public void tearDown() {
        //arrange
        aos = null;
    }

    @Test
    public void arrayOfString_string_shouldreturnbooleanvalue() {
        Map<String,Boolean> expected = new HashMap<String, Boolean>();
        expected.put("a",true);
        expected.put("b",false);
        expected.put("c",true);
        expected.put("d",false);
        assertEquals(expected,aos.arrayOfString(new String[]{"a","b","c","d","a","c","c"}));
    }

}
