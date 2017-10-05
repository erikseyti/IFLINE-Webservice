package model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
public class Aluno {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String nome;
	private String cpf;
	private String email;
	
	public Aluno(String nome, String cpf, String email ) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;

	}
	
	public Aluno()
	{
		
	}

	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public String getCpf() 
	{
		return cpf;
	}
	
	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}


	
	
	
	
}
