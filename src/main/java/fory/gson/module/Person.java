package fory.gson.module;

public class Person {

    private String NAME;
    private String LOCATION;
    private Exam EXAM;

    @Override
    public String toString() {
        return NAME + " - " + LOCATION + " (" + EXAM + ")";
    }

}
