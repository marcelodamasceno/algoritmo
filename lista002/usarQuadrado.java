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
public class usarQuadrado {
    public static void main(String[] args) {
   
        quadrado q1, q2, q3;

        q1 = new quadrado(2);
        q2 = new quadrado(4);
        q3 = new quadrado(5);

        System.out.println("A área de q1 é: " + q1.area() + " e seu perímetro é :" + q1.perimetro());
        System.out.println("A área de q2 é: " + q2.area() + " e seu perímetro é :" + q2.perimetro());
        System.out.println("A área de q3 é: " + q3.area() + " e seu perímetro é :" + q3.perimetro());
    }
    
}