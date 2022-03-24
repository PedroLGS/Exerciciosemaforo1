package view;

import java.util.concurrent.Semaphore;
import controller.PortaController;

public class Principal {

	public static void main(String[] args) {
		int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);

		for (int ThreadId = 1; ThreadId < 5; ThreadId++) {
			Thread pessoa = new PortaController(ThreadId, semaforo);
			pessoa.start();
		}
	}

}