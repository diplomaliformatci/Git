//
//  main.c
//  agucugugucu
//
//  Created by Can KINCAL on 11.01.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int dizi[5];
    int i = 0;
    while (i<5){
        scanf("%d",&dizi[i]);
        i++;
        
    }
    printf("Tek Sayilar:");
    for (i=0;i<5;i++)
        if (dizi[i]%2==0)
            printf("%d,",dizi[i]);
    printf("\n");
    printf("Cift Sayilar:");
    for (i=0;i<5;i++)
        
        if (dizi[i]%2!=0)
            printf("%d,",dizi[i]);
    printf("\n");
    printf("Hello, World!\n");
    return 0;
}
