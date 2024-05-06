package com.win.work.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	ProductDao dao;
	
	public List<ProductDto> selectList(ProductVo vo) {
		return dao.selectList(vo);
	}
	
	public ProductDto selectOne(ProductDto dto) {
		return dao.selectOne(dto);
	}
	
	public int insert(ProductDto dto) {
		return dao.insert(dto);
	}
	
	public int update(ProductDto dto) {
		return dao.update(dto);
	}
	
	public int delete(ProductDto dto) {
		return dao.delete(dto);
	}
	
	public int updateDelNy(ProductDto dto) {
		return dao.updateDelNy(dto);
	}
	
	public int getCount(ProductVo vo) {
		return dao.getCount(vo);
	}	
}
