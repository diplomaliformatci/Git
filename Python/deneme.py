def histogram(s):
    d = dict()
    for c in s:
        if c not in d:
            d[c] = 1
        else :
            d[c] += 1
    return d

def print_hist(h):
    for c in h:
        print(c ,":", h[c])
def reverse_lookup(d,v):
    for k in d:
     if d[k] == v:
      return k
    raise LookupError()
def invert_dict(d):
    inverse = dict()
    for key in d:
        val = d[key]
        if val not in inverse:
            inverse[val] = [key]
        else:
            inverse[val].append(key)
    return inverse
def invert_dict(d):
    inverse = dict()
    for key in d:
        val = d[key]
        if val not in inverse:
            inverse[val] = [key]
        else:
            inverse[val].append(key)
    return inverse # harf analizi kullanilabilir

known = {0:0 , 1:1}
def fibonacci(n):
    if n in known:
        return known[n]
    res = fibonacci(n-1) + fibonacci(n-2)
    known[n] = res
    return res
h = histogram('parrkkkot')
k = invert_dict(h)
x=fibonacci(7)


print(x)
print (k[2])
