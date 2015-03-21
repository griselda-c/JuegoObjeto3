package com.ar.politicaDePersonaje

import com.ar.clases.{Tablero, Personaje, PoliticaDePersonaje}

/**
 * Created by Griselda on 20/03/2015.
 */
class Colaborador(tablero: Tablero) extends PoliticaDePersonaje {

  def hayCompañerosEnDosOMasCeldas (personaje: Personaje): Boolean = {
      val celda = personaje.celdaActual
      val celdasVecinas = tablero.getCeldasVecinas(celda)

      return true


  }
  override def sugerenciaDeMovimiento (personaje: Personaje): Boolean = {
    val seMueve = true;


    return seMueve
  }


}
