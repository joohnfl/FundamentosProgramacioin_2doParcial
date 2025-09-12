Proceso AreasFiguras
    Definir respuesta Como Cadena
    Definir opcion Como Entero
    Definir resultado, radio, baseT, alturaT, baseR, alturaR, lado Como Real
	
    Repetir
        Escribir "C�lculo de �reas"
        Escribir "1. C�rculo"
        Escribir "2. Tri�ngulo"
        Escribir "3. Rect�ngulo"
        Escribir "4. Cuadrado"
        Escribir "Elija una opci�n (1-4):"
        Leer opcion
		
        resultado <- 0
		
        Segun opcion Hacer
            1:
                Escribir "Ingrese el radio del c�rculo:"
                Leer radio
                resultado <- 3.14159265359 * radio^2
                Escribir "El �rea del c�rculo es: ", resultado
            2:
                Escribir "Ingrese la base del tri�ngulo:"
                Leer baseT
                Escribir "Ingrese la altura del tri�ngulo:"
                Leer alturaT
                resultado <- (baseT * alturaT) / 2
                Escribir "El �rea del tri�ngulo es: ", resultado
            3:
                Escribir "Ingrese la base del rect�ngulo:"
                Leer baseR
                Escribir "Ingrese la altura del rect�ngulo:"
                Leer alturaR
                resultado <- baseR * alturaR
                Escribir "El �rea del rect�ngulo es: ", resultado
            4:
                Escribir "Ingrese un lado del cuadrado:"
                Leer lado
                resultado <- lado * lado
                Escribir "El �rea del cuadrado es: ", resultado
            De Otro Modo:
                Escribir "Opci�n no v�lida. Debe elegir entre 1 y 4."
        FinSegun
		
        Escribir "�Desea hacer otra operaci�n?(si/no)"
        Leer respuesta
    Hasta Que respuesta <> "si"
	
    Escribir "Gracias por usar el programa."
FinProceso
