package com.practise.SpringBootDemo.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class CommonUtils {
    public static boolean isString(Object obj) {
        return !NumberUtils.isParsable((String) obj);
    }
}
