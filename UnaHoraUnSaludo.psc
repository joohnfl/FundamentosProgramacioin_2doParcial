Proceso UnaHoraUnSaludo
    Definir respuesta, entrada, saludo Como Cadena
    Definir horaActual Como Entero
	
    Repetir
        Escribir "Escribe la hora actual (1 a 24):"
        Leer entrada
		
        Si EsNumero(entrada) Entonces
            horaActual <- ConvertirANumero(entrada)
			
            Si horaActual < 1 O horaActual > 24 Entonces
                Escribir "Error: la hora debe estar entre 1 y 24."
            Sino
                Segun horaActual Hacer
                    1, 2, 3, 4, 5, 22, 23, 24:
                        saludo <- "¡Que tengas buenas noches!"
                    6, 7, 8, 9, 10, 11, 12:
                        saludo <- "¡Buenos días a ti!"
                    13, 14, 15, 16, 17, 18, 19, 20, 21:
                        saludo <- "¡Buenas tardes!"
                    De Otro Modo:
                        saludo <- "Hora ingresada no válida."
                FinSegun
                Escribir saludo
            FinSi
        Sino
            Escribir "Entrada inválida. Debes escribir un número entero."
        FinSi
		
        Escribir "¿Desea consultar otra hora? (si/no)"
        Leer respuesta
        respuesta <- Minusculas(respuesta)
    Hasta Que respuesta <> "si"
	
    Escribir "Que tenga un..."
FinProceso
