package dao;

import java.util.ArrayList;

import modeo.Planetas;

public class PlanetasDAO {
	private ArrayList<Planetas> listaDePlanetas;

	public PlanetasDAO() {
		listaDePlanetas = new ArrayList<Planetas>();
	}

	public void adicionarPlanetas(String nome) {
		Planetas planetas = new Planetas(nome);
		listaDePlanetas.add(planetas);

	}

	public boolean removerPlanetas(String nome) {
		for (Planetas i : this.listaDePlanetas) {
			if (i.getNome().equalsIgnoreCase(nome)) {
				listaDePlanetas.remove(i);
				return true;
			}
		}
		return false;
	}

	public void limparLista() {
		listaDePlanetas.clear();
	}

	public ArrayList<Planetas> exibirLista() {
		return listaDePlanetas;
	}

}
