def is_abecedarian3(word):
    previous = word[0]
    for c in word:
        if c < previous:
            return False
        previous = c
    return True

def is_abecedarian2(word):
    if len(word) <= 1:
        return True
    if word[0] > word[1]:
        return False
    return is_abecedarian2(word[1:])

def is_abecedarian1(word):
    i = 0
    while i < len(word)-1:
        if word[i+1] < word[i]:
            return False
        i = i+1
    return True
def is_palindrome(word):
    i = 0
    j = len(word)-1
    while i<j:
        if word[i] != word[j]:
            return False
        i = i +1
        j = j-1
    return True
def add_all(t , eski):
    total = 0
    for x in t:
        total += x
    return total
def capitalize_all(t , eski):
    res  = eski
    for s in t:
        res.append(s.capitalize())
    return res
def nested_sum(t):
    sum = 0
    for a in t:
        for b in a:
          sum += a
    return sum
def cum_sum(t):
    sum = 0
    res = []
    for x in t:
        sum += x
        res.append(t)
    return res

def middle(t):
    return t[1:-1]
def chop(t):
    del t[0]
    del t[-1]
def is_sorted(t):
    return t == sorted(t)
def has_duplicates(t):
    res = []
    for i in range(len(t)-1):
        if t[i] == t[i+1]:
            return True
    return False

t = [1,2,2,3,4,5,6,7]
a = [7,6,5,4,4,3,2,1]
print(has_duplicates(t))