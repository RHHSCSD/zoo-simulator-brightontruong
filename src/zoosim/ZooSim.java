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
        
        Image lionImage = new Image(100, 100);
        Image fishImage = new Image(50, 50);
        
        LandAnim lion = new LandAnim(3,"lion", "Mammal", "M", 7, 20, 20, 15, 15, 0, 0, 0, lionImage, "Roar");
        WaterAnim fish = new WaterAnim(10, "fish", "Aquatic", "F", 6, 20, 20, 15, 15, 0, 0, 0, fishImage, "blub");
        
        zoo.addAniamls(lion);
        zoo.addAniamls(fish);
        
        zoo.Stats();
        
        zoo.FeedALl();
        
        zoo.SleepAll();
        
        zoo.move();
        
        
        
        
    }
}
