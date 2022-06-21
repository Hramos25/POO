package Aula8.ex1;

public class AutomovelLigeiro extends Automovel {

    private String tipo;
    private int bagageira;

    public AutomovelLigeiro(String matricula, String marca, String modelo, int potenciaCv, int numeroDoQuadro, int bagageira) {
        super(matricula, marca, modelo, potenciaCv, numeroDoQuadro);
       
    }

    public int getbagageira() {
        return bagageira;
    }

    public void setbagageira(int bagageira) {
        this.bagageira = bagageira;
    }

    @Override
    public String toString() {
        return "Automovel Ligeiro {" + "matricula: " + getMatricula() + ", marca: " + getMarca() + ", modelo: " + getModelo() + ", potenciaCv: " + getPotenciaCv() + ", numero do quadro:  " + getNumeroDoQuadro() + ", tipo: " + tipo + ", bagageira: " + bagageira + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final AutomovelLigeiro other = (AutomovelLigeiro) obj;
        return super.equals(obj) && this.getbagageira() == other.getbagageira();
    }
    
}
