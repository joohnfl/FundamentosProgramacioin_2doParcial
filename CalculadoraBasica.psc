Proceso CalculadoraBasica
    Definir respuesta, op, salida Como Cadena
    Definir numeroA, numeroB, mult, suma, resta Como Entero
    Definir div Como Real
	
    Repetir
        Escribir "Escribe el primer n�mero entero:"
        Leer numeroA
		
        Escribir "Escribe el segundo n�mero entero:"
        Leer numeroB
		
        Escribir "Selecciona una operaci�n: (+, -, *, /)"
        Leer op
		
        salida <- ""
		
        Segun op Hacer
            "*":
                mult <- numeroA * numeroB
                salida <- ConvertirATexto(numeroA) + " * " + ConvertirATexto(numeroB) + " = " + ConvertirATexto(mult)
            "/":
                Si numeroB <> 0 Entonces
                    div <- numeroA / numeroB
                    salida <- ConvertirATexto(numeroA) + " / " + ConvertirATexto(numeroB) + " = " + ConvertirATexto(div)
                Sino
                    salida <- "Error: divisi�n entre cero no permitida."
                FinSi
            "+":
                suma <- numeroA + numeroB
                salida <- ConvertirATexto(numeroA) + " + " + ConvertirATexto(numeroB) + " = " + ConvertirATexto(suma)
            "-":
                resta <- numeroA - numeroB
                salida <- ConvertirATexto(numeroA) + " - " + ConvertirATexto(numeroB) + " = " + ConvertirATexto(resta)
            De Otro Modo:
                salida <- "Operaci�n desconocida. Solo puedes usar: +, -, *, /."
        FinSegun
		
        Escribir salida
		
        Escribir "�Desea realizar alguna otra operaci�n? (si/no)"
        Leer respuesta
        respuesta <- Minusculas(respuesta)
    Hasta Que respuesta <> "si"
	
    Escribir "Gracias por su preferencia en esta calculadora."
FinProceso
