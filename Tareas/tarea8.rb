puts "¿Qué escala inicial desea escoger?" 
puts "1 para Celsius\n2 para Fahrenheit"
puts "\n"

escala = gets().to_i

case escala
    when 1
        puts "Ingrese los grados centígrados "
        n = gets().to_i
        temp = ((n * 1.8) + 32)
        puts "Grados Fahrenheit: #{temp}"

    when 2
        puts "Ingrese los grados fahrenheit"
        n = gets().to_i
        temp = ((n - 32) / 1.8)
        puts "Grados centígrados: #{temp}"

    else 
        puts "Ingresar una de las opciones válidas"
end