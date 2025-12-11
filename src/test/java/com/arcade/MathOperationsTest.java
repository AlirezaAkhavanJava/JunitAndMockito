package com.arcade;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extension;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Spy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

class MathOperationsTest {


    MathOperations operations = spy(MathOperations.class);


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

    @Test
    void sumShouldReturnExactValue() {
        int result = operations.sum(4, 5);
        assertThat(result).isEqualTo(9).isGreaterThan(8);
    }

}