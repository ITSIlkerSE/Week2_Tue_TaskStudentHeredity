import model.BiologyStudent;
import model.Citizen;
import model.Student;
import model.ComputerScienceStudent;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {


        Student myStudent0 = new ComputerScienceStudent("32134", "Ilker", "german", "Hamburg", 72248);
        Student myStudent1 = new ComputerScienceStudent("52414", "Jonas", "english", "Flensburg", 424151);
        Student myStudent3 = new BiologyStudent("2313", "Peter", "C++", 231314);

        ArrayList studentList = new ArrayList();

        studentList.add(myStudent0);
        studentList.add(myStudent1);
        studentList.add(myStudent3);

        System.out.println(studentList.get(0));
        System.out.println(studentList.get(1));
        System.out.println(studentList.get(2));


    }


}


