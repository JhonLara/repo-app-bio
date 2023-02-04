package com.repodoc.appbio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repodoc.appbio.repository.RepoRepository;

/**
 * 
 * Class for builder the logic that reponse the values
 * 
 * @author Jhon Lara
 *
 */
@Service
public class ReposService {

	@Autowired
	private RepoRepository repoRepository;

}
