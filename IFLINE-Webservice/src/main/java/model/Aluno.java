package model;

import java.time.LocalDate;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

public class Aluno {

	private String nome;
	private String cpf;
	private String email;
	private String senha;	
	private Date dataNascimento;
	
	public Aluno(String nome, String cpf, String email, String senha, Date dataNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
		this.setDataNascimento(dataNascimento);
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
	
	public String getSenha() 
	{
		return senha;
	}
	
	public void setSenha(String senha) 
	{
		this.senha = senha;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	
	
	
	
}
