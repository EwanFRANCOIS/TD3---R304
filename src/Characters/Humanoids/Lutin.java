package Characters.Humanoids;

import Abilities.Entertainable;
import Abilities.Worker;
import Building.SimulatorBuilding;
import Building.Workshops;
import Characters.Creatures.Creature;
import Characters.SimulatorCharacter;

public class Lutin extends Humanoid implements Worker, Entertainable {

    private boolean prankster;

    public Lutin(String Name, String Sexe, String Race, int Age, int HungerMeter, boolean TirednessMeter, int Magic) {
        super(Name, Sexe, Race, Age, HungerMeter, TirednessMeter, Magic);
    }


    @Override
    public void play() {
        System.out.print(getName() + " Le " + getRace() + " se divertit.");
        setMagic(getMagic() + 10);
    }

    @Override
    public void work() {
        System.out.print(getName() + " Le " + getRace() + " Travaille.");
        setMagic(getMagic() + 10);
    }

    // TODO : Certains lutin peuvent se transformer en lutins farceurs
    public boolean isPrankster() {
        return prankster;
    }

    public void setPrankster(boolean prankster) { this.prankster = prankster; }

    public void doPrank(SimulatorBuilding building) {
        SimulatorCharacter[] presents = building.getPresentCharacters();
        for (int i = 0; i < building.getCurrentCapacity(); i++) {
            SimulatorCharacter character = presents[i];
            if (character == this) continue;
            if (character instanceof Creature) {
                character.setMagic(character.getMagic() - 2);
            } else if (!(building instanceof Workshops)) {
                character.setMagic(character.getMagic() + 2);
            }
        }
    }
}
