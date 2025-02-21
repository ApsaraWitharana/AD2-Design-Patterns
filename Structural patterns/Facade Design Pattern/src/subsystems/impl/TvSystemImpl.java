package subsystems.impl;

import subsystems.TvSystem;


public class TvSystemImpl implements TvSystem {
    @Override
    public void setChannel(int channel) {
        System.out.println("Set channel to : " + channel);
    }

    @Override
    public void turnOn() {
        System.out.println("Tv is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv is OFF");
    }
}
