package WebIGo.admin.Dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import WebIGo.admin.Bean.OrderGoods;
import WebIGo.admin.utils.MybatisUtil;

public class OrderGoodsDao {
	private SqlSessionFactory sessionFactory = MybatisUtil.getInstance();
	
	public List<OrderGoods> listGoodsOfOrder(OrderGoods orderGoods){
		// TODO Auto-generated method stub
		SqlSession session = sessionFactory.openSession();
		OrderGoodsMapper orderGoodsMapper = session.getMapper(OrderGoodsMapper.class);
		List<OrderGoods> orderGoodslist =  orderGoodsMapper.listGoodsOfOrder(orderGoods);
		return orderGoodslist;
		
	}

	public int addOrderGoods(OrderGoods orderGoods) {
		// TODO Auto-generated method stub
		SqlSession session = sessionFactory.openSession();
		OrderGoodsMapper orderGoodsMapper = session.getMapper(OrderGoodsMapper.class);
		orderGoodsMapper.addOrderGoods(orderGoods);
		session.commit();
		return 0;
	}

	public int deleteOrderGoods(OrderGoods orderGoods) {
		// TODO Auto-generated method stub
		SqlSession session = sessionFactory.openSession();
		OrderGoodsMapper orderGoodsMapper = session.getMapper(OrderGoodsMapper.class);
		orderGoodsMapper.deleteOrderGoods(orderGoods);
		session.commit();
		return 0;
	}

	public int updateOrderGoods(OrderGoods orderGoods) {
		// TODO Auto-generated method stub
		SqlSession session = sessionFactory.openSession();
		OrderGoodsMapper orderGoodsMapper = session.getMapper(OrderGoodsMapper.class);
		orderGoodsMapper.updateOrderGoods(orderGoods);
		session.commit();
		return 0;
	}
}
