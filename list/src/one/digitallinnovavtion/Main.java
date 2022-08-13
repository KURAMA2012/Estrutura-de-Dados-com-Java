package one.digitallinnovavtion;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Carro> listCarros = new ArrayList<>();
		
		listCarros.add(new Carro("Ford"));
		listCarros.add(new Carro("Hondai"));
		listCarros.add(new Carro("Toyota"));
		
		System.out.println(listCarros.contains(new Carro("Toyota")));
		
		System.out.println(listCarros.get(2));
		
		System.out.println(listCarros.indexOf(new Carro("Toyota")));
		
		System.out.println(listCarros.remove(0));
		System.out.println(listCarros);
		
		
	}
}
