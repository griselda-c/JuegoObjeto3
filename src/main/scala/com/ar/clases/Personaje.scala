package com.ar.clases

/**
 * Created by Griselda on 19/03/2015.
 */
class Personaje (var energia: Int,var escudo: Int,var experiencia: Int, val jugador: Jugador, var celdaActual: Celda) {

  def cantDeCompanerosVecinos (): Int = {

    return 1
  }

  def getVecinos(tablero: Tablero):List[Celda] = {
       return List[Celda]()

  }

  def esCompanero(personaje:Personaje):Boolean ={
    return personaje.jugador == jugador

  }


}
