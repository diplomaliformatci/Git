//
//  main.c
//  ll
//
//  Created by Can KINCAL on 20.02.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
void carpimiyazdir(int , int);
void herkesiselamla(void);
void toplamiyazdir(int,int);
int main(int argc, const char * argv[]) {
    int sayi1,sayi2;
    printf("birinci sayiyi giriniz:");
    scanf("%d",&sayi1);
    printf("ikinci sayiyi giriniz:");
    scanf("%d",&sayi2);
    carpimiyazdir(sayi1,sayi2);
    herkesiselamla ();
    toplamiyazdir(sayi1,sayi2);
    
    
    
    printf("\nHello, World!\n");
    return 0;
}
void carpimiyazdir(int deger1,int deger2){
    int carpim = deger1 * deger2;
    printf("\n%d x %d = %d\n",deger1,deger2,carpim);
}
void herkesiselamla () {
    printf("\nhello world");
}
void toplamiyazdir (int deger1 , int deger2) {
    int toplam = deger1 + deger2 ;
    printf("\n%d + %d = %d\n",deger1,deger2,toplam);
}

