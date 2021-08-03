package com.company;

public class PlayerOne {
    private String name;
    private int health;
    private String weapon;

    public PlayerOne(String name, int health, String weapon) {
        this.name = name;
        if(health < 0 || health > 100){
            this.health = 100;
        }else this.health = health;
        this.weapon = weapon;
    }

    public void hurtByGunOne(){
        this.health -= 30;
        System.out.println("The player damaged by gun one and the new health is " + this.health);
        if(this.health <= 0){
            setHealth(0);
            System.out.println(this.getName() + " is dead...");
        }
    }

    public void hurtByGunTwo(){
        this.health -= 50;
        System.out.println("The player hit by gun one...");
        if(this.health <= 0){
            setHealth(0);
            System.out.println(this.getName() + " is dead...");
        }
    }

    public void heal() {
        if(this.getHealth() <= 0){
            System.out.println("Can't increase the health. Already ded");
        }else {
            this.setHealth(100);
            System.out.println("Now your health is 100%. You got healed.....");
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health > 100 || health < 0) {
            this.health = 100;
        }else {
            this.health = health;
        }
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
