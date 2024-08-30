import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        // Scanner input= new Scanner(System.in);
        // int day=input.nextInt();
     
        // String dayName="";
        // switch (day) {
        //     case 1:
        //         dayName="Sunday";
        //         break;
        //         case 2:
        //         dayName="Monday";
        //         break;
        //         case 3:
        //         dayName="Wednesday";
        //         break;
        //         case 5:
        //         dayName="thursday";
        //         break;
        //         case 4:
        //         dayName="friday";
        //         break;
        //         case 6:
        //         dayName="saturday";
        //         break;
        //         case 7:
        //         dayName="tuesday";
        //         break;
        //     default:
        //         break;
        // }
        // System.out.println(dayName);


int day=4;
int time=10;
String dayType="";
String typeOfWork="";

switch(day){
case 1:
case 2:
case 3:
case 4:
case 5:
dayType="Workday";
break;
case 6:
case 7:
dayType="Weekend";
break;
default:
dayType="invalid day";
}
switch (dayType) {
    case "Weekend":
    switch (time) {
        case 9:
            typeOfWork="relax";
            break;
            case 10:
            typeOfWork="relax";
            break;
            case 11:
            typeOfWork="relax";
            break;
        default:
            break;
    }
        
        break;

case "Workday":
switch (time) {
    case 9:
        typeOfWork="come to office";
        break;
        case 12:
        typeOfWork="office coffe";
        break;
        case 1:
        typeOfWork="office launch";
        break;
        case 5:
        typeOfWork="go to home";
        break;
    default:
    typeOfWork="invalid day";
        break;
}
break;
    default:
    dayType="invalid day";
        break;
}





System.out.println(dayType +" "+ typeOfWork);





    }

}
