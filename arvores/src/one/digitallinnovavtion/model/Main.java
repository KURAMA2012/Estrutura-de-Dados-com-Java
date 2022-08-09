package one.digitallinnovavtion.model;

import one.digitallinnovavtion.ArvoreBinaria;

public class Main {

	public static void main(String[] args) {
		
		ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<>();
		
		minhaArvore.inserir(new Obj(13));
		minhaArvore.inserir(new Obj(10));
		minhaArvore.inserir(new Obj(25));
		minhaArvore.inserir(new Obj(2));
		minhaArvore.inserir(new Obj(12));
		minhaArvore.inserir(new Obj(20));
		minhaArvore.inserir(new Obj(31));
		minhaArvore.inserir(new Obj(29));
		
		minhaArvore.exibirInOrdem();
		minhaArvore.exibirPreOrdem();
		minhaArvore.exibirPosOrdem();
		
		minhaArvore.remover(new Obj(20));

		minhaArvore.exibirInOrdem();
		minhaArvore.exibirPreOrdem();
		minhaArvore.exibirPosOrdem();
		

		

	}

}
