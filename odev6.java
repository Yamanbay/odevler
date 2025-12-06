String sa(){
    return "Selamlar";
}

int weight(int a,int b){
    return a + b;
}

String fazla(){
    return "Bu ağırlık size fazla";
}

String baska(){
    return "Başka bir dumbbell deneyin";
}

void main() {
    System.out.println(sa());
    System.out.println("10 + 10="+weight(10,10));
    System.out.println(fazla());
    System.out.println(baska());
}
