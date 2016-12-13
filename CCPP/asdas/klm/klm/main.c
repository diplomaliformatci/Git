//
//  main.c
//  klm
//
//  Created by Can KINCAL on 14.05.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int dizi[10]={25,22,17,19,47,3,5,98,10,124};
    int a;
    int gecici;
    scanf("%d",&a);
    for (int i=0;i<10;i++)
        for (int k=0;k<10;k++)
            if(dizi[k]>dizi[k+1]){
            gecici=dizi[k];
    dizi[k]=dizi[k+1];
                dizi[k+1]=gecici;}
    printf("%d",dizi[a]);
   // for (int i=0;i<10;i++)
    
    printf("Hello, World!\n");
    return 0;
}
