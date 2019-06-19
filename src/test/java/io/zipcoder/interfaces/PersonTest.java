package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testSetName() {
        Person person = new Person();
        person.setName("Bob");
        String actual = "Bob";
        String expected =person.name;

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testConstructor(){
        Person person = new Person(100L, "Bob" );
        String actual = "Bob";
        String expected =person.name;

        Assert.assertEquals(expected,actual);

    }
}