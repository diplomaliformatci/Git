//
//  main.c
//  enkucukn.elemanibul
//
//  Created by Can KINCAL on 24.03.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
int enkucuknincielemanibul(int[],int,int);
int main(int argc, const char * argv[]) {
    int elemansayisi,n;
    scanf("%d",&elemansayisi);
    int dizi[elemansayisi];
    for (int i=0;i<elemansayisi;i++)
        scanf("%d",&dizi[i]);
    printf("kaçıncı elemanı bulmak istedigini gir ");
    scanf("%d",&n);
    printf("%d. eleman %d",n,enkucuknincielemanibul(dizi,elemansayisi,n));
    printf("Hello, World!\n");
    return 0;
}
int enkucuknincielemanibul(int dizi[],int elemansayisi,int n){
    //siralama
    int degisken;
    for (int i=0;i<elemansayisi;i++)
        for (int y=0;y<i;y++)
            if (dizi[i]>dizi[i+1]){
                degisken=dizi[i];
                dizi[i]=dizi[i+1];
                dizi[i+1]=degisken;}
    return dizi[n-1];
    
}