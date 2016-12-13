//
//  main.c
//  bombastik
//
//  Created by Can KINCAL on 24.02.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
int karebul(int);
int main(int argc, const char * argv[]) {
    int sayi;
    printf("bir sayi giriniz ");
    scanf("%d",&sayi);
    printf("girdiginiz sayinin karesi = %d",karebul(sayi));
    printf("Hello, World!\n");
    return 0;
}
int karebul(int deger){
    return deger*deger;
}
