//
//  main.c
//  200000
//
//  Created by Can KINCAL on 12.01.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int nufus=20000;
    float artis=0.03;
    int toplam=0;
    
    for (int i = 0 ; i < 5 ; i++){
        toplam+=nufus*artis;
        nufus+=nufus*artis;
    }
    printf("%d",toplam);
    printf("Hello, World!\n");
    return 0;
}
