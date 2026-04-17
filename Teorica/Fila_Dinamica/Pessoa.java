package Teorica.Fila_Dinamica;

public class Pessoa {
   private String nome;
   private int anoN; 
   public Pessoa(String nome, int anoN){
    this.nome = nome;
    this.anoN = anoN;
   }
   @Override
   public String toString() {
    return "Pessoa [nome=" + nome + ", anoN=" + anoN + "]";
   }
   
}
