package com.singtel.assignment.fish;

import com.singtel.assignment.AnimalFactory;
import com.singtel.assignment.Carnivouros;
import com.singtel.assignment.IAnimal;
import com.singtel.assignment.Swimmable;
import com.singtel.assignment.util.AnimalType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DolphinTest {
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
	public void isDolphinNotAFish(){
		IAnimal result = animalFactory.createAnimal(AnimalType.DOLPHIN);
		assertTrue(!(result instanceof Fish));
	}

	@Test
	public void whenTypeEqualsDolphinReturnDolphin(){
		IAnimal result = animalFactory.createAnimal(AnimalType.DOLPHIN);
		assertTrue(result instanceof Dolphin);
	}

	@Test
	public void canDolphinSwim(){
		IAnimal result = animalFactory.createAnimal(AnimalType.DOLPHIN);
		assertTrue(result instanceof Swimmable);
	}

	@Test
	public void whenDolphinIsNotCarnivorous(){
		IAnimal result = animalFactory.createAnimal(AnimalType.DOLPHIN);
		assertTrue(!(result instanceof Carnivouros));
	}
}
