package one.digitallinnovavtion;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Set<Carro> hashSetCarros = new HashSet<>();

		hashSetCarros.add(new Carro("Ford"));
		hashSetCarros.add(new Carro("Toyota"));
		hashSetCarros.add(new Carro("Hondai"));
		hashSetCarros.add(new Carro("Hondai"));
		hashSetCarros.add(new Carro("TOYO"));
		
		
		System.out.println(hashSetCarros);
		
		Set<Carro> treeSetCarros = new TreeSet<>();
		
		treeSetCarros.add(new Carro("Ford"));
		treeSetCarros.add(new Carro("Toyota"));
		treeSetCarros.add(new Carro("Hondai"));
		treeSetCarros.add(new Carro("Hondai"));
		treeSetCarros.add(new Carro("TOYO"));
		
		System.out.println(treeSetCarros);

	}
}
