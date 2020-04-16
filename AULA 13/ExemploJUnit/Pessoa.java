/**
 * 
 */
public class Pessoa {

   private int idade;
   
   public int getIdade() {
       return this.idade;
   }
   
   public void setIdade(int idade) {
       this.idade = idade;
   }   
   
   public int calcularIdadeMeses() {
       return this.idade * 12;
   }
   
   public int calcularIdadeSemanas() {
       return this.idade * 48;
   }
   
   public double calcularIdadeVirgula() {
       return this.idade * 1.0; //20.0
   }
   
   public int calcularIdadeComRotacaoDaTerra(int rotacaoTerra) {
       return this.idade * rotacaoTerra;
   }
    
   public String calcularIdadeMaisNome(String nome) {
       return nome+this.idade; 
   }
   
}