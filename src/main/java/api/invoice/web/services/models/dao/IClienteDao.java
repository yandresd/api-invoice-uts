package api.invoice.web.services.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import api.invoice.web.services.models.entities.Cliente; 
import api.invoice.web.services.models.entities.Region;

public interface IClienteDao extends CrudRepository<Cliente,Long> {
	
	@Query("from Region")
	public List<Region> findAllRegiones();
}
