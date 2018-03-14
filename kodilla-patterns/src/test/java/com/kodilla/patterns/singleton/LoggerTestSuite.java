package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog1() {

        //Given
        Logger.getInstance();
        //When
        Logger.getInstance().log("Log entry 1");
        Logger.getInstance().log("Log entry 2");
        //Then
        Assert.assertEquals("Log entry 2", Logger.getInstance().getLastLog());
    }

}
