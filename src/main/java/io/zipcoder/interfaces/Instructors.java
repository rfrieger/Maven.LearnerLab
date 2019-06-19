package io.zipcoder.interfaces;

final public class Instructors extends People<Instructor> {

    private static Instructors INSTANCE;

    private final String[] studentNames = {"Dolio", "Kris", "Sian", "Wilhlem"};

    @Override
    Instructor[] toArray() {
        return INSTANCE.toArray();
    }

    public static Instructors getInstance (){
        if(INSTANCE == null){
            INSTANCE = new Instructors();
        }
        return INSTANCE;
    }


    private Instructors(){
        for (int i = 0; i < studentNames.length ; i++) {
            Instructor instructor = new Instructor( i ,studentNames[i]);
            add(instructor);
        }


    }


}

