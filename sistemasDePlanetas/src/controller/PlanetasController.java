package controller;

import java.util.ArrayList;

import dao.PlanetasDAO;
import modeo.Planetas;
import view.PlanetasView;

public class PlanetasController {
	private PlanetasView planetasView;
	private PlanetasDAO planetasDAO;

	public PlanetasController() {
		planetasView = new PlanetasView();
		planetasDAO = new PlanetasDAO();
	}

	public void start() {
		int op = 5;
		do {
			switch (planetasView.menu()) {
			case 1:
				adicionarPlanetas();
				break;
			case 2:
				removerPlanetas();
				break;
			case 3:
				exibirLista();
				break;
			case 4:
				limparLista();
				break;
			}
			if (op > 4) {
				planetasView.opcaoErrada();
			}

		} while (op != 0);

	}

	public void adicionarPlanetas() {
		planetasDAO.adicionarPlanetas(planetasView.nome());
	}

	public void removerPlanetas() {
		planetasDAO.removerPlanetas(planetasView.nome());
		planetasView.recadoRemove();
	}

	public void limparLista() {
		planetasDAO.limparLista();
	}

	public void exibirLista() {
		ArrayList<Planetas> listaDePlanetas = planetasDAO.exibirLista();
		planetasView.exibirLista(listaDePlanetas);
	}

}
