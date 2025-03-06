package estruturas;

public class Vetor {

    private Integer[] elementos;
    private int tamanho;
    private int capacidade;

    public Vetor(int capacidade) {
        this.setElementos(new Integer[capacidade]);
        this.setTamanho(0);
        this.setCapacidade(capacidade);
    }

    public void adicionar(Integer valor){
        if (this.tamanho == this.capacidade) {
            // aumentar a capacidade
            System.out.println("Não é possível adicionar um novo item no vetor");
            return;
        }
        this.elementos[this.getTamanho()] = valor;
        this.tamanho++;
    }

    public void mostrarElementos(){
        for (int i = 0; i < this.tamanho; i++){
            System.out.println(this.elementos[i]);
        }
    }

    public Integer[] getElementos(){
        return this.elementos;
    }

    public void setElementos(Integer[] elementos){
        this.elementos = elementos;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }

    public int numeroProcurado = 22;
}
