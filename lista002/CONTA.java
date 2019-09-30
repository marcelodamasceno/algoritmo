/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista002;
import java.util.Scanner;
/**
 *
 * @author macelo
 */
public class CONTA {

     String Titular;
     int conta;
    
    double saldo;
  String Agencia;
  Scanner sc = new Scanner(System.in);
 
  

    void Conta(String Titular,String Agencia){
        this.Titular = Titular;
      this.Agencia = Agencia;
        this.conta = 0;
    
        saldo = 0;
     // this.saques=0;
    }

    
    void dadosbancarios(String Titular){
        System.out.println("\t");
        System.out.println("Titular : " + this.Titular); 
      System.out.println("Agencia: " + this.Agencia);
        System.out.println("Número da conta: " + this.conta);
        System.out.printf("Saldo atual:  " +this.saldo);
        System.out.println("----\n fim dados bancarios---");
          
  
   
    }
  
  
    void extrato(){
        System.out.println("\t EXTRATO");
        System.out.println("Nome: " + this.Titular);
        System.out.println("Número da conta: " + this.conta);
        System.out.printf("Saldo atual: %.2f\n",this.saldo);
    }

  void sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            saldo++;
            System.out.println("Sacado: " + valor);
            System.out.println("Novo saldo: " + saldo + "\n");
        } else {
            System.out.println("Saldo insuficiente. Faça um depósito\n");
        }
    }

  void depositar(double valor)
    {
        saldo += valor;
        System.out.println("Depositado: " + valor);
        System.out.println("Novo saldo: " + saldo + "\n");
    }
 

public void imprimirEstado(){

System.out.println("\n Titular: " +Titular);
System.out.println("\n Conta: " +conta);
System.out.println("\n Agncia: " +Agencia);
System.out.println("\n Saldo: " +saldo);

}


}

     


