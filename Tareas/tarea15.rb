puts "Azul Carolina Martínez Cabañas"
puts "1868435					 ITS"
puts "Periodo Enero-Junio 2020"
puts "Ing. Ismael Gutiérrez Pimentel"
puts("Suma de matrices")
print "Ingresar el número de filas de la matriz A: "
mA = gets().to_i
print "Ingresar el número de columnas de la matriz A: "
nA = gets().to_i
print "Ingresar el número de filas de la matriz B: "
mB = gets().to_i
print "Ingresar el número de columnas de la matriz B: "
nB = gets().to_i
if nA != nB || mA != mB
    abort("Las dimensiones de las matrices no son válidas")
else
    
    matA = Array.new(mA){Array.new(nA)}
    matB = Array.new(mB){Array.new(nB)}
    for i in(0..(mA - 1))
        for j in(0..(nA - 1))
            print "Ingresar los números que pertenecen a la matriz A[#{i+1}][#{j+1}] :"
            matA[i][j]=gets().to_i
        end
    end
    for i in(0..(mB - 1))
        for j in(0..(nB - 1))
            print "Ingresar los números que pertenecen a la matriz B[#{i+1}][#{j+1}] :"
            matB[i][j]=gets().to_i
        end
    end
    mensaje = ""
    suma = Array.new(mA){Array.new(nA)}
    mensaje=mensaje+"La suma de ambas matrices es \n"
    for i in(0..(mA-1))
        for j in(0..(nA-1))
            suma[i][j]= matA[i][j]+matB[i][j]
            mensaje= mensaje+suma[i][j].to_s+" "
        end
        mensaje=mensaje+"\n"
    end
    print"#{mensaje}"
end