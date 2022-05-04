package exercicio2;

public class Fila {

	No inicio, fim;
	
	// m�todo para inserir um elemento no final da fila (enfileirar)
	public void enfileirar(Motorista motorista) {
		No aux = new No(motorista);
		if(inicio == null) {
			inicio = aux;
		} else {
			aux.esq = fim;
			fim.dir = aux;
		}
		fim = aux;
	}
	
	// m�todo para desenfileirar um elemento da fila, ou seja, remover o primeiro elemento
	public void desenfileirar() {
		if(inicio == null) {
			System.out.println("N�o possuem mais motoristas na fila de espera");
		} else {
			if (inicio.dir != null) {
				inicio = inicio.dir;
				inicio.esq = null;
			}
			else {
				inicio = null;
			}
		}
	}  
	
	// m�todo para exibir os dados (nome e placa) dos motoristas
	public void mostrarDados() {
		for(No i = inicio; i != null ; i = i.dir) {
			System.out.println("Nome do motorista: " + i.motorista.getNome() + "\nPlaca do carro: " + i.motorista.getPlaca() + "\n");
		}
	}
}
