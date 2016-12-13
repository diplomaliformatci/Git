//
//  main.c
//  pointerdytvsy
//
//  Created by Can KINCAL on 29.05.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
int  mystrlen(int);
void swap(int*,int*);
int main(int argc, const char * argv[]) {
    int sayi1=5,sayi2=4;
    int *p1,*p2;
    p1=&sayi1;
    p2=&sayi2;
    swap(p1,p2);
    printf ("1. sayi %d 2. sayi %d",sayi1,sayi2);
    printf("Hello, World!\n");
    return 0;
}
void swap(int *p1,int *p2){
    int gecici;
    gecici=*p1;
    *p1=*p2;
    *p2=gecici;
}