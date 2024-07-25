a = [[11, 2, 4],
     [4,5,6], 
     [10, 8, -12]]

d1, d2 = 0, 0

n = 3
for i in range(n):
    d1 += a[i][i]      
    d2 += a[i][n-i-1]  

difference = d1-d2
print(d1, d2)

print(abs(difference))