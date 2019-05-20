package com.stackroute.Prac5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

import static org.junit.Assert.*;

public class SetInterfaceTest {

        SetInterface si;

        @Before
        public void setup() {
            //arrange
            si = new SetInterface();
        }

        @After
        public void tearDown() {
            //arrange
            si = null;
        }

        @Test
        public void SetInterface_names_shouldreturnorderednames()
        {
            HashSet<String> i = new HashSet<String>();
            i.add("Harry");
            i.add("Olive");
            i.add("Alice");
            i.add("Pluto");
            i.add("Eugene");
            ArrayList<String> expected = new ArrayList<String>();
        }
}
