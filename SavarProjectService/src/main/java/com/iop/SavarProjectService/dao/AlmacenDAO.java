package com.iop.SavarProjectService.dao;

import java.util.List;

import com.iop.SavarProjectService.dto.Almacen;

public interface AlmacenDAO {
	
	public void addAlmacen(Almacen a);
	public void updateAlmacen(Almacen a);
	public List<Almacen> listAlmacens();
	public Almacen getAlmacenById(String id);
	public void removeAlmacen(String id);	
	public String getNextId();
	
}
