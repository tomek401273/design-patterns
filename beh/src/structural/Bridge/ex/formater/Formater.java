package structural.Bridge.ex.formater;

import structural.Bridge.ex.model.Detatil;

import java.util.List;

public interface Formater {
    String format(String attribute, List<Detatil> details);
}
