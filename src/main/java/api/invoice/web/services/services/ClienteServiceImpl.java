package api.invoice.web.services.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import api.invoice.web.services.models.entities.Cliente;
import api.invoice.web.services.models.entities.Factura;
import api.invoice.web.services.models.entities.Producto;
import api.invoice.web.services.models.entities.Region;

import api.invoice.web.services.models.dao.IClienteDao;
import api.invoice.web.services.models.dao.IFacturaDao;
import api.invoice.web.services.models.dao.IProductoDao;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;
	
	
	@Autowired
	private IFacturaDao facturaDao;
	
	@Autowired
	private IProductoDao productoDao;

	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
		
	}

	@Override
	@Transactional(readOnly=true)
	public Cliente findById(Long id) {
		return  clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		 return clienteDao.save(cliente);
	}

	@Override
	@Transactional
	public void delete(Cliente cliente) {
		clienteDao.delete(cliente);
		
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Region> findAllRegiones() {
		return clienteDao.findAllRegiones();
	}
	
	@Override
	@Transactional(readOnly=true)
	public Factura findFacturaById(Long id) {
		return facturaDao.findById(id).orElse(null);
		
	}

	@Override
	@Transactional
	public Factura saveFactura(Factura factura) {
		return facturaDao.save(factura);
	}

	@Override
	@Transactional
	public void deleteFacturaById(Long id) {
		facturaDao.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findProductoByNombre(String term) {
		return productoDao.findByNombreContainingIgnoreCase(term);
	}

	@Override
	public List<Factura> findFacturaAll() {
		 return (List<Factura>) facturaDao.findAll();
	}

}
