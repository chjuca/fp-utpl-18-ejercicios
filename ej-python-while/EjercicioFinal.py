contador = 1
limite=2
nota1=0
nota2=0
nota3=0
nombre=""
promedio=0.0
cadena="{0}\t\t{1}\t{2}\t{3}\t{4}\n".format("Nombres","Nota 1","Nota 2","Nota 3","Promedio")
while (contador<=limite):
    print("***\tESTUDIANTE %d\t***" % (contador))
    nombre=input("Ingrese el nombre del estudiante: ")
    nota1=int(input("Ingrese la Nota #1: : "))
    nota2=int(input("Ingrese la Nota #2: "))
    nota3=int(input("Ingrese la Nota #3: "))
    promedio=(nota1+nota2+nota3)/3
    cadena="{0}{1}\t\t{2}\t{3}\t{4}\t{5:.2}\n".format(cadena,nombre,nota1,nota2,nota3,promedio)
    
    contador+=1

print("\nREPORTE DE NOTAS")
print(cadena)
