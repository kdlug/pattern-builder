package com.github.kdlug.builder;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ComputerTest {
    @Test
    public void computerBuilderTest() {
        Computer c = new Computer.Builder("16GB", "2TB", "Intel i7")
                .setGraphicCardEnabled(true)
                .build();

        Assert.assertEquals("16GB", c.getRAM());
        Assert.assertEquals("2TB", c.getHDD());
        Assert.assertEquals("Intel i7", c.getCPU());
        Assert.assertEquals(true, c.isGraphicCardEnabled());
        Assert.assertEquals(false, c.isBluetoothEnabled());
    }
}