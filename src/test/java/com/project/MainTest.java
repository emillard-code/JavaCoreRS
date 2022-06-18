package com.project;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MainTest {

    @Test
    public void testReverseString() {

        Assertions.assertEquals("!dlroW olleH", Main.reverseString("Hello World!"));
        Assertions.assertEquals(".edoc avaJ gnitseT", Main.reverseString("Testing Java code."));

    }

}
