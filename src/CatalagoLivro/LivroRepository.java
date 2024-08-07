package CatalagoLivro;

import java.util.ArrayList;
import java.util.List;

public class LivroRepository {

   private List<Livro> livroList;

    public LivroRepository() {
        this.livroList = new ArrayList<Livro>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        this.livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAno(int anoInicial, int anoFinal) {
        List<Livro> livrosPorAno = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorAno.add(l);
                }

            }
        }
        return livrosPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for (Livro l : livroList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                }
            }
        }
        return livroPorTitulo;
    }

    public void removerLivroTitulo(String titulo) {
        List<Livro> livrosRemover = new ArrayList<Livro>();
        for (Livro l : livroList) {
            if(l.getTitulo().equalsIgnoreCase(titulo)) {
                livrosRemover.add(l);
            }
        }
        livroList.removeAll(livrosRemover);
    }

    public List<Livro> getLivroList() {
        return livroList;
    }





}
