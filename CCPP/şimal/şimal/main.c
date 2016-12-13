//
//  main.c
//  şimal
//
//  Created by Can KINCAL on 17.05.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
char reserve(char dizi[],int a){
    int gecici;
    char dizi2[20];
    int i=0;
    while (dizi[i]!='\0'){
        i++;
    }
    a=i;
    for (gecici=0;gecici<=a;gecici++){
        i--;
    }
   
    return dizi;
}

int main(int argc, const char * argv[]) {
    char dizi[20];
    printf("bir kelime giriniz");
    scanf("%s",dizi);
    reserve(dizi,20);
    printf("%s",reserve(dizi,20));
    printf("Hello, World!\n");
    return 0;
}
