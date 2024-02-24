package com.sha.demomaven.domain.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class SpringUtils {

    public static String addTest(String a) {
        return a + "test";
    }
}
