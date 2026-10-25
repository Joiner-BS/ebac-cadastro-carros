import java.util.Scanner;

public class CadastroCarros {

    // Ponto de entrada do programa.
    public static void main(String[] args) {

        // Prepara a leitura dos dados pelo teclado.
        Scanner scanner = new Scanner(System.in);

        // Reserva 50 posições para referências a objetos Carro.
        Carro[] carros = new Carro[50];

        // Recebe a quantidade de carros que o usuário deseja cadastrar.
        System.out.println("Quantos carros deseja cadastrar? De 1 a 50:");
        int quantidade = scanner.nextInt();

        // Solicita outra quantidade enquanto ela estiver fora do intervalo.
        while (quantidade < 1 || quantidade > carros.length) {
            System.out.println("Quantidade inválida. Digite um número de 1 a 50:");
            quantidade = scanner.nextInt();
        }

        // Confere a quantidade aceita.
        System.out.println("Quantidade de carros a cadastrar: " + quantidade);

        // Consome a quebra de linha deixada pela leitura da quantidade.
        scanner.nextLine();

        // Cadastra somente a quantidade de carros solicitada.
        for (int i = 0; i < quantidade; i++) {

            System.out.println("Cadastro do carro " + (i + 1) + ":");

            // Cria um novo objeto em cada repetição.
            Carro carro = new Carro();

            // Recebe o nome ou modelo, incluindo eventuais espaços.
            System.out.println("Digite o nome do carro:");
            carro.nome = scanner.nextLine();

            // Recebe o preço do carro.
            System.out.println("Digite o preço do carro:");
            carro.preco = scanner.nextDouble();

            // Consome a quebra de linha antes da próxima leitura de texto.
            scanner.nextLine();

            // Guarda a referência do objeto na posição atual do vetor.
            carros[i] = carro;

            // Confirma os dados cadastrados.
            System.out.println("Carro cadastrado: " + carro.nome
                    + " | Preço: " + carro.preco);
        }

        // Acumula a soma dos preços dos carros cadastrados.
        double totalPrecos = 0;

        System.out.println();
        System.out.println("Resumo dos carros cadastrados:");

        // Percorre somente as posições preenchidas do vetor.
        for (int i = 0; i < quantidade; i++) {

            // Exibe o nome do carro armazenado na posição atual.
            System.out.println((i + 1) + " - " + carros[i].nome);

            // Acrescenta o preço desse carro ao total.
            totalPrecos += carros[i].preco;
        }

        // Exibe a quantidade cadastrada e a soma dos preços.
        System.out.println("Quantidade total de carros: " + quantidade);
        System.out.printf("Soma dos preços: R$ %.2f%n", totalPrecos);

        // Fecha o leitor após concluir as entradas desta etapa.
        scanner.close();
    }
}