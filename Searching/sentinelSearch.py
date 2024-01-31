# Python3 implementation of the approach
# Function to search key in the given array


def sentinelSearch(arr, n, key):

	# Last element of the array
	last = arr[n - 1]       # last = 3

	# Element to be searched is
	# placed at the last index
	arr[n - 1] = key        #arr[2] = 2
	i = 0

	while (arr[i] != key):  # arr[2] != 22
		i += 1              # 3

	# Put the last element back
	arr[n - 1] = last       # arr[2] = 3

	if ((i < n - 1) or (arr[n - 1] == key)):    # 1 < 2 or arr[2] == key
		print(key, "is present at index", i)
	else:
		print("Element Not found")


# Driver code
arr = [1,22,3]
n = len(arr)
key = 2

sentinelSearch(arr, n, key)

# This code is contributed by divyamohan123, Mandeep Dalavi
