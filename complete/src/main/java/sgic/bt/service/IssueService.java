package sgic.bt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import sgic.bt.domain.Issue;

@Service
public class IssueService {
	
	private List<Issue> isssueList = new ArrayList<>();

	public Issue saveIssue(Issue issue) {
		isssueList.add(issue);
		return issue;
	}
	
	public List<Issue> getAllIssue(){
		return isssueList;
	}	
	
	public Issue getIssueById(long issueId) {
		for(Issue issue : isssueList) {
			if(issue.getId()==issueId) {
				return issue;
			}
		}
		return null;
		}
	
	public Issue deleteIssueById(long issueId) {
		for(Issue issue : isssueList) {
			if(issue.getId()==issueId) {
				isssueList.remove(issue);
				return issue;
			}
		}
		return null;
	}


}
