#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{/*
	Pedir un número e indicar si es positivo o negativo
   
  */
    
  //Declaracion de variables  
  int numero;
  
  
  
  //entrada de datos
    printf("\nTeclee un numero :  ");
    scanf("%d", &numero);
   
  
  
  //proceso y salida
  if(numero>0)
  {
     printf("\nEs positivos!! \n");
  }
  else
  {  if(numero==0)
      {
        printf("\nEs cero\n");
      }
      else
      {
        printf("\nEs negativo\n");
      }
  }
  
  
  
  
  system("PAUSE");	
  return 0;
}
