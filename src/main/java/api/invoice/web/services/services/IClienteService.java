package api.invoice.web.services.services;

import java.util.List;
import api.invoice.web.services.models.entities.Cliente;
import api.invoice.web.services.models.entities.Factura;
import api.invoice.web.services.models.entities.Producto;
import api.invoice.web.services.models.entities.Region;

public interface IClienteService {
  
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Cliente cliente);
	
	public List<Region> findAllRegiones();
	
	public Factura findFacturaById(Long id);
	
	public List<Factura> findFacturaAll();
	
	public Factura saveFactura(Factura factura);
	
	public void deleteFacturaById(Long id);
	
	public List<Producto> findProductoByNombre(String term);
}

