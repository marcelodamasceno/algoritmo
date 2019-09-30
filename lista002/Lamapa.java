/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista002;

/**
 *
 * @author macelo
 */
public class Lamapa {
  
      boolean ligada;
     boolean desligada;
    
      void ligada(){
     ligada = true;
      //system.out.printf("a lampada esta ligada")
    }
    
    void desligada(){
      ligada = false;
  // system.out.printf("a lampada esta desligada")
    }
    
    void observa(){
             if(ligada){
         ligada();
       }else{
          desligada();
             } 
             
         
    }
}

