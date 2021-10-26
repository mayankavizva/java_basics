package com.thevarungupta.Day5;

public class Demo6 {
    public static void main(String[] args) {
        // case 1: Exception not occur
        try{
            int c = 10/5;
            System.out.println(c);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Case 1: finally called");
        }

        // case 2: exception occur but not handled
        try{
            int c = 20/0;
            System.out.println(c);
        }
        catch (Exception ex){

        }
        finally {
            System.out.println("Case 2: finally called");
        }

        // case 3: Exception occur and handled
        try{
            int c = 10/0;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Case 3: finally called");
        }

    }
}
