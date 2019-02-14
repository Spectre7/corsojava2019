package hello;

public class User {
	private String nome;
	
	public User(String nome) {
		super();
		this.nome = nome;
	}

	public User() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
