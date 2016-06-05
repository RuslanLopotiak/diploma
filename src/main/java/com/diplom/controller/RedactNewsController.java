package com.diplom.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.diplom.DTO.GrouppDTO;
import com.diplom.DTO.NewsDTO;
import com.diplom.dao.NewsDao;
import com.diplom.model.Groupp;
import com.diplom.model.News;
import com.diplom.service.NewsServise;

@Controller
@RequestMapping(value = { "/redactNews" })
public class RedactNewsController {

	@Inject
	private NewsServise newsService;

	@RequestMapping(method = RequestMethod.GET)
	public String redactNews(Model model, HttpServletRequest request, Principal principal) {
		return "redactNews";
	}

	@RequestMapping(value = { "/getAll" }, method = RequestMethod.GET)
	public @ResponseBody List<NewsDTO> groupAll() {
		List<News> temp = newsService.findAll();
		List<NewsDTO> newsDTOs = new ArrayList<>();
		for (News news : temp) {
			newsDTOs.add(new NewsDTO(news.getId(),news.getTitle(), news.getTextNews(),news.getTime()) );
		}
		return newsDTOs;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> deleteNews(@RequestBody GrouppDTO grouppDTO) {

		News temp = newsService.findById(Integer.parseInt(grouppDTO.getId()));

		newsService.remove(temp);
		return new ResponseEntity<>(HttpStatus.OK);

	}
	@RequestMapping(value = "/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> updateNews(@RequestBody News news) {
		System.out.println(news.getId());
		News temp = newsService.findById(news.getId());
		temp.setTitle(news.getTitle());
		temp.setTextNews(news.getTextNews());
		newsService.update(temp);
		return new ResponseEntity<>(HttpStatus.OK);

	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> addNews(@RequestBody News news) {
		newsService.save(news);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	@RequestMapping(value = "/newsInModal", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody News  NewsInModal(@RequestBody GrouppDTO grouppDTO) {

		return newsService.findById(Integer.parseInt(grouppDTO.getId()));

	}
}
