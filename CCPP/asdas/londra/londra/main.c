//
//  main.c
//  londra
//
//  Created by Can KINCAL on 14.05.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
int i,j,k;
int dizi[5];
int main(int argc, const char * argv[]) {
    for (i=0;i<5;i++){
        scanf("%d",&dizi[i]);
        
    }
    printf("cift sayilar \n");
    for (j=0;j<5;j++){
        if (dizi[j]%2==0)
            printf("%d",dizi[j]);
    }
    printf("\n");
    printf("tek sayilar\n");
    for (k=0;k<5;k++)
        if(dizi[k]%2!=0){
            printf("%d,",dizi[k]);
        }


    printf("Hello, World!\n");
    return 0;
}
