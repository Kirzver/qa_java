package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void createLionWithException(){
        {
            Exception exception = assertThrows(Exception.class, () -> new Lion("Оно", feline));
            String expectedMessage = "Используйте допустимые значения пола животного - самей или самка";
            String actualMessage = exception.getMessage();
            assertEquals(expectedMessage, actualMessage);
        }

    }

    @Test
    public void getKittensShouldBeReturnOne()throws Exception{
        Lion lion = new Lion ("Самка", feline);
        int expectedKittens = 1;
        Mockito.when(feline.getKittens()).thenReturn(expectedKittens);
        assertEquals(expectedKittens, lion.getKittens());
    }

    @Test
    public void getFoodCorrectReturnListForLion() throws Exception {
        Lion lion = new Lion ("Самка", feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        assertEquals(expectedFood,lion.getFood());

    }


}
