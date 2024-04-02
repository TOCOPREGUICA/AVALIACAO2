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

package ex3.entities;

/**
 *
 * @author Felipe Borges Carvalho <felipeborgesmelo80@gmail.com> Gabriel Candido <gcrs2018@gmail.com>
 * @data 01/04/2024
 * @brief Class Product
 */
public class Product {

    // Atributos
    private String name;
    private Double price;
    private int numberOfcopies;

    // Método Get
    public String getName() {
        return name;
    }

    // Método Set
    public void setName(String name) {
        this.name = name;
    }

    // Método Get
    public Double getPrice() {
        return price;
    }

    // Método Set
    public void setPrice(Double price) {
        this.price = price;
    }

    // Método Get
    public int getNumberOfcopies() {
        return numberOfcopies;
    }

    // Método Set
    public void setNumberOfcopies(int numberOfcopies) {
        this.numberOfcopies = numberOfcopies;
    }
    
    // Método para vender cópias
    public void SellCopies() {  
    }
    
    // Método para comprar cópias
    public void orderCopies() {  
    }
}
