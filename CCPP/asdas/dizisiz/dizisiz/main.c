//
//  main.c
//  dizisiz
//
//  Created by Can KINCAL on 12.04.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
#include <string.h>
void my_strcat(char dizi1[],char dizi2[]){
    int i;
    int uzunluk1 =my_strlen(dizi1);
    int uzunluk2 =my_strlen(dizi2);
    for(i=0;i<uzunluk2;i++){
        dizi1[uzunluk1+i]=dizi2[i];
        dizi1[uzunluk1 +i]='\0';
    }
}
int my_strlen(char dizi[]){
    int i=0;
    while (dizi[i]!='\0')
        i++;
    return i;
}
void my_strcpy( char dizi1[],char dizi2[]){
    int i,len;
    len =my_strlen(dizi2);
    for(i=0;i<=len;i++)
        dizi1[i]=dizi2[i];
}
int main(int argc, const char * argv[]) {
    char dizi1[20]="merhaba ";
    char dizi2[20];
    printf("isminizi giriniz ");
    scanf("%s",dizi2);
    strcat(dizi1,dizi2);
    printf("%s ",dizi1);
    return 0;
}
