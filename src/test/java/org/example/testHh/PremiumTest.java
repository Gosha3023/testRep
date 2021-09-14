package org.example.testHh;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PremiumTest {
    @Test
    void asserting1(){
        int n = 4;
        int m = 6;
        Integer[] arr = new Integer[]{199,453,220,601};
        List list = Arrays.asList(arr);
        assertEquals(200, Premium.calculatePremium(n,m,list));
    }

    @Test
    void asserting2(){
        int n = 2;
        int m = 100;
        Integer[] arr = new Integer[]{99 , 1};
        List list = Arrays.asList(arr);
        assertEquals(1, Premium.calculatePremium(n,m,list));
    }

    @Test
    void asserting3(){
        int n = 2;
        int m = 100;
        Integer[] arr = new Integer[]{98 , 1};
        List list = Arrays.asList(arr);
        assertEquals(0, Premium.calculatePremium(n,m,list));
    }

    @Test
    void asserting4(){
        int n = 4;
        int m = 2;
        Integer[] arr = new Integer[]{199,453,220,601};
        List list = Arrays.asList(arr);
        assertEquals(453, Premium.calculatePremium(n,m,list));
    }

    @Test
    void asserting5(){
        int n = 4;
        int m = 7;
        Integer[] arr = new Integer[]{199,453,220,601};
        List list = Arrays.asList(arr);
        assertEquals(199, Premium.calculatePremium(n,m,list));
    }

    @Test
    void asserting6(){
        int n = 4;
        int m = 3;
        Integer[] arr = new Integer[]{199,453,220,601};
        List list = Arrays.asList(arr);
        assertEquals(300, Premium.calculatePremium(n,m,list));
    }

    @Test
    void asserting7(){
        int n = 4;
        int m = 7;
        Integer[] arr = new Integer[]{199,399,599,899};
        List list = Arrays.asList(arr);
        assertEquals(224, Premium.calculatePremium(n,m,list));
    }

    @Test
    void asserting8(){
        int n = 4;
        int m = 3;
        Integer[] arr = new Integer[]{100,100,100,100};
        List list = Arrays.asList(arr);
        assertEquals(100, Premium.calculatePremium(n,m,list));
    }
    @Test
    void asserting9(){
        int n = 5;
        int m = 7;
        Integer[] arr = new Integer[]{299,399,698,797,1396};
        List list = Arrays.asList(arr);
        assertEquals(398, Premium.calculatePremium(n,m,list));
    }
    @Test
    void asserting10(){
        int n = 4;
        int m = 5;
        Integer[] arr = new Integer[]{100,200,100,200};
        List list = Arrays.asList(arr);
        assertEquals(100, Premium.calculatePremium(n,m,list));
    }
    @Test
    void asserting11(){
        int n = 4;
        int m = 1;
        Integer[] arr = new Integer[]{101,205,100,201};
        List list = Arrays.asList(arr);
        assertEquals(205, Premium.calculatePremium(n,m,list));
    }
    @Test
    void asserting12(){
        int n = 4;
        int m = 1;
        Integer[] arr = new Integer[]{100,101,102,103};
        List list = Arrays.asList(arr);
        assertEquals(103, Premium.calculatePremium(n,m,list));
    }
    @Test
    void asserting13(){
        int n = 4;
        int m = 5;
        Integer[] arr = new Integer[]{100,200,200,202};
        List list = Arrays.asList(arr);
        assertEquals(100, Premium.calculatePremium(n,m,list));
    }
    @Test
    void asserting14(){
        int n = 4;
        int m = 5;
        Integer[] arr = new Integer[]{100,100,101,101};
        List list = Arrays.asList(arr);
        assertEquals(50, Premium.calculatePremium(n,m,list));
    }
    @Test
    void asserting15(){
        int n = 5;
        int m = 5;
        Integer[] arr = new Integer[]{0,0,0,0,5};
        List list = Arrays.asList(arr);
        assertEquals(1, Premium.calculatePremium(n,m,list));
    }
    @Test
    void asserting16() {
        int n = 100000;
        int m = 1;
        List<Integer> list = new ArrayList<>(100000);
        Random random = new Random();
        for (int i = 0; i < n; i++){
            list.add(random.nextInt(100_000_000));
        }
        System.out.println(Premium.calculatePremium(n,m,list));
    }
    @Test
    void asserting17(){
        int n = 5;
        int m = 11;
        Integer[] arr = new Integer[]{10,10,12,10,10};
        List list = Arrays.asList(arr);
        assertEquals(4, Premium.calculatePremium(n,m,list));
    }
    @Test
    void asserting18(){
        int n = 5;
        int m = 6;
        Integer[] arr = new Integer[]{100,192,190,193,360};
        List list = Arrays.asList(arr);
        assertEquals(120, Premium.calculatePremium(n,m,list));
    }

    @Test
    void asserting19(){
        int n = 15;
        int m = 31;
        Integer[] arr = new Integer[]{100,100,100,100,100,200,200,200,200,200,150,150,150,150,150};
        List list = Arrays.asList(arr);
        assertEquals(50, Premium.calculatePremium(n,m,list));
    }
}