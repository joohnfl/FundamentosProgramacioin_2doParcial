Proceso Horoscopos
    Definir respuesta, signoZodiacal Como Cadena
    Definir diaNacimiento, mesNacimiento Como Entero
	
    Repetir
        Escribir "Escribe el día de tu nacimiento (1-31):"
        Leer diaNacimiento
		
        Escribir "Escribe el mes de tu nacimiento (1-12):"
        Leer mesNacimiento
		
        signoZodiacal <- ""
		
        Segun mesNacimiento Hacer
            12:
                Si diaNacimiento >= 1 Y diaNacimiento <= 21 Entonces
                    signoZodiacal <- "Sagitario"
                Sino
                    signoZodiacal <- "Capricornio"
                FinSi
            11:
                Si diaNacimiento >= 1 Y diaNacimiento <= 21 Entonces
                    signoZodiacal <- "Escorpio"
                Sino
                    signoZodiacal <- "Sagitario"
                FinSi
            10:
                Si diaNacimiento >= 1 Y diaNacimiento <= 22 Entonces
                    signoZodiacal <- "Libra"
                Sino
                    signoZodiacal <- "Escorpio"
                FinSi
            9:
                Si diaNacimiento >= 1 Y diaNacimiento <= 22 Entonces
                    signoZodiacal <- "Virgo"
                Sino
                    signoZodiacal <- "Libra"
                FinSi
            8:
                Si diaNacimiento >= 1 Y diaNacimiento <= 22 Entonces
                    signoZodiacal <- "Leo"
                Sino
                    signoZodiacal <- "Virgo"
                FinSi
            7:
                Si diaNacimiento >= 1 Y diaNacimiento <= 22 Entonces
                    signoZodiacal <- "Cáncer"
                Sino
                    signoZodiacal <- "Leo"
                FinSi
            6:
                Si diaNacimiento >= 1 Y diaNacimiento <= 20 Entonces
                    signoZodiacal <- "Géminis"
                Sino
                    signoZodiacal <- "Cáncer"
                FinSi
            5:
                Si diaNacimiento >= 1 Y diaNacimiento <= 20 Entonces
                    signoZodiacal <- "Tauro"
                Sino
                    signoZodiacal <- "Géminis"
                FinSi
            4:
                Si diaNacimiento >= 1 Y diaNacimiento <= 19 Entonces
                    signoZodiacal <- "Aries"
                Sino
                    signoZodiacal <- "Tauro"
                FinSi
            3:
                Si diaNacimiento >= 1 Y diaNacimiento <= 20 Entonces
                    signoZodiacal <- "Piscis"
                Sino
                    signoZodiacal <- "Aries"
                FinSi
            2:
                Si diaNacimiento >= 1 Y diaNacimiento <= 18 Entonces
                    signoZodiacal <- "Acuario"
                Sino
                    signoZodiacal <- "Piscis"
                FinSi
            1:
                Si diaNacimiento >= 1 Y diaNacimiento <= 19 Entonces
                    signoZodiacal <- "Capricornio"
                Sino
                    signoZodiacal <- "Acuario"
                FinSi
            De Otro Modo:
                signoZodiacal <- "Mes ingresado no válido."
        FinSegun
		
        Escribir "Según tu fecha de nacimiento, tu signo es: ", signoZodiacal
		
        Escribir "¿Deseas consultar alguna otra fecha? (si/no)"
        Leer respuesta
        respuesta <- Minusculas(respuesta)
    Hasta Que respuesta <> "si"
	
    Escribir "Que tengas un buen día."
FinProceso
