//
//  main.c
//  bbbubu
//
//  Created by Can KINCAL on 6.01.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int a,b;
    scanf("%d",&a);
    for (a;a>=0;a--){
        printf("\n");
        for (b=0;b<a;b++){
            printf("*");
            }
    }
    
    
   
    return 0;
}
