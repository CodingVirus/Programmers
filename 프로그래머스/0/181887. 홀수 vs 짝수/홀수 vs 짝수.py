def solution(num_list):
    num1 = 0
    num2 = 0
    for i in range(0, len(num_list)):
        if (i % 2 == 0):
            num1 += num_list[i]
        else:
            num2 += num_list[i]
    
    if (num1 > num2): return num1
    else: return num2