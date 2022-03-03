package POO;

public class Aviao {
	
	/*Crie uma classe avi�o e apresente os atributos e m�todos referentes
	 * esta classe, em seguida crie um objeto avi�o, defina as instancias deste
	 * objeto e apresente as informa��es deste objeto no console.
	 */ 
	 //Moderadores de acesso: private, public e protect, define o acesso de outras classes aos atributos.
	private String nomeDoAviao;
	private String porte;
	private String ano; // Em casos que a variavel pode ser somada ou multiplicada, o ideal � declarar como Int ou Float.
	
	//O m�todo construtor abaixo, sempre ter� o mesmo nome da Classe; que recebe o mesmo nome da Classe e consigo passar o formato dos dados que queremos que o usuario passe;
	public Aviao (String nomeDoAviao,String porte,String ano) {
		this.nomeDoAviao = nomeDoAviao;
		this.porte = porte;
		this.ano = ano;
	}
	// get
	// set imputar valor, atribuir valor, colocar dado ao atributo.
	public void imprimirInfo() {
		System.out.println("O avi�o "+nomeDoAviao+ " tem o porte "+porte+ " e foi fabricado no ano "+ano+".");
	}

	public String getNomeDoAviao() {
		return nomeDoAviao;
	}

	public void setNomeDoAviao(String nomeDoAviao) {
		this.nomeDoAviao = nomeDoAviao;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	

}
