package com.singtel.assignment.butterfly;

import com.singtel.assignment.AnimalFactory;
import com.singtel.assignment.Flyable;
import com.singtel.assignment.IAnimal;
import com.singtel.assignment.Walkable;
import com.singtel.assignment.util.AnimalType;
import com.singtel.assignment.util.InsectState;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ButterflyTest {

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
	public void isButterFLyStartWithCatterpillarState(){
		IAnimal result = animalFactory.createAnimal(AnimalType.BUTTERFLY);
		assertEquals(InsectState.CATERPILLAR, ((Butterfly) result).getState());
	}

	@Test
	public void whenCatterpillarcannotFly(){
		IAnimal result = animalFactory.createAnimal(AnimalType.BUTTERFLY);
		assertTrue(!(((Butterfly) result).getCurrentState() instanceof Flyable));
	}

	@Test
	public void whenCatterpillarcanwalk(){
		IAnimal result = animalFactory.createAnimal(AnimalType.BUTTERFLY);
		assertTrue(((Butterfly) result).getCurrentState() instanceof Walkable);
	}


	@Test
	public void whenCatterPillarTransformToButterFly(){
		IAnimal result = animalFactory.createAnimal(AnimalType.BUTTERFLY);
		((Butterfly) result).transform();
		assertTrue( ((Butterfly) result).getCurrentState() instanceof ButterFlyState);
	}


	@Test
	public void whenCatterPillarTransformToButterFlyCanFly(){
		IAnimal result = animalFactory.createAnimal(AnimalType.BUTTERFLY);
		((Butterfly) result).transform();
		assertTrue( ((Butterfly) result).getCurrentState() instanceof Flyable);
	}



	@Test
	public void whenCatterPillarTransformToButterFlyCannotWalk(){
		IAnimal result = animalFactory.createAnimal(AnimalType.BUTTERFLY);
		((Butterfly) result).transform();
		assertTrue( !(((Butterfly) result).getCurrentState() instanceof Walkable));
	}

}
