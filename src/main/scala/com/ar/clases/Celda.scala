package com.ar.clases

import scala.collection.mutable.ListBuffer

/**
 * Created by Griselda on 19/03/2015.
 */
class Celda (cantVecinos: Int, val vecinos:List[String], val nombre:String ){

 var personajes = ListBuffer[Personaje]()

  def getPersonajesDeJugador(jugador:Jugador):ListBuffer[Personaje] = {
     personajes.filter{ a => a.jugador == jugador}
  }

  def existeCompañeroEnCelda(jugador:Jugador):Boolean = {
    personajes.exists{ a => a.jugador == jugador}
  }

}
