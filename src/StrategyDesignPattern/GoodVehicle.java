package StrategyDesignPattern;

import StrategyDesignPattern.Strategy.NormalDriveStrategy;

public class GoodVehicle extends Vehicle{
    GoodVehicle(){
        super(new NormalDriveStrategy());
    }
}
