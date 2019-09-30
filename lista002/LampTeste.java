

package lista002;
  //import java.util.Scanner;
/**
 *
 * @author macelo
 */
public class LampTeste {

   
    public static void main(String[] args) {
     
      Lamapa lamp1= new Lamapa();
       lamp1.ligada(); 
       lamp1.desligada();
       lamp1.observa();
      
      Lamapa lamp2= new Lamapa();
       lamp2.ligada(); 
       lamp2.desligada();
      
      
   
           if(lamp1.ligada){
        System.out.printf(" a lampada1 esta ligada");
       }else{
      
        System.out.printf(" a lampada1 esta desligada");
        
    }
     if(lamp2.ligada){
        System.out.printf(" a lampada2 esta ligada");
       }else{
      
        System.out.printf(" a lampada2 esta desligada");
        
    }
}
          
}            


              