/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author utsav
 */
public class BinarySearch {

    public static int search(int[] searchThis, int lIndex, int rIndex, int toSearch) {
        if (lIndex > rIndex) {
            return -1;
        }
        int mid = (lIndex + rIndex) / 2;
        if (toSearch == searchThis[mid]) {
            return mid;
        } else if (toSearch < searchThis[mid]) {
            return search(searchThis, lIndex, mid - 1, toSearch);
        } else {
            return search(searchThis, mid + 1, rIndex, toSearch);
        }
    }

    public static int search(String[] searchThis, int lIndex, int rIndex, String toSearch) {
        if (lIndex > rIndex) {
            return -1;
        }
        int mid = (lIndex + rIndex) / 2;
        if (toSearch == searchThis[mid]) {
            return mid;
        } else if (toSearch.compareTo(searchThis[mid]) < 0) {
            return search(searchThis, lIndex, mid - 1, toSearch);
        } else {
            return search(searchThis, mid + 1, rIndex, toSearch);
        }
    }

    public static void main(String[] args) {
        int[] a = {11, 22, 33, 44, 55, 66};
        for (int x : a) {
            search(a, 0, a.length - 1, x);
            search(a, 0, a.length - 1, x + 1);
        }
        String[] b = {"a", "b", "c", "d", "e", "f", "g"};
        search(b, 0, b.length - 1, "f");
    }
}
