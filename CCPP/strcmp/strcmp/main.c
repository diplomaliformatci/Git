//
//  main.c
//  strcmp
//
//  Created by Can KINCAL on 30.05.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
void sonunaekle(char*,char*);
int main(int argc, const char * argv[]) {
    char dizi1[100]="ahmet";
    char dizi2[100]="mehmet";
    char *ptr1,*ptr2;
    ptr1=dizi1;
    ptr2=dizi2;
    sonunaekle(ptr1,ptr2);
    
    printf("%s\n",dizi1);
    printf("Hello, World!\n");
    return 0;
}
void sonunaekle(char *ptr1,char *ptr2){
    int i=0;
    int b=0;
    printf(">>>>>%s<<<<<\n",ptr1);
    while (*ptr1!='\0'){
        i++;
        ptr1++;
        printf("i nın %d. kullanımı\n",i);
    }
    while (*ptr2!='\0'){
        
        b++;
    ptr2++;
        printf("b nin %d. kullanımı\n",b);
    }
    for (int a=0;a<b;a++){
        ptr1[a+i]=ptr2[a];
        printf("calistikca gom %d. \n",a);
    }
    printf("------>%s<------ \n",ptr2);
}
