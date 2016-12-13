//
//  main.c
//  çç
//
//  Created by Can KINCAL on 8.03.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
int topla(int dizi[],int elemansayisi);
int main(int argc, const char * argv[]) {
    
    int sonuc=topla();
    printf("girdiginiz degerlerin toplami=%d",sonuc);
    return 0;
}
int topla(int dizi[],int elemansayisi){
    scanf("%d",&elemansayisi);
    for (int i = 0 ; i < elemansayisi;i++)
    {
        scanf("%d",&dizi[i]);
    }
    for ( int i = 0 ; i<elemansayisi;i++)
        dizi[i]+=dizi[i];
    return dizi[i];
}
