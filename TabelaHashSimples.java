public class TabelaHashSimples {
    int[] tabela = new int[10];
    private int funcaoHash(int chave) {
        return chave % 10;
    }

    public void inserir(int chave) {
        int indice = funcaoHash(chave);
        tabela[indice] = chave;
    }

    public boolean buscar(int chave) {
        int indice = funcaoHash(chave);
        return tabela[indice] == chave;
    }

    public void remover(int chave) {
        int indice = funcaoHash(chave);
        if (tabela[indice] == chave) {
            tabela[indice] = 0;
        }
    }

    public void imprimirTabela() {
        for (int i = 0; i < tabela.length; i++) {
            System.out.println("Posição " + i + ": " + tabela[i]);
        }
    }
}
