from __future__ import print_function, division

import os
def replace(source , filename1 , filename2):
    #TODO Taking a text file and changing specifies words with ur expect
    fin = open(filename1 , 'r')
    fout = open(filename2 , 'w')
    for line in fin:
        line = line.replace('bilgiye' , source)
        fout.write(line)


def main():
    #TODO for main class minimize
    replace("denemelerimi veremn alime " , 'text.txt' ,' text2.txt')


if __name__ == '__main__':
        main()