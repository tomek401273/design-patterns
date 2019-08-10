package behavioral.mediator.ex;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    List<Ligth> ligthList = new ArrayList<>();

    public void registerLigh(Ligth ligth) {
        ligthList.add(ligth);
    }

    public void turnOnAllLights() {
        for (Ligth ligth: ligthList) {
            ligth.setTurnOn(true);
        }
    }

    public void turnOffAllLighs() {
        for (Ligth ligth: ligthList) {
            ligth.setTurnOn(false);
        }
    }
}
