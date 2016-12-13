//
//  main.c
//  fasfsas
//
//  Created by Can KINCAL on 23.02.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {

    // insert code here...
    int vize,final,sonuc;
    printf("vize ve final notlarını giriniz\n");
    scanf("%d%d",&vize,&final);
    sonuc=(vize*40/100)+(final*60/100);
    if(sonuc<45)
        printf("Kaldiniz");
    else if(sonuc>45)
        printf("gectiniz");
    
    return 0;
}
