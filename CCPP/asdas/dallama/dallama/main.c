//
//  main.c
//  dallama
//
//  Created by Can KINCAL on 12.04.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
int my_strlen(char dizi[]);
void my_strcpy(char dizi1[],char dizi2[]);
int my_strcmp(char dizi1[],char dizi2[]);
int my_strcmpV2(char dizi1[],char dizi2[]);

int main(int argc, const char * argv[]) {
    char kelime[50];
    printf("bir metin giriniz");
    gets(kelime);
    int uzunluk = my_strlen(kelime);
    printf("girdiginiz metindeki karakter sayisi:%d\n",uzunluk);
    my_strcpy(kelime,"baba bana para ver");
    puts(kelime);
    printf("girdiginiz metindeki karakter sayisi : %d\n",my_strlen(kelime));
    char dizi1[]="kitap";
    char dizi2[]="defter";
    char dizi3[]="kitap";
    if (my_strcmp(dizi1,dizi2)>0)
        printf("%s ve %s ayni \n",dizi1,dizi2);
    else
        printf("%s ve %s farkli\n",dizi1,dizi2);
    if (my_strcmp(dizi1,dizi3))
        printf("%s ve %s ayni \n",dizi1,dizi3);
    else
        printf("%s ve %s farkli\n",dizi1,dizi3);
    if (my_strcmpV2(dizi1,dizi3))
        printf("%s ve %s ayni \n",dizi1,dizi3);
    else printf("%s ve %s farkli\n",dizi1,dizi3);
        printf("Hello, World!\n");
    return 0;
}
int my_strlen(char dizi[]){
    int i=0;
    while (dizi[i]!='\0')
        i++;
    return i+1;
}
void my_strcpy(char dizi1[],char dizi2[]){
    int uzunluk=my_strlen(dizi2);
    for(int i=0;i<uzunluk;i++)
        dizi1[i]=dizi2[i];
}
void my_strcat(char dizi1[],char dizi2[]){
    int uzunluk=my_strlen(dizi1);
    int son=my_strlen(dizi2);
    for (int i=0;i<son;i++)
        dizi1[i+uzunluk]=dizi2[i];
    
}
int my_strcmp(char dizi1[],char dizi2[]){
    int uzunluk=my_strlen(dizi1);
    if (my_strlen(dizi1)!=my_strlen(dizi2))
        return 0;
    else
        for (int i=0;i<uzunluk;i++)
            if (dizi1[i]!=dizi2[i])
                return 0;
    return 1;
    
    
    
    
}