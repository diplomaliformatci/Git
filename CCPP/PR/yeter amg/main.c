//
//  main.c
//  yeter amg
//
//  Created by Can KINCAL on 11.01.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int matris[3][3],i,j,x,y,toplam=0,toplam2=0;
    for (i=0;i<3;i++){
        for (j=0;j<3;j++)
            scanf("%d",&matris[i][j]);
    }
    for (x=0;x<3;x++){
        for (y=0;y<3;y++){
         //x sabit y degişicek
            toplam+=matris[x][y];
            toplam2+=matris[y][x];
            
            
            
        }
        printf("%d sutunu sayilari toplami: %d\n",x,toplam2);
        toplam2=0;
        printf("%d satiri sayilari toplami: %d\n",x,toplam);
        toplam=0;
    }
    printf("Hello, World!\n");
    return 0;
}


/* 1 2 3
   4 5 6
   7 8 9 */