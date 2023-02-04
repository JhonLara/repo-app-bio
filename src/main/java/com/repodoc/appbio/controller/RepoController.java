package com.repodoc.appbio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.repodoc.appbio.service.ReposService;

/**
 * Controller for expose the services
 * 
 * @author jhonlara10
 */
@RestController
@RequestMapping("/repos")
public class RepoController {

	@Autowired
	private ReposService reposService;



}
