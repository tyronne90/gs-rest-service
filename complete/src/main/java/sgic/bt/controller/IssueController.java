package sgic.bt.controller;

//import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping; //This is for  @RequestMapping("/Issue")
import org.springframework.web.bind.annotation.RestController;

import sgic.bt.domain.Issue;
import sgic.bt.service.IssueService;

/*
 * @RestController public class IssueController {
 * 
 * @RequestMapping("/Issue") public Issue greeting() { return new Issue(); }
 * 
 * }
 */

@RestController
public class IssueController {
	
	@Autowired
	IssueService issueService;
	//IssueService issueService = new IssueService(); // Without @Autowired we need to use this
	
	@GetMapping("/Issue")
	public List<Issue> getIssue(){
		 List <Issue> issueList = issueService.getAllIssue();
		return issueList;
	}
	
	@PostMapping("/Issue")
	public Issue createIssue(@Valid @RequestBody Issue issue) {
		System.out.println("In the post method creating a issue");
		Issue savedIssue = issueService.saveIssue(issue);
		return savedIssue;
	}
	
	@GetMapping("/Issue/{id}")
	public Issue getIssueById(@PathVariable("id") long issueId) {
		System.out.println("In the post method getting a issue");
		Issue issue = issueService.getIssueById(issueId);
		return issue;
	}
	
	@DeleteMapping("/Issue/{id}")
	public Issue deleteIssueById(@PathVariable("id") long issueId) {
		System.out.println("In the delete method getting a issue");
		Issue issue = issueService.deleteIssueById(issueId);
		return issue;
	}

	/*
	 @GetMapping("/Issue") 
	 public List <Issue> issue() {
		 List <Issue> issueList = new ArrayList<>();
		 Issue issueOne = new Issue();
		 issueOne.setDescription("issue one description is here");
		 issueOne.setTitle("Wrong pronunciation headline");
		 issueOne.setId(1);
		 
		 Issue issueTwo = new Issue();
		 issueTwo.setDescription("issue two description is here");
		 issueTwo.setTitle("wrong color pallate");
		 issueTwo.setId(2);
		 
		 issueList.add(issueOne);
		 issueList.add(issueTwo);
		 
		 return issueList;
	 }
	 
	 @PostMapping("/Issue")
	 public String createIssue(@Valid @RequestBody Issue issue) {
		 //System.out.print("In the post method creating a issue");
		 Issue issueTwo = new Issue();
		 issueTwo.setDescription("issue two description is here");
		 issueTwo.setTitle("wrong color pallate");
		 issueTwo.setId(2);
		 
		return "Sucess";
	 }
	*/ 
	 
	 
	 }