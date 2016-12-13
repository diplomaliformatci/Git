//
//  main.c
//  matrisin satirinin bütüğü :d
//
//  Created by Can KINCAL on 4.04.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
int matrisdebul(int [][2],int,int);
int main(int argc, const char * argv[]) {
    int satir,sutun=2;
    scanf("%d",&satir);
    int matris[satir][2];
    for (int i=0;i<satir;i++)
        for (int x=0;x<2;x++)
            scanf("%d",&matris[i][x]);
    for(int i=0;i<satir;i++)
        for(int x=0;x<sutun;x++)
    printf("%d\n",matrisdebul(matris,satir,2));
    
    printf("Hello, World!\n");
    return 0;
}
int matrisdebul(int matris[][2],int satir,int sutun){
    int enbuyuk=0;
    for (int i=0;i<satir;i++)
        for (int x=0;x<sutun;x++)
            if (matris[i][x]>enbuyuk)
                enbuyuk=matris[i][x];
            return enbuyuk;
    
}

