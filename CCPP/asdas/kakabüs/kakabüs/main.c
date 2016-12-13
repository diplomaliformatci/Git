//
//  main.c
//  kakabüs
//
//  Created by Can KINCAL on 12.04.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int matris[3][3],toplam;
    double ortalama;
    for(int i=0;i<3;i++){
        for (int x=0;x<3;x++){
            printf("%d nolu ogrencinin %d nolu sinav sonucunu giriniz",i+1,x+1);
            scanf("%d",&matris[i][x]);
            
            
        }
    }
        for (int i=0;i<3;i++){
           toplam=0;
            for (int x=0;x<3;x++){
                toplam+=matris[i][x];
                 ortalama=toplam/3.0;
                printf(" %.2lf\n",ortalama);
            }
        }
        
    
        
    
    printf("Hello, World!\n");
    return 0;
}
