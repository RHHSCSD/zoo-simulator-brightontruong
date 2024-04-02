/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author brigh
 */
public abstract class WaterAnim extends Animal implements ISwimmable{
    
    public WaterAnim(int id, String name, String species, String sex, int age, int positionX, int positionY, int size, int speed, int direction, int hunger, int fatigue, Image image, String sound) {
        super(id, name, species, sex, age, positionX, positionY, size, speed, direction, hunger, fatigue, image, sound);
  
}
public boolean canBreathe;


}