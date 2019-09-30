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
public class quadrado {

    double lado;

    public quadrado(double lado) {
        this.lado = lado;
    }

    public double area() {
        return lado * lado;
    }

    public double perimetro() {
        return 4 * lado;
    }

}