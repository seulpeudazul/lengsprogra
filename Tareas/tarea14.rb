puts "Azul Carolina Martínez Cabañas"
puts "1868435					 ITS"
puts "Periodo Enero-Junio 2020"
puts "Ing. Ismael Gutiérrez Pimentel"
puts "Búsqueda en Matriz"
puts "Ingrese la cantidad de filas de la matriz: "
n = gets().to_i
puts "Ingrese la cantidad de columnas de la matriz: "
m = gets().to_i
matriz= Array.new(n){Array.new(m)}
for i in (0...n)
    for j in (0...m)
    puts "Ingrese el número a ingresar en la matriz: \n"
    matriz[i][j] = gets.to_i
    end
end

for i in (0...n)
    for j in (0...m)
        print "#{matriz[i][j]}   "
    end
    puts "\n"
end
puts "Ingrese el número a buscar"
buscar = gets().to_i
contador = 0
for i in (0...n)
    for j in (0...n)
    if(matriz[i][j] == buscar)
        contador += 1
    end
    end
end
puts "\nEl numero a buscar es: #{buscar}"

if contador>1
    puts "\nVeces que aparece en el matriz: #{contador}"
else
    puts "No se encontró al número en la matriz"
end
