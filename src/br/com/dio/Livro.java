package br.com.dio;

import java.time.LocalDate;

public class Livro {
	private int livroId;
	private String isbn;
	private String titulo;
	private String autor;
	private int numeroPaginas;
	private String idioma;
	private String editora;
	private LocalDate dataPublicacao;
	static int contador = 0;
	
	public Livro (String isbn, String titulo, String autor, int numeroPaginas, 
				  String idioma, String editora, LocalDate dataPublicacao) {
	    this.isbn = isbn;
	    this.titulo = titulo;
		this.autor = autor;
	    this.numeroPaginas = numeroPaginas;
	    this.idioma = idioma;
	    this.editora = editora;
	    this.dataPublicacao = dataPublicacao;		
	    livroId = ++contador;
	}
	
	public String toString () {
	    return this.livroId			+ "|" + 
		       this.isbn 			+ "|" + 
			   this.titulo 			+ "|" + 
			   this.autor 			+ "|" + 
			   this.numeroPaginas 	+ "|" + 
			   this.idioma 			+ "|" + 
			   this.editora 		+ "|" + 
			   this.dataPublicacao	+ "|";
	}
}
