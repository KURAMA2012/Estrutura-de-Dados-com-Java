package fila;

public class No<T> {

	private T object;
	private No<T> referenciaNo;

	public No() {

	}

	public No(T object) {
		this.referenciaNo = null;
		this.object = object;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

	public No getReferenciaNo() {
		return referenciaNo;
	}

	public void setReferenciaNo(No referenciaNo) {
		this.referenciaNo = referenciaNo;
	}

	@Override
	public String toString() {
		return "No [object=" + object + "]";
	}

}
