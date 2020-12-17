package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService CashbackHackService = new CashbackHackService();

    @Test
    public void shouldReturn100WhenSpend900(){
        int expected = 100;
        int actual = CashbackHackService.remain(900);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0WhenSpend1000(){
        int expected = 0;
        int actual = CashbackHackService.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1WhenSpend1999(){
        int expected = 1;
        int actual = CashbackHackService.remain(1999);
        assertEquals(actual, expected);
    }
}