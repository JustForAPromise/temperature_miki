package com.fhx.temperature.util;

import com.fhx.temperature.config.exception.BusinessException;

import java.util.function.Predicate;

public class BSUtil {
    public static final String ILLEGAL_OPERATION = "illegal operation!";
    public static final String FAILED_OPERATION = "操作失败!";

    public BSUtil() {
    }

    public static void error(String error) {
        throw new BusinessException(error);
    }

    public static <T> void isTrue(T arg, Predicate<T> predicate, String error) {
        if (!predicate.test(arg)) {
            error(error);
        }

    }

    public static void isTrue(boolean expression, String error) {
        if (!expression) {
            error(error);
        }

    }

    public static void isNull(Object object, String error) {
        if (object != null) {
            error(error);
        }

    }

    public static void notNull(Object object, String error) {
        if (object == null) {
            error(error);
        }

    }

    public static void validateRegexp(String input, String regexp, String error) {
        isTrue(input.matches(regexp), error);
    }
}
