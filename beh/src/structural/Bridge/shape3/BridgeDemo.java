package structural.Bridge.shape3;

import structural.Bridge.shape3.formater.Formatter;
import structural.Bridge.shape3.formater.PrintFormatter;
import structural.Bridge.shape3.model.Movie;
import structural.Bridge.shape3.printer.MoviePrinter;
import structural.Bridge.shape3.printer.Printer;

public class BridgeDemo {

	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.setClassification("Action");
		movie.setTitle("John Wick");
		movie.setRuntime("2:15");
		movie.setYear("2014");
		
		Printer moviePrinter = new MoviePrinter(movie);

		Formatter printFormatter = new PrintFormatter();
		String printedMaterial = moviePrinter.print(printFormatter);
		
		System.out.println(printedMaterial);
		
//		Formatter htmlFormatter = new HtmlFormatter();
//
//		String htmlMaterial = moviePrinter.print(htmlFormatter);
//
//		System.out.println(htmlMaterial);
	}

}
