package cn.ccsu.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ccsu.entity.ProductMonthlyRecord;
import cn.ccsu.entity.SalesmanMonthlyRecord;
import cn.ccsu.mapper.SummarizeMonthlySaleInfoMapper;
import cn.ccsu.service.ISummarizeMonthlySaleInfoService;

@Service
public class SummarizeMonthlySaleInfoServiceImpl implements ISummarizeMonthlySaleInfoService {

	@Autowired
	private SummarizeMonthlySaleInfoMapper mapper;

	public SummarizeMonthlySaleInfoServiceImpl() {

	}

	// 查询销售员的月销售记录
	@Override
	public List<SalesmanMonthlyRecord> querySalmanMonthlySaleRoom() {
		return mapper.querySalmanMonthlySaleRoom();
	}

	// 查询产品的月销售记录
	@Override
	public List<ProductMonthlyRecord> queryProductMonthlySaleRoom() {

		return mapper.queryProductMonthlySaleRoom();
	}

}