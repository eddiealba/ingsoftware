package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.model.CartDetail;
import bo.ucb.edu.ingsoft.model.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CartDetailDao {

    public void createCartDetail(CartDetail cartDetail);
}
