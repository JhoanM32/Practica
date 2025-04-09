import pandas as pd
ventas = pd.Series([2000, 2500, None, 1500, 1200, 1600], 
                   index=['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio'])


print("Serie original de ventas:")
print(ventas)


ventastratadas = ventas.fillna(ventas.mean())
print("\nSerie luego de tratar los datos faltantes:")
print(ventastratadas)


ventasordenadas = ventastratadas.sort_values()
print("\nVentas ordenadas de menor a mayor:")
print(ventasordenadas)


promedioventas = ventastratadas.mean()
miniventas = ventastratadas.min()
maxiventas = ventastratadas.max()

print(f"\nEstadísticas básicas:")
print(f"Promedio de ventas: {promedioventas}")
print(f"Mínimo de ventas: {miniventas}")
print(f"Máximo de ventas: {maxiventas}")

por_encima_promedio = []
por_debajo_promedio = []

for mes in ventastratadas.index:
    if ventastratadas[mes] > promedioventas:
        por_encima_promedio.append(mes)
    else:
        por_debajo_promedio.append(mes)

print("\nMeses con ventas por encima del promedio:", por_encima_promedio)
print("Meses con ventas por debajo del promedio:", por_debajo_promedio)