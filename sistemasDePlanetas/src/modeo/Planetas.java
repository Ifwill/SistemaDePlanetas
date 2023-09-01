package modeo;

public class Planetas {
	private String nome;
	private int id;
	static int incremento;

	public Planetas(String nome) {
		this.nome = nome;
		this.id = ++incremento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

}
