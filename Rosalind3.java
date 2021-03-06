public class Rosalind3{
    private String DNA;
    private String RNA;

    public Rosalind3 (String data){
	DNA = data;
	RNA = "";
    }
    
    public void transcribe(String data){
	for (int i = data.length()-1; i>= 0; i--){
	    char c = data.charAt(i);
	    if (c == 'A'){
		RNA += 'T';}
	    else if (c == 'C'){
		RNA += 'G';}
	    else if (c == 'G'){
		RNA += 'C';}
	    else if (c == 'T'){
		RNA += 'A';} 
	}
    }

    public String solve(){
	transcribe(DNA);
	return RNA;
    }
 
    //main

    public static void main (String[]args){
	Rosalind3 a = new Rosalind3("AAGAGTCTAACCAGATACGCACTAAAAAGACGATAGACTGGTCAGGAGGCACGCCGGTAAAGCCATGTTAAACGCCAGAGTATCTGCCTATTCCACCTTATGAAGCCGGACTATGGCCGCCAAAAATCCGATCGGTGGATCCTGACACCGGACAAGAGCAGTTCTATCGCTTTTCGGCTGGCACCGACGCTTGACCTGAAAGAGAGGACTAACACGGCAGGCGAAACATTGACTCGTTAGGGTGCGTGACCTAGTCTAAGCAGCCTTGGTTGGGCCTATGTTCCTTTCCAATTGTTGCACTGGTGGGGAGACAACATTCATACGCTGCATCATATCTCCCGAGTGCGTATGATTCCTGTCGGCCGTAGCCACAGCTAATAGCACAAAGACACGCTTGCGACAGTCGATCGGATAGTTCCACCAGATCAGTTTTCTCCAGCTCGGTCATGAAACCCTATTAAAGCTATTCCGTATCTGTGGAGACTCGTAAAACGGGGCCGAGACTACGACGGGAGTCGGCCACTAGCCATCAGATCATGTTAGGATCCCAGCTCCCATCTTTATTAAGGCATGGAATAAGGCAGCCCTGAATCACTAGTACTTTTGATTCTCCCTCTTTGCCAGCGGCCCGCTAGACATGGAAGGATTTATAACTAGTAATACTAGGTATATTCCTGTGCTTGGAGGTACGTAATTGCCATATTTTGCTTGATTCGCAATTGCTTTATTACAAATGGCGACTCTGAAATGACACGTGCGATAACCCGTGTCCTCGTTAGGAAGGTTCTGTGTGAACAATCTTCACCTGTCAGGCAGCCGTCCAAACTCACGTTGTCATCCAGGTACTGGGCCCCACACACTACGAGCCCTGCTCAGCCGTGTCTTTTTGGGATACCGTTAGGATCTACTGCACCATACACCTGAGCCAAGTGATCCAACACTGTTCACCCCCGGCAACGATCAAGATGGCTCT");
	System.out.println(a.solve());
    }
}
