//
//  main.cpp
//  c++
//
//  Created by Can KINCAL on 11.11.2015.
//  Copyright © 2015 Can KINCAL. All rights reserved.
//

#include <iostream>
using namespace std;
int main(int argc, const char * argv[]) {
    int sayi=2;
    int istek;
    float sonuc=1.0;
    std::cin>>istek;
    for (;sayi<=istek;sayi++){
        if (sayi%2==0)
            sonuc+=sayi/(sayi+1.0);
        else
            sonuc-=sayi/(sayi+1.0);
    }
        
    
    std::cout<<sonuc;
    std::cout<<"\nlaaaan\n";
    
    
    
    
    
    
        return 0;
    
}
