package CatalagoLivro;

public class Usuario {

    public static void main(String[] args) {
        LivroRepository livroRepository = new LivroRepository();

        livroRepository.adicionarLivro("Dom Casmurro", "machado de assis", 2020);
        livroRepository.adicionarLivro("Dom Casmurro", "machado de assis", 2020);
        livroRepository.adicionarLivro("Assim falou Zaratustra", "nietzsche", 1990);


        System.out.println(livroRepository.getLivroList());

        livroRepository.removerLivroTitulo("Dom Casmurro");
        
        System.out.println(livroRepository.getLivroList());




    }
}
