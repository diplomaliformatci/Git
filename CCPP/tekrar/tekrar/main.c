//
//  main.c
//  tekrar
//
//  Created by Can KINCAL on 18.07.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int matris1[3][3];
    int matris2[3][3];
    int sonuc[3][3];
    int satir = 0 , sutun = 0;
    printf("\n iki matrsin toplanmasi .. ");
    printf("\n ===============================\n");
    printf("\n 1. matrisi giriniz : \n");
    for (satir=0;satir<3;satir++){
        for (sutun = 0 ; sutun <3 ;sutun++){
            printf("deger [%i][%i]",satir+1,sutun+1);
            scanf("%i",&matris1[satir][sutun]);
            fflush(stdin);
        }
    }
    printf("\n 2. matris i giriniz : \n");
    for (satir=0;satir<3;satir++){
        for (sutun =0;sutun<3;sutun++){
            printf("deger[%i][%i]:",satir+1,sutun+1);
            scanf("%i",&matris2[satir][sutun]);
            fflush(stdin);
        }
    }
    for (satir=0;satir<3;satir++){
        for (sutun =0;sutun < 3 ; sutun++){
            sonuc[satir][sutun]=matris1[satir][sutun] + matris2[satir][sutun];
        }
    }
  
    printf("\n matrislerin toplami : \n");
    for (satir =0;satir<3;satir++){
        printf ("\n");
        for (sutun =0;sutun<3;sutun++);
        printf("%i",matris1[satir][sutun]);
        if (satir==1)
            printf("+");
        else printf(" ");
        for (sutun =0;sutun<3;sutun++)
            printf("%i",matris2[satir][sutun]);
        if (satir ==1)
            printf(" = ");
        else
            printf("  ");
        for (sutun = 0 ; sutun <3 ;sutun++)
            printf("%i",sonuc[satir][sutun]);
    }
    printf("Hello, World!\n");
    return 0;
}
