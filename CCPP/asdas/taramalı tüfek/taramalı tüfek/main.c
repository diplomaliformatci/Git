//
//  main.c
//  taramalı tüfek
//
//  Created by Can KINCAL on 6.04.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
void matrissirala(int mat[][3]);
int main(int argc, const char * argv[]) {
    int matris[3][3];
    for (int i=0;i<3;i++)
        for (int x=0;x<3;x++)
            scanf("%d",&matris[i][x]);
    matrissirala(matris);
    printf("Hello, World!\n");
    return 0;
}
void matrissirala(int matris[][3]){
    int degisken;
    for (int i=0;i<3;i++)
        for (int x=0;x<3;x++){
           if(matris[i][x+1]>=matris[i][x])
               degisken=matris[i][x+1];
                matris[i][x+1]=matris[i][x];
                matris[i][x]= degisken ;
        }
    for (int x=0;x<3;x++){
        for (int y=0;y<3;y++){
            printf("%3d",matris[x][y]);
        }
        printf("\n");}
}