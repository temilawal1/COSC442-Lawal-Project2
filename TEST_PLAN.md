test plan

valid beavior - does the method produce the expected result when used normally with valid inputs and appropriate preconditions?
exception/invalid behavior - what should happen when invalid input is supplied or a required precondition is violated? if an exception si specified, does the correct exception occur?
boundary behavior - at what values or conditions does the program's behavior change? Test values immediately below, at, and above an important boundary when appropriate



method/behavior

addItem() -> adds item to a slot
getItem() -> gets item from a slot
removeItem() -> removes item from a slot
insertMoney() -> inserts money into machine balance
getBalance() -> get machine balance
makePurchase() -> purchase item
returnChange() -> returns money from machine


valid cases

addItem() -> add an item to a valid slot (A, B, C, or D)
getItem() -> get item from a valid slot, given the slot has an item
removeItem() -> remove an item from a valid slot, given the slot has an item
insertMoney() -> insert amounts of money over $1
getBalance() -> get balance from machine, including balance of 0
makePurchase() -> purchase item from valid slot, given the slot has an item and balance is greater than the price of the item
returnChange() -> returns money from machine, given machine has a balance


exception/invalid cases

addItem() -> invalid slot code, adding item to a preoccupied slot
getItem() -> invalid slot code
removeItem() -> invalid slot code, removing item from an empty slot
insertMoney() -> negative amount, amount below $1
getBalance() -> N/A (negative amount cannot happen)
makePurchase() -> not enough funds, purchase from an empty slot
returnChange() -> N/A (negative amount cannot happen)

boundary cases

addItem() -> empty to occupied slot (adding item)
getItem() -> 
removeItem() -> occupied to empty slot (removing item)
insertMoney() -> negative amount, exact amount, right below and above exact amount, more than necessary amount
getBalance() -> 
makePurchase() -> balance matches exact price of item, right below and above exact price, more than necessary amount for purchase
returnChange() -> 

oracle/expected result

addItem() -> item is added to slot, invalid code/empty slot throw exceptions
getItem() -> item is retrieved from slot and slot is now empty, invalid code throws exception
removeItem() -> removed item is removed from slot and slot is now empty, invalid code/empty slot throw exceptions
insertMoney() -> accepted amount is added to balance. amounts not accepted throw exceptions
getBalance() -> machines begin with balance of 0
makePurchase() -> returns true when purchase is made, item is removed, price amount is subtracted from machine balance. returns false when not enough funds/empty slot (instead of exception)
returnChange() -> returns machine balance, sets machine balance to 0

related junit tests

addItem() -> testAddItem_ValidCode, testAddItem_InvalidCode, testAddItem_OccupiedSlot
getItem() -> testGetItem_ValidCode, testGetItem_InvalidCode, testGetItem_EmptySlot
removeItem() -> testRemoveItem_ValidCode, testRemoveItem_InvalidCode, testRemoveItem_EmptySlot
insertMoney() -> testInsertMoney (ParameterizedTest with 6 values, boundaries)
getBalance() -> testGetBalance
makePurchase() -> testMakePurchase, testMakePurchase_NotEnoughFunds, testMakePurchase_EmptySlot
returnChange() -> testReturnChange, testReturnChange_NoBalance