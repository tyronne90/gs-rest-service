package sgic.bt.domain;

import javax.validation.constraints.NotEmpty;

public class Issue {
	
private long id;
	@NotEmpty
private String title;
	@NotEmpty
private String description;

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
