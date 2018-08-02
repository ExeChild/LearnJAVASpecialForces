class EqualSymbolTest{
	public static void main(String args[]){
		stringEqualSymbolTest();
	}
	public static final String x0 = "ab";
	private static void stringEqualSymbolTest(){
		String x = "a" + "b" + 1;
		String y = "ab1";
		boolean bool01 = x == y;
		System.out.println("\"a\" + \"b\" + 1 is ==  \"ab1\"  ----> " + bool01);
		String z = x0 + 1;
		System.out.println(x == z);

		/*
		* 因为编译时优化：常量的相加，在编译时就已经算好，放在内存中。所以x和y是同块内存
		*/
	}
}
