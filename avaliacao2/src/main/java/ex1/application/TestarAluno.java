/*
 * Copyright (C) 2024 Felipe Borges Carvalho <felipeborgesmelo80@gmail.com> Gabriel Candido <gcrs2018@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ex1.application;

import ex1.entities.Alunos;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Felipe Borges Carvalho <felipeborgesmelo80@gmail.com> Gabriel Candido <gcrs2018@gmail.com>
 * @data 01/04/2024
 * @brief Class TestarAluno
 */
public class TestarAluno {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        double n1;
        double n2;
        double n3;
        double n4;
        
        
        System.out.println("--Aluno 1--");
        System.out.println("escreva n1 do aluno");
        n1 = ler.nextDouble();
        System.out.println("escreva n2 do aluno");
        n2 = ler.nextDouble();
        System.out.println("escreva n3 do aluno");
        n3 = ler.nextDouble();
        System.out.println("escreva n4 do aluno");
        n4 = ler.nextDouble();
        
        Alunos aluno1 = new Alunos(n1,n2,n3,n4);
        
        aluno1.Media();
        System.out.println("Media "+aluno1.getMedia());
        
        System.out.println("--Aluno 2--");
        System.out.println("escreva n1 do aluno");
        n1 = ler.nextDouble();
        System.out.println("escreva n2 do aluno");
        n2 = ler.nextDouble();
        System.out.println("escreva n3 do aluno");
        n3 = ler.nextDouble();
        System.out.println("escreva n4 do aluno");
        n4 = ler.nextDouble();
        
        Alunos aluno2 = new Alunos(n1,n2,n3,n4);
        
        aluno2.Media();
        System.out.println("Media "+aluno2.getMedia());
        
        System.out.println("--Aluno 3--");
        System.out.println("escreva n1 do aluno");
        n1 = ler.nextDouble();
        System.out.println("escreva n2 do aluno");
        n2 = ler.nextDouble();
        System.out.println("escreva n3 do aluno");
        n3 = ler.nextDouble();
        System.out.println("escreva n4 do aluno");
        n4 = ler.nextDouble();
        
        Alunos aluno3 = new Alunos(n1,n2,n3,n4);
        
        aluno3.Media();
        System.out.println("Media "+aluno3.getMedia());
        
        System.out.println("");
        System.out.println("(-1)menor\n(0)igual\n(1)maior");
        System.out.println("");
        System.out.println("--Aluno 1--");
        
        
       
        System.out.println("aluno 1 para Aluno 2: "+aluno1.compararMedia(aluno2));
        System.out.println("aluno 1 para Aluno 3: "+aluno1.compararMedia(aluno3));
        System.out.println("");
        System.out.println("--Aluno 2--");
        System.out.println("aluno 2 para Aluno 1: "+aluno2.compararMedia(aluno1));
        System.out.println("aluno 2 para Aluno 3: "+aluno2.compararMedia(aluno3));
        System.out.println("");
        System.out.println("--Aluno 3--");
        System.out.println("aluno 3 para Aluno 1: "+aluno3.compararMedia(aluno1));
        System.out.println("aluno 3 para Aluno 2: "+aluno3.compararMedia(aluno2));
        
        aluno3.somademedidas(aluno1);
        aluno3.somademedidas(aluno2);
        aluno3.somademedidas(aluno3);
        
        System.out.println("media total = "+aluno3.mediaTotal());
    }
}
