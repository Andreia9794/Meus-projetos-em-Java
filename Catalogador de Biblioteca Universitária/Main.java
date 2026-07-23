public class Main {
    public static void main(String[] args) {
        Acervo acervoFaculdade = new Acervo();

        System.out.println("=== CATALOGAÇÃO DE LIVROS - BIBLIOTECA DA FACULDADE ===\n");

        // Cadastrando livros de ADS
        acervoFaculdade.cadastrarLivro(new Livro("Entendendo Algoritmos", "Aditya Bhargava", Categoria.PROGRAMACAO));
        acervoFaculdade.cadastrarLivro(new Livro("Clean Code", "Robert C. Martin", Categoria.ENGENHARIA_SOFTWARE));
        acervoFaculdade.cadastrarLivro(new Livro("Sistemas de Banco de Dados", "Elmasri & Navathe", Categoria.BANCO_DE_DADOS));

        // Consultando acervo por área
        acervoFaculdade.listarPorCategoria(Categoria.PROGRAMACAO);
        acervoFaculdade.listarPorCategoria(Categoria.BANCO_DE_DADOS);
    }
}