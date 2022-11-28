n = int(input("enter the number you wantto convert to binary = "))

a=list()
while n!=0:
    r = n % 2
    l = a.append(r)
    n = n //2
    
a.reverse()

print(a)
print(*a, sep = ' ')
