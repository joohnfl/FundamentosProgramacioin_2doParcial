Proceso Meses
    Definir respuesta, entrada, mesNombre Como Cadena
    Definir opcion, cantidadDias Como Entero
	
    Repetir
        Escribir "Escribe un número de mes entre 1 y 12:"
        Leer entrada
		
        // Convertir a número
        opcion <- ConvertiraNumero(entrada):
		
        mesNombre <- ""
        cantidadDias <- 0
		
        Si opcion >= 1 Y opcion <= 12 Entonces
            Segun opcion Hacer
                12:
                    mesNombre <- "Diciembre"
                    cantidadDias <- 31
                11:
                    mesNombre <- "Noviembre"
                    cantidadDias <- 30
                10:
                    mesNombre <- "Octubre"
                    cantidadDias <- 31
                9:
                    mesNombre <- "Septiembre"
                    cantidadDias <- 30
                8:
                    mesNombre <- "Agosto"
                    cantidadDias <- 31
                7:
                    mesNombre <- "Julio"
                    cantidadDias <- 31
                6:
                    mesNombre <- "Junio"
                    cantidadDias <- 30
                5:
                    mesNombre <- "Mayo"
                    cantidadDias <- 31
                4:
                    mesNombre <- "Abril"
                    cantidadDias <- 30
                3:
                    mesNombre <- "Marzo"
                    cantidadDias <- 31
                2:
                    mesNombre <- "Febrero"
                    cantidadDias <- 28
                1:
                    mesNombre <- "Enero"
                    cantidadDias <- 31
            FinSegun
			
            Escribir "Seleccionaste: ", mesNombre
            Escribir "Número de días: ", cantidadDias
        Sino
            Escribir "El número ingresado no corresponde a un mes válido (1-12)."
        FinSi
		
        Escribir "¿Deseas consultar otro mes? (si/no)"
        Leer respuesta
        respuesta <- Minusculas(respuesta)
    Hasta Que respuesta <> "si"
	
    Escribir "Gracias."
FinProceso
