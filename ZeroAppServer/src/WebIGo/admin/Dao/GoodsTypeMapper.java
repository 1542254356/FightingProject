package WebIGo.admin.Dao;

import java.util.List;

import WebIGo.admin.Bean.GoodsType;


public interface GoodsTypeMapper {
	 List<GoodsType> listGoodsType();
	 List<GoodsType> findGoodsTypeById(GoodsType goodsType);
	 int addGoodsType(GoodsType goodsType);
	void updateGoodsType(GoodsType goodsType);
	void deleteGoodsType(GoodsType goodsType);
	void addGoodsType2(GoodsType goodsType);

}
