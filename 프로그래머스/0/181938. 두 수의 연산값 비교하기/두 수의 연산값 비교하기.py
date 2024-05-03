def solution(a, b):
    answer = 0
    test = int(str(a) + str(b))
    if test > 2*a*b:
        answer = test
    else:
        answer = 2*a*b
    return answer