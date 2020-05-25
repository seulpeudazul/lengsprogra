puts "Azul Carolina Martínez Cabañas"
puts "1868435					 ITS"
puts "Periodo Enero-Junio 2020"
puts "Ing. Ismael Gutiérrez Pimentel"
puts "Serie C"
puts "Ingrese el número de la serie al que se quiere llegar: "
n = gets().to_i

contador = 0
positivos = 2
negativos = -3
actual = 1
varSwitcheable = true
for i in (1..n)
  if(varSwitcheable)then
    for y in (1..actual)
      if(contador>=n)then
      abort()
      else
      print("#{positivos} ")
      positivos += 2
      contador += 1
      end
    end
    varSwitcheable=false
    actual += 1
  else
    for y in (1..3)
      if(contador>=n)then
        abort()
      else
      print("#{negativos} ")
      negativos -= 2
      contador += 1
      end
    end
    varSwitcheable=true
  end
end