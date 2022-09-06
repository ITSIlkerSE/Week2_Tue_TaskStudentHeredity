import model.BiologyStudent;
import model.Citizen;
import model.Student;
import model.ComputerScienceStudent;


public class Main {

    public static void main(String[] args) {


        Student myStudent0 = new ComputerScienceStudent("32134", "Ilker", "german", "Hamburg", 72248);
        Student myStudent1 = new ComputerScienceStudent("52414", "Jonas", "english", "Flensburg", 424151);

        Student myStudent3 = new BiologyStudent("2313", "Peter", "C++", 231314);

        System.out.println(myStudent3);
        System.out.println(myStudent0.getCourse());


    }


}


