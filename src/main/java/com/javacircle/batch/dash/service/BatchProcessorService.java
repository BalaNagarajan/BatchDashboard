package com.javacircle.batch.dash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javacircle.batch.dash.dao.BatchProcessorDao;
import com.javacircle.batch.domain.StudDept;

/**
 * Service class to compute the count of Bigram
 * 
 * @author Bala
 *
 */
@Service
public class BatchProcessorService {

	@Autowired
	private BatchProcessorDao batchProcessorDao;

	public List<StudDept> checkBatchStatus() {

		List<StudDept> studListObj = batchProcessorDao.findStudentByDepartment();

		if (studListObj != null && studListObj.size() > 0) {
			System.out.println("-----------The List Size----->" + studListObj.size());
		} else {
			System.out.println("-----------The List Size Is Empty----->");
		}

		return studListObj;
	}

}
