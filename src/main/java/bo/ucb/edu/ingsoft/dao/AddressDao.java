package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.model.Address;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AddressDao {

    public void create(Address address);

    public void update(Address address);

}
