public class Main {
    public static void Main(String[] args) {
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
    }
}