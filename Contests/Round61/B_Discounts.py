n = int(input())
a = input().split(' ')

sum = 0
for i in range(n):
    t = int(a[i])
    sum += t
    a[i] = t

a.sort()

m = int(input())
q = input().split(' ')
for i in range(m):
    print(sum - a[n - int(q[i])])
