package Batment;

import Characters.Humanoids.Humanoid;
import Characters.SimulatorCharacter;

public class FemaleCabin extends SimulatorBatment {

    public FemaleCabin(double area, int maxCapacity, Cleanliness cleanliness) {
        super(area, maxCapacity, cleanliness);
    }

    @Override
    public boolean canAccept(SimulatorCharacter character) {
        if (character instanceof Humanoid && character.getSexe().equals("Female")) {
            return true;
        } else {
            return false;
        }
    }

    public void sleepEveryone() {
        SimulatorCharacter[] charactersPresent = getPresentCharacters();
        for (int i = 0; i < getCurrentCapacity(); i++) {
            charactersPresent[i].sleep();
        }
    }
}
