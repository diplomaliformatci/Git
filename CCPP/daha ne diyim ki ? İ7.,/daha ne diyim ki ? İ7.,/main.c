//
//  main.c
//  daha ne diyim ki ? İ7.,
//
//  Created by Can KINCAL on 4.04.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
int matristoplami(int matris[][5],int satir,int sutun);
int main(int argc, const char * argv[]) {
    int satir,sutun=5;
    scanf("%d",&satir);
    int matris[satir][sutun];
    
    for (int i = 0 ; i<satir;i++)
        for (int y=0;y<sutun;y++)
            scanf("%d",&matris[i][y]);
    printf("matris toplami : %d",matristoplami(matris,satir,sutun));
    printf("Hello, World!\n");
    return 0;
}
int matristoplami(int matris[][5],int satir, int sutun){
    int toplam=0;
    for (int i=0;i<satir;i++)
        for (int y =0;y<sutun;y++)
            toplam+=matris[i][y];
    return toplam;
}