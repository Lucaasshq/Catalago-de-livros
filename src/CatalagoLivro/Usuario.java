package CatalagoLivro;

public class Usuario {

    public static void main(String[] args) {
        LivroRepository livroRepository = new LivroRepository();

        livroRepository.adicionarLivro("Dom Casmurro", "machado de assis", 2020);
        livroRepository.adicionarLivro("Dom Casmurro", "machado de assis", 2020);
        livroRepository.adicionarLivro("Assim falou Zaratustra", "nietzsche", 1990);
        livroRepository.adicionarLivro("Livro 1", "Autor 1", 2020);
        livroRepository.adicionarLivro("Livro 1", "Autor 2", 2021);
        livroRepository.adicionarLivro("Livro 2", "Autor 2", 2022);
        livroRepository.adicionarLivro("Livro 3", "Autor 3", 2023);
        livroRepository.adicionarLivro("Livro 4", "Autor 4", 1994);


        System.out.println(livroRepository.pesquisarPorAutor("machado de assis"));
        System.out.println(livroRepository.pesquisarPorTitulo("Assim falou Zaratustra"));
        System.out.println(livroRepository.pesquisarPorIntervaloAno(2020, 2022));




    }
}
