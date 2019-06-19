package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void teach() {
        Instructor instructor = new Instructor();
        Student student = new Student();

        instructor.teach(student, 10.0);
        Double actual = student.getTotalStudyTime();
        Double expected = 10.0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lecture() {
        Instructor instructor = new Instructor();
        Student student = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        Student[] studentsArr = {student,student2,student3};

        instructor.lecture(studentsArr, 3.0);
        Double actual = student.getTotalStudyTime();
        Double expected = 1.0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor();

        Assert.assertTrue(instructor instanceof Teacher);
    }
    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor();

        Assert.assertTrue(instructor instanceof Person);
    }
}