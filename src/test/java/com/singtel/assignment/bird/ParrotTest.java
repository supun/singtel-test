package com.singtel.assignment.bird;

import com.singtel.assignment.*;
import com.singtel.assignment.util.AnimalType;
import com.singtel.assignment.util.NeighbourType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ParrotTest {
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
	public void whenTypeEqualsParrotReturnParrot(){
		IAnimal result = animalFactory.createAnimal(AnimalType.PARROT);
		assertTrue(result instanceof Parrot);
	}


	@Test
	public void canParrotSing(){
		IAnimal result = animalFactory.createAnimal(AnimalType.PARROT);
		assertTrue(result instanceof Singable);
	}

	@Test
	public void canParrotWalk(){
		IAnimal result = animalFactory.createAnimal(AnimalType.PARROT);
		assertTrue(result instanceof Walkable);
	}

	@Test
	public void parrotCannotSwim(){
		IAnimal result = animalFactory.createAnimal(AnimalType.PARROT);
		assertTrue(!(result instanceof Swimmable));
	}


	@Test
	public void canParrotFly(){
		IAnimal result = animalFactory.createAnimal(AnimalType.PARROT);
		assertTrue(result instanceof Flyable);
	}

	@Test
	public void whenParrotNearDogReturnNeighbourtypeDog(){
		IAnimal result = animalFactory.createAnimal(AnimalType.PARROT_NEAR_DOG);
		assertEquals(NeighbourType.DOG, ((Parrot) result).getNeighbourType());
	}


	@Test
	public void whenParrotNearDogReturnNeighbourtypeCat(){
		IAnimal result = animalFactory.createAnimal(AnimalType.PARROT_NEAR_CAT);
		assertEquals(NeighbourType.CAT, ((Parrot) result).getNeighbourType());
	}

	@Test
	public void whenParrotNearDogReturnNeighbourtypeDuck(){
		IAnimal result = animalFactory.createAnimal(AnimalType.PARROT_NEAR_DUCK);
		assertEquals(NeighbourType.DUCK, ((Parrot) result).getNeighbourType());
	}

	@Test
	public void whenParrotNearDogReturnNeighbourtypeRooster(){
		IAnimal result = animalFactory.createAnimal(AnimalType.PARROT_NEAR_ROOSTER);
		assertEquals(NeighbourType.ROOSTER, ((Parrot) result).getNeighbourType());
	}

	@Test
	public void whenParrotNearDogReturnNeighbourtypePhone(){
		IAnimal result = animalFactory.createAnimal(AnimalType.PARROT_NEAR_PHONE);
		assertEquals(NeighbourType.PHONE, ((Parrot) result).getNeighbourType());
	}


}
