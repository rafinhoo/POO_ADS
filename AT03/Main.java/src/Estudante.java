public class Estudante {

    private String nome;
    private int matricula;
    private String endereco;
    private double[] notas;

    public Estudante (final String nome, final int matricula, final String endereco, final double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.endereco = endereco;
        this.notas = notas;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(final int matricula) {
        this.matricula = matricula;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(final String endereco) {
        this.endereco = endereco;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public void setNotas(final double[] notas) {
        this.notas = notas;
    }

    double calcularMedia() {
        double soma = 0;
        for (final double nota : notas) {
            soma+=nota;
        }
        final double media = soma / notas.length;
        return media;
    }
}