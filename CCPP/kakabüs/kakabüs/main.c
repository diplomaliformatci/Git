//
//  main.c
//  kakabüs
//
//  Created by Can KINCAL on 9.03.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    float ortalama;
    int dizi[3][30];
    int toplam=0;
    for (int i=0;i<3;i++)
        for (int y=0;y<30;y++)
            scanf("%d",&dizi[y][i]);
    for (int x=0;x<3;x++)
        for (int b=0;b<30;b++){
            toplam += dizi[b][x];
            ortalama=toplam/30.0;}
    printf("Ortalama : %f",ortalama);
    printf("Hello, World!\n");
    return 0;
}
