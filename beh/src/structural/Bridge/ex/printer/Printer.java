package structural.Bridge.ex.printer;

import structural.Bridge.ex.formater.Formater;
import structural.Bridge.ex.model.Detatil;

import java.util.List;

public abstract class Printer {

    public String print(Formater formater) {
        return formater.format(getAttribute(), getDetails());
    }

    public abstract List<Detatil> getDetails();

    public abstract String getAttribute();
}
