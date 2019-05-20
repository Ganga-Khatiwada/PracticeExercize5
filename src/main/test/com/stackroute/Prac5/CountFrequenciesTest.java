package com.stackroute.Prac5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class CountFrequenciesTest {
    CountFrequencies cf;

        @Before
        public void setup() {
            //arrange
            cf = new CountFrequencies();
        }

        @After
        public void tearDown() {
            //arrange
            cf = null;
        }


        @Test
        public void countFrequencies_string_shouldreturncountoccurrence()
        {
            HashMap<String,Integer> hashMap = new HashMap<>();
            hashMap.put("one",5);
            hashMap.put("two",2);
            hashMap.put("three",2);

            assertEquals(hashMap,cf.countFrequencies("one one -one___two,,three,one @three*one?two"));


        }
}
