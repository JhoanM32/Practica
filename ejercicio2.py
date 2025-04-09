import pandas as pd

num_libros = int(input("¿Cuántos libros diferentes deseas registrar? "))


libros = []
prestamos = []


for i in range(num_libros):
    titulo = input(f"Ingrese el título del libro #{i+1}: ")
    while True:
        try:
            num_prestamos = int(input(f"Ingrese el número de préstamos realizados para '{titulo}': "))
            if num_prestamos < 0:
                print("El número de préstamos no puede ser negativo. Intente de nuevo.")
                continue
            break
        except ValueError:
            print("Por favor ingrese un número válido de préstamos.")
    
    libros.append(titulo)
    prestamos.append(num_prestamos)


serie_prestamos = pd.Series(prestamos, index=libros)


print("\nSerie completa con los libros y sus préstamos:")
print(serie_prestamos)


libro_mas_prestado = serie_prestamos.idxmax()
libro_menos_prestado = serie_prestamos.idxmin()

print(f"\nEl libro más prestado fue '{libro_mas_prestado}'")
print(f"El libro menos prestado fue '{libro_menos_prestado}'")


total_prestamos = serie_prestamos.sum()
print(f"\nLa cantidad total de préstamos realizados en el mes fue: {total_prestamos}")


print("\nAnálisis de circulación de los libros:")
for libro, prestamos in serie_prestamos.items():
    if prestamos > 15:
        print(f"El libro '{libro}' tuvo alta circulación (más de 15 préstamos).")
    else:
        print(f"El libro '{libro}' tuvo baja circulación (15 préstamos o menos).")