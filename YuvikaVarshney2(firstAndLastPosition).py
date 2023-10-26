def firstAndLastPosition(arr, n, k):

    # Write your code here
    first=-1
    last=-1
    l=0
    h=n-1
    m=-1
    while l<=h:
        m=l+ (h-l)//2
        if arr[m]==k:
            first=last=m
            break
        elif arr[m]>k:
            h=m-1
        else:
            l=m+1
    j=m
    while arr[m-1]==k and m>0:
        first=m-1
        m-=1
    m=j
    while arr[m]==k and m<n-1:
        last=m
        m+=1  
    if arr[n-1]==k:
        last=n-1 

    
    return [first,last]
