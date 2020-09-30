import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class EqualsTest {
    @Before
    public void setUp() {
    }

    @Test
    public void GasPlanetEqualsMethod() {
        Planet neptune = new GasPlanet(78, "Gas Planet", false, Color.BLUE);
        Planet uranus = new GasPlanet(34, "Gas Planet", false, Color.BLUE);
        assertEquals(true, neptune.equals(uranus));
    }

    @Test
    public void RockPlanetEqualsMethod() {
        Planet earth = new RockPlanet(88, "Rock Planet", false);
        Planet mercury = new RockPlanet(94, "Rock Planet", false);
        assertEquals(true, earth.equals(mercury));
    }

    @Test
    public void MoonEqualsMethod() {
        Moon moon1 = new Moon(new Planet(54, "Rock Planet"), true, 75, "Moon");
        Moon moon2 = new Moon(new Planet(54, "Rock Planet"), true, 67, "Moon");
        assertEquals(true, moon1.equals(moon2));
    }





}
