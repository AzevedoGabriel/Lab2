package lab2;


/**

* Representação de uma Conta de Laboratório, responsável por manter o registro da 
* quantidade de espaço utilizado,  pelo aluno, em determinado laboratório.

* @author Gabriel Dantas

*/

public class ContaLaboratorio {
	
/**
 *O nome do Laboratório uilizado pelo usuário.

 * @author Gabriel Dantas
*/
	private String nomeLaboratorio;
	
/**
 * Representa a cota do Laboratório.
 * A cota determina o limite de espaço disponível.

 * @author Gabriel Dantas 
 */
	private int cota;
	
/**
 *Representa o os dados armazenados ou removidos pelo usuário. 

 * @author Gabriel Dantas
 */
	private int mbytes;
	
/**
 * Representa a cota limite que cada laboratório possui.

 * @author Gabriel Dantas 
 */
	private int cotaInicial;
	
/**
 * Constrói uma conta de laboratório a partir do nome do laboratório, 
 * e inicializa a cota disponível e a cota limite inicial. 
 
 * @author Gabriel Dantas
 */
	
	public ContaLaboratorio(String nomeLaboratorio) {
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = 0;
		this.cotaInicial = 2000;
		
	}

/**
 * Constrói uma conta de laboratório a partir do nome, da cota disponível e
 * a da cota limite.
 
 * @author Gabriel Dantas 
 */
	public ContaLaboratorio(String nomeLaboratorio, int cota) {
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = cota;
		this.cotaInicial = 2000;
		
	}
	
/**
 * 	Retorna o valor da cota dispnível após o usuário armazenar os dados.
 
 * @author Gabriel Dantas 
 */
	public void consomeEspaco(int mbytes) {
		cota +=  mbytes;

	}
	
/**
 * Retorna o valor da cota disponível após o usuário remover dados.
 
 * @author Gabriel Dantas
 */
	public void liberaEspaco(int mbytes) {
		cota -= mbytes;
		
	}
	
/**
 * Retorna verdadeiro ou falso, a partir da informação se o usuário atingiu a cota limite.

 * @author Gabriel Dantas
*/
	public boolean atingiuCota() {
		
		if (cota >= cotaInicial) {
			return true;
		} else {
			return false;
		}
		
	}
	
/**
 * Retorna a String que contém o nome do laboratório, o espaço ocupado e a cota.

 * @author Gabriel Dantas 	
 */
	public String toString() {
		return nomeLaboratorio + " " + cota + "/" + cotaInicial;
		
	}
}
