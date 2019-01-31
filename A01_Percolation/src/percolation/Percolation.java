package percolation;

import java.util.Random;

import edu.princeton.cs.algs4.QuickUnionUF;

public class Percolation {

	QuickUnionUF uf1 = new QuickUnionUF(5);
	int[][] sites;
	static int dim;

	// create N­by­N grid, with all sites blocked
	public Percolation(int n) {
		sites = new int[n][n];

		dim = n;

	}

	// open the site (row i, col j)
	public void open(int i, int j) {
		sites[i][j] = 1;
	}

	// is the site (row i, col j) open?
	public boolean isOpen(int i, int j) {
		if (this.sites[i][j] == 1) {
			return true;
		} else {
			return false;
		}
	}

	// is the site (row i, col j) full?
	public boolean isFull(int i, int j) {
		if (this.sites[i][j] != 1) {
			return true;
		} else {
			return false;
		}
	}

	// does the system percolate?
	// I have not started on this one yet
	public boolean percolates() {
		return false;

	}

	// iterates through the matrix and prints to console
	private static void printSim(Percolation perc) {
		for (int i = 0; i < perc.sites.length; i++) {
			for (int j = 0; j <= perc.sites.length - 1; j++) {
				if (j == perc.sites.length - 1) {
					System.out.print(" " + perc.sites[i][j] + "\n");

				} else {
					System.out.print(" " + perc.sites[i][j]);
				}
			}
		}
	}

	// fills the sites at random in nxn matrix sites
	private static void fillSites(Percolation perc) {
		Random a = new Random();
		Random b = new Random();
		Random prob = new Random();
		int c, d, chance;
		for (int i = 0; i <= perc.sites.length - 1; i++) {
			for (int j = 0; j <= perc.sites.length - 1; j++) {

				c = (int) (a.nextDouble() * dim);
				d = (int) (b.nextDouble() * dim);
				chance = (int) (prob.nextDouble() * 10);

				if (chance < 6) {
					perc.open(c, d);
				} else {
				}
			}
		}
	}

	public static void main(String[] args) {

		// creates a new matrix of 25x25
		Percolation perc = new Percolation(25);

		// shows the matrix is all zeros to begin with
		printSim(perc);

		// fills the sites at random
		fillSites(perc);

		System.out.println();

		// prints the matrix with randomly opened sites
		printSim(perc);

	}

}
