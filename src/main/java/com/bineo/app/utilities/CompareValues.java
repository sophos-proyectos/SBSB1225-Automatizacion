package com.bineo.app.utilities;

public class CompareValues {
    private CompareValues() {
    }

    public static Boolean validateIfFirstValueIsLess(Double value, Double valueEvaluated) {
        return value < valueEvaluated;
    }
}
