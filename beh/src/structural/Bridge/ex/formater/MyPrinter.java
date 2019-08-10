package structural.Bridge.ex.formater;

import structural.Bridge.ex.model.Detatil;

import java.util.List;

public class MyPrinter implements Formater {
    @Override
    public String format(String attribute, List<Detatil> details) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("author: ");
        stringBuilder.append(attribute);
        stringBuilder.append('\n');

        for (Detatil detatil: details) {
            stringBuilder.append(detatil.getKey());
            stringBuilder.append(detatil.getValue());
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }
}
