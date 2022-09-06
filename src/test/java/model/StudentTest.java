package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {



    @Test
    void testEquals_whenSameStudents_returnTrue(){
        // GIVE
        Student student1 = new ComputerScienceStudent("123", "Ilker","german");
        Student student2 = new ComputerScienceStudent("123", "Ilker","german");

        // WHEN
        boolean actual = student1.equals(student2);

        // THEN
        assertEquals(true, actual);
    }

    @Test
    void testIfStudentsAreEqualReturnFalse(){


        //Given

        Student student1 = new ComputerScienceStudent("4332", "Ilker","german");
        Student student2 = new ComputerScienceStudent("41214", "Hans","english");

        //When

        boolean actual = student1.equals(student2);


        //Then

        assertEquals(false, actual);

    }

}