//
//  main.c
//  dizi sıralama
//
//  Created by Can KINCAL on 11.01.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int dizi[4]={12,10,9,3};
    int i,j,x;
    //dizinin sıralamadan önceki hali
    printf("siralamadan önce\n");
    for ( i=0;i<4;i++){
        printf("%3d",dizi[i]);
        
    }
    //siralama işlemi burda yapılıyor
    for (i=0;i<3;i++){
        for(j=0;j<3;j++){
            //eger bir önceki eleman bir sonrakinden daha büyükse
            if ( dizi[j]>dizi[j+1]){
                //elemanları yer degiştirelim ( swap )
                int gecici = dizi[j];
                dizi[j]=dizi[j+1];
                dizi[j+1]=gecici;
                
            }
        }
       // her iterasyonda aldiği dizinin aldigi durumu yazdiralim
        printf("\n%d. Iterasyon\n",i);
        for (x=0;x<4;x++)
            printf("%3d",dizi[x]);
    }
    printf("\nsiralamadan sonra\n");
    for ( i = 0 ; i<4 ; i++){
        printf("%3d",dizi[i]);
    }
    printf("Hello, World!\n");
    return 0;
}
