//
//  main.c
//  loşdoş
//
//  Created by Can KINCAL on 18.05.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int dizi[10]={1,2,3,4,5,6,7,8,9,10};
    int *ptr=&dizi[0];
    int *ptr2 = dizi;
    int i;
    printf("dizinin 1. elemanlı : %d\n",dizi[0]);
    printf("dizinin 1. elemani %d\n",*ptr);
    printf("dizinin 1. elemani : %d\n",*ptr2);
    printf("\n\n\n");
    printf("dizinin 4. elemani :%d",dizi[4]);
    printf("dizinin 4. elemani : %d",*(ptr+4));
    printf("dizinin 4. elemani : %d",*(ptr2+4));
    printf("\n\n\n");
    printf("dizinin 8. elemani : %d\n",dizi[8]);
    printf("dizinin 8. elemani : %d\n",*(ptr+8));
    printf("dizinin 8. elemani : %d\n",*(ptr2+8));
    printf("\n\n\n");
    for (i=0;i<10;i++)
        printf("dizi[%d]->adresi %p , degeri %d\n",i,ptr+i,*(ptr+i));
    
    return 0;
}
