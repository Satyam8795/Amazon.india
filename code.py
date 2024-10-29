def f(x):
    return x**3-x*x-2


a = float(input("first size ="))
b = float(input("second size ="))
n = float(input("No. of iteration ="))

if f(a)*f(b)>0:
print("This method is not applicable of that type of equation")
else:
k=1
while(k<=n):
    r = (a*f(b)-b*f(a))/f(b)-f(a)
    
    print("root=",r,"No. of iteration =",k)
    k = k+1
    a=r