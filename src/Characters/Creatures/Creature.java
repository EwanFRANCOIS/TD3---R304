package Characters.Creatures;

import Characters.SimulatorCharacter;

public abstract class Creature extends SimulatorCharacter {

    public Creature() {
        super();
    }

    public Creature(String Name, String Sexe, String Race, int Age, int HungerMeter, boolean TirednessMeter, int Magic) {
        super(Name, Sexe, Race, Age, HungerMeter, TirednessMeter, Magic);
    }

    public boolean isCreature() {
        return true;
    }

    // TODO : Implémentation d'une méthode qui pourait peut etre transformer les lutins en lutin farceurs
}
