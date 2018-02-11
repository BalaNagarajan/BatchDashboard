package com.javacircle.batch.dash.controller;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javacircle.batch.dash.service.BatchProcessorService;
import com.javacircle.batch.domain.StudDept;

/**
 * The purpose of this Controller is to parse the input file and display the
 * bigrams with the count
 * 
 * @author Bala
 *
 */

@Controller
public class BatchMonitorController {

	private static final Logger LOGGER = LoggerFactory.getLogger(BatchMonitorController.class);
	@Autowired
	private BatchProcessorService processorService;

	@RequestMapping(value = "/checkStatus", method = RequestMethod.POST)
	public String checkBatchStatus(Model model) throws IOException {
		LOGGER.info("Start::POST::checkBatchStatus()");
		String processed = null;
		List<StudDept> studDeptList = null;
		try {

			System.out.println("-----Inside Check Batch Status------");
			studDeptList = processorService.checkBatchStatus();

			// processed = processorService.process(builder.toString());

		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {

		}

		 model.addAttribute("studDeptList", studDeptList);
		LOGGER.info("End::POST::checkBatchStatus()");
		return "result";

	}

}
