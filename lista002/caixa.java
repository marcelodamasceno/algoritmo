
package lista002;
import java.util.Scanner;


public class caixa {




    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
       String nome;
               
       int conta, saques;
       int opcao; 
     double saldo,inicial,valor;
       String Agencia ;
      System.out.printf("\n digite o titular da conta: ");
    nome = sc.nextLine();
    System.out.printf("\n digite o da Agencia da conta: ");
    Agencia = sc.nextLine();
   
    
      
      CONTA caixa = new CONTA();
      caixa.Titular = nome;
      caixa.conta = 5698;
      caixa.saldo =  0;
      caixa.Agencia = Agencia ;
      
      
        
   
        
         
      do{
        
      System.out.println("\t opção ");
        System.out.println("1 - dados bancarios");
        System.out.println("2 - Extrato");
        System.out.println("3 - Sacar");
        System.out.println("4 - Depositar");
        System.out.println("0 - Sair\n");
        
        
        System.out.print("Opção: ");
        opcao = sc.nextInt();
              
         if(opcao == 1){
         caixa.dadosbancarios(nome);
          
         }else if(opcao ==2){
             System.out.println("digite o valor do saque: ");
             valor = sc.nextDouble();
             caixa.sacar(valor);
         }else if (opcao == 3){
             System.out.println("digite o valor do deposito: ");
             valor = sc.nextDouble();
              caixa.depositar(valor);
         }
       }while(opcao != 0);
    }
}
         
         
      
    

   



