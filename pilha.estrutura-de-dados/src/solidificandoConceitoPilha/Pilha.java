package solidificandoConceitoPilha;

public class Pilha {
	//Declarando o array
	public Object[] pilha;
	
	//Vari�vel para armazenar a posi��o atual na pilha
	public int posicaoPilha;
	
	public Pilha() {
		this.posicaoPilha = -1;
		// indica que esta nula, vazia, pois a posi��o zero
		//do array j� armazena informa��o
		this.pilha = new Object[10]; // criando uma pilha com 10 posi��es
	}
	
	// Fun��o para verificar se a pilha est� vazia
	public boolean pilhaVazia() {
		if (this.posicaoPilha == -1) {
			return true;
		}
		return false;
	}
	
	//Fun��o que retorna a quantidade de itens na pilha
	public int tamnhoDaPilha() {
		if(this.pilhaVazia()) {
			return 0;// aqui indica que n�o tem nenhum conte�do dentro da pilha
		}
		return this.posicaoPilha + 1;
	}
	
	//Fun��o para empilhar itens
	public void empilhar(Object valor) {
		//push
		if(this.posicaoPilha < this.pilha.length -1){
			this.pilha[++posicaoPilha] = valor;
		}
	}

	//Fun��o para remover itens da lista
	public Object desempilhar() {
		//pop
		if(pilhaVazia()) {// primeiro verificamos se a pilha esta vazia,
			return null;//se estiver, nada ser� realizado
		}
		return this.pilha[this.posicaoPilha--];
	}
	
	public static void main(String[] args) {
		Pilha p = new Pilha();
		p.empilhar("Portuguesa");
		p.empilhar("Frango com catupiry");
		p.empilhar("Calabresa ");
		p.empilhar("Quatro queijos");
		p.empilhar("Frango com Pasta de Creme");
		p.empilhar("Frango sem Pasta de Creme");
		p.empilhar("Calabresa ");
		
		while (p.pilhaVazia() == false) {
            System.out.println(p.desempilhar());
            System.out.println(p.tamnhoDaPilha());
        }
	}
}
