public class Principal {

    public static void main(String args[]) {
        
        System.out.println("\f");
        
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(30);
        System.out.println(pessoa.calcularIdadeMeses());
        
    }
    
}