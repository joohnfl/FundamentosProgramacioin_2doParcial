Algoritmo ciclo2
	Definir n Como Entero;
	
	n<-1
	resultado<-0
	
	si n=1 Entonces
		resultado<-0;
	FinSi
	
	Repetir
		resultado<- resultado+n;
		n<-n+1;
	Hasta Que n>= 10
	Escribir "el resultado es: ", resultado;
	
FinAlgoritmo
