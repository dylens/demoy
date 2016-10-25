package fory.gson.first.module;

public class Exam {

    private String SUBJECT;
    private double GRADE;

    @Override
    public String toString() {
        return SUBJECT + " - " + GRADE;
    }

}
