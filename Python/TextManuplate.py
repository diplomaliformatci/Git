import string
def getString(filename):
    text = []
    fr = open(filename)
    for a in fr:
      text.append(a.split())
    return deleteunusual(text)

def parsetext(text):
    type = []
    bloks = "-+_)(*&\"^%$#@!.,- "
    for a in text:
        type.append(a.strip(bloks))
    return type

def deleteunusual(text):
    texti = []
    for i  in range(len(text)):
       texti.append(parsetext(text[i]))
    #print (texti)
    return texti

def add_dict(d ,word):
    if word in d.keys():
        d[word] += 1
    else:
        d[word] = 1
    return d

if __name__ == '__main__':
    text = getString('53702-0.webarchive.txt')
    d = {}
    durum = 0
    count = 0
    print('\n\n\n\n\n\n\n\n\n')
    for a in text:
        for b in a:
          count += 1
          add_dict(d , b)
    print(d.items())
   # for key ,value in d.items():




         #print (d.values())
    print ('\n\n\n\n\n\n' , count)
   # print(text)

   # print(text)
  #  for i in range(len(text)):
  #      parsetext(text[i])
    #deleteunusual(text)