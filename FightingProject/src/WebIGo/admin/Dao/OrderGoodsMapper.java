package WebIGo.admin.Dao;

import java.util.List;

import WebIGo.admin.Bean.OrderGoods;

public interface  OrderGoodsMapper {

	List<OrderGoods> listGoodsOfOrder(OrderGoods orderGoods);

	void addOrderGoods(OrderGoods orderGoods);

	void deleteOrderGoods(OrderGoods orderGoods);

	void updateOrderGoods(OrderGoods orderGoods);

}
