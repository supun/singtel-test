package com.singtel.assignment.bird;

import com.singtel.assignment.*;
import com.singtel.assignment.util.AnimalType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DuckTest {
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
	public void whenTypeEqualsDuckReturnDuck(){
		IAnimal result = animalFactory.createAnimal(AnimalType.DUCK);
		assertTrue(result instanceof Duck);
	}


	@Test
	public void canDuckSing(){
		IAnimal result = animalFactory.createAnimal(AnimalType.DUCK);
		assertTrue(result instanceof Singable);
	}

	@Test
	public void canDuckWalk(){
		IAnimal result = animalFactory.createAnimal(AnimalType.DUCK);
		assertTrue(result instanceof Walkable);
	}

	@Test
	public void canDuckSwim(){
		IAnimal result = animalFactory.createAnimal(AnimalType.DUCK);
		assertTrue(result instanceof Swimmable);
	}

	@Test
	public void duckCannotFly(){
		IAnimal result = animalFactory.createAnimal(AnimalType.DUCK);
		assertTrue(! (result instanceof Flyable));
	}


}
