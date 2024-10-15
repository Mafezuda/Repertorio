public class MainHash {
    public static void main(String[] args) {
        TabelaHashSimples hash = new TabelaHashSimples();
        int[] valores = {12, 25, 37, 41, 53, 64, 78, 89};
        for (int valor : valores) {
            hash.inserir(valor);
        }
        hash.imprimirTabela();
        System.out.println("Buscar 25: " + hash.buscar(25));
        hash.remover(25);
        System.out.println("Buscar 25 após remoção: " + hash.buscar(25));
        hash.imprimirTabela();
    }
}
