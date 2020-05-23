puts"Búsqueda en un Vector"
puts "Ingrese el tamaño del vector: "
n = gets().to_i
if(n==1)then
    abort("Ingresar números mayores a 1")
end
vec = Array.new(n)
for i in (0...n)
    puts "Ingrese el número que pertenece al vector: "
	vec[i] = gets().to_i
    end
puts("El vector es: ")	
print("[")
for i in(0...(n - 1)) #Penúltimo elemento
	print("#{vec[i]}, ") 
end
print("#{vec[i+1]}]") #Último elemento, se concatena el ]
print("\nIngrese el número a buscar: ")
buscar = gets().to_i
contador = 0
for i in(0...n)
	if(vec[i]==buscar)then
		contador +=1
    end
end 
puts("El numero a buscar es: #{buscar} \n")
if contador!=0
    puts("Veces que aparece en el vector: #{contador}")
else
    puts("Número no encontrado en el vector")
end
