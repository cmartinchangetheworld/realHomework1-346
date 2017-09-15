/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_test_practice_c311_codymartin;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marti
 */
public class IMP_ILinkedListTest {
    
    public IMP_ILinkedListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of next method, of class IMP_ILinkedList.
     */
    @Test
    public void testNext() {
        System.out.println("IMP_ILinkedListTest: testNext()");
        //Set up test
        
        IMP_ILinkedList<Integer> list = new IMP_ILinkedList<>();
        IMP_ILinkedList<Integer> expected = new IMP_ILinkedList<>();
        
        //test actions
        list.setNext(expected);
        ILinkedList<Integer> actual = list.next();
        
        //assert test
        assertEquals(expected, actual);
    }

    /**
     * Test of last method, of class IMP_ILinkedList.
     */
    @Test
    public void testLast() {
        System.out.println("IMP_ILinkedListTest: testLast()");
        //set up test
        IMP_ILinkedList<Integer> first = new IMP_ILinkedList<>();
        IMP_ILinkedList<Integer> second = new IMP_ILinkedList<>();
        IMP_ILinkedList<Integer> expected = new IMP_ILinkedList<>();
        
        first.setNext(second);
        second.setNext(expected);
        
        //test actions
        ILinkedList<Integer> actual = first.last();
        
        //assert test
        assertEquals(expected, actual);
    }

    /**
     * Test of after method, of class IMP_ILinkedList.
     */
    @Test
    public void testAfter() {
        System.out.println("IMP_ILinkedListTest: testAfter");
        //set up test
        IMP_ILinkedList<Integer> first = new IMP_ILinkedList<>();
        IMP_ILinkedList<Integer> second = new IMP_ILinkedList<>();
        IMP_ILinkedList<Integer> third = new IMP_ILinkedList<>();
        IMP_ILinkedList<Integer> fourth = new IMP_ILinkedList<>();
        IMP_ILinkedList<Integer> fifth = new IMP_ILinkedList<>();
        
        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        
        //test actions
        ILinkedList<Integer> actual = first.after(2);        
        
        //assert test
        assertEquals(fourth, actual);
    }

    /**
     * Test of detach method, of class IMP_ILinkedList.
     */
    @Test
    public void testDetach() {
        System.out.println("IMP_ILinkedListTest: testDetach()");
        //set up test
        IMP_ILinkedList<Integer> first = new IMP_ILinkedList<>();
        IMP_ILinkedList<Integer> second = new IMP_ILinkedList<>();
        IMP_ILinkedList<Integer> expected = new IMP_ILinkedList<>();
        IMP_ILinkedList<Integer> fourth = new IMP_ILinkedList<>();
        
        first.setNext(second);
        second.setNext(expected);
        expected.setNext(fourth);
        
        //test actions
        ILinkedList<Integer> actual = second.detach();
        
        //assert test
        assertEquals(expected, actual);
    }

    /**
     * Test of get method, of class IMP_ILinkedList.
     */
    @Test
    public void testGet() {
        System.out.println("IMP_ILinkedListTest: testGet()");
        //set up test
        IMP_ILinkedList<Integer> first = new IMP_ILinkedList<>(2, null);
        
        //test actions
        int actualValue = first.get();
        
        //assert test
        assertEquals(2, actualValue);
    }

    /**
     * Test of set method, of class IMP_ILinkedList.
     */
    @Test
    public void testSet() {
        System.out.println("IMP_ILinkedListTest: testSet()");
        //set up test
        IMP_ILinkedList<Integer> first = new IMP_ILinkedList<>();
        
        //test actions
        first.set(3);
        int actual = first.get();
        
        //assert test
        assertEquals(3, actual);
    }

    /**
     * Test of setNext method, of class IMP_ILinkedList.
     */
    @Test
    public void testSetNext() {
        System.out.println("IMP_ILinkedListTest: testSetNext()");
        //set up test
        IMP_ILinkedList<Integer> first = new IMP_ILinkedList<>();
        IMP_ILinkedList<Integer> expected = new IMP_ILinkedList<>();
        
        //test actions
        first.setNext(expected);
        ILinkedList<Integer> actual = first.next();
        
        //assert test
        assertEquals(expected, actual);
    }

    /**
     * Test of append method, of class IMP_ILinkedList.
     */
    @Test
    public void testAppend() {
        System.out.println("IMP_ILinkedListTest: testAppend()");
        //set up test
        IMP_ILinkedList<Integer> first = new IMP_ILinkedList<>();
        IMP_ILinkedList<Integer> second = new IMP_ILinkedList<>();
        IMP_ILinkedList<Integer> third = new IMP_ILinkedList<>();
        IMP_ILinkedList<Integer> expected = new IMP_ILinkedList<>();
        
        first.setNext(second);
        second.setNext(third);
        
        //test actions
        first.append(expected);
        ILinkedList<Integer> actual = first.next;
        
        //assert test
        assertEquals(expected, actual);
    }

    /**
     * Test of insert method, of class IMP_ILinkedList.
     */
    @Test
    public void testInsert() {
        System.out.println("IMP_ILinkedListTest: testInsert()");
        //set up test
        IMP_ILinkedList<Integer> first = new IMP_ILinkedList<>();
        IMP_ILinkedList<Integer> second = new IMP_ILinkedList<>();
        IMP_ILinkedList<Integer> inserted = new IMP_ILinkedList<>();
        
        first.setNext(second);
        
        //test actions
        first.insert(inserted);
        ILinkedList<Integer> actual = inserted.next;
        
        //assert test
        assertEquals(first, actual);
    }
}