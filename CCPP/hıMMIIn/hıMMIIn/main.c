//
//  main.c
//  hıMMIIn
//
//  Created by Can KINCAL on 11.01.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int dizi[17]={1,2,3,4,5,6,7,8,9,10,11,12,13,26,15,16};
    int x,indis1,i;
    for (i=0;i<16;i++){
        for (x=0;x<16;x++){
            if(dizi[x]<dizi[x+1]){
            indis 1=dizi[x];
    dizi[x]=dizi[x+1];
                dizi[x+1]=indis1;}}
    }
    for (int i=0;i<16;i++)
        printf("%d\n",dizi[i]);
        printf("\n");
        return 0;
}
