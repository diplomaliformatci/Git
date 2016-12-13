//
//  main.c
//  kalabak
//
//  Created by Can KINCAL on 17.05.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
#include <ctype.h>
int kontrol(char dizi[]){
    for (int i=0;dizi[i]!='\0';i++){
        dizi[i]=tolower(dizi[i]);
    }
    int a=0;
    for (int i=0;dizi[i]!='\0';i++){
        a++;
    }
    for (int i=0;i<=a;i++){
        if (dizi[i]!=dizi[a-1])
            return 0;
        a--;
    
    }
    return 1;
}
int main(int argc, const char * argv[]) {
    char dizi[10];
    scanf("%s",dizi);
    if (kontrol(dizi))
        printf("tersten okunusu ayni");
    else
        printf("tersten okunusu farkli");
    printf("Hello, World!\n");
    return 0;
}
