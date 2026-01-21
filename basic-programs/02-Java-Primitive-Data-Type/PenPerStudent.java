class PenPerStudent{
    public static void main(String[] args){
	    int pen = 14;
		int students = 3;
		int pens_per_student = pen / students;
		int remaining_pens = pen%students;
		System.out.println("The Pen Per Student is "+pens_per_student+" and the remaining pen not distributed is "+remaining_pens);
	}
}