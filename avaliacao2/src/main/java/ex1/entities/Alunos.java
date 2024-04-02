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

package ex1.entities;

/**
 *
 * @author Felipe Borges Carvalho <felipeborgesmelo80@gmail.com> Gabriel Candido <gcrs2018@gmail.com>
 * @data 01/04/2024
 * @brief Class Alunos
 */
public class Alunos {
    private double n1;
    private double n2;
    private double n3;
    private double n4;
    private double media;
    private final int numero_de_alunos = 3;
    private double soma_de_medidas;
    
    public Alunos(){
        
    }
    public Alunos(double n1,double n2,double n3,double n4){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
    }
    
    public void Media(){
       this.media = (n1*1)+(n2*2)+(n3*3)+(n4*4);
    }
    
    public double getMedia(){
       return media; 
    }
    
   
    public int compararMedia(Alunos aluno){
        
            if(media < aluno.media){
                return -1;
            }else if(media == aluno.media){
                return 0;
            }else{
                return 1;
            }
    }
    public void somademedidas(Alunos aluno){
        soma_de_medidas = soma_de_medidas + aluno.media;
    }
    public double mediaTotal(){
        return (soma_de_medidas/numero_de_alunos);
    }
}
