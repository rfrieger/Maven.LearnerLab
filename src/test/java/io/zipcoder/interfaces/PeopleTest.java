//package io.zipcoder.interfaces;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class PeopleTest {
//
//    public People<Person> peopleList
//    private Person student = new Student(10l, "bob");
//    private Person student1 = new Student(16l, "guy");
//    private Person instructor = new Instructor(1l, "jon");
//
//
//    @Before
//    public void setup(){
//        peopleList = new People<Person>();
//    }
//
//    @After
//    public void tearDown(){
//        peopleList.removeAll();
//    }
//
//    @Test
//    public void add() {
//        peopleList.add(student);
//        peopleList.add(instructor);
//
//        Integer expected = 2;
//        Integer actual = peopleList.count();
//
//        assertEquals(expected,actual);
//    }
//
//    @Test
//    public void findById() {
//        peopleList.add(student);
//        peopleList.add(instructor);
//
//        String expected = "bob";
//        String actual = peopleList.findById(10L).name;
//
//        assertEquals(expected,actual);
//    }
//
//
//    @Test
//    public void remove() {
//
//        peopleList.add(student);
//        peopleList.add(instructor);
//
//        peopleList.remove(10L);
//        Integer expected = 1;
//        Integer actual = peopleList.count();
//
//        assertEquals(expected,actual);
//
//    }
//
//    @Test
//    public void remove1() {
//        peopleList.add(student);
//        peopleList.add(instructor);
//        peopleList.remove(instructor);
//        peopleList.add(student1);
//        Integer expected = 2;
//        Integer actual = peopleList.count();
//
//        assertEquals(expected,actual);
//    }
//
//    }
//
//
