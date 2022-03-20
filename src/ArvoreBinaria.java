
public class ArvoreBinaria {
	 private No raiz;
	 
	 Integer esquerda = 0;
	  
	  public void insere(long id, Object elemento){
	    No novoNo = new No(id,elemento,null,null);
	    if (raiz == null) {
	      raiz = novoNo;
	    } else {
	      No atual = raiz; No pai;
	      while (true) {
	        pai = atual;
	        
	        if (id < atual.getId()) {
	          atual = atual.getEsq();
	          
	          if (atual == null) {
	            pai.setEsq(novoNo);
	            return;
	          }
	        } else {      
	          atual = atual.getDir();
	          
	          if (atual == null) {
	            pai.setDir(novoNo);
	            return;
	          }
	        }
	      }
	    }
	  }
	  
	  public void preFixado(No atual){
	    if (atual != null) {
	      System.out.println("Id: "+atual.getId()+" Elemento: "+atual.getElemento());
	      preFixado(atual.getDir());
		  preFixado(atual.getEsq());
			if(atual.getEsq() != null){		
				esquerda++;
			}		
	    }
	  }
	  

	public long calcEsquerda(No atual, long a){
	    if (atual != null) {
	        long e;
	        e = calcEsquerda(atual.getEsq(),a)+1;
	        return a+e;
	    }
	    return a;
	}
	
	public void imprime(){
		preFixado(raiz);
	} 

	public long totalNosEsquerda(){
		long a = 0;
		return calcEsquerda(raiz, a);
	 }
}
