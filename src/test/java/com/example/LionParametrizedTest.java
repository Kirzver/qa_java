package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class LionParametrizedTest {

    private final String sex;
    private  final boolean hasMane;


    public LionParametrizedTest(String sex, boolean hasMane){
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);


    }


    @Parameterized.Parameters
    public static Object[][] getSexAndHasMane(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Mock
    Feline feline;

    @Test
    public void doesHaveManeIsCorrect() throws Exception{
        Lion lion = new Lion(sex, feline);
        assertEquals(hasMane, lion.doesHaveMane());
    }



}
