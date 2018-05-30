package com.example.song.passwordvalidator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Shengnan Song
 *B00735789
 *
 */
public class ExampleUnitTest {
    @Test
    public void Validate0() throws Exception {
        Validator validator = new Validator();
        String password="apple";
        assertEquals(0,validator.Valid(password));
    }
    @Test
    public void Validate2() throws Exception{
        Validator validator = new Validator();
        String password="password";
        assertEquals(2,validator.Valid(password));
    }
    @Test
    public void Validate3() throws Exception{
        Validator validator = new Validator();
        String password="computer";
        assertEquals(3,validator.Valid(password));
    }
    @Test
    public void Validate4() throws Exception{
        Validator validator = new Validator();
        String password="students1";
        assertEquals(4,validator.Valid(password));
    }
    @Test
    public void Validate5() throws Exception{
        Validator validator = new Validator();
        String password="Students1";
        assertEquals(5,validator.Valid(password));
    }
}