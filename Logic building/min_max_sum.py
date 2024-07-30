def miniMaxSum(arr):
    # Write your code here
    arr.sort()
    min_sum, max_sum = 0,0
    n = len(arr)
    for i in range(n-1):
        print(i)
        min_sum += arr[i]
        max_sum += arr[i+1]
        
    print(min_sum,max_sum)

arr = [7, 69, 2, 221, 8974]
miniMaxSum(arr)