/*questao 9*/

void questao9(){
	setlocale(LC_ALL,"portuguese");
	int age;
	printf("Digite sua idade: ");
	scanf("%d", &age);
	if(age>=5 && age<=7){
		printf("\nVoc� est� no INFANTIL A.");
	}
	else if(age>=8 && age<=10){
		printf("\nVoc� est� no INFANTIL B.");
	}
	else if(age>=11 && age<=13){
		printf("\nVoc� est� no JUVENIL A.");
	}
	else if(age>=14 && age<=17){
		printf("\nVoc� est� no JUVENIL B.");
	}
	else if(age>=18 && age<=17){
		printf("\nVoc� est� no S�NIOR.");
	}
	else{
		printf("\nIdade fora da faixa et�ria.");
	}
}
