package fory.gson.first.module;

public class Person {

    private String NAME;
    private String LOCATION;
    private fory.gson.first.module.Exam EXAM;

    @Override
    public String toString() {
        return NAME + " - " + LOCATION + " (" + EXAM + ")";
    }

}
