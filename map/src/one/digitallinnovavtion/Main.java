package one.digitallinnovavtion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<String, String> aluno = new HashMap<>();
		
		aluno.put("Nome", "Joao");
		aluno.put("Idade", "7");
		aluno.put("Turma", "2a");
		
		
		Map<String, String> aluno2 = new HashMap<>();
		
		aluno2.put("Nome", "Pedro");
		aluno2.put("Idade", "10");
		aluno2.put("Turma", "4b");
		
		Map<String, String> aluno3 = new HashMap<>();
		
		aluno3.put("Nome", "Pedro");
		aluno3.put("Idade", "10");
		aluno3.put("Turma", "4b");
		
		
		System.out.println(aluno);
		
		//Retorna um grupo das Chaves
		System.out.println(aluno.keySet());
		
		//Retorna todos os Valores
		System.out.println(aluno.values());
		
		
		List<Map<String, String>> listaAlunos = new ArrayList<>();
		
		listaAlunos.add(aluno);
		listaAlunos.add(aluno2);
		listaAlunos.add(aluno3);
		
		
		System.out.println(listaAlunos);
		
		System.out.println(aluno.containsKey("Nome"));
		
		
	}
}
