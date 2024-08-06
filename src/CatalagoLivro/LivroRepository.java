package CatalagoLivro;

import java.util.ArrayList;
import java.util.List;

public class LivroRepository {

   private List<Livro> livroList;

    public LivroRepository(List<Livro> livroList) {
        this.livroList = new ArrayList<Livro>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        this.livroList.add(new Livro(titulo, autor, anoPublicacao));
    }


}
