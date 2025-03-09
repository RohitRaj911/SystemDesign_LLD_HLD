package Action;

import Actors.BookItem;
import Actors.SystemUser;

public class IssueService {
    FineService fine;

    public BookLending getBookReservationDetail(BookItem book){
        return null;
    }

    public void updateReservationDetail(BookLending bookDetail){
        
    }

    public BookLending reserveBook(BookItem bookItem, SystemUser user){
        return null;
    }

    public BookIssueDetail issueBook(BookItem book, SystemUser user){
        return null;
    }

    public BookIssueDetail renewBook(BookItem book, SystemUser user){
        return null;
    }

    public void returnBook(BookItem book, SystemUser user){
        
    }
}
