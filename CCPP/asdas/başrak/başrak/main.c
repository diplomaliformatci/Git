//
//  main.c
//  başrak
//
//  Created by Can KINCAL on 14.05.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int dizi[5];
    for (int i=0;i<5;i++)
        scanf("%d",&dizi[i]);
    printf("cift sayilar=");
    for (int i=0;i<5;i++)
        if(dizi[i]%2==0)
            printf("%d ",dizi[i]);
    printf("\n");
    printf("tek sayilar");
    for (int i=0;i<5;i++)
        if (dizi[i]%2!=0)
            printf("%d ",dizi[i]);
    printf("Hello, World!\n");
    return 0;
}
