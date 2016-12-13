
from __future__ import print_function, division


def make_word_list():
    word_list = []
    fin = open('words.txt')
    for line in fin:
        word = line.strip()
        word_list.append(word)
    return word_list
def in_bisect(word_list , word):
    if len(word_list) == 0:
        return False
    i = len (word_list) //2
    if word_list[i] == word:
        return True
    if word_list[i] > word:
        return in_bisect(word_list[:i] , word)
    else:
        return in_bisect(word_list[i+1:] ,word)

def interlock(word_list , word):
    evens = word[::2]
    odds = word[1::2]
    return in_bisect(word_list , evens) and in_bisect(word_list,odds)
def interlock_general(word_list , word, n=3):
    for i in range(n):
        inter = word[i::n]
        if not in_bisect(word_list,inter):
            return False
    return True
if __name__ == '__main__':
    word_list = make_word_list()
    for word in word_list:
        if interlock(word_list, word):
            print(word,word[::2] ,word[1::2])
    for word in word_list:
        if interlock_general(word_list , word,3):
            print(word,word[0::3] , word[1::3] , word[2::3])
