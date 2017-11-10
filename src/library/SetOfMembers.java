/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package library;

import java.util.ArrayList;



/**
 *
 * @author Kutoma
 */
public class SetOfMembers extends ArrayList<Member> {


    public SetOfMembers()
    {
        super();
    }

    public void addMember(Member aMember) {
        this.add(aMember);
    }

    public void removeMember(Member aMember) {
        int index = this.indexOf(aMember);
        if(index != -1) {
            this.remove(index);
        }
    }

    public SetOfMembers getMembersFromName(String memberName){
        SetOfMembers foundMembers = new SetOfMembers();
        String lowerCaseMemberName = memberName.toLowerCase();
        for (Member m : this) {
            if (m.getMemName().toLowerCase().startsWith(lowerCaseMemberName))
                foundMembers.addMember(m);
        }
        return foundMembers;
    }

    public Member getMemberFromNumber(int memberNumber){
        for (Member m : this) {
            if (m.getMemNumber() == memberNumber)
                return m;
        }
        return null;
    }

}
