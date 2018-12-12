package com.relesi.fighterregistration.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;



@Entity
@Table(name = "fighter")
public class Fighter {

	private Long id;
	private String nome;
	private String faixa;
	private String categoria;
	private Integer grau;
	private Integer idade;
	private Double peso;
	private String email;

	public Fighter() {

	}

	public Fighter(Long id, String nome, String faixa, String categoria, Integer grau, Integer idade, Double peso,
			String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.faixa = faixa;
		this.categoria = categoria;
		this.grau = grau;
		this.idade = idade;
		this.peso = peso;
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((faixa == null) ? 0 : faixa.hashCode());
		result = prime * result + ((grau == null) ? 0 : grau.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idade == null) ? 0 : idade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((peso == null) ? 0 : peso.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fighter other = (Fighter) obj;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (faixa == null) {
			if (other.faixa != null)
				return false;
		} else if (!faixa.equals(other.faixa))
			return false;
		if (grau == null) {
			if (other.grau != null)
				return false;
		} else if (!grau.equals(other.grau))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idade == null) {
			if (other.idade != null)
				return false;
		} else if (!idade.equals(other.idade))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (peso == null) {
			if (other.peso != null)
				return false;
		} else if (!peso.equals(other.peso))
			return false;
		return true;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@NotEmpty(message = "Campo idade não pode ser vazio")
	@Column(name = "nome", nullable = false)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@NotEmpty(message = "Campo faixa não pode ser vazio ")
	@Column(name = "faixa", nullable = false)
	public String getFaixa() {
		return faixa;
	}

	public void setFaixa(String faixa) {
		this.faixa = faixa;
	}

	@NotEmpty(message = "Campo categoria não pode ser vazio")
	@Column(name = "categoria", nullable = false)
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	//@NotEmpty(message = "Camapo quantidade de grau não pode ser vazio")
	@Column(name = "qtd_grau", nullable = false)
	public Integer getGrau() {
		return grau;
	}

	public void setGrau(Integer grau) {
		this.grau = grau;
	}

	//@NotEmpty(message = "Campo idade não pode ser vazio")
	@Column(name = "idade", nullable = false)
	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	//@NotEmpty(message = "Campo peso não pode ser vazio")
	@Column(name = "peso", nullable = false)
	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	@Email(message = "Email inválido!")
	@NotEmpty(message = "Campo email não pode ser vaizo")
	@Column(name = "email", nullable = false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Fighter [id=" + id + ", nome=" + nome + ", faixa=" + faixa + ", categoria=" + categoria + ", grau="
				+ grau + ", idade=" + idade + ", peso=" + peso + ", email=" + email + ", hashCode()=" + hashCode()
				+ ", getId()=" + getId() + ", getNome()=" + getNome() + ", getFaixa()=" + getFaixa()
				+ ", getCategoria()=" + getCategoria() + ", getGrau()=" + getGrau() + ", getIdade()=" + getIdade()
				+ ", getPeso()=" + getPeso() + ", getEmail()=" + getEmail() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}

}
