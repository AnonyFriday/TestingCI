/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.fptsoftware.oscar.mathutil.core.test;

import com.fptsoftware.oscar.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author LENOVO
 */
public class NewEmptyJUnitTest {

    public NewEmptyJUnitTest() {
    }

    //chuẩn bị bộ data đưa vào hàm getFactorial()
    //chuẩn bị luôn bộ data kết quả trả về từ hàm
    //0! -> 1; 1! -> 1; 2! -> 2; 3! -> 6; 4! -> 24; 5! -> 120; 6! -> 720
    //{0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120},{6, 720},
    public static Object[][] initData() {
        return new Object[][]
        {
         {0, 1}, 
         {1, 1}, 
         {2, 2}, 
         {3, 6}, 
         {4, 24}, 
         {5, 120}, 
         {6, 720}
        };
    }
    
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgunentReturnsWell(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
