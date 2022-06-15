import java.util.Date;
public class AlfredQuotes {
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name, String dayPeriod) {
        String str1 = String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
        return str1;
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "Today is " + date;
    }

    public String respondBeforeAlexis(String conversation) {
        int index1 = conversation.indexOf("Alexis");
        int index2 = conversation.indexOf("Alfred");
        if(index1 != -1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }else if(index2 != -1){
            return "At your service. As you wish, naturally.";
        }else{
            return "Right. And with that I shall retire.";
        }
    }
}
