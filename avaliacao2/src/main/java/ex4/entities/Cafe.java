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

package ex4.entities;

/**
 *
 * @author Felipe Borges Carvalho <felipeborgesmelo80@gmail.com> Gabriel Candido <gcrs2018@gmail.com>
 * @data 01/04/2024
 * @brief Class Cafe
 */
public class Cafe {
    
    private String nome;
    private int quantidade = 0;
    private double valor;
    
    public Cafe(){
        
    }
    
    public Cafe(String nome,double valor){
        this.nome = nome;
        this.valor = valor;
    }
    
    public void addCafe(){
        quantidade++;
        System.out.println("Iten adicionado");
    }
    
    public void removerCafe(){
        if(quantidade <= 0 ){
        System.out.println("Voce nao tem mais esse itens no carrinho");
        }else{
        quantidade--;
        System.out.println("Iten removido");
        }        
    } 
    
    public String getNome(){
        return nome;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public double total(){
        return quantidade*valor;
    }
    
}
