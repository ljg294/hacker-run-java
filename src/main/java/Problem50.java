
//Java Object Oriented Programming Java Method Overriding
class Sports{

    String getName(){
        return "Generic Sports";
    }

    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }

    // Write your overridden getNumberOfTeamMembers method here

}

public class Problem50{

    public static void main(String []args){
        Sports sports = new Sports();
        Soccer soccer = new Soccer();

        System.out.println(sports.getName());
        sports.getNumberOfTeamMembers();

        System.out.println(soccer.getName());
        soccer.getNumberOfTeamMembers();
    }
}
