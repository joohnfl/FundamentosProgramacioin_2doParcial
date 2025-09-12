Proceso CineEntradasYPromociones
    Definir respuesta, diaSemana Como Cadena
    Definir cantidadPersonas, respuestaMembresia, numParejas, individuales Como Entero
    Definir totalAPagar, PRECIO_NORMAL, PRECIO_PROMO_MIERCOLES, PRECIO_PAREJA_JUEVES, DESCUENTO_MEMBRESIA Como Real
	
    PRECIO_NORMAL <- 50.0
    PRECIO_PROMO_MIERCOLES <- 30.0
    PRECIO_PAREJA_JUEVES <- 75.0
    DESCUENTO_MEMBRESIA <- 0.10
	
    Repetir
        Escribir "¿Cuántas personas asistirán al cine?"
        Leer cantidadPersonas
		
        Escribir "Escribe el día de la semana (ej: lunes, martes, ...):"
        Leer diaSemana
        diaSemana <- Minusculas(diaSemana)
		
        Escribir "¿Tienes membresía? (1 = Sí, 0 = No)"
        Leer respuestaMembresia
		
        totalAPagar <- 0
		
        Segun diaSemana Hacer
            "miercoles":
                totalAPagar <- cantidadPersonas * PRECIO_PROMO_MIERCOLES
            "miércoles":
                totalAPagar <- cantidadPersonas * PRECIO_PROMO_MIERCOLES
            "jueves":
                numParejas <- trunc(cantidadPersonas / 2)
                individuales <- cantidadPersonas % 2
                totalAPagar <- (numParejas * PRECIO_PAREJA_JUEVES) + (individuales * PRECIO_NORMAL)
            De Otro Modo:
                totalAPagar <- cantidadPersonas * PRECIO_NORMAL
        FinSegun
		
        Si respuestaMembresia = 1 Entonces
            totalAPagar <- totalAPagar * (1 - DESCUENTO_MEMBRESIA)
        FinSi
		
        Escribir "El costo total de las entradas es: $", totalAPagar
		
        Escribir "¿Desea agregar alguna otra cosa? (si/no)"
        Leer respuesta
        respuesta <- Minusculas(respuesta)
    Hasta Que respuesta <> "si"
	
    Escribir "Que tenga un buen día, gracias por su preferencia."
FinProceso
