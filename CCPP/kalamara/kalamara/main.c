//
//  main.c
//  kalamara
//
//  Created by Can KINCAL on 20.07.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>
void matrisyazdir(int ** ,int ,int);
void transpozyazdir(int ** , int ,int);
int main(int argc, const char * argv[]) {
    int **matris;
    int satirsayisi,sutunsayisi;
    printf("olusturacaginiz matrisin satir sayisii giriniz");
    scanf("%d",&satirsayisi);
    printf("olusturacaginiz matrisin sutun sayisini giriniz : ");
    scanf("%d",&sutunsayisi);
    matris= (int **) malloc(sizeof(int) * sutunsayisi);
    int i,j;
    for (i=0;i<satirsayisi;i++)
        matris[i]= (int * ) malloc (sizeof(int)*sutunsayisi);
    printf("--------------------------\n");
    printf("matris icin elemanlari giriniz \n");
    printf("----------------------------\n");
    for (i=0;i<satirsayisi;i++){
        for (j=0;j<sutunsayisi;j++){
            printf("Matris[%d][%d]= ",i,j);
            scanf("%d",&matris[i][j]);
            
        }
    }
    printf("girdiginiz matris : \n");
    matrisyazdir(matris,satirsayisi,sutunsayisi);
    printf("matrisin transpozu : \n");
    transpozyazdir(matris,satirsayisi,sutunsayisi);
    for (i=0;i<satirsayisi;i++)
        free(matris[i]);
    free(matris);
    printf("Hello, World!\n");
    return 0;
}
void matrisyazdir(int ** matris,int satir,int sutun){
    int i,j;
    for (i=0;i<satir;i++){
        for (j=0;j<sutun;j++){
            printf("%5d",matris[i][j]);
        }
        printf("\n");
        }
    }
void transpozyazdir(int ** matris,int satir,int sutun){
    int i,j;
    for (i=0;i<sutun;i++){
        for (j=0;j<satir;j++){
            printf("%5d",matris[j][i]);
            
        }
        printf("\n");
    }
}

