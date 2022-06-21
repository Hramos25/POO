package Testagem_De_Código;


public class Carros {

    private static int stock = 5;
    private int ID;
    private String Marca;
    private String matricula;
    private int Total_Now;

   public Carros (String Marca, String Matricula){
    this.ID = stock++;
    this.Marca = Marca;
    this.matricula = Matricula;
   } 
    

   public Carros (String Marca) {
    this.ID = stock++;
    this.Marca = Marca;
   }

   public Carros() {

   }

   public int getstock() {
        return this.ID;
   }

   public String getMarca() {
        return this.Marca;
   }

   public String getMatricula() {
        return this.matricula;
   }

   public int Total_Now() {
        return this.Total_Now;
   }

   public void setMarca(String Marca) {
        this.Marca = Marca;
   }

   public void setMatricula(String Matricula) {
          this.matricula = Matricula;
   }


     public void setTotal_Now(int Total_Now) {
            this.Total_Now = Total_Now;
     }

     public String toString() {
            return "Carro " + this.ID + "; " + this.Marca + "; " + this.matricula + "; " + this.Total_Now;

     }



}
