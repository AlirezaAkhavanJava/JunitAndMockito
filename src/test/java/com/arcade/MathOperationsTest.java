package com.arcade;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class MathOperationsTest {

    MathOperations operations = mock(MathOperations.class);


    @Test
    @Disabled
    void emptyTest() {
    }

    @ParameterizedTest
    @ValueSource(ints = {-7, 2, 4, 6, 8})
    void splitTest(int num) {
        when(operations.checkIfEven(num)).thenReturn(num % 2 == 0);
        when(operations.split(num)).thenReturn(num / 2);
        assertAll(
                () -> assertEquals(num % 2 == 0, operations.checkIfEven(num)),
                () -> assertEquals(num / 2, operations.split(num))
        );
    }
}