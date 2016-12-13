//
//  main.c
//  kaka
//
//  Created by Can KINCAL on 29.05.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
void my_strcpy(char* ,char* );
int main(int argc, const char * argv[]) {
    char dizi1[10]="ahmet";
    char dizi2[10];
    char *p1,*p2;
    p1=dizi1;
    p2=dizi2;
    my_strcpy(p1, p2);
    printf("%s",p2);
    
    return 0;
}
void my_strcpy(char* dizi1,char* dizi2){
    for (int i=0;i<10;i++){
        *dizi2=*dizi1;
        dizi1++;
        dizi2++;
    }
}
