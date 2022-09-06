package model;

public class BiologyStudent extends Student implements Citizen {


    public BiologyStudent(String id, String name, String studentAddress, int identityCardNumber) {
        super(id, name, studentAddress, identityCardNumber);
    }

    @Override
    public String getCourse() {
        return "biology";
    }
}
