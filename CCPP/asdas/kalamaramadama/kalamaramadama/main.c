//
//  main.c
//  kalamaramadama
//
//  Created by Can KINCAL on 12.04.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int sayi=15;
    printf("sayi degiskeninin degeri %d\n",sayi);
    printf("sayi degiskeninin bellek adresi %p\n",&sayi);
    int *p = NULL;
    printf("p isaretcisnin tanimlama esnasindaki degeri : %p\n",p);
    p=&sayi;
    printf("p isaretcisinin yeni degeri : %p",p);
    printf("p degiskeninin tuttugu bellek adresindeki deger :%d\n",*p);
    *p=16;
    printf("p degiskeninin tuttugu bellek adresindeki yeni deger %d\n",*p);
    printf("sayi degiskenini yeni deger : %d\n",sayi);
    
    printf("Hello, World!\n");
    return 0;
}
