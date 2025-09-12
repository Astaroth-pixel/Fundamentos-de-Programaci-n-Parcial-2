Algoritmo Figuras
    Definir n, i, j, espacios, numAsteriscos Como Entero
    Definir fila Como Cadena
	
    
    Escribir "Ingrese el número de líneas (n):"
    Leer n
	
    
   
    Para i <- 1 Hasta n
        fila <- ""
        espacios <- n - i
        numAsteriscos <- (i * 2) - 1
        
        Para j <- -1 Hasta espacios
            fila <- fila + " "
        FinPara
        
        Para j <- 1 Hasta numAsteriscos
            fila <- fila + "*"
        FinPara
        Escribir fila
    FinPara
	
    Para i <- 1 Hasta n
        fila <- ""
        Para j <- 1 Hasta n
            fila <- fila + "*"
        FinPara
        Escribir fila
    FinPara
    
    Para i <- n Hasta 1 
        fila <- ""
        espacios <- n - i
        numAsteriscos <- (i * 2) - 1
      
        Para j <- -1 Hasta espacios
            fila <- fila + " "
        FinPara
        
        Para j <- 1 Hasta numAsteriscos
            fila <- fila + "*"
        FinPara
        Escribir fila
    FinPara
	
    
   
	
FinAlgoritmo
