package fila;

public class Main {
	public static void main(String[] args) {
		
		Fila<String> minhaFila = new Fila<>();
		
		minhaFila.enqueue("primeiro");
		minhaFila.enqueue("segundo");
		minhaFila.enqueue("terceiro");
		minhaFila.enqueue("quarto");
		minhaFila.enqueue("quinto");
		System.out.println(minhaFila);
		
		minhaFila.dequeue();
		
		System.out.println(minhaFila);
	}
}
