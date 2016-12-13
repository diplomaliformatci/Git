//
//  main.c
//  cananna
//
//  Created by Can KINCAL on 23.02.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    float endeks;
    float boy;
    int kilo;
    printf("kilo ve boyunuzu giriniz boyunuzu metre cinsinden giriniz ");
    scanf("%d%f",&kilo,&boy);
    endeks=(float)kilo*boy*boy;
    if ( endeks <18.4)
        printf("zayıf");
    else if ( endeks > 18.5 && endeks < 24.9)
        printf("normal");
    else if (endeks >25.0 && endeks< 29.9)
        printf("fazla kilolu");
    else if ( endeks > 30 && endeks < 34.9)
        printf("obez - I. sınıf");
    else if ( endeks > 35.0 && endeks < 44.9)
        printf("obez - II. sınıf");
    else if ( endeks > 45)
        printf("AŞIRI OBEZ ");
    
    printf("Hello, World!\n");
    return 0;
}
