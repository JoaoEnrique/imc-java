package Padrao;
import java.util.Scanner;


public class CalculoIMC
{
   public static void main(String[] args) 
   {//dclaração de variaveis
      Scanner teclado = new Scanner(System.in);
      float peso, altura;
      float IMC;
      String nome, classificacao;
 
      System.out.println(">>> Calcule o seu IMC!");
      System.out.println("");
      System.out.print("Informe seu nome: ");
      nome = teclado.nextLine();
      System.out.print(nome + " Informe o seu peso (kg): ");
      peso = teclado.nextFloat();
      System.out.print(nome + " Informe a sua altura (m): ");
      altura = teclado.nextFloat();
  
      IMC = calcularIMC(peso,altura);
      classificacao = resultadoIMC(IMC);
      System.out.println("");
      
      System.out.printf(nome + " Seu IMC é: %.1f - %s\n",IMC,classificacao);//mostrar resultado e classificacao
   } 
 
   
   static float calcularIMC(float p, float h)//calcular o imc
   {
      return p/(h*h);
   }

   
   //Declaração if e else
   static String resultadoIMC(float imc)//calcular a classificaco
   {
      String result;
      if (imc < 18.5)
         result = "Você está abaixo do peso";
      else
         if (imc <= 25)
            result = "Você está com o peso normal";
         else
            if (imc <= 30)
               result = "Você está com sobrepeso";
            else
               if (imc <= 35)
                  result = "Você tem obesidade Grau I";
               else
                  if (imc <= 40)
                    result = "Você tem obesidade Grau II"; 
                        else
                            result = "Você tem obesidade Grau III ou Mórbida";
      
      return result;
   }
}