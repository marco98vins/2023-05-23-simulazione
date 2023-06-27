package it.polito.tdp.baseball.model;

public class Nodo {
	
	private String idgiocatore;
	private String nome;
	private String cognome;
	private Integer anno;
	private Integer salario;
	private Integer idteam;
	

	public Nodo(String idgiocatore, String nome, String cognome, Integer anno, Integer salario, Integer idteam) {
		super();
		this.idgiocatore = idgiocatore;
		this.nome = nome;
		this.cognome = cognome;
		this.anno = anno;
		this.salario = salario;
		this.idteam = idteam;
	}

	public Integer getAnno() {
		return anno;
	}

	public void setAnno(Integer anno) {
		this.anno = anno;
	}

	public Integer getSalario() {
		return salario;
	}

	public void setSalario(Integer salario) {
		this.salario = salario;
	}

	public String getIdgiocatore() {
		return idgiocatore;
	}

	public void setIdgiocatore(String idgiocatore) {
		this.idgiocatore = idgiocatore;
	}

	public Integer getIdteam() {
		return idteam;
	}

	public void setIdteam(Integer idteam) {
		this.idteam = idteam;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	

}
