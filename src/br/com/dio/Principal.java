package br.com.dio;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		Livro umLivro1 = new Livro("3347588683-2", "ASP.NET MVC", "Joao da Silva", 359, "PT-BR", "Alta Books",
		    LocalDate.parse("2015-02-17"));
		Livro umLivro2 = new Livro("8746576331-6", "Java : Como Programar", "Deitel", 657, "PT-BR", "Bookman ",
		    LocalDate.parse("2017-11-23"));
		Livro umLivro3 = new Livro("4487356258-7", "Engenharia de Software", "Sommerville", 552, "PT-BR", "Alta Books",
		    LocalDate.parse("2012-08-21"));
		Livro umLivro4 = new Livro("6456534421-4", "Python 3", "Fernando da Costa", 398, "PT-BR", "Bookman ",
		    LocalDate.parse("2019-10-14"));

		System.out.println(umLivro1);
		System.out.println(umLivro2);
		System.out.println(umLivro3);
		System.out.println(umLivro4);
	}
}
