//
//  main.c
//  ornek 4
//
//  Created by Can KINCAL on 23.02.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    // insert code here...
    int a,b,c,sonuc;
    printf("iki sayi giriniz\n");
    scanf("%d%d",&a,&b);
    printf("yapilacak islemi seciniz toplama=1 cıkarma=2 carpma=3 bolme=4");
    scanf("%d",&c);
    if (c==1) {
        sonuc=a+b;
        printf("%d",sonuc);
    }
    if (c==2) {
        sonuc=a-b;
        printf("%d",sonuc);
    
        
    }
    if (c==3) {
        sonuc=a*b;
        printf("%d",sonuc);
    }
    if (c==4) {
        sonuc=a/b;
        printf("%d",sonuc);
    }
    return 0;
}
