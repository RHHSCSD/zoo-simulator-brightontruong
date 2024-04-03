/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *Represents an animal in the zoo
 * Implements IEntity
 * common attributes for all animals in the zoo
 * each animal extends this class
 * @author brigh
 */
public abstract class Animal implements IEntity{
    int id;
    String name;
    String species;
    String sex;
    int age;
    int positionX;
    int positionY;
    int size;
    int speed;
    int direction;
    int hunger;
    int fatigue;
    Image image;
    String sound;
    
    /**
     * Constructor to initialize an animal object.
     *
     * @param id id identifier for the animal
     * @param name  name of the animal
     * @param species  species of the animal
     * @param sex  sex of the animal (M for male, F for female)
     * @param age  age of the animal
     * @param positionX  X-coordinate position of the animal
     * @param positionY  Y-coordinate position of the animal
     * @param size  size of the animal
     * @param speed  speed of the animal
     * @param direction  direction in which the animal is facing (in
     * degrees).
     * @param hunger  hunger level of the animal
     * @param fatigue  fatigue level of the animal
     * @param image  image representing the animal
     * @param sound  sounds made by the animal
     */
    
    public Animal(int id, String name, String species, String sex, int age, int positionX, int positionY, int size, int speed, int direction, int hunger, int fatigue, Image image, String sound) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.sex = sex;
        this.age = age;
        this.positionX = positionX;
        this.positionY = positionY;
        this.size = size;
        this.speed = speed;
        this.direction = direction;
        this.hunger = hunger;
        this.fatigue = fatigue;
        this.image = image;
        this.sound = sound;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public int getSize() {
        return size;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDirection() {
        return direction;
    }

    public int getHunger() {
        return hunger;
    }

    public int getFatigue() {
        return fatigue;
    }

    public Image getImage() {
        return image;
    }

    public String getSound() {
        return sound;
    }
   
    
    public void makeSound(){
        System.out.println("as;ldkfhaiosehgasleghsaljghasljhnlfakjsh");
    }
    
    public void move(){
        System.out.println("The " + name + "is traveling in the " + direction + " with a speed of:" + speed);
    }
    
    public void eat(){
        hunger = 100;
        System.out.println("The " + name + " hunger is " + hunger);
    }
    
    public void sleep(){
        fatigue = 0;
        System.out.println("The " + name + " is " + fatigue + " fatigue");
               
    }
    
    public void place(int x, int y){
        positionX = x;
        positionY = y;
        
    }
    
    public void turn(int degree){
        int turn = (direction + degree);
        System.out.println(name +  " turned " + turn);
    }
    
} 
