package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class FelineTest {

    @Test
    public void eatMeatReturnCorrectListForFeline() throws Exception{
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, feline.eatMeat());
    }

    @Test
    public  void  getFamilyReturnIsFeline(){
        assertEquals(new Feline().getFamily(), "Кошачьи");
    }

    @Test
    public void getKittensReturnInputKittensIsCorrect(){
        int kittensCount = 10;
        int actualKitten = 10;
        assertEquals(actualKitten,new Feline().getKittens(kittensCount));

    }

    @Test
    public void getKittensReturnDefaultKittensShouldBeOne(){
        int expectedKitten = 1;
        assertEquals(expectedKitten, new Feline().getKittens());

    }
}
