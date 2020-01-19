package com.singtel.assignment.bird;

import com.singtel.assignment.*;
import com.singtel.assignment.util.AnimalType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ChickenTest {
	AnimalFactory animalFactory = null;

	@Before
	public void setUp() {
		animalFactory = new AnimalFactory();
	}

	@After
	public void clear() {
		animalFactory = null;
	}


	@Test
	public void whenTypeEqualsChickenReturnChicken(){
		IAnimal result = animalFactory.createAnimal(AnimalType.CHICKEN);
		assertTrue(result instanceof Chicken);
	}

	@Test
	public void whenTypeEqualsRoosterReturnRoster(){
		IAnimal result = animalFactory.createAnimal(AnimalType.ROOSTER);
		assertEquals(Boolean.TRUE,((Chicken) result).isMale());
	}

	@Test
	public void canChickenSing(){
		IAnimal result = animalFactory.createAnimal(AnimalType.CHICKEN);
		assertTrue(result instanceof Singable);
	}

	@Test
	public void canChickenWalk(){
		IAnimal result = animalFactory.createAnimal(AnimalType.CHICKEN);
		assertTrue(result instanceof Walkable);
	}

	@Test
	public void chickenCannotFly(){
		IAnimal result = animalFactory.createAnimal(AnimalType.CHICKEN);
		assertTrue(! (result instanceof Flyable));
	}

	@Test
	public void chickenCannotSwim(){
		IAnimal result = animalFactory.createAnimal(AnimalType.CHICKEN);
		assertTrue(! (result instanceof Swimmable));
	}
}
