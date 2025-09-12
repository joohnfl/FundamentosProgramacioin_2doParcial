Proceso Pasteleria
    Definir respuesta, eleccionSabor, tipoChoco, nombre Como Cadena
    Definir precioTotal Como Real
    Definir respuestaSnack, respuestaNombre, cantidadSnacks Como Entero
	
    Repetir
        precioTotal <- 0
		
        Escribir "Elige el sabor de la tarta:"
        Escribir "- manzana"
        Escribir "- fresa"
        Escribir "- chocolate"
        Leer eleccionSabor
        eleccionSabor <- Minusculas(eleccionSabor)
		
        Segun eleccionSabor Hacer
            "chocolate":
                Escribir "�Qu� tipo de chocolate deseas? (negro o blanco)"
                Leer tipoChoco
                tipoChoco <- Minusculas(tipoChoco)
                Si tipoChoco = "negro" Entonces
                    precioTotal <- 280
                Sino
                    Si tipoChoco = "blanco" Entonces
                        precioTotal <- 300
                    Sino
                        Escribir "Opci�n no v�lida, se asignar� chocolate negro por defecto."
                        precioTotal <- 280
                    FinSi
                FinSi
				
            "fresa":
                precioTotal <- 250
				
            "manzana":
                precioTotal <- 200
				
            De Otro Modo:
                Escribir "Sabor no v�lido, se asignar� tarta de manzana por defecto."
                precioTotal <- 200
        FinSegun
		
        Escribir "�Deseas a�adir snacks? Cada uno cuesta $25 (1 para S�, 2 para No)"
        Leer respuestaSnack
		
        Si respuestaSnack = 1 Entonces
            Escribir "�Cu�ntos snacks quieres agregar?"
            Leer cantidadSnacks
            precioTotal <- precioTotal + (cantidadSnacks * 25)
        FinSi
		
        Escribir "�Deseas personalizar la tarta con un nombre? (+$30) (1 para S�, 2 para No)"
        Leer respuestaNombre
		
        Si respuestaNombre = 1 Entonces
            Escribir "Escribe el nombre que ir� en la tarta:"
            Leer nombre
            precioTotal <- precioTotal + 30
        FinSi
		
        Escribir "La cantidad a pagar es: $", precioTotal
		
        Escribir "�Deseas ordenar alg�n otro postre? (si/no)"
        Leer respuesta
        respuesta <- Minusculas(respuesta)
		
    Hasta Que respuesta <> "si"
	
    Escribir "Gracias por su preferencia."
FinProceso
