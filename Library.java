// Program 12: Inner Class in Library Example

class Library {
    private String libraryName;

    Library(String name) {
        this.libraryName = name;
    }

    // Non-static inner class
    class Member {
        String memberName;
        int memberId;

        Member(String memberName, int memberId) {
            this.memberName = memberName;
            this.memberId = memberId;
        }

        void displayMemberInfo() {
            System.out.println("Library: " + libraryName);
            System.out.println("Member Name: " + memberName);
            System.out.println("Member ID: " + memberId);
        }
    }

    public static void main(String[] args) {
        Library lib = new Library("City Central Library");

        // To instantiate a non-static inner class:
        Library.Member m1 = lib.new Member("Alice", 101);
        m1.displayMemberInfo();
    }
}

