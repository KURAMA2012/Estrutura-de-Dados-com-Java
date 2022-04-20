package one.digitalinnovation;

public class Pilha {
	
	private No referenciaEntradaPilha;
	
	public Pilha() {
		this.referenciaEntradaPilha = null;
	}
	
	public void push(No novoNo) {
		No referenciaAuxiliar = referenciaEntradaPilha;
		referenciaEntradaPilha = novoNo;
		referenciaEntradaPilha.setReferenciaNo(referenciaAuxiliar);
		 
	}
	
	public No pop() {
		if(!this.isEmpty()) {
			No noPeped = referenciaEntradaPilha;
			referenciaEntradaPilha = referenciaEntradaPilha.getReferenciaNo();
			return noPeped;
		}
		return null;
	}
	
	public No top()  {
		return referenciaEntradaPilha;
	}
	
	public boolean isEmpty() {
		
		if(referenciaEntradaPilha == null) {
			return true;
		}
		
		return false;
	}
}
