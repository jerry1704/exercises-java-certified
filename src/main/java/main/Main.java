package main;

import util.ICalculadora;

public class Main {
  
  public static void main(String[] args) {
    
    //ICalculadora  calculador = (n)->System.out.println("Bienvenido con las expresiones lambda  "+n);
    //calculador.mensaje("Gerardo");
    
    ICalculadora  calculadora = (num1, num2)->{
                                  double resultado = num1 + num2 ;
                                  System.out.println("La suma es : " + resultado);      
                                 }; 
    
    calculadora.operacion(3, 2);

  }
  
}
