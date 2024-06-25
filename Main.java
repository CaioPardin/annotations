package br.com.cpardin;


public class Main {


    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setNome("Alice");
        cliente.setEmail("alice@example.com");

        // Acessando as colunas da tabela
        Tabela tabela = Cliente.class.getAnnotation(Tabela.class);
        String[] colunas = tabela.colunas();
        System.out.println("Colunas da tabela de clientes:");
        for (String coluna : colunas) {
            System.out.println(coluna);
        }
    }
}
