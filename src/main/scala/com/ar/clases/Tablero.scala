package com.ar.clases

/**
 * Created by Griselda on 19/03/2015.
 */
class Tablero(cantLados:Int, var celdas:List[Celda] ) {

  def getCelda(nombreCelda:String) :Celda= {
   val celda =  celdas filter { celda => celda.nombre == nombreCelda }
    return celda.head
  }

  def getCeldas(nombres: List[String]) :List[Celda] = {
   return  nombres map { a => getCelda(a) }
  }

  def getCeldasVecinas(celda:Celda) : List[Celda] = {
     val nombresCeldas = celda.vecinos
     return getCeldas(nombresCeldas)
  }

  def existeCompañeroEnCelda(celda: Celda, jugador:Jugador):Boolean = {
       celda.existeCompañeroEnCelda(jugador)
  }

  def cantCeldasConCompañeros(personaje:Personaje):Int = {
    val celdasVecinas = getCeldasVecinas(personaje.celdaActual)
    val cant = 0
    val personajesDelJugador = celdasVecinas.map {a=> a.getPersonajesDeJugador(personaje.jugador)}
    return personajesDelJugador.size
  }

}
