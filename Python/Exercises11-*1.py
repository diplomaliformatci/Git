def make_dictionary():
    fin = open('words.txt')
    words = dict()
    for a in fin:
        if a in words:
         words[a]+=1
        else:
         words[a]=1
    return words

if __name__ == '__main__':
  print ('dictionary examples ')
  kelime = dict()
  kelime = make_dictionary()

  for b in kelime:
      if kelime[b] == 1:
        print (kelime[b], b)
        print ('\n')
