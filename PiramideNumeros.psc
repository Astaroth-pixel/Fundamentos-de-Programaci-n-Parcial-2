Algoritmo PiramideNumeros
    Definir n, i, j Como Entero
    Definir linea Como Cadena
    Escribir "Ingresa un número entero"
    Leer n
    Para i <- 1 Hasta n Hacer
        linea <- ""
        Para j <- 1 Hasta i Hacer
            linea <- linea + ConvertirATexto(j) + " "
        FinPara
        Escribir linea
    FinPara
FinAlgoritmo



