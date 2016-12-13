//
//  main.c
//  kalamar
//
//  Created by Can KINCAL on 11.04.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
void ortalamadoldur(int matris[][3],double[]);
int main(int argc, const char * argv[]) {
    int matris[30][3];
    for(int i=0;i<30;i++){
        for(int x=0;x<3;x++){
            printf("%d. ogrencinin %d. notunu giriniz :",i+1,x+1);
            scanf("%d",&matris[i][x]);}}
    double ortalama[30];
    ortalamadoldur (matris,ortalama);
    for (int i=0;i<30;i++)
    printf("%d. ogrencinin ortalamasi %.2lf\n",i+1,ortalama[i]);
    
    printf("Hello, World!\n");
    return 0;
}
void ortalamadoldur(int matris[][3],double dizi[]){
    int i,j;
    int toplam;
    double ortalama;
    for(i=0;i<30;i++){
        toplam=0;
        for(j=0;j<3;j++) {
            toplam+=matris[i][j];
            ortalama=toplam/3.0;
            dizi[i]=ortalama;
        }
            
    }
        
}