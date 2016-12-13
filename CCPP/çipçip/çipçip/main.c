//
//  main.c
//  çipçip
//
//  Created by Can KINCAL on 28.02.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
int bolunebiliyormu(int,int);
void obebbul(int,int);
int obebsonuc;
int main(int argc, const char * argv[]) {
    int sayi1,sayi2;
    printf("birinci sayiyi giriniz " );
    scanf("%d",&sayi1);
    printf("ikinci sayiyi giriniz " );
    scanf("%d",&sayi2);
    //obeb hesapla
    obebbul(sayi1,sayi2);
    //bulunan obeb degerini yazdır
    printf("girdiginiz iki sayinin obebi ->%d\n",obebsonuc);
    
    return 0;
}
void obebbul(int sayi1,int sayi2){
    //parametrelerden kucuk olanın degerini blulalım
    int kucuksayi = sayi1;
    if ( sayi2< kucuksayi)
        kucuksayi=sayi2;
    int i ;
    for ( i = kucuksayi;i>0;i++){
        if (bolunebiliyormu ( sayi1,i)==1 && bolunebiliyormu(sayi2,i)==1){
            obebsonuc = i;
        }
        
    }
}
int bolunebiliyormu(int bolunen , int bolen){
    if (bolunen % bolen == 0 )
        return 1 ;
    else return 0 ;
}