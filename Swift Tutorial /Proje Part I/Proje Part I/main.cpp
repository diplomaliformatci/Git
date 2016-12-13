//
//  main.cpp
//  Proje Part I
//
//  Created by Can KINCAL on 16.08.2016.
//  Copyright © 2016 Can KINCAL. All rights reserved.
//
// kod isim para;
#include <iostream>
#include <cstdlib>
using namespace std;
FILE *dosya;
int main(int argc, const char * argv[]) {

    dosya = fopen("Dokuman.txt","w");
    int kod;
    string isim;
    float para;
    while (){
        cout >>    "KOD :" ;
        cin >> kod;
        if (kod == -1 )
            break;
        cout << "URUN ADI :";
        cin >> isim;
        cout << "Ucret ";
        cin >> para;
        fprintf(dosya,"%d\t%s\t%f",kod,isim,para);
    }
    cout << "program sonu";
    return 0;
}
