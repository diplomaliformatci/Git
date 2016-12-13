//
//  main.c
//  c lan c
//
//  Created by Can KINCAL on 2.11.2015.
//  Copyright © 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
#include <math.h>

int main(int argc, const char * argv[]) {
  char isim[10]= "AHMET";
    char tersisim[10];
    int sayac=0,i=0;
    while (isim[i]!='\0'){
        sayac++;
        i++;
    }
    int a=10;
    int b=sayac;
    for (int x = 0 ; x <=sayac  ; x++){
        tersisim[x]=isim[b];
        b--;
        
    }
    for (int b=0;b<10;b++){
    printf("%c",tersisim[b]);
           }
    
    return 0;
}
