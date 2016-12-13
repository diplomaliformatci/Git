//
//  main.c
//  farkılılıklar
//
//  Created by Can KINCAL on 18.05.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
void farklılıklar(char dizi[],char dizi2[]){
    int a=0,i;
    int b=0;
    char dizi3[30];
    for (i=0;dizi[i] != '\0' && dizi2[i] != '\0';i++){
        a++;
    }
    for (i=0;i<=a;i++){
        if (dizi[i]!=dizi2[i]){
            dizi3[b]=dizi[i];
            b++;}
    }
    dizi3[b+1]='\0';
    printf("%s",dizi3);
}
int main(int argc, const char * argv[]) {
    char dizi1[10];
    char dizi2[10];
    scanf("%s",dizi1);
    scanf("%s",dizi2);
    farklılıklar(dizi1,dizi2);
    printf("Hello, World!\n");
    return 0;
}
