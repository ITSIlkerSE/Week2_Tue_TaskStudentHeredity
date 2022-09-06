package model;

import org.junit.jupiter.api.Test;

import java.lang.constant.Constable;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {


    @Test
    void testEquals_whenSameStudents_returnTrue() {
        // GIVE
        Student student1 = new ComputerScienceStudent("123", "Ilker", "german", "Hamburg", 72248);
        Student student2 = new ComputerScienceStudent("123", "Ilker", "german", "Hamburg", 72248);

        // WHEN
        boolean actual = student1.equals(student2);

        // THEN
        assertEquals(true, actual);
    }

    @Test
    void testIfStudentsAreEqualReturnFalse() {


        //Given

        Student student1 = new ComputerScienceStudent("4332", "Ilker", "german", "Hamburg", 72248);
        Student student2 = new ComputerScienceStudent("41214", "Hans", "english", "Flensburg", 44421);

        //When

        boolean actual = student1.equals(student2);


        //Then

        assertEquals(false, actual);

    }

    @Test
    void testMyAbstractMethodInNonAbstractClass() {

        //Given
        Student student1 = new ComputerScienceStudent("241242", "hans", "C++", "Frankfurt", 78291);
        //When
        String actual = student1.getCourse();
        //Then

        assertEquals("test for abstract method", actual);


    }


}