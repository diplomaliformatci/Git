//
//  main.c
//  enesin titis
//
//  Created by Can KINCAL on 14.05.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int matris[3][3];
    int toplam=0;
    int sayi=1;
    for (int i=0;i<3;i++)
        for (int x=0;x<3;x++)
            scanf("%d",&matris[i][x]);
    for (int i=0;i<3;i++){
        toplam=0;
        
        for (int x=0;x<3;x++){
            toplam+=matris[x][i];
        
        }
        printf("%d. sutun toplami %d\n",sayi,toplam);
         sayi++;
        sayi=1;
        
    }
    for (int i=0;i<3;i++){
        toplam=0;
        
        for (int x=0;x<3;x++){
            toplam+=matris[i][x];
            
        }
        printf("%d. satir toplami %d\n",sayi,toplam);
        sayi++;
    }

    
    printf("Hello, World!\n");
    return 0;
}
