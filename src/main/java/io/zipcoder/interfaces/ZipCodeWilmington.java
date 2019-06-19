package io.zipcoder.interfaces;

import java.util.HashMap;

final public class ZipCodeWilmington {
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    private static ZipCodeWilmington INSTANCE;

    public static ZipCodeWilmington getInstance (){
        if(INSTANCE == null){
            INSTANCE = new ZipCodeWilmington();
        }
        return INSTANCE;
    }

    private ZipCodeWilmington() { }

    public void hostLecture(Teacher teacher, double numberOfHours){
//        Learner[] studentsArr = new Learner[students.count()];
        teacher.lecture(students.toArray(), numberOfHours);
////        Learner[] studentsArr = students.toArray();
//
//        int i = 0;
//
//        for(Object dude: students) {
//            studentsArr[i] = (Learner) dude;
//            i++;
//        }
//
//        teacher.lecture(studentsArr, numberOfHours);
////        if (teacher != null) {
////            teacher.lecture(studentsArr, numberOfHours);
////        }
    }

    public void hostLecture(long id, double numberOfHours){
        instructors.findById(id).lecture(students.toArray(), numberOfHours);
//
//        Instructor instructorteach = null;
//        Instructor[] instructorArr  = new Instructor[instructors.count()];
//        Learner[] studentsArr = new Student[students.count()];
//
//
//        int i = 0;
//        for(Object dude: instructors) {
//            instructorArr[i] = (Instructor)dude;
//        }
//        for (Instructor instructor : instructorArr){
//            if (instructor.getId().equals(id)) {
//                instructorteach = instructor;
//            }
//        }
//        for(Object dude: students) {
//            studentsArr[i] = (Learner) dude;
//        }
//        if (instructorteach != null) {
//            instructorteach.lecture(studentsArr, numberOfHours);
//        }
    }

    public HashMap getStudyMap(){
        HashMap<Object, Double> studentHash = new HashMap<Object, Double>();
        Learner[] studentsArr = new Student[students.count()];

        int i = 0;
        for (Object student : students){
            studentsArr[i] = (Learner) student;
            i++;
        }
        for (Learner student : studentsArr) {
            studentHash.put(student, student.getTotalStudyTime());
        }

        return studentHash;
    };
}
