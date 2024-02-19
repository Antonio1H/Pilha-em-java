public class PilhaEstatica {
    
    public int[] elementos;
    public int tamanho;
    public int topo;

    public PilhaEstatica(int tamanho){
        this.elementos = new int[tamanho];
        this.tamanho = tamanho;
        topo = 0;
    }

    public void push(int valor){
        if(!cheio(valor, valor)){
            elementos[topo] = valor;
            topo++;
        }else{
            throw new IllegalStateException(" pilha cheia ");
        }
    }

    public Integer pop(){
        if(isEmpty()){
            throw new IllegalStateException(" pilha vazia ");
        }
        this.topo--;
        Integer valorRetirado = this.elementos[this.topo];

        return valorRetirado;
    }

    public boolean isEmpty(){
        return topo == 0;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia");
        }
        return this.elementos[this.topo - 1];
    }

    public boolean cheio(int tamanho, int topo){
        return this.tamanho == this.topo;
    }
}
