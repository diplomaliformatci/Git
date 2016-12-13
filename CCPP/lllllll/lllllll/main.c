//
//  main.c
//  lllllll
//
//  Created by Can KINCAL on 2.03.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
int karesi(int);
int main(int argc, const char * argv[]) {
    int sayi;
    scanf("%d",&sayi);
    printf("%d",karesi(sayi));
    printf("Hello, World!\n");
    return 0;
}
int karesi(int sayi){
return sayi*sayi;
}