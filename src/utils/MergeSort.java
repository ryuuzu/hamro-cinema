/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author utsav
 */
public class MergeSort {

    public static void sort(int[] sortThis) {
        if (sortThis.length <= 1) {
            return;
        }
        // Seperating groups from
        int[] group1 = new int[sortThis.length / 2];
        int[] group2 = new int[sortThis.length - group1.length];

        // Adding to first group
        for (int i = 0; i < group1.length; i++) {
            group1[i] = sortThis[i];
        }
        // Adding to second group
        for (int i = 0; i < group2.length; i++) {
            group2[i] = sortThis[group1.length + i];
        }

        sort(group1);
        sort(group2);
        merge(group1, group2, sortThis);
    }

    public static void merge(int[] group1, int[] group2, int[] sortThis) {
        // Initializing index counters for each array.
        int group1_index = 0; // Index for group1
        int group2_index = 0; // Index for group2
        int sortThis_index = 0; // Index for sortThis

        // Adding values to the sortThis from group1 and group2
        while (group1_index < group1.length && group2_index < group2.length) {
            if (group1[group1_index] < group2[group2_index]) {
                sortThis[sortThis_index] = group1[group1_index];
                group1_index++;
            } else {
                sortThis[sortThis_index] = group2[group2_index];
                group2_index++;
            }
            sortThis_index++;
        }

        // Adding the remaining values from either group1 or group2 array.
        while (group1_index < group1.length) {
            sortThis[sortThis_index] = group1[group1_index];
            group1_index++;
            sortThis_index++;
        }
        while (group2_index < group2.length) {
            sortThis[sortThis_index] = group2[group2_index];
            group2_index++;
            sortThis_index++;
        }
    }

}
