//
//  main.c
//  kadastro
//
//  Created by Can KINCAL on 15.05.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
#include <string.h>
int my_strlen(char dizi[]){
    int i=0;
    while (dizi[i]!='\0'){
        i++;
    }
    return i;
}
int main(int argc, const char * argv[]) {
    char kullaniciadi[20];
    unsigned long karaktersayisi=0;
    printf("lütfen kullanici adinizi giriniz:");
    scanf("%s",kullaniciadi);
    karaktersayisi = strlen(kullaniciadi);
    if (karaktersayisi<6)
        printf("kullanici adi en az 6 karakterden oluşmalıdır");
    else printf("kullanici adiniz gecerli");
    printf("Hello, World!\n");
    return 0;
}
