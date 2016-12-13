//
//  main.c
//  asal
//
//  Created by Can KINCAL on 2.11.2015.
//  Copyright © 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int sonuc=0;
    for (int x=20;x<=50;x++){
        sonuc+=x;
        aba: printf("baba");
    }
    printf("%d",sonuc);
    goto aba;

    printf("Hello, World!\n");
    return 0;
}
