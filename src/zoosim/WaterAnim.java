/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *represents animals that are in water / water animal 
 * extends the animal class and provide attributes for wateranim
 * each water animal should extend this class
 * @author brigh
 */

public class WaterAnim extends Animal implements ISwimmable{
    
    public WaterAnim(int id, String name, String species, String sex, int age, int positionX, int positionY, int size, int speed, int direction, int hunger, int fatigue, Image image, String sound) {
        super(id, name, species, sex, age, positionX, positionY, size, speed, direction, hunger, fatigue, image, sound);
  
}
public boolean canBreathe;


}