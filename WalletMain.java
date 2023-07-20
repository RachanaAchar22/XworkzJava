class WalletMain{
	public static void main(String[] args)
	{
		System.out.println("Invoking Wallet in WalletKiller");
		Wallet wallet=new Wallet();
		
		System.out.println("---------------------------");
		Wallet wallet1=new Wallet("Bellroy",350,"Black");
		System.out.println(wallet1.brand);
		System.out.println(wallet1.price);
		System.out.println(wallet1.color);
		
	}
}