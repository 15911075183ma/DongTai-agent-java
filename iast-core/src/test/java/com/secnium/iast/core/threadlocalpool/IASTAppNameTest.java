package com.secnium.iast.core.threadlocalpool;

import org.junit.Test;

public class IASTAppNameTest {
    public static IastAppName appName = new IastAppName();

    @Test
    public void testCreate() throws InterruptedException {
        for (int i = 0; i < 10000000; i++) {
            Thread.sleep(10);
            appName.set(new String("abc"));
        }
    }
}
