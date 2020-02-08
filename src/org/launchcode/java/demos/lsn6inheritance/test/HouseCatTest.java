package org.launchcode.java.demos.lsn6inheritance.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.main.HouseCat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class HouseCatTest {
    HouseCat house_cat;

    @Before
    public void createHouseCatObject(){
        house_cat = new HouseCat("Ramsey", 40);
    }

    @Test
    public void inheritsSuperInFirstConstructor(){
        assertEquals(40, house_cat.getWeight(), .001);
    }
}
