package org.launchcode.java.exercises.technology;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Program {

    private Computer computer;

    @Before
    public void createComputerObject(){
        computer = new Computer("Apple", "Green", 16);
    }

    @Test
    public void colorCanUpdate(){
        computer.updateColor("Yellow");
        assertEquals("Yellow", computer.getColor());
    }

    @Test
    public void memoryCanUpdate(){
        computer.updateMemory(32);
        assertEquals(32, computer.getMemory());
    }


}
