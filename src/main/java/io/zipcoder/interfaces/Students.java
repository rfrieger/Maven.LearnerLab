package io.zipcoder.interfaces;

final public class Students extends People<Student> {

    private static Students INSTANCE;

    private final String[] studentNames = {"bob", "alex", "Ben", "Joanna", "erick", "ed", "henry"};

    public static Students getInstance (){
        if(INSTANCE == null){
            INSTANCE = new Students();
        }
        return INSTANCE;
    }

    private Students(){
        for (int i = 0; i < studentNames.length ; i++) {
            Student studentAdd = new Student( i ,studentNames[i]);
            add(studentAdd);
        }
    }


    @Override
    Student[] toArray() {
        Student[] arr = new Student[INSTANCE.count()];
        int i = 0;
        for (Object student: INSTANCE
        ) {
            arr[i] = (Student) student;
            i++;
        }
        return arr;
    }
}

