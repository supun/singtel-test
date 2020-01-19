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

public class ClownFishTest {
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
	public void isClownFishIsAFish(){
		IAnimal result = animalFactory.createAnimal(AnimalType.CLOWN_FISH);
		assertTrue(result instanceof Fish);
	}

	@Test
	public void whenTypeEqualsClownFishReturnClownFish(){
		IAnimal result = animalFactory.createAnimal(AnimalType.CLOWN_FISH);
		assertTrue(result instanceof ClownFish);
	}

	@Test
	public void canClownFishSwim(){
		IAnimal result = animalFactory.createAnimal(AnimalType.CLOWN_FISH);
		assertTrue(result instanceof Swimmable);
	}

	@Test
	public void canClownFishMakeJokes(){
		IAnimal result = animalFactory.createAnimal(AnimalType.CLOWN_FISH);
		assertTrue(result instanceof Jokable);
	}

	@Test
	public void isClownFishSmall(){
		IAnimal result = animalFactory.createAnimal(AnimalType.CLOWN_FISH);
		assertEquals(Size.SMALL, ((ClownFish) result).getSize());
	}

	@Test
	public void isClownFishOrangeColored(){
		IAnimal result = animalFactory.createAnimal(AnimalType.CLOWN_FISH);
		assertEquals(Color.ORANGE, ((ClownFish) result).getColor());
	}

	@Test
	public void clownFishIsnotCarnivouros(){
		IAnimal result = animalFactory.createAnimal(AnimalType.CLOWN_FISH);
		assertTrue(!(result instanceof Carnivouros));
	}
}
