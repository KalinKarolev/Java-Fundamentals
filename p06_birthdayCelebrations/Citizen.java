package p06_birthdayCelebrations;

public class Citizen implements Person{
    private String name;
    private String age;
    private String id;
    private String birthday;

    public Citizen(String name, String age, String id, String birthday) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthday = birthday;
    }


    @Override
    public String getBirthday() {
        return this.birthday;
    }
}
