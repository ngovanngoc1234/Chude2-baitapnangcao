package model;

public class Nguoi {
    private String name;
    private String sdt;
    private String email;
    private int age;


    public Nguoi() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Nguoi(String name, String sdt, String email, int age) {
        this.name = name;
        this.sdt = sdt;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "name='" + name + '\'' +
                ", sdt='" + sdt + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
