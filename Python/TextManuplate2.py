import randomm
import string

def process_file(filename , skip_header):
    hist = {}
    fp = open(filename)
    for line in fp:
        process_line(line,hist)
    return hist

def process_line(line ,hist):
    #TODO rewrite using counter
    line = line.replace('-' , ' ')
    strippables = string.punctuation + string.whitespace
    for word in line.split():
        word = word.strip(strippables)
        word = word.lower()
        hist[word] = hist.get(word, 0) +1
def most_common (hist):
    t = []
    for key , value in hist.items():
        t.append((value,key))
    t.sort()
    t.reverse()
    return t

def difference(d1,d2):
    #TODO reimplement using counter
    res = {}
    for key in d1:
        if key not in d2:
            res[key] = None
    return res


if __name__ == '__main__':
    #TODO testing with swapping dictionaries
    dict = process_file('text.txt' , True)
    dict2 = process_file('53702-0.webarchive.txt' , True)
    list = most_common(dict)
    print(list)
    print('\n\n')
    list2 = most_common(dict2)
    print(list2)
    d3 = difference(dict,dict2)
    list3 = most_common(d3)
    print(list3)
