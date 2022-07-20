package fila;

public class Fila<T> {

	private No<T> referenciaNoEntradaFila;

	public Fila() {
		this.referenciaNoEntradaFila = null;
	}

	public void enqueue(T object) {
		No novoNo = new No(object);
		novoNo.setReferenciaNo(referenciaNoEntradaFila);
		referenciaNoEntradaFila = novoNo;
	}

	public T first() {
		if (!this.isEmpty()) {
			No primeiroNo = referenciaNoEntradaFila;
			while (true) {
				if (primeiroNo.getReferenciaNo() != null) {
					primeiroNo = primeiroNo.getReferenciaNo();
				} else {
					break;
				}
			}
			return (T) primeiroNo.getObject();
		}
		return null;
	}

	public T dequeue() {
		if (!this.isEmpty()) {
			No primeiroNo = referenciaNoEntradaFila;
			No noAuxiliar = referenciaNoEntradaFila;
			while (true) {
				if (primeiroNo.getReferenciaNo() != null) {
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getReferenciaNo();
				} else {
					noAuxiliar.setReferenciaNo(null);
					break;
				}
			}
			return (T) primeiroNo.getObject();
		}
		return null;
	}

	public boolean isEmpty() {
		return referenciaNoEntradaFila == null ? true : false;
	}

	@Override
	public String toString() {
		String stringRetorno = "";
		No noAuxiliar = referenciaNoEntradaFila;

		if (referenciaNoEntradaFila != null) {
			while (true) {
				stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]---->";
				if (noAuxiliar.getReferenciaNo() != null) {
					noAuxiliar = noAuxiliar.getReferenciaNo();
				} else {
					stringRetorno += "null";
					break;
				}
			}
		} else {
			stringRetorno = "null";
		}

		return stringRetorno;
	}

}
