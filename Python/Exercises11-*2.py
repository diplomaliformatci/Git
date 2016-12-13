from __future__ import print_function , division
cache = {}
def ackermann(m,n):
    if m ==0:
        return n+1
    if n == 0:
        return ackermann(m-1 ,1)
    try:
        return cache[m,n]
    except KeyError:
        cache[m,n] = ackermann(m-1 , ackermann(m , n-1))
        return cache[m,n]
def invert_dict(d):
    inverse = {}
    for key in d:
        val = d [key]
        inverse.setdefault(val,[]).append(key)
    return inverse
def has_duplicates(t):
    d = {}
    for x in t:
        if x in d:
            return True
        d[x] = True
    return False
def has_duplicates2(t):
    return len(set(t))  < len(t)
if __name__  == '__main__':
    t = [1,2,3]
    print (has_duplicates(t))
    t.append(1)
    print(has_duplicates(t))
    t=[1,2,3]
    print(has_duplicates2(t))
    t.append(1)
    print(has_duplicates2(t))
    d = dict(a=5 , b=2 , c=3 , z=1)
    inverse = invert_dict(d)
    for val in inverse:
        keys = inverse[val]
        print(val , keys)
    print (ackermann(1,3))
    print(ackermann(3,6))