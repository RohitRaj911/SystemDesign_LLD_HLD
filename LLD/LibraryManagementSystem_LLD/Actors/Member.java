package Actors;
import Action.Search;
import Action.IssueService;

public class Member extends SystemUser{
    int totalBookCheckedOut;

    Search searchObj;
    IssueService IssueService;
}
