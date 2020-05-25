puts("Azul Carolina Martínez Cabañas")
puts("1868435					 ITS")
puts('Periodo Enero-Junio 2020')
puts("Ing. Ismael Gutiérrez Pimentel")
puts "Serie B"
puts "Ingrese el número de la serie al que se quiere llegar: "
n = gets().to_i
control = 2
contador = 1

for i in(1..n)
  if(i % 2 == 0)then
    for j in (1..control)
      if(contador > n)then
        abort()
      else
        print "#{i} "
        contador+=1
      end
    end
    control+=1
  else
    if(contador>n)then
      abort()
    else
  print "-#{i} "
  contador+=1
    end
  end
end 