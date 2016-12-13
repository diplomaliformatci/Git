//
//  main.c
//  sıfırdan
//
//  Created by Can KINCAL on 15.07.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>
int main(int argc, const char * argv[]) {
    int sayi;
    int toplam=0;
    printf("kac adet sayi gireceksiniz : ");
    scanf("%d",&sayi);
    int *sayidizisi = (int*)malloc(sizeof(int)*sayi);
    int i;
    for (i=0;i<sayi;i++){
        printf("%2d. elemani giriniz:",i+1);
        scanf("%d",sayidizisi+i);
        
    }
    for (i=0;i<sayi;i++){
        toplam += sayidizisi[i];
        
    }
    float ortalama = (float) toplam/(float)sayi;
    printf("girdiginiz dizinin ortalamasi : %.2f\n",ortalama);
    free(sayidizisi);
    
         
           
    printf("Hello, World!\n");
    return 0;
}
