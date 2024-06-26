/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.fptsoftware.oscar.mathutil.core.test;

// quy tắc đặt tên package trong Java
// tên miền cty đảo ngược, đi kèm thông tin dự án/project và module
// com.tên-cty.tên-dự-án.module.Tên-Class
// com.microsoft.sqlserver.jdbc.
// com.fptsoftware.oscar.mathutil.core
// NET: chiều xuôi, chữ hoa từng đầu từ
// Microsoft.Sdk.

import com.fptsoftware.oscar.mathutil.core.MathUtility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ASUS
 */
// class này chứa các test case dùng để test code của class chính
// bên MathUtility
public class MathUtilityTest {
     
    //Test case: là bộ data đầu vào + thao tác nhập xuất trên app, màn hình, trên hàm
    //           để verify 1 hàm, màn hình, chức năng chạy đúng hay sai!!! PE

    //Test case #1: Check/test getF() with n = 0
    // *Input/Given n = 0
    // * Steps/Procedure (bước test)
    //  call method getFactorial(n)
    // * Expected Result: 1 (hy vọng 0! = 1)
    // * Actual Result ??? chờ chạy hàm mới biết
    // * Status: passed | failed
    
    @Test   // framework ép ta phải viết code theo 1 quy tắc nào đó
            // thư viện cho viêt tự do, gọi là hàm tự do
    //framework là thư viện, nhưng thuw viện ko hẳn là framework
    
    public void testFactorialGivenRightArg0ReturnWell(){
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
    //Test case #3: Check/test getF() with n = 2
    // *Input/Given n = 1
    // * Steps/Procedure (bước test)
    //  call method getFactorial(n)
    // * Expected Result: 1 (hy vọng 1! = 1)
    // * Actual Result ??? chờ chạy hàm mới biết
    // * Status: passed | failed
    
    @Test   // framework ép ta phải viết code theo 1 quy tắc nào đó
            // thư viện cho viêt tự do, gọi là hàm tự do
    //framework là thư viện, nhưng thuw viện ko hẳn là framework
    
    public void testFactorialGivenRightArg1ReturnWell(){
        assertEquals(1, MathUtility.getFactorial(1));
    }
    
    //Test case #3: Check getF() with n = 5, expected = 120
    @Test
    public void testFactorialGivenRightArg5ReturnWell(){
        assertEquals(120, MathUtility.getFactorial(5));
    }  

    @Test
    public void testFactorialGivenRightArg12345ReturnWell(){
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
    // thấy ngoại lệ mừng rơi nước mắt 
    // Test case #5: Check getF() with n = -1, the method throw Exception 
    @Test
    public void testFactorialGivenWrongArg_1ThrowException(){
        //MathUtility.getFactorial(-1);
        assertThrows(IllegalArgumentException.class, 
                () -> {MathUtility.getFactorial(-1);});
    }
}
