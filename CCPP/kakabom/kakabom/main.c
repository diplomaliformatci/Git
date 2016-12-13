//
//  main.c
//  kakabom
//
//  Created by Can KINCAL on 24.02.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
double cevrehesapla(double yaricap);
double alanhesapla(double yaricap);
int main(int argc, const char * argv[]) {
    printf("dairenin yaricapini giriniz:");
    int yaricap;
    scanf("%d",&yaricap);
    printf("dairenin alani = %.2f\n",alanhesapla(yaricap));
    printf("dairenin çevresi = %.2f\n",cevrehesapla(yaricap));
    
    
    
    printf("Hello, World!\n");
    return 0;
}
double cevrehesapla(double yaricap){
    float cevre=2*3.14*yaricap;
    return cevre;
}
double alanhesapla(double yaricap){
    float alan=3.14*yaricap*yaricap;
    return alan;
}