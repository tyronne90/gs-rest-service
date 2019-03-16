package sgic.bt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sgic.bt.domain.Issue;

@RestController
public class IssueController {
	@RequestMapping("/Issue")
	public Issue greeting() {
		return new Issue();
	}

}
