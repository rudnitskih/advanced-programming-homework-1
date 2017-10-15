This is first homework for Advanced Programming course in UCU (2017 year).
Lector @Jeka1978

The assignment contains of three tasks which described 
in separate package. There is additional package Utils which 
contains helper functions.

## Task 1
The best way how to replace **switch** statement in **JAVA** 
is using some collection, e.g. **Map**.

The question is how to build this collection of emails.
In my implementation, I just describe email classes in EmailsRegistry
interface, but in production environment I can suppose two options:
* some external config where will describe this classes
* using custom annotation to mark classes as *Email* for 
*EmailSender*

## Task 2
This is simple task which does not require advanced 
architecture. All implementation described in *GuessGame* class.

## Task 3
I didn't understand correctly how *Elf* should kick 
*King* or *Knight* because they have random power on every turn,
but *Elf* kick enemy depend on his power, so *King* and *Knight* 
has initial random power and damage enemy with another random value.

In this task I tried use composition to minimize duplication of code. 
Maybe there are some not optimal architecture decisions, 
please tell me about them.

Also good way how to improve this implementation 
is creating custom annotation to initialize random fields *hp* and *power*. 
