
package lista002;

 import java.util.Scanner;


public class Quadrado03{
 Scanner sc = new Scanner(System.in);
     double lado,area,perimetro;
  
       
    
    double area(){
        
        area = lado*lado;
        
        return area;
    }
     double Perimetro(){
        
        perimetro = 4*lado;
        
        return perimetro;
    }
     
    void imprimirArea(){
        
        System.out.println("O quadrado do lado: "+lado+"\n area: "+area()+"\n Perimetro: "+Perimetro());
                
                
    }
    
    void ladodoQuadrado(){
      System.out.printf("Informe do valor do lado do quadrado");
        lado = sc.nextDouble();
    }
    
}


