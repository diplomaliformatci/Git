//
//  main.c
//  bobom
//
//  Created by Can KINCAL on 17.02.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
int main(int argc, const char * argv[]) {
   // 4 sayinin siralamasini yapmak ..
    int dizi[4]={12,31,29,8};
    int i,a ;
    for ( i = 0 ; i < 4 ; i++)
        for(int j =0;j<3;j++){
        if ( dizi[i]>dizi[i+1])
            a=dizi[i];
        dizi[i]=dizi[i+1];
        dizi[i+1]=a;
            
    }
    i=0;
    while (i<4){
        printf("%d\n",dizi[i]);
        i++;
    }
    
    
    printf("Hello, World!\n");
    return 0;
}
