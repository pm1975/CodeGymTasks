package com.codegym.task.lessons;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

public class PhantomReference<I extends Number> {
    public PhantomReference(I x, ReferenceQueue<I> queue) {
    }

    public static void main(String[] args) {
        // Special queue for phantom objects
        ReferenceQueue<Integer> queue = new ReferenceQueue<Integer>();

// List of phantom references
        ArrayList<PhantomReference<Integer>> list = new ArrayList<PhantomReference<Integer>>();

// Create 10 objects and add them to the list using phantom references
        for ( int i = 0; i < 10; i++)
        {
            Integer x = new Integer(i);
            list.add(new PhantomReference<Integer>(x, queue));
        }

// Call the garbage collector and hope it will listen to us :)
// It should destroy all phantom reachable objects and put them in the queue
// of phantoms
        System.gc();

// Get all objects from the queue
        Reference<? extends Integer> referenceFromQueue;
        while ((referenceFromQueue = queue.poll()) != null)
        {
            // Display the object on the screen
            System.out.println(referenceFromQueue.get());

            // Clear the reference
            referenceFromQueue.clear();
        }
    }
}
