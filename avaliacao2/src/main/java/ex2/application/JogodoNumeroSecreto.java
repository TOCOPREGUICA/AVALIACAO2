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

package ex2.application;

import ex2.entities.NumeroSecreto;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Felipe Borges Carvalho <felipeborgesmelo80@gmail.com> Gabriel Candido <gcrs2018@gmail.com>
 * @data 01/04/2024
 * @brief Class JogodoNumeroSecreto
 */
public class JogodoNumeroSecreto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        
        
        NumeroSecreto numerosecreto = new NumeroSecreto();
        
        numerosecreto.Sortear();
        System.out.println("Escreva um palpite"); 
        do{ 
        }while(numerosecreto.Adivinhar(ler.nextInt()));
    
    }
}
