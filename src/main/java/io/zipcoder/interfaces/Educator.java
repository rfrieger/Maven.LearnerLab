package io.zipcoder.interfaces;

import java.util.Enumeration;

public enum Educator implements Teacher  {


    Dolio(new Instructor(0l, "Dolio") , 0.0),
    Kris(new Instructor(1l, "Kris"), 0.0),
    Sian(new Instructor(2l, "Sian"), 0.0),
    Wilhlem(new Instructor(3l, "Wilhem"), 0.0)
    ;

    Instructors instructors = Instructors.getInstance();
    private final Instructor instructor;
    double timeWorked;

    Educator(Instructor instructor, double timeWorked ) {
        this.instructor = instructor;
        this.timeWorked = 0.0;
        instructors.add(instructor);
    }


    public void teach(Learner learner, Double numberOfHours) {
        instructor.teach(learner,numberOfHours);
    }

    public void lecture(Learner[] learners, Double numberOfHOurs) {
        instructor.lecture(learners, numberOfHOurs);
    }

}
