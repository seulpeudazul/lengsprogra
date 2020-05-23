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