
def mergeSort(arr):
    # allow condition, if size of array is 1 (as one element in array is already sorted)
    if len(arr)>1:
        mid = len(arr)//2
        
        #initializing the left and right array
        left = arr[:mid]
        right = arr[mid:]
        
        mergeSort(left) #sorting the left array (recursively)
        mergeSort(right) #sorting the right array (recursively)
        merge(left, right, arr) #invoking merge method
        
#merge() method
def merge(left, right, arr):
    i = j = k = 0
    
    #Merging the temp arrays to final array
    while i < len(left) and j < len(right):
        if left[i] <= right[j]:
            arr[k]=left[i]
            i+=1
        else:
            arr[k]=right[j]
            j+=1
        k+=1
        
     
    while i < len(left):
            arr[k] = left[i]
            i+=1
            k+=1
    while j < len(right):
            arr[k] = right[j]
            j+=1
            k+=1

# method to print an array
def printList(arr):
    for i in range(len(arr)):
        print(arr[i],end=" ") 
    print("\n")
        
# driver method
if __name__ == '__main__': 
    arr = [3,4,1,7,6,2,8]  
    print ("Given array: ", end="\n")  
    printList(arr)
    mergeSort(arr) 
    print("Sorted array: ", end="\n") 
    printList(arr)