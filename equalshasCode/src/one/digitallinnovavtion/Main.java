package one.digitallinnovavtion;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Carro> listaCarros = new ArrayList<>();
		
		
		// hashCode: 2195706
		listaCarros.add(new Carro("Ford"));
		
		// hashCode: -2127781340
		listaCarros.add(new Carro("Hondai"));
		
		// hashCode: 73425139
		listaCarros.add(new Carro("Linux"));
		
		// hashCode: -2018788868
		listaCarros.add(new Carro("Linux1"));
		
		System.out.println("HashCode: " + listaCarros.get(3).hashCode());
		System.out.println("Marca: " + listaCarros.get(3).marca);
		
		Carro carro1 = new Carro("Ford");
		Carro carro2 = new Carro("Hondai");
		
		System.out.println(carro1.equals(carro2));

	}

}
