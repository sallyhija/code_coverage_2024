package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


import static org.junit.Assert.*;
import  org.junit.Test;

public class AppTest {
	
	@Test
	public void Tc_1(){
        int a = 2;
        int b = 2;
        int c = 5;
        String result = TriangleClassifier.classifyTriangle(a,b,c).toString();
        String expected =Triangle_Types.Nottriangle.toString();
     
        assertEquals(expected, result.toString());
    }
	
	@Test
	public void Tc_2(){
        int a = 2;
        int b = 5;
        int c = 2;
        String result = TriangleClassifier.classifyTriangle(a,b,c).toString();
        String expected =Triangle_Types.Nottriangle.toString();
     
        assertEquals(expected, result.toString());
    }
	
	@Test
	public void Tc_3(){
        int a = 5;
        int b = 2;
        int c = 2;
        String result = TriangleClassifier.classifyTriangle(a,b,c).toString();
        String expected =Triangle_Types.Nottriangle.toString();
     
        assertEquals(expected, result.toString());
    }
	
	@Test
	public void Tc_4(){
        int a = 6;
        int b = 6;
        int c = 6;
        String result = TriangleClassifier.classifyTriangle(a,b,c).toString();
        String expected =Triangle_Types.equilateral.toString();
     
        assertEquals(expected, result.toString());
    }
	
	@Test
	public void Tc_5(){
        int a = 6;
        int b = 6;
        int c = 5;
        String result = TriangleClassifier.classifyTriangle(a,b,c).toString();
        String expected =Triangle_Types.isosceles.toString();
     
        assertEquals(expected, result.toString());
    }
	
	@Test
	public void Tc_6(){
        int a = 5;
        int b = 6;
        int c = 6;
        String result = TriangleClassifier.classifyTriangle(a,b,c).toString();
        String expected =Triangle_Types.isosceles.toString();
     
        assertEquals(expected, result.toString());
    }
	
	@Test
	public void Tc_7(){
        int a = 6;
        int b = 5;
        int c = 6;
        String result = TriangleClassifier.classifyTriangle(a,b,c).toString();
        String expected =Triangle_Types.isosceles.toString();
     
        assertEquals(expected, result.toString());
    }
	
	@Test
	public void Tc_8(){
        int a = 3;
        int b = 4;
        int c = 5;
        String result = TriangleClassifier.classifyTriangle(a,b,c).toString();
        String expected =Triangle_Types.Scalene.toString();
     
        assertEquals(expected, result.toString());
    }
}  