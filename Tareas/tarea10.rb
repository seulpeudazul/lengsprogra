puts("Azul Carolina Martínez Cabañas")
puts("1868435					 ITS")
puts('Periodo Enero-Junio 2020')
puts("Ing. Ismael Gutiérrez Pimentel")
puts "Serie  A (Exponentes impares)"
puts "Ingrese el número de la serie al que se quiere llegar: "

n = gets().to_i
puts "\n"
impar = 1

for i in (1..n)
    num = i ** impar
    impar += 2
    puts "#{num}"
end