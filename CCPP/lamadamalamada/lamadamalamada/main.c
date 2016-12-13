//
//  main.c
//  lamadamalamada
//
//  Created by Can KINCAL on 29.05.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
int faktoriyelhesapla (int);

int main(int argc, const char * argv[]) {
    int sayi=0;
    int (*fonkptr)(int);
    fonkptr=faktoriyelhesapla;
    printf("faktorieli bulunacak sayiyi giriniz:");
    scanf("%d\n",&sayi);
    int faktoriyel = (*fonkptr)(sayi);
    printf("%d\n",faktoriyel);
    return 0;
}
int faktoriyelhesapla ( int sayi){
    int sonuc = 1;
    if (sayi<=0)
        return sonuc;
    for (int i=sayi;i>=1;i--){
        sonuc = sonuc*i;
    }
    return sonuc;
}
