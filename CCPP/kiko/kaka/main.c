//
//  main.c
//  kaka
//
//  Created by Can KINCAL on 21.02.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
int buyugubul(int,int);
int main(int argc, const char * argv[]) {
    int sayi1,sayi2;
    scanf("%d%d",&sayi1,&sayi2);
    printf("%d",buyugubul(sayi1,sayi2));
    return 0;
}

int buyugubul(int deger1,int deger2) {
    if (deger1>deger2)
        return deger1;
    else
        return deger2;
    
}
