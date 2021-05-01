def divide(numerator,denominator):
    c=0
    while(True):
        numerator-=denominator
        if numerator>=0:
            c+=1
        else:
            break
    return c
n=int(input("Enter numerator: "))
d=int(input("Enter denominator: "))
if d==0:
    print("Cannot be divided by zero")
    exit()
quotient=divide(abs(n),abs(d))
if (n<0 and d>0) or (n>0 and d<0):
    print("Quotient is:",(quotient*-1))
else:
    print("Quotient is:",quotient)