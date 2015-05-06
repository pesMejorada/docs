#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{  
    //declaracion de variables
    float a;
    float b;
    float c;
    float x1;
    float x2;
    
    float subRadical ;
    
    
    // Entrada de datos
    printf("\n ECUACIONES CUADRATICAS \n\n");
    printf("\n Coeficiente a: "); scanf("%f", &a);
    printf("\n Coeficiente b: "); scanf("%f", &b);
    printf("\n Coeficiente c: "); scanf("%f", &c);
    //Proceso  y salida
    subRadical= b*b - 4*a*c;
    if(subRadical<0)
    { 
       printf("\nSoluciones imaginarias.\n");
                    
    }
   else
   {  
    x1= -b + sqrt(subRadical)/(2*a);
    x2= -b - sqrt(subRadical)/(2*a);
    printf("\nx1 : %f " , x1);
    printf("\nx2 : %f " , x2);
    } 
  
  system("PAUSE");	
  return 0;
}
