Proceso AreasFiguras
    Definir respuesta Como Cadena
    Definir opcion Como Entero
    Definir resultado, radio, baseT, alturaT, baseR, alturaR, lado Como Real
	
    Repetir
        Escribir "Cálculo de Áreas"
        Escribir "1. Círculo"
        Escribir "2. Triángulo"
        Escribir "3. Rectángulo"
        Escribir "4. Cuadrado"
        Escribir "Elija una opción (1-4):"
        Leer opcion
		
        resultado <- 0
		
        Segun opcion Hacer
            1:
                Escribir "Ingrese el radio del círculo:"
                Leer radio
                resultado <- 3.14159265359 * radio^2
                Escribir "El área del círculo es: ", resultado
            2:
                Escribir "Ingrese la base del triángulo:"
                Leer baseT
                Escribir "Ingrese la altura del triángulo:"
                Leer alturaT
                resultado <- (baseT * alturaT) / 2
                Escribir "El área del triángulo es: ", resultado
            3:
                Escribir "Ingrese la base del rectángulo:"
                Leer baseR
                Escribir "Ingrese la altura del rectángulo:"
                Leer alturaR
                resultado <- baseR * alturaR
                Escribir "El área del rectángulo es: ", resultado
            4:
                Escribir "Ingrese un lado del cuadrado:"
                Leer lado
                resultado <- lado * lado
                Escribir "El área del cuadrado es: ", resultado
            De Otro Modo:
                Escribir "Opción no válida. Debe elegir entre 1 y 4."
        FinSegun
		
        Escribir "¿Desea hacer otra operación?(si/no)"
        Leer respuesta
    Hasta Que respuesta <> "si"
	
    Escribir "Gracias por usar el programa."
FinProceso
