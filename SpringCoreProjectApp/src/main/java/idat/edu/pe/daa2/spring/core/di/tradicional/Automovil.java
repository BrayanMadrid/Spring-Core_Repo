package idat.edu.pe.daa2.spring.core.di.tradicional;

import org.springframework.stereotype.Component;

@Component
public class Automovil implements VehiculoI {

	@Override
	public void acelerar() {
		
		System.out.println("Viajando en un auto");
		
	}
	
}
