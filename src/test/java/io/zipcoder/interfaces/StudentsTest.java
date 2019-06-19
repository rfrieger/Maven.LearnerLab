package io.zipcoder.interfaces;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void getInstance() {


       Students students =  Students.getInstance();

      assertThat(students.count(), is(7));

    }
}