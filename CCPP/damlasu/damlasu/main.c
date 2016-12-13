//
//  main.c
//  damlasu
//
//  Created by Can KINCAL on 18.05.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
#include <ctype.h>
int aynimi(char dizi1[],char dizi2[]){
    
    int toplam1=0;
    int toplam2=0;
    for (int i=0;dizi1[i]!='\0' && dizi2[i]!='\0';i++){
        dizi1[i]=toupper(dizi1[i]);
        dizi2[i]=toupper(dizi2[i]);
    }
    for (int i=0;dizi1[i]!='\0' && dizi2[i]!='\0';i++){
        toplam1+=dizi1[i];
        toplam2+=dizi2[i];
    }
    if (toplam1==toplam2)
        return 1;
    else
        return 0;
}
int main(int argc, const char * argv[]) {
    char dizi1[10];
    char dizi2[10];
    scanf("%s",dizi1);
    scanf("%s",dizi2);
    if (aynimi(dizi1,dizi2))
        printf("girdiginiz degerler ayni");
    else
        printf("girdiginiz degerler farklı");
    
    printf("Hello, World!\n");
    return 0;
}
