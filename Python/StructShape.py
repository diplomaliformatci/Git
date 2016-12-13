from __future__ import print_function , division
def structshape(ds):
    typename = type(ds).__name__
    sequence = (list,tuple,set,type(iter('')))
    if isinstance(ds,sequence):
        t = []
        for i , x in enumerate(ds):
            t.append(structshape(x))
        rep = '%s of %s ' % (typename,listrep(t))
        return rep
    elif isinstance(ds,dict):
        keys = set()
        vals = set()
        for k , v in ds.items():
            keys.add(structshape(k))
            vals.add(structshape(v))
        rep = '%s of %d %s -> %s' % (typename , len(ds) , setrep(keys) ,setrep(vals))
    else:
        if hasattr(ds , '__class__'):
            return ds.__class__.__name__
        else:
            return typename
def listrep(t):
    current = t[0]
    count = 0
    res = []
    for x in t:
        if x == current:
            count +=1
        else:
            append(res,current,count)
            current = x
            count =1
    append(res,current,count)
    return setrep(res)
def setrep(s):
    rep = ',' .join(s)
    if len (s) == 1:
        return rep
    else:
        return '(' + rep + ')'
    return
def append(res , typestr , count):
    if count == 1:
        rep = typestr
    else:
        rep = '%d %s ' % (count ,typestr)
    res.append(rep)
if __name__ == '__main__':
    t= [1,2,3]
    print(structshape(t))
    t2=[[1,2,3] , [4,5,] , [5,6] ]
    print(structshape(t2))