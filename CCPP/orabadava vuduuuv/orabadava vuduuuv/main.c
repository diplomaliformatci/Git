//
//  main.c
//  orabadava vuduuuv
//
//  Created by Can KINCAL on 20.02.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
int minimum(int deger1,int deger2);
int maksimum(int deger1,int deger2);
int main(int argc, const char * argv[]) {
    int sayi1,sayi2;
    printf("birinci sayiyi giriniz ");
    scanf("%d",&sayi1);
    printf("ikinci sayiyi giriniz " );
    scanf ("%d",&sayi2);
    minimum (sayi1,sayi2);
    maksimum(sayi1,sayi2);
    
    printf("Hello, World!\n");
    return 0;
}
int mininmum(int deger1,int deger2){
    if (deger1>deger2)
        printf("%d daha buyuktur ",deger1);
    else
        printf("%d daha buyuktur ",deger2);
}
