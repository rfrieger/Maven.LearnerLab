package io.zipcoder.interfaces;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class InstructorsTest {

    @Test
    public void getInstance() {

        Instructors instructors =  Instructors.getInstance();

        assertThat(instructors.count(), is(4));


    }
}