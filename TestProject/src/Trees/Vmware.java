package Trees;

public class Vmware {

	static boolean isLinkPossible(char[][] iArray, int i, int j, int m, int n) {

		boolean isPossible = false;
		
		
		if (iArray[i][j] == 'X')
			return true;
		
		if (i != 0 && iArray[i][j] == '^')
			return isLinkPossible(iArray, i - 1, j, m, n);
		else if (j < n - 1 && iArray[i][j] == '>')
			return isLinkPossible(iArray, i, j + 1, m, n);
		else if (i < m - 1 && iArray[i][j] == 'v')
			return isLinkPossible(iArray, i + 1, j, m, n);
		else if (j != 0 && iArray[i][j] == '<')
			return isLinkPossible(iArray, i, j - 1, m, n);

		return isPossible;

	}

	public static String[] getPaths(String[] inputs) {

		String[] returnArray = new String[inputs.length];

		int m = inputs.length;

		int n = inputs[0].length();

		char X = 'X';

		char O = 'o';

		char north = '^';

		char east = '>';

		char south = 'v';

		char west = '<';

		char[][] iArray = new char[m][n];

		char[][] oArray = new char[m][n];

		for (int i = 0; i < inputs.length; i++) {

			iArray[i] = inputs[i].toCharArray();

		}

		for (int i = 0; i < iArray.length; i++) {

			for (int j = 0; j < iArray[i].length; j++) {

				char current = iArray[i][j];

				if (current == X) {

					oArray[i][j] = current;

				} else if (current == O) {
					
							if (i != 0 && iArray[i - 1][j] == X) {

								oArray[i][j] = north;

							} else if (j < n - 1 && iArray[i][j + 1] == X) {

								oArray[i][j] = east;

							} else if (i < m - 1 && iArray[i + 1][j] == X) {

								oArray[i][j] = south;

							} else if (j != 0 && iArray[i][j - 1] == X) {

								oArray[i][j] = west;

							} else {
																

									if (i != 0 && iArray[i - 1][j] == O) {

										oArray[i][j] = north;

									} else if (j < n - 1
											&& iArray[i][j + 1] == O) {

										oArray[i][j] = east;

									} else if (i < m - 1
											&& iArray[i + 1][j] == O) {

										oArray[i][j] = south;

									} else if (j != 0 && iArray[i][j - 1] == O) {

										oArray[i][j] = west;

									}
									else
										
										oArray[i][j] = O;
																
												

							}

						}else
						{
							oArray[i][j]='F';
						}

					}

				}

			

		System.out.println(oArray[0]);
		
		/*for(int i=0;i<oArray.length;i++)
		{
			for(int j=0;j<oArray[i].length;j++)
			{
				
			if(!isLinkPossible(oArray, i, j, m, n))
				oArray[i][j]= '?';
			}
		}*/

		for (int i = 0; i < oArray.length; i++) {

			returnArray[i] = oArray[i].toString();

		}

		return returnArray;

	}

	public static void main(String[] args) {

		
		String []inputs ={"oooFX"};
		String []output = getPaths(inputs);
	//	System.out.println(output[0]);
		

	}
}
