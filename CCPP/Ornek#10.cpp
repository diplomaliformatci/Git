/*
	Yas s�n�f�n�n �zelliklerini kullanarak kal�t�m (inheritance) yolu
	ile YasHesap ad�nda yeni bir s�n�f t�rettildi...	
*/
#include <iostream>
#include <iomanip>
#include <cmath>
#include <cstring>
#include <conio.h>

using namespace std;

class Yas 		// Kal�t�m olarak kullan�lacak s�n�f (BASE class)
{							// define base class ....
	protected:				// D��ardan kullan�ma KAPALI ...
    	int DOGUM_YIL; int MEVCUT_YIL;
	public: 				// D��ardan kullan�ma ACIK ....				
    	void DogumYili (int DgmYil){
        	DOGUM_YIL = DgmYil;
    	}
    	void MevcutYil (int MvctYil){
        	MEVCUT_YIL = MvctYil;
    	}
};

class YasHesap : public Yas          /*   define derived class
		Yas class �n �zelliklerini kullanarak kal�t�m yolu
 		ile YasHesap ad�nda yeni bir s�n�f t�rettildi.     */
{
public:
    int hesap()
    {
        return(MEVCUT_YIL - DOGUM_YIL);
    }
};

int main (void)
{
	YasHesap object;   //S�n�ftan object ad�nda bir nesne olu�turuluyor...

    int gun, yil;

    cout << "\n Dogum tarihini giriniz    : ";
    cin >> gun;
    cout << "\n Bulundugumuz yili giriniz : ";
    cin >> yil;

    object.DogumYili (gun);    // Class i�erisindeki fonksiyonlar� kullan�yorum
    object.MevcutYil (yil);
	cout << setfill('=') << setw(33) << "="  << endl;
    cout << "Yasiniz : " << object.hesap();
    
    return 0;
}
