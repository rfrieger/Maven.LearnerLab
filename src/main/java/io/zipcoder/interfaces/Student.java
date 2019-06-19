package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    private Double totalStudyTime = 0.0;
    public Student(){};

    public Student(long id, String name) {
        super(id, name);
    }

    public void learn(Double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
