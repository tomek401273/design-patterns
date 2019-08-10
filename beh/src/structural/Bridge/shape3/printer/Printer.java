package structural.Bridge.shape3.printer;

import structural.Bridge.shape3.model.Detail;
import structural.Bridge.shape3.formater.Formatter;

import java.util.List;

public abstract class Printer {

	public String print(Formatter formatter) {
		return formatter.format(getHeader(), getDetails());
	}
	
	abstract protected List<Detail> getDetails();
	
	abstract protected String getHeader();
}
