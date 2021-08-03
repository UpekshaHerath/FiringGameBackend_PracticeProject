package com.company;

public class PlayerTwo extends PlayerOne{

    boolean isArmerOn;

    public PlayerTwo(String name, int health, String weapon, boolean isArmerOn) {
        super(name, health, weapon);
        this.isArmerOn = isArmerOn;
    }

    @Override
    public void hurtByGunOne() {
        if(isArmerOn()){
            this.setHealth(this.getHealth() - 20);
            System.out.println("The health reduced by 20 of the player " + this.getName());
            if(this.getHealth() <= 0){
                this.setHealth(0);
                System.out.println("The " + this.getName() + " is dead....");
            }
        }else {
            this.setHealth(this.getHealth()-30);
            System.out.println("The health reduced by 30 of the player " + this.getName());
            if(this.getHealth() <= 0){
                this.setHealth(0);
                System.out.println("The " + this.getName() + " is dead....");
            }
        }
    }

    @Override
    public void hurtByGunTwo() {
        if(isArmerOn()){
            this.setHealth(this.getHealth()-40);
            System.out.println("The health reduced by 40 of the player " + this.getName());
            if(this.getHealth() <= 0){
                this.setHealth(0);
                System.out.println("The " + this.getName() + " is dead....");
            }
        }else {
            this.setHealth(this.getHealth()-50);
            System.out.println("The health reduced by 50 of the player " + this.getName());
            if(this.getHealth() <= 0){
                this.setHealth(0);
                System.out.println("The " + this.getName() + " is dead....");
            }
        }
    }

    public boolean isArmerOn() {
        return isArmerOn;
    }

    public void setArmerOn(boolean armerOn) {
        isArmerOn = armerOn;
    }
}
