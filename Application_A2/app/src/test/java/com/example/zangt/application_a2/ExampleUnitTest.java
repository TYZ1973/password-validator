package com.example.zangt.application_a2;

import org.junit.Test;

//import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
//import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by zangt on 18/2/9.
 */

public class ExampleUnitTest {
    passwordCheck pck = new passwordCheck();
    @Test
    public void checklen() throws Exception{
        assertEquals(0,pck.lengthCheck("1234567A"));
    }
    @Test
    public void checkpd() throws Exception{
        assertEquals(1,pck.equalCheck("passwword"));
    }
    @Test
    public void checkLow() throws Exception{
        assertEquals(2,pck.digitsCheck("90299999"));
    }
    @Test
    public void checkM() throws Exception{
        assertEquals(3,pck.ifLower("12345678asdfg"));
    }
    @Test
    public void checkH() throws Exception{
        assertEquals(4,pck.ifUpper("Az123456"));
    }
}