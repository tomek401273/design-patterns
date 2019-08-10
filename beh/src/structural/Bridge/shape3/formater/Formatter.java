package structural.Bridge.shape3.formater;

import structural.Bridge.shape3.model.Detail;

import java.util.List;

public interface Formatter {
	String format(String header, List<Detail> details);
}
