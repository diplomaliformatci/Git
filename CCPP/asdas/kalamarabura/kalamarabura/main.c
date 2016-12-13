//
//  main.c
//  kalamarabura
//
//  Created by Can KINCAL on 9.04.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
void bul(int matris[][3],int,int);
int main(int argc, const char * argv[]) {
    int matris[3][3]={1,2,3,4,5,6,7,8,9};
    bul(matris,3,3);
    return 0;
}
void bul(int matris[][3],int satir,int sutun){
    int i,k,l;
    int toplam=0;
    for(i=0;i<3;i++){
        toplam=0;
        for(k=0;k<3;k++){
            toplam+=matris[i][k];
            
    
        }printf("%d. satir toplami %d\n",i,toplam);
    }
    
                        
}