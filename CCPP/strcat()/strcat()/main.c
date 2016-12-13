//
//  main.c
//  strcat()
//
//  Created by Can KINCAL on 15.05.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
#include <string.h>
void my_strcat (char dizi1[],char dizi2[]){
    int i;
    int uzunluk1 = my_strlen(dizi1);
    int uzunluk2 = my_strlen(dizi2);
    for (i=0;i<uzunluk2;i++)
        dizi1[uzunluk1+i]=dizi2[i];
    dizi1[uzunluk1+i]='\0';
}
int main(int argc, const char * argv[]) {
    char dizi1[20]="Merhaba ";
    char dizi2[20];
    printf("isminizi giriniz");
    scanf("%s",dizi2);
    //kullanıcının girdiği ismi dizi1 değişkeninin sonuna ekleyelim
    strcat(dizi1,dizi2);
    printf("%s\n",dizi1);
    printf("Hello, World!\n");
    return 0;
}
