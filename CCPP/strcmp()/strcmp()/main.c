//
//  main.c
//  strcmp()
//
//  Created by Can KINCAL on 16.05.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
#include <string.h>
int my_strcmp(char dizi1[],char dizi2[]){
    int i=0;
    while (dizi1[i]!='\0' && dizi2[i]!='\0'){
        if(dizi2[i]==dizi2[i]){
        i++;
    }
        else {return 0;}
}
    return 1;
}


int main(int argc, const char * argv[]) {
    char dogrucevap[]="Ankara";
    char cevap[20];
    printf("türkiyenin başkenti hangi ilimizdir");
    scanf("%s",cevap);
    if (strcmp(cevap,dogrucevap)==0)
        printf("cebabınız doğru tebrikler");
    else
        printf("cevabınız yanlış tekrar deneyiniz");
    printf("Hello, World!\n");
    return 0;
}
