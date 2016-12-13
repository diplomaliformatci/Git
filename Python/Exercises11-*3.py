#import __future__  import print_function, division
#from rotate import rotate_word
def make_word_dict():
    d = dict()
    fin = open ('words,txt')
    for line in fin :
        word = line.strip().lower()
        d[word] = None
    return d
def rotate_pairs(word , word_dict):
    for i in range(1,14):
        rotated = rotate_word(word,i)
        if rotated in word_dict:
            print(word,i,rotated)

def reverse(value):
    value2 = ''
    counter = len(value)
    counter -=1
    while counter > 0:
        value2 += value[counter]
        counter -=1
    print(value + '   ' + value2)
    return value2

def rotate_pairs(value , dict):
    new_value  = reverse(value)
    if new_value in dict:
        return True
    else:
        return False

if __name__ ==  '__main__':
    dict = dict()
    fin = open('words.txt')
    for a in fin :
       if a in dict:
        dict[a] += 1
       else:
           dict[a] = 1
    for  b in dict:
        if rotate_pairs(b,dict):
            print('isleniyor')