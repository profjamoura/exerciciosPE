# imprime a sequência de Fibonacci até um número dado
# autor: profjamoura@gmail.com
qt=int(input("Quantos números da sequência de Fibonacci você quer imprimir?"))
ant=0
atual=1
n=3
print(ant,atual,end=" ")
while n <= qt:
    prox = ant + atual
    print(prox, end=" ")
    ant = atual
    atual = prox
    n += 1
print("\nFim da sequência de Fibonacci")

    
    

    