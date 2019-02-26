package WebIGo.admin.Dao;

import java.util.List;

import WebIGo.admin.Bean.OrderInfo;

public interface OrderMapper {

	List<OrderInfo> listOrderInfos();

	void addOrder(OrderInfo orderInfo);

	void deleteOrder(OrderInfo orderInfo);

	void updateOrder(OrderInfo orderInfo);

}
