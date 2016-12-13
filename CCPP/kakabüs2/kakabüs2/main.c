//
//  main.c
//  kakabüs2
//
//  Created by Can KINCAL on 24.03.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
int enbuyuk(int[],int);
int enkucuk(int[],int);
int main(int argc, const char * argv[]) {
    
    int elemansayisi;
    scanf("%d",&elemansayisi);
    int dizi[elemansayisi];
    
    for (int i=0;i<elemansayisi;i++){
        scanf("%d",&dizi[i]);
    }
    printf("en buyuk dizi elemani %d\n en kucuk dizi elemani %d\n",enbuyuk(dizi,elemansayisi),enkucuk(dizi,elemansayisi));
    
    printf("Hello, World!\n");
    return 0;
}
int enbuyuk(int dizi[],int elemansayisi){
    int enbuyuk=0;
    for (int i = 0;i<elemansayisi;i++)
        if(dizi[i]>enbuyuk)
            enbuyuk=dizi[i];
    return enbuyuk;
    
}
int enkucuk(int dizi[],int elemansayisi){
    int enkucuk=9999;
    for (int i = 0 ; i<elemansayisi;i++)
        if (dizi[i]<enkucuk)
            enkucuk=dizi[i];
    return enkucuk;
}