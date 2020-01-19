package com.singtel.assignment;

import com.singtel.assignment.butterfly.Butterfly;
import com.singtel.assignment.butterfly.CatterpillarState;
import com.singtel.assignment.util.AnimalType;

public class Solution {

    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        IAnimal[] animals = new IAnimal[]{
               animalFactory.createAnimal(AnimalType.DUCK),
               animalFactory.createAnimal(AnimalType.CHICKEN),
               animalFactory.createAnimal(AnimalType.ROOSTER),
               animalFactory.createAnimal(AnimalType.FISH),
               animalFactory.createAnimal(AnimalType.SHARK),
               animalFactory.createAnimal(AnimalType.CLOWN_FISH),
               animalFactory.createAnimal(AnimalType.DOLPHIN),
               animalFactory.createAnimal(AnimalType.BUTTERFLY)
        };
       countEachAnimalType(animals);

    }

    static void countEachAnimalType(IAnimal[] animals) {
        int swimCount = 0;
        int walkCount = 0;
        int singCount = 0;
        int flyCount = 0;
        for (IAnimal animal : animals) {

            if (animal instanceof Butterfly) {
                ((Butterfly) animal).transform();
            }
            if (animal instanceof Swimmable) {
                swimCount++;
            } if (animal instanceof Singable) {
                singCount++;
            }  if (animal instanceof  Flyable){
                flyCount++;
            } if (animal instanceof Walkable){
                walkCount ++;
            } if(animal instanceof Butterfly && (((Butterfly) animal).getCurrentState() instanceof Flyable)){
                flyCount++;
            }
        }

        System.out.println("flyCount : "+flyCount);
        System.out.println("walkCount : "+walkCount);
        System.out.println("singCount : "+singCount);
        System.out.println("swimCount : "+swimCount);
    }

}
