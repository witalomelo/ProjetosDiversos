package br.com.alura.minhasmusicas.modelos;

public class Audio {
	//atributos
	private String titulo;
	private double duracao;
	private int totalReproducoes;
	private int totalCurtidas;
	private int classificacao;
	
	//permitir altear o titulo
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	public int getTotalReproducoes() {
		return totalReproducoes;
	}
	
	public int getTotalCurtidas() {
		return totalCurtidas;
	}
	
	public int getClassificacao() {
		return classificacao;
	}
	
	//metodos
	public void curte() {
		this.totalCurtidas++;
	}
	
	public void reproduz() {
		this.totalReproducoes++;
		
	}

	

}
