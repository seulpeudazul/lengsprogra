puts "Azul Carolina Martínez Cabañas"
puts "1868435					 ITS"
puts "Periodo Enero-Junio 2020"
puts "Ing. Ismael Gutiérrez Pimentel"
puts "Multiplicación de Matrices"
print "Ingresar el número de filas de la matriz A: "
mA = gets().to_i
print "Ingresar el número de columnas de la matriz A: "
nA = gets().to_i
print "Ingresar el número de filas de la matriz B: "
mB = gets().to_i
print "Ingresar el número de columnas de la matriz B: "
nB = gets().to_i
if nA == mB
    matA = Array.new(mA){Array.new(nA)}
    matB = Array.new(mB){Array.new(nB)}
    multi = Array.new(mA){Array.new(nB)}
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
	display=""
	for i in(0...mA)
    	for j in(0...nB)
			multi[i][j] = 0
			for k in(0...nA)
    			multi[i][j] = (matA[i][k] * matB[k][j]) + multi[i][j]
			end
			display = display + multi[i][j].to_s + " "
		end
		display = display + "\n"
	end
	puts "El resultado de la multiplicación de las matrices es: "
	puts(display)
else
    abort "Las dimensiones de las matrices no son válidas"
end