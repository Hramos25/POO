package Aula8.ex1;

public class PesadoPassageiros extends Pesado {

    private int nPassageiros;

    public PesadoPassageiros(String matricula, String marca, String modelo, int potenciaCv, int numeroDoQuadro, int peso, int nPassageiros) {
        super(matricula, marca, modelo, potenciaCv, numeroDoQuadro, peso);
        this.nPassageiros = nPassageiros;
    }

    public int getnPassageiros() {
        return nPassageiros;
    }
    
    public void setnPassageiros(int nPassageiros) {
        this.nPassageiros = nPassageiros;
    }

    @Override
    public String toString() {
        return "PesadoPassageiros [ matricula: "+ getMatricula() + ", marca: " + getMarca() + ", modelo: " + getModelo() + ", potênciaCv: " + getPotenciaCv() + ", numero do quadro: " + getNumeroDoQuadro() + ", peso: " + getPeso() +", nPassageiros=" + getnPassageiros() + "]";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        
        final PesadoPassageiros other = (PesadoPassageiros) obj;
        return super.equals(obj) && this.getnPassageiros() == other.getnPassageiros();
    }

    

    
}
