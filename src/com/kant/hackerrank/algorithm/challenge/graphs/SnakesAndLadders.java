/**
 * 
 */
package com.kant.hackerrank.algorithm.challenge.graphs;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author shaskant
 * 
 */
public class SnakesAndLadders {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testSize = scanner.nextInt();
		int[] moves = new int[101];
		for (int testNbr = 1; testNbr <= testSize; testNbr++) {
			Arrays.fill(moves, -1);

			int nbrOfSnakes = scanner.nextInt();
			readLines(moves, scanner, nbrOfSnakes);
			int nbrOfStairs = scanner.nextInt();
			readLines(moves, scanner, nbrOfStairs);
			System.out.println(getMinDiceThrows(moves, 100));
		}

	}

	private static void readLines(int[] moves, Scanner scanner, int times) {
		for (int reader = 1; reader <= times; reader++) {
			int src = scanner.nextInt();
			int des = scanner.nextInt();
			moves[src] = des;
		}
	}

	static class QueueEntry {
		int v = 1; // Vertex number
		int dist = 0; // Distance of this vertex from source
	}

	private static int getMinDiceThrows(int move[], int N) {
		if (checkForImpossiblity(move, N))
			return -1;
		boolean[] visited = new boolean[N + 1];
		for (int i = 1; i <= N; i++)
			visited[i] = false;

		Queue<QueueEntry> queue = new ArrayDeque<QueueEntry>();

		visited[1] = true;
		QueueEntry s = new QueueEntry();// defaults to 1,0
		queue.add(s);
		// BFS way
		QueueEntry qe = null;
		while (!queue.isEmpty()) {
			qe = queue.element();
			int v = qe.v;

			// If front vertex is the destination vertex,
			// we are done
			if (v == N)
				break;

			// Otherwise dequeue the front vertex and enqueue
			// its adjacent vertices (or cell numbers reachable
			// through a dice throw)
			queue.remove();
			for (int j = v + 1; j <= (v + 6) && j <= N; ++j) {
				if (!visited[j]) {
					QueueEntry a = new QueueEntry();
					a.dist = (qe.dist + 1);
					visited[j] = true;

					// Check if there a snake or ladder at 'j'
					// then tail of snake or top of ladder
					// become the adjacent of 'i'
					if (move[j] != -1)
						a.v = move[j];
					else
						a.v = j;
					queue.add(a);
				}
			}
		}

		// We reach here when 'qe' has last vertex
		// return the distance of vertex in 'qe'
		return qe.dist;
	}

	private static boolean checkForImpossiblity(int[] move, int N) {
		boolean result = true;
		for (int checker = N - 6; checker <= N - 1; checker++) {
			result = result && (move[checker] != -1);
		}

		if (result == true) {
			for (int checker = 1; checker < N; checker++) {
				if (move[checker] == 100)
					return false;
			}
		}
		return result;
	}
}
