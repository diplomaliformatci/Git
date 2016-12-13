def metathesis():
    fin = open('words.txt')
    t = []
    count = 0
    for a in fin :
        #3for b in fin:
            if count > 2 :
                count = 0
                break
            for c in a:
                if c not in a:
                    break
                else:
                    t.append(a)

    return t

if __name__ == '__main__':
    isim1 = 'kdenemek'
    isim2 = 'dmgkmkem'
    count=0
    t1 = tuple(isim1)
    t2 = tuple (isim2)
    for a in t1:
        count += 1
        if a not in t2 or count > 2:
            break
        print(a)
    print (metathesis())