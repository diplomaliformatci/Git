//
//  main.c
//  abiick
//
//  Created by Can KINCAL on 11.01.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int dizi[10]={15,24,56,32,27,34,98,124,102,99};
    int sayi=0;
    int x;
    while (sayi<1 || sayi>10){
        printf("1-ile 10 arasinda bir sayi degeri gir ..");
    scanf("%d",&sayi);}
    for(x=0;x<9;x++)
    for (int i=0;i<9;i++){
        if (dizi[i]>dizi[i+1] ){
            int gecici;
            gecici =dizi[i];
        dizi[i]=dizi[i+1];
            dizi[i+1]=gecici;
            
        }
    }
    int i;
    
        printf(" %d.eleman : %d\n",sayi,dizi[sayi-1]);
    
    printf("Hello, World!\n");
    return 0;
}
