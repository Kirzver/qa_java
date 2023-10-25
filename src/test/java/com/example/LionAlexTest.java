package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensShouldBeReturnZero() throws Exception{
        LionAlex alex = new LionAlex(feline);
        int expectedZero = 0;
        assertEquals(expectedZero,alex.getKittens());

    }

    @Test
    public void getFriendsReturnCorrectList() throws Exception{
        LionAlex alex = new LionAlex(feline);
        List <String> friendListExpected = List.of("Марти", "Глория", "Мелман");
        assertEquals(friendListExpected, alex.getFriends());

    }

    @Test
    public void getPlaceOfLivingShouldBeCorrect() throws Exception{
        LionAlex alex = new LionAlex(feline);
        String expectedPlace = "Нью-Йоркский зоопарк";
        assertEquals(expectedPlace, alex.getPlaceOfLiving());

    }
}
