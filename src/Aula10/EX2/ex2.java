package Aula10.EX2;

public class ex2 {
    public static void main(String[] args) {
        Termos2 t = new Termos2();

        t.add("termo1", "definicao1");
        t.add("Que tem a cor da neve", "Descorado, pálido", "Cor de leite");
        t.add("azul", "Cor do céu", "Cor da água");
        t.add("azul", "cor azul", "Cor do céu");
        t.remove("Que tem a cor da neve");
        System.out.println(t);

        t.removeDefinicao("azul", "Cor do céu");
        t.addDefinicao("Azul", "Cor da água 2");

        System.out.println(t);

        System.out.println(t.randomDefinicao("azul"));

    }


    
}
