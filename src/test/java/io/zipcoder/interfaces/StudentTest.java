package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void learn() {
        Student student = new Student();
        student.learn(10.0);
        Double actual =  student.getTotalStudyTime();
        Double expected = 10.0;

        Assert.assertEquals(expected,actual);

    }


    @Test
    public void testImplementation() {
        Student student = new Student();

        Assert.assertTrue(student instanceof Person);
    }
    @Test
    public void testInheritance() {
        Student student = new Student();

        Assert.assertTrue(student instanceof Learner);
    }
}