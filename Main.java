public class Main {
    public static void main(String[] args) {
        StaticStack<Integer> pilha = new StaticStack<>(5);

        System.out.println("Empilhando elementos na pilha:");
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);

        try {
            pilha.push(60);
        } catch (StackOverflowError e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Desempilhando elementos da pilha:");
        while (!pilha.isEmpty()) {
            System.out.println("Elemento desempilhado: " + pilha.pop());
        }

        try {
            pilha.pop();
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Empilhando novamente elementos na pilha:");
        pilha.push(100);
        pilha.push(200);
        System.out.println("Limpando a pilha.");
        pilha.clear();

        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.println("A pilha não está vazia.");
        }

        Fila<Integer> fila = new Fila<>(5);

        System.out.println("\nAdicionando elementos na fila:");
        fila.add(10);
        fila.add(20);
        fila.add(30);
        fila.add(40);
        fila.add(50);

        try {
            fila.add(60);
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Removendo elementos da fila:");
        while (!fila.isEmpty()) {
            System.out.println("Elemento removido: " + fila.remove());
        }

        try {
            fila.remove();
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Adicionando novamente elementos na fila:");
        fila.add(100);
        fila.add(200);
        System.out.println("Limpando a fila.");
        fila.clear();

        if (fila.isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.println("A fila não está vazia.");
        }
    }
}
