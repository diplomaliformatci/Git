//
//  main.c
//  asdas
//
//  Created by Can KINCAL on 24.03.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
int asalsayimi(int sayi);
int main(int argc, const char * argv[]) {
    int sayi;
    printf("yok babaaan\n");
    scanf("%d",&sayi);
    for (int i = 0 ; i<=sayi;i++){
        if(asalsayimi(i)==1)
            printf("%3d",i);
    }
    printf("Hello, World!\n");
    return 0;
}
int asalsayimi(int sayi){
    int i;
    for (i=2;i<sayi;i++)
        if (sayi%i==0)
            return 0;
    return 1;
}
