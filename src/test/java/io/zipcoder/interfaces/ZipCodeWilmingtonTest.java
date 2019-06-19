package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLecture() {
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Instructors instructors =  Instructors.getInstance();
        Students students = Students.getInstance();

        Teacher teacher = (Teacher)instructors.findById(0L);
        Learner learner = (Learner)students.findById(0l);

        zipCodeWilmington.hostLecture(teacher, 70.0);

        Double acutal = learner.getTotalStudyTime();
        Double expected = 10.0;

        assertEquals(expected,acutal);
    }

    @Test
    public void hostLecture2() {
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Students students = Students.getInstance();

        Learner learner = (Learner)students.findById(0l);

        zipCodeWilmington.hostLecture(Educator.Wilhlem, 70.0);

        Double acutal = learner.getTotalStudyTime();
        Double expected = 10.0;

        assertEquals(expected,acutal);
    }

}