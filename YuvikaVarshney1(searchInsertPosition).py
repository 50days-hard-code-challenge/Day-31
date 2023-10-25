def searchInsert(arr: [int], m: int) -> int:
    # Write your code here.
    n=len(arr)
    l=0
    h=n-1
    pos=n
    while l<=h:
        mid=l+(h-l)//2
    
        if arr[mid]>=m:
            pos=mid
            h=mid-1
        else:
            l=mid+1
    return pos

    """
    n = len(arr)
    lo = 0
    hi = n - 1
    ans = -1

    while lo <= hi:

        mid = lo + (hi - lo) // 2

        # Check if element is present.
        if (arr[mid] == m):
            return mid
        
        # Check the left half.
        if (arr[mid] > m):
            hi = mid - 1
            ans = mid
        # Check the right half.
        else:
            lo = mid + 1

    if (ans == -1):
        ans = n

    return ans
    """

    """
    n=len(arr)
    for i in range(n):
        if arr[i]>=m:
            return i
    return n
    """

    """
    n=len(arr)
    l=0
    h=n-1
    pos=0
    while l<=h:
        mid=l+(h-l)//2
        pos=mid
        if arr[mid]==m:
            pos=mid
            return mid
        elif arr[mid]>m:
            h=mid-1
        else:
            pos=mid+1
            l=mid+1
    return pos
    """
    pass
