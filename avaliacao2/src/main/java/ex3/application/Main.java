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

package ex3.application;

import ex3.entities.Album;
import ex3.entities.Movie;

/**
 *
 * @author Felipe Borges Carvalho <felipeborgesmelo80@gmail.com> Gabriel Candido <gcrs2018@gmail.com>
 * @data 01/04/2024
 * @brief Class Main
 */
public class Main {
    public static void main(String[] args) {
    
    // 
    Album album = new Album();
    Movie movie = new Movie();
 
    // Atribuindo dados para o objeto Album
    album.setName("Gustavo Lima - Ao vivo em Goiania");
    album.setPrice(45.00);
    album.setNumberOfcopies(1000);
    album.setArtist("Gustavo Lima");
    
    // Exibindo os dados do objeto Album
    System.out.println("Nome do album: " + album.getName());
    System.out.printf("Valor: R$ %.2f \n", album.getPrice());
    System.out.println("Numero de copias: " + album.getNumberOfcopies());
    System.out.println("Nome do artista: " + album.getArtist());
    
    System.out.println();
    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");
    System.out.println();
    
    // Atribuindo dados para o objeto Filme
    movie.setName("Velozes e Furiosos: Desafio em Toquio");
    movie.setPrice(30.00);
    movie.setNumberOfcopies(5000);
    movie.setDirector("John Queiroz");
    
    // Exibindo os dados do objeto Filme
    System.out.println("Nome do filme: " + movie.getName());
    System.out.printf("Valor: R$ %.2f \n", movie.getPrice());
    System.out.println("Numero de copias: " + movie.getNumberOfcopies());
    System.out.println("Nome do artista: " + movie.getDirector());
    
    }
}
