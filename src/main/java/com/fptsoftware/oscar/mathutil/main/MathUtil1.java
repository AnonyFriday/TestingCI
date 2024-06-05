/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fptsoftware.oscar.mathutil.main;

import com.fptsoftware.oscar.mathutil.core.MathUtility;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class MathUtil1 {

    public static void main(String[] args) {
        
        int n = 0;
        long expectedValue = 1; // Hy vọng 0! = 1
        long actualValue; //=? Chờ hàm trả về
        actualValue = MathUtility.getFactorial(n);
        
        String result = n + "! | Expected: " + expectedValue +
                            " | Actual: " + actualValue;
        JOptionPane.showMessageDialog(null, result);
    }
//    public static void main(String[] args) {
//        
//        // TEST CASE #01
//        // N = 0, EXPECTED VALUE: 1, ACTUAL VALUE: ? STATUS: PASSED/FAILED
//        int n = 0;
//        long expectedValue = 1; // Hy vọng 0! = 1
//        long actualValue; //=? Chờ hàm trả về
//        actualValue = MathUtility.getFactorial(n);
//        
//        System.out.println("0! | Expected: " +expectedValue
//                + " Actual: " +actualValue);
//        
//        
//        // TEST CASE #02
//        // N = 1, EXPECTED VALUE: 1, ACTUAL VALUE: ? STATUS: PASSED/FAILED
//        n = 1;
//        expectedValue = 1; // Hy vọng 1! = 1
//        actualValue = MathUtility.getFactorial(n); //=? Chờ hàm trả về
//        
//        System.out.println("1! | Expected: " +expectedValue
//                + " Actual: " +actualValue);
//        
//        
//        // TEST CASE #03
//        // N = 5, EXPECTED VALUE: 120, ACTUAL VALUE: ? STATUS: PASSED/FAILED
//        n = 5;
//        expectedValue = 120; // Hy vọng 5! = 120
//        actualValue = MathUtility.getFactorial(n); //=? Chờ hàm trả về
//        
//        System.out.println("5! | Expected: " +expectedValue
//                + " Actual: " +actualValue);
//        
//        
//        // TEST CASE #04
//        // N = -1, EXPECTED VALUE: THẤY NGOẠI LỆ, ACTUAL VALUE: ? STATUS: PASSED/FAILED
//        System.out.println("Check if the Illegal Argument Exception is thrown");
//        n = -1;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("-1! | Expected: " +expectedValue
//                + " Actual: " +actualValue);
//        
//    }
}
