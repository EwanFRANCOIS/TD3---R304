package Batment;

import Characters.SimulatorCharacter;

public class SantaClausHouse extends SimulatorBatment {

    public SantaClausHouse(double area, int maxCapacity, Cleanliness cleanliness) {
        super(area, maxCapacity, cleanliness);
    }

    @Override
    public boolean canAccept(SimulatorCharacter character) {
        return false;
    }

}
