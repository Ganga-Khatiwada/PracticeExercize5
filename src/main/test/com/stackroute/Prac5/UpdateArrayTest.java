package com.stackroute.Prac5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class UpdateArrayTest {

        UpdateArray ua;

        @Before
        public void setup() {
            //arrange
            ua = new UpdateArray();
        }

        @After
        public void tearDown() {
            //arrange
            ua = null;
        }

        @Test
        public void arrayelements_string_shouldreturnreplacedelements()
        {
            ArrayList<String> list_strings = new ArrayList<String>();
            list_strings.add("Apple");
            list_strings.add("Grape");
            list_strings.add("Melon");
            list_strings.add("Berry");
            ArrayList<String> expected = new ArrayList<String>();

        }


}
