package com.singtel.assignment.fish;

import com.singtel.assignment.*;
import com.singtel.assignment.util.AnimalType;
import com.singtel.assignment.util.Color;
import com.singtel.assignment.util.Size;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SharkTest {
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
	public void isSharkIsAFish(){
		IAnimal result = animalFactory.createAnimal(AnimalType.SHARK);
		assertTrue(result instanceof Fish);
	}

	@Test
	public void whenTypeEqualsSharkReturnShark(){
		IAnimal result = animalFactory.createAnimal(AnimalType.SHARK);
		assertTrue(result instanceof Shark);
	}

	@Test
	public void canSharkSwim(){
		IAnimal result = animalFactory.createAnimal(AnimalType.SHARK);
		assertTrue(result instanceof Swimmable);
	}

	@Test
	public void canClownFishMakeJokes(){
		IAnimal result = animalFactory.createAnimal(AnimalType.CLOWN_FISH);
		assertTrue(result instanceof Jokable);
	}

	@Test
	public void isSharkLarge(){
		IAnimal result = animalFactory.createAnimal(AnimalType.SHARK);
		assertEquals(Size.LARGE, ((Shark) result).getSize());
	}

	@Test
	public void isSharkGreyColored(){
		IAnimal result = animalFactory.createAnimal(AnimalType.SHARK);
		assertEquals(Color.GREY, ((Shark) result).getColor());
	}

	@Test
	public void sharkIsCarnivouros(){
		IAnimal result = animalFactory.createAnimal(AnimalType.SHARK);
		assertTrue(result instanceof Carnivouros);
	}
}
