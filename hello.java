class hello{
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		int wagePerHour = 20;
                int fullDayHour = 8;
                int dailyWage = 0;
		int IS_FULL_TIME = 1;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			 System.out.println("Employee is Absent");
	}
}
