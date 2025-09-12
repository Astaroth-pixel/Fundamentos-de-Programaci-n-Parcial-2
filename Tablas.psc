Algoritmo Tablas
	
    DEFINIR n COMO ENTERO
    REPETIR
        ESCRIBIR "Ingrese un número (0 para salir): "
        LEER n
        SI n <> 0 ENTONCES
            PARA i <- 1 HASTA 10 HACER
                ESCRIBIR n, " x ", i, " = ", n * i
            FIN PARA
        FIN SI
    HASTA QUE n = 0
    ESCRIBIR "Programa finalizado."

FinAlgoritmo
