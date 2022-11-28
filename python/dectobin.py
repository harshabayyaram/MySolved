n = int(input("enter the number you want to convert to decimal from binary"))
a = list() 
while n!=0:
    rem = n%2 
    a.append(rem)
    n = n//2
print(a)
# a.reverse()
a = a[::-1]
print(a)