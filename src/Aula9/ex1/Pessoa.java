package Aula9.ex1;
import Aula7.Date;

public class Pessoa {

    public String nome;
    public int cc;
    public Date dataNasc;

    public Pessoa(String nome, int cc, Date dataNasc) {
        this.nome = nome;
        this.cc = cc;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }
    public int getCc() {
        return cc;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cc=" + cc + ", dataNasc=" + dataNasc + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        
        final Pessoa other = (Pessoa) obj;
        return this.cc == other.cc && this.nome.equals(other.nome) && this.dataNasc.equals(other.dataNasc);


    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + cc;
        result = prime * result + ((dataNasc == null) ? 0 : dataNasc.hashCode());
        return result;
        
    }
    
}
