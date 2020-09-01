package interfaceLockable;

// TODO
// Make class TreasureChest implement Lockable interface.
// TreasureChest should have the following variables and a constructor:
//  -treasure, of type String,
//  -key, an integer,
//  -isLocked, a boolean variable (whether the treasure chest is locked or not)
//  -a constructor that that takes the treasure and the key as parameters
//
//Since TreasureChest implements Lockable, it should provide implementations to methods of Lockable:
//
// - lock;  The lock method “locks” the treasure chest with the given key if the key is correct. Returns true if the operation was successful, and false otherwise.
// - unlock ; Unlocks the chest, but only if the key passed in is correct. Returns true if operation was successful and false otherwise.
// - isLocked; Returns true if the chest is locked and false otherwise.
//
//The class should also have:
//- 	a method getTreasure(int key) that returns the treasure but only if the key passed is correct, otherwise returns null.   Hint: getTreasure(key) needs to call unlock(key) first.
public class TreasureChest {
    // FILL IN CODE
}
