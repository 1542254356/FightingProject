package WebIGo.admin.Dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import WebIGo.admin.Bean.GoodsType;
import WebIGo.admin.utils.MybatisUtil;

public class GoodsTypeDao {
	private SqlSessionFactory sessionFactory = MybatisUtil.getInstance();
	
	public List<GoodsType> listGoodsType()
	{
		SqlSession session = sessionFactory.openSession();
		GoodsTypeMapper goodsTypeMapper = session.getMapper(GoodsTypeMapper.class);
		List<GoodsType> typeList = goodsTypeMapper.listGoodsType();
		return typeList;
		
	}
	
	public int addGoodsType(GoodsType  goodsType)
	{
		SqlSession session = sessionFactory.openSession();
		GoodsTypeMapper goodsTypeMapper = session.getMapper(GoodsTypeMapper.class);
		if(goodsType.getTid()!=0) {
			goodsTypeMapper.addGoodsType2(goodsType);
			System.out.println("addGoodsType2 :"+"ok");
		}else {
			goodsTypeMapper.addGoodsType(goodsType);
			//System.out.println("addGoodsType :"+"ok");
		}

		session.commit();
		return 0;
		
	}

	public int updateGoodsType(GoodsType goodsType) {
		// TODO Auto-generated method stub
		SqlSession session = sessionFactory.openSession();
		GoodsTypeMapper goodsTypeMapper = session.getMapper(GoodsTypeMapper.class);
		goodsTypeMapper.updateGoodsType(goodsType);
		session.commit();
		return 0;
	}

	public int deleteGoodsType(GoodsType goodsType) {
		// TODO Auto-generated method stub
		SqlSession session = sessionFactory.openSession();
		GoodsTypeMapper goodsTypeMapper = session.getMapper(GoodsTypeMapper.class);
		goodsTypeMapper.deleteGoodsType(goodsType);
		session.commit();
		return 0;
		
	}

	public boolean findGoodsTypeByTid(GoodsType goodsType) {
		// TODO Auto-generated method stub
		SqlSession session = sessionFactory.openSession();
		GoodsTypeMapper goodsTypeMapper = session.getMapper(GoodsTypeMapper.class);
		List<GoodsType> typeList = goodsTypeMapper.findGoodsTypeById(goodsType);
		
		if(typeList.size()==0) {
			return false;
		}
		else {
			return true;
		}
	}


}
