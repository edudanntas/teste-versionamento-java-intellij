package br.com.edu;


import br.com.edu.models.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();

        System.out.println(gato);

        Livro livro1 = new Livro("A culpa é das estrelas", 700);

        livro1.setNome("Avalanche de amor");

        System.out.println(livro1.getNome());

        /*String nome = "Eduardo";
        Integer idade = 25;
        System.out.println("meu nome é: " + nome + " e tenho: " + idade + " anos");*/
    }
}


class Livro{
    private String nome;
    private Integer nroPaginas;

    public Livro(String nome, Integer nroPaginas) {
        this.nome = nome;
        this.nroPaginas = nroPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(Integer nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", nroPaginas=" + nroPaginas +
                '}';
    }
}