//
//  main.c
//  agucubugucu
//
//  Created by Can KINCAL on 12.01.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    /*int aranansayi;
    int dizi[15]={2,7,23,67,123,9,21,0,124,789,34,8,1235,14,5};
    int bulundu = 0;
    printf("Dizi içinde arayacaginiz sayiyi giriniz");
    scanf("%d",&aranansayi);
    int i ;
    for (i = 0;i<15;i++){
        if (dizi[i]== aranansayi){
            bulundu = 1;
            break;
            
        }
        
    }
    if(bulundu)
        printf("bulundu: dizinin %d. elemani aranan degere esit . \n",i+1);
    else
        printf("aradiginiz eleman dizide bulunmamaktadir");*/
    
    
    //Binary Search
    /*int dizi[25]={12,15,18,25,33,46,47,49,50,53,54,57,59,61,63,66,68,71,74,78,81,83,88,90,94};
    int hedef;
    int bulundu=0;
    int solindis=0;//dizideki ilk elemanin indisi
    int sagindis=24;//dizideki son elemanin indisi
    int ortaindis=0;
    printf("dizi icinde aracaginiz sayiyi giriniz");
    scanf("%d",&hedef);
    while (bulundu==0 && solindis <= sagindis){
        ortaindis=(solindis + sagindis)/2;
        if( hedef==dizi[ortaindis]){
            bulundu = 1 ;
            break;
        }
        else if ( hedef < dizi[ortaindis]){
            sagindis=ortaindis-1;
            
        }
        else if ( hedef > dizi[ortaindis]){
            solindis=ortaindis+1;
        }
        
    }
    if ( bulundu)
        printf("Bulundu: dizinin %d. indisindeki deger aranan elemana esit . \n",ortaindis);
   
    else
        
        printf("aradiginiz eleman dizide bulunamadi");
    
   */
    
    int dizi[4]={12,10,9,3};
    int i,j,x;
    printf("siralamadan once\n");
    for ( i = 0 ; i < 4 ; i++){
        printf ( " %3d ",dizi[i]);
    }
    for ( i = 0 ; i < 3; i++){
        for ( j = 0 ; j < 3-i ; j++ )
            if (dizi[j]>dizi[j+1]){
                int gecici = dizi[j];
                dizi[j] = dizi[j+1];
                dizi[j+1] = gecici;
            }
                
            
    }
    printf("\n %d iterasyon \n",i);
    for ( x = 0; x<4 ; x++){
        printf("%3d",dizi[x]);
}
    printf("\nsiralamadan sonra \n");
    for (i = 0 ; i < 4 ; i++){
        printf("%3d",dizi[i]);
    }

    printf("Hello, World!\n");
    return 0;
}
