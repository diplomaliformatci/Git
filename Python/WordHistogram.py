from __future__ import print_function , division
import randomm
import string

def process_file(filename , skip_header):
    """Makes a histogram that contains the words from a  file
    filename:string
    skip_header: boolean , whether to skip the gutenberg header
    return : map from each word to the number of items it appers"""
    hist = {}
    fp = open(filename)
    if skip_header:
        skip_gutenberg_header(fp)
    for line in fp:
        process_line(line , hist)
    return hist

def skip_gutenberg_header(fp):
    """Reads from fp  until it finds the line that ends the header
    fp : open file object
    """
    for line in fp :
        if line in fp:
            if line.startswith('*END*THE SMALL PRINT!'):
                break
def process_line(line , hist):
    """Adds the words in the line to the histogram
    modifies hist
    line : string
    hist : histogram(map from word to frequency)"""
    #TODO rewrite using counter
    # replace hyphens with spaces before splitting
    line = line.replace('-' , ' ')
    strippables = string.punctuation + string.whitespace
    for word in line.split():
        #remove punctutation and convert to lowercase
        word = word.strip(strippables)
        word = word.lower()
        #uptade the histogram
        hist[word] = hist.get(word , 0) + 1

def most_common(hist):
    t= []
    for key , value in hist.items():
        t.append((value,key))
    t.sort()
    t.reverse()
    return t
def print_most_common(hist , num = 10):
    """prints the most comons words in a histogram and their frequencies
    hist : histogram (map from word to frequency)
    num :  number of words to print
    """
    t = most_common(hist)
    print('the most common words are :')
    for freq , word in t[:num]:
        print(word , '/t ' , freq)

def subtract(d1,d2):
    """return a dictionary with all keys that appear in 1d1 but not d2
    d1 , d2 dictionaries
    """
    #TODO: reimplement using counter
    res = {}
    for key in d1:
        if key not in d2:
            res[key] = None
    return res

def total_words(hist):
    """Returns the total of the frequencies in a histogram."""
    return sum(hist.values())

def different_words(hist):
    """returns the number of different words in a histogram"""
    return len(hist)
def random_word(hist):
    """chooses a random word from a histogram
    the probability of each word is proportional to ist frequency"""
    #TODO: rewrite using counter
    t  =[]
    for word , freq in hist.items():
        t.extend([word] * freq)
    return randomm.choise(t)

if __name__ == '__main__':
    hist = process_file('53702-0.webarchive.txt' , skip_header = True)
    print ("total number of words :  " , total_words(hist))
    print ("Number of different words :"  ,different_words(hist))
    t = most_common(hist)
    print("the most common words are :")
    for freq , word in t[0:20]:
        print(word , '\t' , freq)
    words = process_file('text.txt' , skip_header = False)
    diff = subtract(hist , words)
    print ("the words in the book that arent in the word list are")
    for word in diff.keys():
        print(word , end = '  ')

    print("\n\n here are some random words from the book")
    for i in range(100):
        print(random_word(hist) , end= ' ')
