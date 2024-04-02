/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosim;

/**
 *
 * @author michael.roy-diclemen
 */
public class ZooSim {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        
        LandAnim lion = new LandAnim(3,"lion", "Mammal", "M", 7, 20, 20, 15, 15, 0, 0, 0, 0, null, "Roar");
        
        WaterAnim fish = new WaterAnim(10, "fish", "Aquatic", "F", 6, 20, 20, 15, 15, 0, 0, 0, 0, null, "blub");
        
        zoo.addAniamls(lion);
        zoo.addAniamls(fish);
        
        zoo.Stats();
        
        zoo.FeedALl();
        
        zoo.SleepAll();
        
        zoo.move();
        
        
        
        
    }
}
