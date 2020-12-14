package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.model.Address;
import bo.ucb.edu.ingsoft.model.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDao {
    public void updateOrderState(Order order);

    public void updateOrderAddress(Order order);

    public void updateAddress(Address address);

    public Integer selectAddressId(Integer orderId);

    public void createOrder(Order order);
}
