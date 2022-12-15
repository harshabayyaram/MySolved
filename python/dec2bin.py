n = int(input("enter the number you want to convert to decimal from binary"))
a = list()
while n!=0:
  rem = n%2
  a.append(rem)
  n = n//2
#print(a) checking by print
# a.reverse() inbuilt function

a = a[::-1] #reverse of list
print(a) #prints bin value in list []


#to print as string
for i in range(0,len(a)):
    print(a[i],end="")     
