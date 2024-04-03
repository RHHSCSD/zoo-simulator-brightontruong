/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

import java.util.ArrayList;
import java.util.List;

/**
 *represents zoo containing animals
 * zoo manages the animals and provides methods for them
 * this class also allows adding animals, displaying stats, feeding animals, making animals sleep and moving animals
 * @author brigh
 */
public class Zoo extends Animal{
    ArrayList<Animal> animals = new ArrayList<Animal>();
    public Zoo(int id, String name, String species, String sex, int age, int positionX, int positionY, int size, int speed, int direction, int hunger, int fatigue, Image image, String sound) {
        super(id, name, species, sex, age, positionX, positionY, size, speed, direction, hunger, fatigue, image, sound);

    }
    
    
    public void addAniamls(Animal ann){
        animals.add(ann);
    }

    public void Stats() {
        System.out.println("");
    }

    public void FeedALl() {
        for(Animal animal : animals){
        if(animal.getHunger() <= 50){
            animal.setHunger(100);
        }   
       }
    }

    public void SleepAll() {
        for(Animal animal : animals){
        if(animal.getFatigue() >= 50){
            animal.setFatigue(0);
        }
       }
    }

   public void move() {
       for(Animal animal : animals){
           int newX = animal.getPositionX() + animal.getSpeed() *
       }
       
    }
   
    
}
