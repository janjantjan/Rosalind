public class Rosalind1{

    private int numA;
    private int numC;
    private int numG;
    private int numT;
    private String DNA;

    public Rosalind1(String data){
	numA = 0;
	numC = 0;
	numG = 0;
	numT = 0;
	DNA = data;
    }

    public  void seqDNA(String data){
	for (int i=0; i < data.length(); i++){
	    char c = data.charAt(i);
	    if (c == 'A'){
		numA++;}
	    else if (c == 'C'){
		numC++;}
	    else if (c == 'G'){
		numG++;}
	    else if (c == 'T'){
		numT++;}
	}}

    public String makeString(){
	String fin = "";
	fin += numA + " " + numC + " " + numG + " " + numT;
	return fin;}

    public String solve(){
	seqDNA(DNA);
	return makeString();
    }
    //Main

    public static void main (String[]args){
	Rosalind1 a  = new Rosalind1("TGTTACACCACTACAGATAGATCATGAGAAACATTCGAGCTTAGGAGGCGCTCGGACGCTTCTTCTTTAGTCGGTTAGAGTGAATCCGAGGAGGGAGCATACCGCCTAAATGGCTCCCGCCGGTCGGAGTTCACCGCGGTTGTTGCGGGGGAGAATACTCATACGAGTTCATCACCTTTAAATCTCGGATAATCCAGTTAATGGTGACTCATTATCAGCTGCGGCGTGCCAGTCGAGGCGAAGACCAACAGCCGGGGTGCTTTATTGCAAACTGCCTCTGTTTTAACCCGATTGAATCCCTTGCGGAGCCGTGTGTTGTGCATAGTTGATAAACGAATAACAAATCGTCCGGGTACGCACAGAGGCTGTCGTTGAGTACGGCCTATCGTGAGGCGCTGGTCCCAAATCTGCTCAGACTAGTTTTTCGGTCTTAGGGCCCAGGTTCAATGAGAGCGCTCATTCTAGTATCTTGTGATATAGAGAGCCGGAGTGGATCAAGGGTATACAATTTAATTTTTTCTTGTCGATCTTAAATCGCAACTAACCACCGCAGGCGGTTGTCCCGGAATTACCTCTGGCGTGTCGCGTACGGAAGGCAGGCGTGGAACCGGCAGTTAGCGATGTTGCAGTTCTGCAGTCCCAGGGATGAACGTAGTAGGGGAGAACAAGTCGACGGCGGGCGGAGTGTGGTAATGTCGAAAGTACTCATTTGCTCGGGCCATCTTCTGACACTATTGGGTAAATATAATGGCCATTGAGTTATAATGATGACAGTAAACATTCTTTTCGAGGCGGGGACCACGTCTAAGCGTTAACAGCTGCAGTCCGCGCCCCTGTGAATAAGACGGTACGTAACGACCCAGGCAAGTATGGATTTACGTGCCCGTGCACGTGTATTCG");
	System.out.println(a.solve());
    }
	    
    
}
	

    
	    
			
