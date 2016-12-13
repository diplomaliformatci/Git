//
//  main.c
//  lamada
//
//  Created by Can KINCAL on 12.04.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
void reserve (char dizi[]);
int main(int argc, const char * argv[]) {
    char dizi[10]="kelime";
    reserve(dizi);
    for(int i=0;i<10;i++)
    printf("%c",dizi[i]);
    printf("Hello, World!\n");
    return 0;
}
void reserve(char dizi[]){
    int a,b=0;
    char dizi1[10];
    for(a=10;a>0;a++){
        dizi1[b]=dizi[a];
        b++;
    }
    for(a=0;a<10;a++)
        dizi[a]=dizi1[a];
    
}