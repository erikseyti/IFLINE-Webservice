package service;


import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

import controle.ControleLista;

import model.Aluno;


@Path("/Aluno")
@ApplicationPath("/resource")
public class AlunoService extends Application {
	List<Aluno> listagemAluno = new ArrayList<>();

	@GET
	@Path("/hello")
	public Response hello() {
		return Response.status(200).entity("chamou.").build();

	}
	//http://localhost:8080/WebService-Ionic/resource/Aluno/hello
	
	@POST
    @Path("/testeAddAluno")
    @Produces
    @Consumes("application/json")
    public Response testeCadastrar(Aluno objAluno) {
       System.out.println("Nome do Aluno: " + objAluno.getNome());
       System.out.println("Cpf do Aluno: " + objAluno.getCpf());
       System.out.println("Senha do Aluno: " + objAluno.getSenha());
       System.out.println("Email do Aluno: " + objAluno.getEmail());
       
        return Response.status(200).entity(objAluno.getNome()).build();     
      
    }
	//http://localhost:8080/WebService-Ionic/resource/Aluno/testeAddAluno
	
	//{
		//  "nome": "jose",
		 // "cpf": 46484925879,
		  //"email": "sey_ti@hotmail.com",
		  //"senha": "joseD0Eg1to",
		  //"dataNascimento": "2012-04-23T18:25:43.511Z"
		//}
	
	@POST
    @Path("/adicionar")
    @Produces
    @Consumes("application/json")
    public Response cadastrar(Aluno objAluno) {
		ControleLista.listaAluno.add(objAluno);
		
        return Response.status(200).entity("Nome do Aluno: "+objAluno.getNome()
		+"\n" + "CPF do Aluno: "+objAluno.getCpf() 
		+"\n" + "Email do Aluno: "+objAluno.getEmail() 
		+"\n"+ "Numero de Alunos Cadastrados no ArrayList: " +ControleLista.listaAluno.size()).build();
    }
	//http://localhost:8080/WebService-Ionic/resource/Aluno/adicionar
	
	@GET
    @Path("/listarTodosConsole")
    public Response listarTodosAlunosConsole(Aluno objAluno) {
	    List<Aluno> listagemAluno = new ArrayList<>();
	    listagemAluno = ControleLista.listaAluno;
		for (Aluno Aluno: listagemAluno) {
		    System.out.println("Nome do Aluno: "+ Aluno.getNome());
		    System.out.println("CPF do Aluno: "+ Aluno.getCpf());
		    System.out.println("Email do Aluno: "+ Aluno.getEmail());
		    
		    System.out.println("\n");
		    
		}
        return Response.status(200).entity("Numero de Alunos Cadastrados no WebService: "+ControleLista.listaAluno.size()).build();
    }
	
	@GET
    @Path("/listarTodos")
    public Response listarTodosAlunos(Aluno objAluno) {
	    listagemAluno = ControleLista.listaAluno;
        return Response.status(200).entity(listagemAluno).build();
    }
	
	//http://localhost:8080/WebService-Ionic/resource/Aluno/listarTodos
	
	
	

	
	
	@GET
    @Path( "/consulta" )
    @Produces("application/json")
    public String ConsultaAluno() 
	{
		return null;
	}
	
	
}
