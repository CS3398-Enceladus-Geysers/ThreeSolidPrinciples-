// Jazmine Castillo
//
// This class applies to the manager, who will manage the different types of workers.
// Creating a separate file ensures only code associated with the manager is placed in this file.
// This complies with the Open Close Principle because new code can be added easily while still
// minimizing changes to current code.
// This file implements the Single Responsibility Principle because the activities of the manager
// differ from the workers' activities, therefore changes to workers' code will require minimal changes
// to this file.

package threesolid;

class Manager {
	IWorkable worker;

	public void setWorker(IWorkable w) {
		worker = w;
	}

	public void manage() {
		worker.work();
	}
}