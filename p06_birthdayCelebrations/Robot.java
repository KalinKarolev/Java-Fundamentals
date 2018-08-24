package p06_birthdayCelebrations;

public class Robot implements Person {
    private String model;
    private String id;

    public Robot(String model, String id) {
        this.model = model;
        this.id = id;
    }

    @Override
    public String getBirthday() {
        return null;
    }
}
