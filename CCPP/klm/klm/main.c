//
//  main.c
//  klm
//
//  Created by Can KINCAL on 2.03.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    for ( int i = 0 ; i <5;i++){
        for (int j =0;j<i;j++){
            printf("*");}
        printf("\n");
    }
    for ( int i = 5 ; i>=0;i--){
        for (int j = 0 ; j<i;j++)
            printf("*");
    
        printf("\n");}
    printf("Hello, World!\n");
    return 0;
}
