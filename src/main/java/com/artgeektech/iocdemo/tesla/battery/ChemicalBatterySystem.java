package com.artgeektech.iocdemo.tesla.battery;

public class ChemicalBatterySystem implements BatterySystem {

    @Override
    public void providePower() {
        System.out.println(this.getClass().getSimpleName() + " is providing power for ");
    }
}
