//
//  main.c
//  labalaba
//
//  Created by Can KINCAL on 8.03.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
int asalsayimi(int);
int main(int argc, const char * argv[]) {
    int sayi;
    scanf("%d",&sayi);
    printf("girdiginiz sayiya kadar olan asal sayilar soyledir :");
    asalsayimi(sayi);
    printf("Hello, World!\n");
    return 0;
}
int asalsayimi(int sayi){
    int i;
    for ( i=2;i<sayi;i++){
        if (i%2==0)
            printf("%3d",i);
        return i;}
    return 0;
}