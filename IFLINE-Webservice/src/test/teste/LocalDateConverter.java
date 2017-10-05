package teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateConverter {

	public static void main(String[] args) {
		String data = "25/01/2016";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(data,formatter);
		System.out.println(date);

	}

}
