puts "Azul Carolina Martínez Cabañas"
puts "1868435					 ITS"
puts "Periodo Enero-Junio 2020"
puts "Ing. Ismael Gutiérrez Pimentel"
puts "Convertidor de pesos mexicanos a divisas extranjeras.\nIngrese una de las siguientes opciones: "
puts "1 para dólar"
puts "2 para euro"
puts "3 para yen japonés"
puts "4 para dólar de Hong Kong"
puts "\n"
mon = gets().to_i

case mon
    when 1
        puts "Ingrese la cantidad de pesos que desea convertir: "
        n = gets().to_i
        dol = n / 20
        if dol > 1
            puts "#{dol} dólares"
        else
            puts "#{dol} dólar"
        end

    when 2
        puts "Ingrese la cantidad de pesos que desea convertir: "
        n = gets().to_i
        eur = n/23
        if eur > 1
            puts "#{eur} euros"
        else
            puts "#{eur} euro"
        end

    when 3
        puts "Ingrese la cantidad de pesos que desea convertir: "
        n = gets().to_i
        yen = n/0.18
        if yen > 1
            puts "#{yen} yenes"
        else
            puts "#{yen} yenes"
        end

    when 4
        puts "Ingrese la cantidad de pesos que desea convertir: "
        n = gets().to_i
        hk = n / 2.58
        if hk > 1
            puts "#{hk} dólares de Hong Kong"
        else
            puts "#{hk} dólar de Hong Kong"
        end
    else 
        puts "Ingresar una opción válida"
end