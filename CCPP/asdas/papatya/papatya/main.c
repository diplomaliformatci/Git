//
//  main.c
//  papatya
//
//  Created by Can KINCAL on 15.05.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int i;
    char iller[3][10]={"Ankara","Istanbul","Izmir"};
    for (i=0;i<3;i++)
        puts(iller[i]);
    char filmler[][40]={"Snatch","Lock,Stock & Two Smoking Barrels","Life Is Beautiful"};
    puts("--------------- \nFilm Listesi\n----------------");
    for (i=0;i<5;i++)
        puts(filmler[i]);
    printf("Hello, World!\n");
    return 0;
}
