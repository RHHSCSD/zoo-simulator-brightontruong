/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * represents a bird animal in the zoo that can fly
 * extends animal class and implements IFlyable interface
 * this class provides additional attributes specifically birds
 * each type of bird should extend this class
 * @author brigh
 */
public abstract class BirdAnim extends Animal implements IFlyable{
    
    public BirdAnim(int id, String name, String species, String sex, int age, int positionX, int positionY, int size, int speed, int direction, int hunger, int fatigue, Image image, String sound) {
        super(id, name, species, sex, age, positionX, positionY, size, speed, direction, hunger, fatigue, image, sound);

    }
    public boolean canFly;
        
}
