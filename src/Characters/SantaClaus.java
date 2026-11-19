package Characters;
import Batment.Cleanliness;
import Batment.SimulatorBatment;

public class SantaClaus extends SimulatorBatment {

    public SantaClaus(double area, int maxCapacity, Cleanliness cleanliness) {
        super(area, maxCapacity, cleanliness);
    }

    @Override
    public boolean canAccept(SimulatorCharacter character) {
        return true;
    }

    public void examineBat(SimulatorCharacter character) {
        // TODO : Examine un bâtiment et affiche ses caractéristiques de celui-ci avec les personnages
        SimulatorCharacter[] characterPresent = getPresentCharacters();
        // Affiche les caractéristiques du batiment

    }

    public void askCleanService() {
        // TODO : Demande l'entretient d'un bâtiment
    }

    public void moveCharacter(SimulatorCharacter character) {
        // TODO : Peut faire déplacer un personnage d'un bâtiment à un autre
        SimulatorCharacter[] charactersPresent = getPresentCharacters();
    }
}
