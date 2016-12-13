//
//  main.c
//  kakakak
//
//  Created by Can KINCAL on 2.03.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
float alan(int);
int main(int argc, const char * argv[]) {
    int yaricap;
    scanf("%d",&yaricap);
    printf("%f",alan(yaricap));
    printf("Hello, World!\n");
    return 0;
}
float alan(int yaricap){
    return 3.14*yaricap*yaricap;
}