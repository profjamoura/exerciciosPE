# Fatorial
# profjamoura@gmail.com
numero = int(input("Digite um número para calcular o fatorial: "))
for i in range(numero - 1, 0, -1):
    numero *= i
print("O fatorial é:", numero)  