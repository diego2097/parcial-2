/*
 * Copyright (C) 2016 hcadavid
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
package edu.eci.pdsw.managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import edu.eci.pdsw.entities.Paciente;
import edu.eci.pdsw.entities.TipoIdentificacion;
import edu.eci.pdsw.services.ServicesException;
import edu.eci.pdsw.services.BlogServices;

/**
 *
 * @author hcadavid
 */
@ManagedBean(name = "mb")
@SessionScoped
public class PacientesBean extends BasePageBean {

	@Inject
	private BlogServices servicio;

    TipoIdentificacion tipoIdentificacion = TipoIdentificacion.CC;

    public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public List<Paciente> getData() throws Exception{
        try {
            return servicio.consultarPacientes();
        } catch (ServicesException ex) {
            
            throw ex;
        }
        
    }

    public TipoIdentificacion[] getTiposIdentificacion() {
        return TipoIdentificacion.values();
    }
    
}
