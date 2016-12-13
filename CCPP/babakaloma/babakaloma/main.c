//
//  main.c
//  babakaloma
//
//  Created by Can KINCAL on 24.02.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
int kucuk(int,int);
int buyuk(int,int);
int main(int argc, const char * argv[]) {
    int sayi1,sayi2;
    
    printf("lütfen 2 adet sayi giriniz");
    scanf("%d%d",&sayi1,&sayi2);
    printf("buyuk olan sayi %d\n",buyuk(sayi1,sayi2));
    printf("kucuk olan sayi %d\n",kucuk(sayi1,sayi2));
    printf("Hello, World!\n");
    return 0;
}
int kucuk (int deger1,int deger2){
    if (deger1<deger2)
        return deger1;
    else return deger2;
}
int buyuk(int deger1,int deger2){
    if ( deger1>deger2)
        return deger1;
    else return deger2;
    
}