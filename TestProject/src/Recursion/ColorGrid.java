package Recursion;

import java.util.HashMap;

public class ColorGrid {

	public class Screen {
		int maxx;
		int maxy;

		public Screen(int x, int y) {
			this.maxx = x;
			this.maxy = y;
		}
	}

	public boolean colorBoxes(int x, int y, String color, Screen s,
			String[][] pixels) {

		if ((x < 0 || x > s.maxx) || (y < 0 || y > s.maxy)) {
			return false;
		}

		else if (pixels[y][x] != color) {

			colorBoxes(x - 1, y, color, s, pixels);
			colorBoxes(x + 1, y, color, s, pixels);
			colorBoxes(x, y - 1, color, s, pixels);
			colorBoxes(x, y + 1, color, s, pixels);

		}

		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
