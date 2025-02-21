package subsystems.impl;

import subsystems.DVDPlayer;



public class DVDPlayerImpl implements DVDPlayer {
    @Override
    public void playMovie(String movieName) {
        System.out.println("Play movie : " + movieName);
    }

    @Override
    public void stopMovie() {
        System.out.println("Stop movie");
    }

    @Override
    public void turnOn() {
        System.out.println("DVD ON");
    }

    @Override
    public void turnOff() {
        System.out.println("DVD OFF");
    }
}
