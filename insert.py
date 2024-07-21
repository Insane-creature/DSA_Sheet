# arr = [4,1,3,5,6]
# n = len(arr)
# # print(n)
# def insertSorting(arr):
#     for i in range(n-1):
#         for j in range(n-1):
#             if(arr[i]<arr[j]):
#                 temp = arr[i]
#                 arr[i] = arr[j]
#                 arr[j] = temp
#     print(arr)

# insertSorting(arr)

def insertSorting(arr):
    n = len(arr)  # Ensure n is defined as the length of the array
    for i in range(n-1):
        for j in range(n-1):
            if(arr[i] < arr[j]):
                temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
    return arr  # Use return instead of print

# Example usage
arr = [5, 3, 8, 6, 2]
sorted_arr = insertSorting(arr)
print(sorted_arr)  # This will print the returned sorted array
