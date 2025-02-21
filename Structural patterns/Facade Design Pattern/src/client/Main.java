package client;

import facade.HomeTheater;
import facade.HomeTheaterFacade;

public class Main {
    public static void main(String[] args) {
        HomeTheater homeTheater = new HomeTheaterFacade();
        System.out.println("Preparing to watch movie...");

        homeTheater.watchMovie("Hello");

        System.out.println();
        System.out.println("Stopping..........");
        homeTheater.stopMovie();
    }
}
