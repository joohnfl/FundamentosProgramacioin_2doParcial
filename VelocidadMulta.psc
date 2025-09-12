Proceso VelocidadMulta
    Definir respuesta, textoVel, cumpleanos Como Cadena
    Definir vel Como Entero
	
    Repetir
        Escribir "Escribe tu velocidad en km/h:"
        Leer textoVel

        Si es numero(textoVel) Entonces:
            vel <- ConvertirANumero(textoVel)
			
            Escribir "¿Es tu cumpleaños? (si/no)"
            Leer cumpleanos
            cumpleanos <- Minusculas(cumpleanos)
			
            Si cumpleanos = "si" Entonces
                Escribir "¡Feliz cumpleaños! No tienes multa ??"
            Sino
                Si vel < 60 Entonces
                    Escribir "Tu velocidad está bien. No hay multa."
                Sino
                    Si vel <= 80 Entonces
                        Escribir "Cuidado! Tienes una multa pequeña."
                    Sino
                        Escribir "¡Alto riesgo! Tienes una multa grande."
                    FinSi
                FinSi
            FinSi
			
        Sino
            Escribir "Error: Debes ingresar un número válido para la velocidad."
        FinSi
		
        Escribir "¿Desea verificar otra velocidad? (si/no)"
        Leer respuesta
        respuesta <- Minusculas(respuesta)
		
    Hasta Que respuesta <> "si"
	
    Escribir "Condusca con cuidado."
FinProceso
