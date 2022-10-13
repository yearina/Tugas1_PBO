#include <iostream>
using namespace std;

class Matriks{
	public:
		void input();
		void penjumlahan();
		void output();
	private:
		// tipe data, variabel, array multidimensi
		int a[10][10], b[10][10], c[10][10], i, j, n, m;
};

void Matriks::input(){
	// input, for, comment
	cout<<"\t PROGRAM PENJUMLAHAN DUA BUAH MATRIKS UKURAN 2x2\n";
	cout<<"\t========================================\n";
	cout<<"Masukkan banyak baris: "; cin>>n;
	cout<<"Masukkan banyak kolom: "; cin>>m;
	cout<<endl;
	cout<<"Masukkan isi matriks A: "<<endl;
	for(i=1; i<=n; i++){
		for(j=1; j<=m; j++){
			cout<<"["<<i<<"]"<<"["<<j<<"]: "; cin>>a[i][j];
		}
	}
	cout<<"Masukkan isi matriks B: "<<endl;
	for(i=1; i<=n; i++){
		for(j=1; j<=m; j++){
			cout<<"["<<i<<"]"<<"["<<j<<"]: "; cin>>b[i][j];
		}
	}
	
	penjumlahan();
	output();
}

void Matriks::penjumlahan(){
	for(i=1; i<=n; i++){
		for(j=1; j<=m; j++){
			c[i][j]= a[i][j]+b[i][j];
		}
	}
}

// output
void Matriks::output(){
	cout<<"Matriks A: "<<endl;
	for(i=1; i<=n; i++){
		for(j=1; j<=m; j++){
			cout<<a[i][j]<<" ";
		}
		cout<<endl;
	}
	
	cout<<"Matriks B: "<<endl;
	for(i=1; i<=n; i++){
		for(j=1; j<=m; j++){
			cout<<b[i][j]<<" ";
		}
		cout<<endl;
	}
	
	cout<<"Hasil penjumlahan matriks A + matriks B = "<<endl;
	for(i=1; i<=n; i++){
		for(j=1; j<=m; j++){
			cout<<c[i][j]<<" ";
		}
		cout<<endl;
	}
}

// main program
int main(){
	// tipe data, variabel, array satu dimensi
	double d[5];
	char pilih;
	string akhir;
	int i, j;
	
	awal:
	Matriks m;
	m.input();
	
	cout<<"----------------------------------------\n";
	// array satu dimensi
	cout<<endl;
	d[1]=10.25; d[2]=20.75; d[3]=30.67;
	for(i=1; i<=3; i++){
		cout<<d[i]<<" ";
	}
	
	// while
	cout<<endl;
	i = 1;
	while(i<=10){
		cout<<i<<" ";
		i++;
	}
	
	//do while
	cout<<endl;
	j=10;
	do{
		cout<<j<<" ";
		j--;
	}while(j>=1);
	
	// if
	cout<<endl<<endl;
	cout<<"Akhiri Program (Y/N): "; cin>>pilih;
	if(pilih=='Y'||pilih=='y'){
		akhir = "\nProgram telah berakhir";
		cout<<akhir;
	}
	
	else if(pilih=='N'||pilih=='n'){
		cout<<"\nProgram berulang\n"<<endl;
		goto awal;
	}

	return 0;
}
