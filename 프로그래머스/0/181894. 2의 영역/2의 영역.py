def solution(arr):
    answer = []
    myList = []
    for i in range(len(arr)):
        if (arr[i] == 2):
            myList.append(i)
            
    if (len(myList)) > 1:
        answer = arr[myList[0]:myList[-1]+1]
    elif (len(myList) == 1):
        answer = [arr[myList[0]]]
    else:
        answer = [-1]
        
    return answer