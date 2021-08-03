package com.company;

public class Main {

    public static void main(String[] args) {
        PlayerOne player = new PlayerOne("Upeksha", 5000, "AK47");
//        player.setHealth(500);
//        System.out.println(player.getHealth());
//        player.hurtByGunOne();
//        player.hurtByGunOne();
//        player.hurtByGunOne();
//        player.hurtByGunOne();
//        System.out.println(player.getHealth());

        PlayerTwo playertwo = new PlayerTwo("Dilshan", 100, "rifal", true);
        playertwo.hurtByGunOne();
        System.out.println(playertwo.getHealth());
        playertwo.setArmerOn(false);
        playertwo.hurtByGunOne();
        playertwo.heal();
        System.out.println(playertwo.getHealth());



    }
}
