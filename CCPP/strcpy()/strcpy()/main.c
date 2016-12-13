//
//  main.c
//  strcpy()
//
//  Created by Can KINCAL on 15.05.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
#include <string.h>
void my_strcpy(char dizi1[],char dizi2[]){
    int i,len;
    len = my_strlen(dizi2);
    for (i=0;i<=len ;i++)
        dizi1[i]=dizi2[i];
}
int main(int argc, const char * argv[]) {
    char dizi1[20]="Merhaba";
    char dizi2[20];
    //ilk diziyi ikincisine kopyalayalım
    strcpy(dizi2,dizi1);
    //her iki dizinin de değerini ekrana yazdılarım
    printf("dizi1 -> %s\n",dizi1);
    printf("dizi2 -> %s\n",dizi2);
    printf("Hello, World!\n");
    return 0;
}
