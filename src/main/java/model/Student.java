package model;

import java.util.Objects;

public abstract class Student {

    private String id;
    private String name;

    private String address;

    private int identityCardNumber;


    public Student(String id, String name, String studentAddress, int identityCardNumber) {
        this.id = id;
        this.name = name;
        this.address = studentAddress;
        this.identityCardNumber = identityCardNumber;


    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(int identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public abstract String getCourse();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (!Objects.equals(id, student.id)) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student {" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", studentAddress='" + address + '\'' +
                ", studentIdentityCardNumber=" + identityCardNumber +
                '}';
    }
}
