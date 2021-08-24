package com.dabor.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @author dabort
 * @date 2021/8/6 - 11:16
 */
public class IdUtils {

    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }


}
