//
//  main.c
//  lamadabu
//
//  Created by Can KINCAL on 8.03.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
int asalsayimi(int sayi)
{
    int i;
    for ( i = 2 ; i < sayi ; i++){
        if (sayi%i==0 && sayi!=2)      return 0;
        
    }
    return 1;
}
int main(int argc, const char * argv[]) {
    int girilensayi;
    int testsonucu;
    do {
        printf("lütfen bir sayi giriniz");
        scanf("%d",&girilensayi);
        testsonucu = asalsayimi(girilensayi);
        if (!testsonucu)
            printf("girilen sayi asal degildir\n");
        
    }while (!testsonucu);
        printf("girilen sayi asaldir\n");
    printf("Hello, World!\n");
    return 0;
}
