//
//  main.c
//  cincon
//
//  Created by Can KINCAL on 20.02.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
int toplamayap( int , int );
int main(int argc, const char * argv[]) {
    int sayi1,sayi2;
    sayi1=2;
    sayi2=4;
    int toplamsonucu=toplamayap(sayi1,sayi2);
    printf("%d+%d=%d\n",sayi1,sayi2,toplamsonucu);
    // insert code here...
    printf("Hello, World!\n");
    return 0;
}
int toplamayap (int deger1,int deger2){
    int sonuc = deger1 + deger2;
    return sonuc;
}
