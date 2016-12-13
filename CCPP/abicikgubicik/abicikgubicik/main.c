//
//  main.c
//  abicikgubicik
//
//  Created by Can KINCAL on 11.01.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int matris[3][3];
    int satir,sutun,toplam=0,toplam2=0;
    for(int i=0;i<3;i++)
        for (int j=0;j<3;j++)
        scanf("%d",&matris[i][j]);
    for(satir=0;satir<3;satir++){
        for (sutun=0;sutun<3;sutun++){
            toplam+=matris[satir][sutun];
            toplam2+=matris[sutun][satir];
            printf("%d nolu satir %d nolu sutun : toplami %d\n",satir,sutun,toplam2);
            toplam2=0;
            
        }
      printf("%d nolu satir %d nolu sutun toplami:%d\n",satir,sutun,toplam);
        toplam=0;
        
    }
         printf("Hello, World!\n");
    return 0;
}
