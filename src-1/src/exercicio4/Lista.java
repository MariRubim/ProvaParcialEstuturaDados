package exercicio4;

public class Lista {
	No inicio;
	No fim;
	
	// método para inserir um elemento na lista.
	// a inserção deve manter a lista ordenada (ordem crescente)
	public void inserir(int dado) {
		No aux = new No(dado);
		if(inicio == null) {
			inicio = aux;
			fim = aux;
		} else if (aux.dado < inicio.dado){
			aux.dir = inicio;
			inicio.esq = aux;
			inicio = aux;	
		} else if (aux.dado > fim.dado) {
			fim.dir = aux;
			aux.esq = fim;
			fim = aux;
		} else {
			No aux2 = inicio;
			do {
				if(aux.dado > aux2.dado && aux.dado < aux2.dir.dado) {
					aux.esq = aux2;
					aux.dir = aux2.dir;
					aux2.dir.esq = aux;
					aux2.dir = aux;
					break;
				}
				aux2 = aux2.dir;
			} while(aux2 != null);
			
		}
		
	}
	
	// método para imprimir os elementos da lista
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.dado);
			aux = aux.dir;
		}
	}
}
