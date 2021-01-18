package com.codegym.task.task24.task2401;

import java.lang.reflect.Method;

public class Util {
    public static void testClass(SelfMarkerInterface markerInterface) throws UnsupportedMarkerInterfaceException {
        if (markerInterface == null) {
            throw new UnsupportedMarkerInterfaceException("Parameter is null");
        }

        for (Method method : markerInterface.getClass().getDeclaredMethods()) {
            System.out.println(method);
        }
    }
}
