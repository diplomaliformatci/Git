def has_match(t1, t2):
    for x, y in zip(t1, t2):
        if x == y:
            return True
    return False


if __name__ == '__main__':
 t1 = tuple('nevarlar')
 t2 = tuple('m')
 t3 = [('a' , 0 )  , ('b' , 1) , ('c' , 2)]
 d = dict(t3)

 print (has_match(t1,t2))
 for element, index  in enumerate(t1):
     print(element,index)
 print (d)