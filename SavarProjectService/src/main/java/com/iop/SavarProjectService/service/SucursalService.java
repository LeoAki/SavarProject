package com.iop.SavarProjectService.service;

import java.util.List;

import com.iop.SavarProjectService.dto.Sucursal;

public interface SucursalService {
	public void addSucursal(Sucursal s);
	public void updateSucursal(Sucursal s);
	public List<Sucursal> listSucursals();
	public Sucursal getSucursalById(String id);
	public void removeSucursal(String id);	
	
}
