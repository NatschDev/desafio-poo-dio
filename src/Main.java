import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descri��o curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descri��o curso js");
		curso2.setCargaHoraria(4);
						
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de java");
		mentoria.setDescricao("Descri��o mentoria java");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devNathalia = new Dev();
		devNathalia.setNome("Nathalia");
		devNathalia.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos Nathalia" + devNathalia.getConteudosInscritos());
		devNathalia.progredir();
		devNathalia.progredir();
		System.out.println("-");
		System.out.println("Conte�dos Inscritos Nathalia" + devNathalia.getConteudosInscritos());
		System.out.println("Conte�dos Conclu�dos Nathalia" + devNathalia.getConteudosConcluidos());
		System.out.println("XP:" + devNathalia.calcularTotalXp());
		
		System.out.println("---------------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("Jo�o");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos Jo�o" + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conte�dos Inscritos Jo�o" + devJoao.getConteudosInscritos());
		System.out.println("Conte�dos Conclu�dos Jo�o" + devJoao.getConteudosConcluidos());
		System.out.println("XP:" + devJoao.calcularTotalXp());	
					
	}

}
