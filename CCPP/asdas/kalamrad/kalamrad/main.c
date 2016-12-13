//
//  main.c
//  kalamrad
//
//  Created by Can KINCAL on 14.05.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    float dizi[10];
    float toplam=0.0;
    
    for (int i=0;i<10;i++)
        scanf("%f",&dizi[i]);
    for(int i=0;i<10;i++)
        toplam+=dizi[i];
    printf("toplam = %.2f",toplam);
    printf("Hello, World!\n");
    return 0;
}
