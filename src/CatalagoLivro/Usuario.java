package CatalagoLivro;

public class Usuario {

    public static void main(String[] args) {
        LivroRepository livroRepository = new LivroRepository();

        livroRepository.adicionarLivro("casa Branca", "machado de assis", 2020);
        livroRepository.adicionarLivro("casa Branca", "machado de assis", 2020);
        livroRepository.adicionarLivro("A noite é bela", "Nietzs", 1990);


        System.out.println(livroRepository.getLivroList());

        livroRepository.removerLivroTitulo("casa Branca");

        System.out.println(livroRepository.getLivroList());




    }
}
