/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.giaolang.mathutil.test;

//import org.junit.jupiter.api.Test; //JUnit 5 Maven

import static com.giaolang.mathutil.core.MathUtil.*;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;   //JUnit 4 
import static org.junit.Assert.*;

/**
 *
 * @author giao.lang
 */
public class MathUtilTest {
    
    //các hàm để test các class bên code chính sẽ đặt ở đây
    //ko đặt trong main() nữa!!!
    //tách riêng code để test và code chính ra 2 nơi khác nhau
    
    //Test case #1: check getF() with valid argument
    //n = 0 (0!), expected = 1, actual = ? đoán xem!!!   
    @Test //annotation, bộ thư viện quy ước phải viết điều này
    //máy ảo JVM biết phải làm gì? -> biến hàm dưới này thành main()
    public void testFactorialGivenValidArgumentReturnsWell() {
        
        long expected = 1; //hy vọng 0! = 1
        long actual = getFactorial(0);
        
        assertEquals(expected, actual);
    }
    
    //Test case #2: check getF() with valid argument
    //n = 6 (6!), expected = 720, actual = ? đoán xem!!!   
    @Test //annotation, bộ thư viện quy ước phải viết điều này
    //máy ảo JVM biết phải làm gì? -> biến hàm dưới này thành main()
    public void testFactorialGivenValidArgumentN6ReturnsWell() {
        
        long expected = 720; //hy vọng 6! = 720
        long actual = getFactorial(6);
        
        assertEquals(expected, actual);
        
        
    }
    
    //Case #3: ngoại lệ thì test làm sao???
    //ngoại lệ ko phải là giá trị để so sánh!!!
    //nó chỉ có ở hình dạng là: mày xh hay ko mà thôi
    //ko thể xài hàm assertEquals(cần value để so sánh)
    //nếu ta đưa vào n = -5, số âm, thì ta sẽ nhận về ngoại lệ
    //thiết kế đúng của hàm, đưa âm, vượt 20, nhận về ngoại lệ
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenInvalidArgumentThrowsException() {
        getFactorial(-5);
    }
    //chạy như thiết kế thì phải là màu xanh cho dù có Exception
    //nhưng là Exception đc phép xh
    
    
}
