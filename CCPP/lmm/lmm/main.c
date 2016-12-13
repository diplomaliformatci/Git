//
//  main.c
//  lmm
//
//  Created by Can KINCAL on 25.07.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>
void diziyazdir(int * dizi,int elemansayisi);
int main(int argc, const char * argv[]) {
    int *sayidizisi1;
    int sayi;
    printf("eleman sayisini giriniz");
    scanf("%d",&sayi);
    sayidizisi1=(int*)calloc(sayi,sizeof(int));
    printf("\n-------------------------------------\n");
    printf("calloc sonucu olusan dizinin elemanlarin");
    diziyazdir(sayidizisi1,sayi);
    printf("dizi elemanlarinia 5 degerini atayalim ");
    int i;
    for (i=0;i<sayi;i++){
        sayidizisi1=5;
    }
    diziyazdir(sayidizisi1,sayi);
    sayi=10;
    sayidizisi1=realloc(sayidizisi1,sayi*sizeof(int));
    printf("realloc sonucu olusan diinin elemanlari \n");
    diziyazdir(sayidizisi1,sayi);
    free(sayidizisi1);
    
    printf("Hello, World!\n");
    return 0;
}
void diziyazdir(int *dizi,int elemansayisi){
    int i;
    for(i=0;i<elemansayisi;i++){
        printf("dizi[%d]=%d\n",i,dizi[i]);
    }
}
