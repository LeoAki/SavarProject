package com.iop.SavarProjectService.service;

import java.util.List;

import com.iop.SavarProjectService.dto.Vehiculo;

public interface VehiculoService {
	public void addVehiculo(Vehiculo v);
	public void updateVehiculo(Vehiculo v);
	public List<Vehiculo> listVehiculos();
	public Vehiculo getVehiculoById(String id);
	public void removeVehiculo(String id);		
	public String getNextId();
}
