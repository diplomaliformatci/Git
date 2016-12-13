//
//  main.c
//  bobo
//
//  Created by Can KINCAL on 24.02.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
//fonsiyon prototipleri
int bolunebiliyormu(int,int);
int obebbul(int,int);
int okekbul(int,int);

int main(int argc, const char * argv[]) {
    int sayi1,sayi2;
    printf("birinci sayiyi giriniz:");
    scanf("%d",&sayi1);
    printf("ikinci sayiyi giriniz:");
    scanf("%d",&sayi2);
    int obeb = obebbul(sayi1,sayi2);
    int okek = okekbul(sayi1,sayi2);
    printf("obeb(%d,%d) = %d\n",sayi1,sayi2,obeb);
    printf("okek(%d,%d) = %d\n",sayi1,sayi2,okek);
    
    
    
    printf("Hello, World!\n");
    return 0;
}
int bolunebiliyormu(int bolunen,int bolen){
    if (bolunen%bolen == 0)
        return 1;
    else return 0;
}
int obebbul(int sayi1,int sayi2){
    int kucuksayi = sayi1;
    if (sayi1 < kucuksayi)
        kucuksayi = sayi2;
    int i;
    for ( i = kucuksayi;i>0;i--){
        if (bolunebiliyormu(sayi1,i)==1 && bolunebiliyormu (sayi2,i)==1){
            return i;
        }
    }
    return 0;
}
int okekbul(int sayi1,int sayi2) {
    int buyuksayi = sayi1;
    int kucuksayi = sayi2;
    if (sayi2 < buyuksayi){
        buyuksayi = sayi2;
        kucuksayi = sayi1;
    }
if (bolunebiliyormu(buyuksayi,kucuksayi))
    return buyuksayi;
    int i ;
    for ( i=buyuksayi*2;;i+= buyuksayi){
        if ( bolunebiliyormu(i,sayi1) == 1 && bolunebiliyormu (i,sayi2)==1){
            return i;
        }
    }
    return 0 ;
}