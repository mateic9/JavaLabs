

import java.util.*;


public class App {
    public static void main(String[] args) {
        List<String> r1=new ArrayList<String>();
        r1.add("Vaslui");
        r1.add("Onesti");
        r1.add("Bucuresti");
        r1.add("Ss");
        r1.add("Iasi");

        Problem p=new Problem();
        Solution s=new Solution();
        Driver d=new Driver("Matei",12,"vaslui","Iasi");
        Driver d2=new Driver("Edi",12,"buzau","Onesti");
        Driver d3=new Driver("Ion",13,"galati","Iasi");
  d.addRoute(r1);
        Passanger p1=new Passanger( "Vlad",13,"barlad","V");
        Passanger p2=new Passanger( "XVlad",13, "vaslui","V");
        Passanger p3=new Passanger( "FVlad",13,"botosani","V");
        Passanger p4=new Passanger("Cvlad",15,"suceava" ,"V");
        p.addHuman(d3);
       p.addHuman(d);
       p.addHuman(d2);
       p.addHuman(p1);
       p.addHuman(p2);
       p.addHuman(p3);
       p.addHuman(p4);


       s.setInstance(p);
      s.getReachableDestinations();
        }
    }
