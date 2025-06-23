package org.example;

public class Person {

    private String name;
    private int age;
    private String gender;
    private Boolean adult;
    private Boolean isFemale;

    public Person() {
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }


    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.adult = null;
        this.isFemale = null;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getGender() {
        return gender;
    }

    public String toDisplayString() {
        String genderStr = isFemale == null ? "לא ידוע" : (isFemale ? "נקבה" : "זכר");
        String adultStr = adult == null ? "לא ידוע" : (adult ? "בוגר": "צעיר");
        return String.format("[שם: %s | גיל: %d | בוגר: %s | מגדר: %s]",
                name, age, adultStr, genderStr);
    }

    @Override
    public String toString() {
        return  toDisplayString();
    }
}