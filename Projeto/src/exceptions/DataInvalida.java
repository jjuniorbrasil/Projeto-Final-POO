package exceptions;

public class DataInvalida extends Exception {
  int indexdia;
  int indexMes;
  int indexano;
  String erro;
 
 public DataInvalida(int indexdia, int indexMes, int indexano) {
	super();
	this.indexdia = indexdia;
	this.indexMes = indexMes;
	this.indexano = indexano;
}

public void mensagemErro() {
	 if(indexdia==0)
		 erro+="O dia da data de nascimento não foi selecionado/n";
	 if(indexMes==0)
		 erro+="O mês da data de nascimento não foi selecionado/n";
	 if(indexano==0)
		 erro+="O ano da data de nascimento não foi selecionado/n";
 }
   
@Override
public String toString() {
	return erro;
}


}
