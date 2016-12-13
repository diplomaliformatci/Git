def openfile(filename):
    d = {}
    b = []
    fr = open(filename)
    for a  in fr :
        d[a] = 1
    return d
def printdict(dict):
    for a in dict:
        print(a)

def most_frequent(fileread):
   # t= tuple(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27)
    list = []
    keys = []
    d = dict()
    for a in fileread:
        if a in d:
            d[a] += 1
        else :
            d[a] = 1

    for a  in d :
        t = (a,d[a])
        list.append(t)
    print (list)
    print(list[1])

    return make_decision(d)
def make_decision(d):
    for a in d:
        bool = True
        for b in d:
            if d[a] < d[b]:
                bool = False
                break
        if bool:
            return a
    #print (d)
def make_dict(d):
    dictionary = dict()
    for a in d:
        list = []
        for b in a:
            list.append(b)
        dictionary[a] = list
    return dictionary
#def analyze_dict(d):

def signature(s):
    t= list(s)
    t.sort()
    t = ' '.join(t)
    return t

def all_anagrams(filename):
    d = {}
    for line in open(filename):
        word = line.strip().lower()
        t = signature(word)
        if t not in d:
            d [t] = [word]
        else:
            d[t].append(word)
    return d

def filter_length(d,n):
    res = {}
    for word , anagrams in d.items():
        if len (word) == n:
            res [word] = anagrams
    return res

def print_anagram_sets_in_order(res):
    t = []
    for v in res.keys():
        if len (v) > 1:
            t.append((len(v) , v))
    t.sort()
    for x in t:
        print(x)

def metathesis_pair(d , l):
    res = {}
    bool = True
    for anagrams in d.keys():
        for word1 in anagrams:
            for word2 in anagrams:
                if word1 > word2 and word_distance(word1 , word2) > 2:
                            bool = False
        if bool == True:
            print (anagrams)
        bool = True


def word_distance(word1,word2):
    assert len(word1) == len(word2)
    count = 0
    for c1 , c2 in zip(word1,word2):
        if c1 != c2:
            count += 1

    return count



if __name__ == '__main__':
    d = dict()
    d = openfile('words.txt')
   # print (d.values())
    seconddict =  make_dict(d)
    t = print(signature("denemebirki"))
    a=all_anagrams('words.txt')
  #  print(a.items())

    #res = filter_length(d,3)
    res = {'isim':1 , 'iism' :1, 'iisim' :1, 'iiiiism' :1, 'iismmmm' :1}
    print (res)
    print (res.values())
    print(res.keys())
    metathesis_pair(res , 3)
    #print_anagram_sets_in_order(res)
    ## printdict(d.items())
    #isim = "name\n man "
    #print (isim)
    #isim = isim.strip('n')
    #print(isim)
    #print(most_frequent("denemelerimi veremmmmmmmn elime"))