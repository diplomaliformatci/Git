import random
def has_no_e(word):
    for a in word:
        if a == 'e':
            return False
    return True
         ## icinde e olmayan kelimeler
def forbidden_words(word , forbidden):
    for a in word:
        for b in forbidden:
         if b == a:
            return False
    return True # yasakli harfleri bulundurmayan kelimeler
def must_be_used(word , mustbe):
    for a in mustbe:
        if a not in word:
            return False
    return True # mecburi harfleri bulunduran kelimeler

def is_alphabethic_sort(word):
    b = word.__len__()
    for a in range(b-1):
     #  print(a)
       if word[a] >= word[a+1]:
            return False
    return True
'''def make_decision():
    number = random.randrange(4)
    if number is 0:
        return  '$'
    elif number is 1:
        return '#'
    elif number is 2:
        return '%'
    else:
        return '*'

def  string_search(words):
    i=0
    for a in words:
        for b in a:
            i +=1
            if b is not ' ':
             words[i] = make_decision()
    return words
  '''


fin = open('words.txt')
fin.readline()

forbidden = input("")
line = fin.readline()
word = line.strip()
#print(word)
print('a' > 'b')
count = 0
for line in fin:
    if has_no_e(line) == True:
        print(line.strip())

