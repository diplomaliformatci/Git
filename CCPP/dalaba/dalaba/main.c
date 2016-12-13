//
//  main.c
//  dalaba
//
//  Created by Can KINCAL on 12.01.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//
#include <iostream>

#include <stdlib.h>

int main(int argc, const char * argv[]) {
    char dizi[10];
    printf("metni gir ");
    scanf("%s",&dizi);
    int x = strlen(dizi);
    for (int i = 0 ; i<x;i++){
        char a=dizi[i];
        if ( a > 'a' && a <= 'z')
            dizi[i]=a-32;
        else
            dizi[i]=a+32;
        for ( int i = 0 ; i < x ; i++)
            printf("%c ",dizi[i]);
    }
    return 0;
}
