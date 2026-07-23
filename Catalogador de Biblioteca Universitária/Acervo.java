import java.util.ArrayList;
import java.util.List;

public class Acervo {
    private List<Livro> livros = new ArrayList<>();

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro '" + livro.getTitulo() + "' catalogado com sucesso!");
    }

    public void listarPorCategoria(Categoria cat) {
        System.out.println("\n--- LIVROS DA CATEGORIA: " + cat + " ---");
        for (Livro l : livros) {
            if (l.getCategoria() == cat) {
                System.out.println("• " + l.getTitulo() + " (Autor: " + l.getAutor() + ")");
            }
        }
    }
}