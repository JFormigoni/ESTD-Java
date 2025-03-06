import estruturas.Vetor;

public class VetorApp {
    
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        vetor.adicionar(21);
        vetor.adicionar(33);
        vetor.adicionar(19);
        vetor.adicionar(22);
        vetor.adicionar(57);

        System.out.println(vetor.getTamanho());
        vetor.mostrarElementos();
    }
}
