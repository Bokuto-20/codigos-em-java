Algoritmo "MeuNome"
// Disciplina   : [Linguagem e L�gica de Programa��o] 
// Professor   : Antonio Carlos Nicolodi 

Var
  a, b, c, x1, x2, delta:real
  
Inicio
   escreva("escreva o valor de a: ")
   leia(a)
   
   escreva("escreva o valor de b: ")
   leia(b)
   
   escreva("escreva o valor de c: ")
   leia(c)
   
   //calculo de DELTA.
   
   delta <- (b*b) - 4*a*b
   
   //calculo normal
   
   x1<-(-b+Raizq (delta))/(2*a)
   x2<-(-b-Raizq (delta))/(2*a)
   
   escreval("o valor de delta �", delta)
   escreval("o valor de x1 �: ", x1)
   escreva("o valor de x2 �: ",x2)
Fimalgoritmo