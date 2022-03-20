
public class Main {
	public static void main(String[] args) {
		ArvoreBinaria arv = new ArvoreBinaria();
		arv.insere(10,"A");
		arv.insere(5,"B"); 
		arv.insere(9,"C"); 
		arv.insere(2,"D");
		arv.insere(7,"E");
		arv.insere(12,"F"); 
		arv.insere(6,"G");
		arv.insere(8,"H");
		arv.insere(15,"F"); 
		arv.insere(4,"G");
		arv.insere(1,"H");
		
		arv.imprime();
		
		System.out.println("Número do nos a esquerda "+ arv.totalNosEsquerda());
		
		System.out.println("\n --------------------------------");
		System.out.println("Exercício B \n");
		
		ArvoreBinariaPerguntaB arvB = new ArvoreBinariaPerguntaB();
		
		arvB.insere(555,"A");
		arvB.insere(333,"B"); 
		arvB.insere(111,"C"); 
		arvB.insere(444,"D");
		arvB.insere(888,"E");
		arvB.insere(999,"F"); 
		
		arvB.imprimeElementosArvore();
		
		System.out.println("Altura da arvore " + arvB.alturaArvore());
		System.out.println("Alinhado a esquerda "+ arvB.totalEsquerda());
		
	}

}
