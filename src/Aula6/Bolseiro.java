package Aula6;
public class Bolseiro extends Aluno {

    private float valorBolsa;

    public Bolseiro(String nome, int cc, Date dataNasc, float valorBolsa) {
        super(nome, cc, dataNasc);
        this.valorBolsa = valorBolsa;
    }

    public float getBolsa() {
        return valorBolsa;
    }

    public void setBolsa(float valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

    @Override
    public String toString() {
        return "Bolseiro{" + "valorBolsa=" + valorBolsa + '}';
    }
    
}