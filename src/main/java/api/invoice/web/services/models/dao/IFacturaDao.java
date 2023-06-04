package api.invoice.web.services.models.dao;

import org.springframework.data.repository.CrudRepository;

import api.invoice.web.services.models.entities.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Long> {

}
