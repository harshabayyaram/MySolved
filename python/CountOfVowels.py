sentence=input("enter sentence:")
string=sentence.lower()
#print(string)

count=0
list1=["a","e","i","o","u"]

a=[]

for char in string:
  if char in list1:
    count = count+1
    a.append(char)
    
print(a)
print("number vowels in given sentence is:",count)
