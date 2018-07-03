package arrayexample;

public class arrayex {
public static void main(String[] args) {
String nameC = "Chitra";
String nameB = "Bikram";
String nameBa = "Balu";
String nameA = "Adif";
//Index arrays starts from 0
String fnames[] = {"Chitra","Bikram","Balu",nameA};
//for (int i =0; i <4;i++) {
//System.out.println(fnames[i]);
//}	
int i = 0;
while (i<4) {
	System.out.println(fnames[i]);
	i++;
}	
}
}
