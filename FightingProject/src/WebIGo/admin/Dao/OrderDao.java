package WebIGo.admin.Dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import WebIGo.admin.Bean.OrderInfo;
import WebIGo.admin.utils.MybatisUtil;

public class OrderDao {
	private SqlSessionFactory sessionFactory = MybatisUtil.getInstance();

	public List<OrderInfo> listOrderInfos() {
		// TODO Auto-generated method stub
		SqlSession session = sessionFactory.openSession();
		OrderMapper orderMapper = session.getMapper(OrderMapper.class);
		List<OrderInfo> orderInfosList = orderMapper.listOrderInfos();
		return orderInfosList;
	}

	public int addOrder(OrderInfo orderInfo) {
		// TODO Auto-generated method stub
		SqlSession session = sessionFactory.openSession();
		OrderMapper orderMapper = session.getMapper(OrderMapper.class);
		orderMapper.addOrder(orderInfo);
		session.commit();
		return 0;
	}

	public int deleteOrder(OrderInfo orderInfo) {
		// TODO Auto-generated method stub
		SqlSession session = sessionFactory.openSession();
		OrderMapper orderMapper = session.getMapper(OrderMapper.class);
		orderMapper.deleteOrder(orderInfo);
		session.commit();
		return 0;
	}

	public int updateOrder(OrderInfo orderInfo) {
		// TODO Auto-generated method stub
		SqlSession session = sessionFactory.openSession();
		OrderMapper orderMapper = session.getMapper(OrderMapper.class);
		orderMapper.updateOrder(orderInfo);
		session.commit();
		return 0;
	}

}
