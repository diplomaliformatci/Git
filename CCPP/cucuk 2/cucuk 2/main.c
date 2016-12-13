//
//  main.c
//  cucuk 2
//
//  Created by Can KINCAL on 9.01.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int dizi[4]={12,10,9,3};
    int i,j,x;
    printf("sıralamadan önce\n");
    for ( i=0;i<4;i++)
        printf("%3d",dizi[i]);
    for (i=0;i<3;i++){
        for(j=0;j<3-i;j++)
            if (dizi[j]>dizi[j+i])
                {
                    int gecici=dizi[j];
                    dizi[j]=dizi[j+i];
                    dizi[j+1]=gecici;
                }
                
                
                printf("\n%d. Iterasyon\n",i);
                for ( x=0;x<4;x++)
                printf("%3d",dizi[x]);
                printf("\nsiralamadan sonra\n");
                for (i=0;i<4;i++)
                printf("%3d",dizi[i]);
                
                
    }
    
        
        
    printf("Hello, World!\n");
    return 0;
}
