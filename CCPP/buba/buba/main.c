//
//  main.c
//  buba
//
//  Created by Can KINCAL on 24.02.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
int kuvvethesapla(int,int);
int main(int argc, const char * argv[]) {
    int sayi;
    int kuvvet;
    int x;
    printf("hesaplamak istediginiz sayiyi ve kuvvetini giriniz\n\n");
    scanf("%d%d",&sayi,&kuvvet);
    printf("%d^%d=%d\n\n\n",sayi,kuvvet,kuvvethesapla(sayi,kuvvet));
    putchar(x);
    printf("Hello, World!\n");
    return 0;
}
int kuvvethesapla(int sayi,int kuvvet){
    if (kuvvet == 2)
        return sayi*sayi;
    int i;
    int carpim=1;
    for ( i = 1; i<=kuvvet;i++){
        carpim*=sayi;}
        return carpim;
}
