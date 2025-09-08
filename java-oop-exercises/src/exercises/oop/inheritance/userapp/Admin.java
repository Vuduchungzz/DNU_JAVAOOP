package exercises.oop.inheritance.userapp;

import java.util.*;

public class Admin extends User {
    private ArrayList<String> permissions = new ArrayList<>();

    public Admin(){}
    public Admin(String userId, String username, String password, String email, java.util.List<String> permissions){
        super(userId, username, password, email);
        if (permissions!=null) this.permissions = new ArrayList<>(permissions);
    }

    public ArrayList<String> getPermissions(){ return permissions; }
    public void setPermissions(ArrayList<String> permissions){ this.permissions=permissions; }

    @Override public String toString(){
        return "Admin{userId='"+getUserId()+"', username='"+getUsername()+"', email='"+getEmail()+"', permissions="+permissions+"}";
    }

    @Override public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Số quyền: ");
        int n = Integer.parseInt(sc.nextLine());
        permissions.clear();
        for (int i=0;i<n;i++){
            System.out.print("Quyền #" + (i+1) + ": ");
            permissions.add(sc.nextLine());
        }
    }
}
