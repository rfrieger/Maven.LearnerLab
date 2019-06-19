package io.zipcoder.interfaces;

import com.sun.xml.internal.rngom.digested.DPattern;

public class Instructor extends Person implements Teacher {

    public Instructor(){};

    public Instructor(long id, String name) {
       super(id, name);
    }

    public void teach(Learner learner, Double numberOfHours) {

        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, Double numberOfHOurs) {
            Double numberOfHoursPerLearner = numberOfHOurs/learners.length;
        for (Learner learner: learners) {
            learner.learn(numberOfHoursPerLearner);
        }
    }
}
