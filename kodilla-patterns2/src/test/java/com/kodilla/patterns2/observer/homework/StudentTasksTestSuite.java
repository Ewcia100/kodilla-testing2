package com.kodilla.patterns2.observer.homework;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTasksTestSuite {
    @Test
    public void testUptade(){
        //Given
        StudentTasks ewelina=new StudentTasks("Ewelina");
        StudentTasks magda=new StudentTasks("Magda");

        Mentor pp=new Mentor("PP");
        Mentor ks=new Mentor("KS");

        ewelina.registerObserver(pp);
        magda.registerObserver(ks);

        ewelina.addNewTask("Facade");
        ewelina.addNewTask("Decorator");
        magda.addNewTask("Prototype");
        magda.addNewTask("Builder");
        magda.addNewTask("Factory");

        assertEquals(2,pp.getUptadeCount());
        assertEquals(3,ks.getUptadeCount());



    }
}
