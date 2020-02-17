/*
 * File:	RR.java
 * Course: 	Operating Systems
 * Code: 	1DV512
 * Author: 	Suejb Memeti
 * Date: 	November, 2017
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RR{

	// The list of processes to be scheduled
	public ArrayList<Process> processes;

	// the quantum time - which indicates the maximum allowable time a process can run once it is scheduled
	int tq;

	// keeps track of which process should be executed next
	public Queue<Process> schedulingQueue;

	// Class constructor
	public RR(ArrayList<Process> processes, int tq) {
		schedulingQueue = new LinkedList<Process>();
		this.processes = processes;
		this.tq = tq;
	}

	public void run() {
		/*
		 * This is where you put your code
		 * hints:
		 * 1. do not forget to sort the processes by arrival time
		 * 2. think about CPU idle times
		 */

	}

	public void printProcesses() {
		// TODO Print the list of processes in form of a table here
	}

	public void printGanttChart(){
		// TODO Print the demonstration of the scheduling algorithm using Gantt Chart
	}
}
