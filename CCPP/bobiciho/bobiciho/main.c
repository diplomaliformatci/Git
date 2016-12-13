//
//  main.c
//  bobiciho
//
//  Created by Can KINCAL on 5.01.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int matris1[3][3];
    int matris2[3][3];
    int sonuc[3][3];
    int satir=0,sutun = 0;
    clrscr();
    printf("\niki matrsin toplanmasi");
    printf("\n======================");
    printf("\n1. matrisi giriniz \n");
    for (satir =0;satir<3;satir++)
    {
        for(sutun=0;sutun<3;sutun++){
            printf("deger [%i][%i]:",satir+1,sutun+1);
        scanf("%i",&matris1[satir][sutun]);
        fflush(stdin);
    }
    }
    printf("\n 2. matris i giriniz : \n");
    for (satir=0;satir<3;satir++){
        for (sutun=0;sutun<3;sutun++){
            printf("deger [%i][%i]",satir+1,sutun+1);
            scanf("%i",&matris2[satir][sutun]);
            fflush(stdin);
            
        }
    }
    for (satir=0;satir<3;satir++){
        for (sutun=0;sutun<3;sutun++){
            sonuc[satir][sutun] =matris1[satir][sutun] + matris2[satir][sutun];
            
        }
    }
    clrscr();
    printf("\n matrislerin toplami : \n");
    for ( satir=0;satir<3;satir++){
        printf("%i", matris1[satir][sutun]);
    if (satir == 1 )
        printf(" + ");
    else
        printf("  ");
    for (sutun =0;sutun<3;sutun++)
        printf("%i",matris2[satir][sutun]);
    if (satir == 1 )
        printf("  =  ");
    else
        printf("    ");
    for ( sutun=0;sutun<3;sutun++)
        printf("%i",sonuc[satir][sutun]);
    }

    return 0;
}
