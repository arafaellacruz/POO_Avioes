package POO;

public class TesteAviao {
	public static void main(String[] args) {
		
		/*
		 *  Estanciar seria puxar a Classe que voc� criou para onde voc� vai executar
		 *   (onde tem o main), e ai voc� tem que criar um "novo nome" pra classe, mas 
		 *   somente o nome sera mudado, ela vai respeitar tudo que voc� criou dentro do Pessoa
		 */

		Aviao Plane = new Aviao ("Turbinexx","m�dio","2000");
		Plane.imprimirInfo();
	}

}
