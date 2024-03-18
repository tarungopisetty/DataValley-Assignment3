  class Organization {
    private String organizationCode;
    private String organizationName;
    private String organizationAddress;
    public Organization(String code, String name, String address) {
        this.organizationCode = code;
        this.organizationName = name;
        this.organizationAddress = address;
    }
    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }
    public Organization copyOrganization() {
        Organization copy = new Organization(this.organizationCode, this.organizationName, this.organizationAddress);
        return copy;
    }
    public static void main(String[] args) {
        Organization org1 = new Organization("001", "ABC Corp", "123 Main St");
        Organization org2 = org1.copyOrganization(); 
        System.out.println("Original Organization:");
        org1.printDetails(); 
        System.out.println("\nCopied Organization:");
        org2.printDetails(); 
    }
}