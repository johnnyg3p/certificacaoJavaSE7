package br.com.exercicioXTI.teste;

import br.com.exercicioXTI.entidades.Multiplica;
import br.com.exercicioXTI.entidades.OperacaoMatematica;
import br.com.exercicioXTI.entidades.Soma;

/**
 * 
 * @author edneyroldao
 *mais exemplos de como pode ser util a utilizacao de polimorfismo
 */
public class TestePolimorfismoParte2 {

	public static void calcular(OperacaoMatematica op, double x, double y) {
		System.out.println(op.calcular(x, y));
	}
	
	public static void main(String[] args) {
		calcular(new Soma(), 10, 10);
		calcular(new Multiplica(), 10, 10);
	}
	
}
