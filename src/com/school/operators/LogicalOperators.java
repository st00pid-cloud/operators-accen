package com.school.operators;

public class LogicalOperators {
    public static void main(String[]args){
        boolean hasID = true;
        boolean hasTicket = false;
        boolean isVIP = true;

        boolean idAndTicket = hasID && hasTicket;
        boolean idOrTicket = hasID || hasTicket;
        boolean ticket = !hasTicket;
        boolean idTicketAndVIP = ((hasID && hasTicket) || isVIP);
        boolean idAndVIP = !(hasID && isVIP);

        System.out.println("hasID && hasTicket: " + idAndTicket);
        System.out.println("hasID || hasTicket: " + idOrTicket );
        System.out.println("!hasTicket: " + ticket );
        System.out.println("(hasID && hasTicket) || isVIP: " + idTicketAndVIP );
        System.out.println("!(hasID && isVIP): " + idAndVIP);

        }
    }

