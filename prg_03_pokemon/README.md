# Instructions

In this project assignment you will create a [Pokemon](https://en.wikipedia.org/wiki/Pok%C3%A9mon) collection using a BST data structure. The collection can be based on a given "type1" parameter (e.g., "Water", "Fire", "Psychic", etc.). The collection is going to be based on a relatively large dataset of Pokemon that I found online [here](https://gist.github.com/armgilles/194bcff35001e7eb53a2a8b441e8b2c6). 

# Pokemon Class

The Pokemon class definition matches the features found in the CSV file. A Pokemon can be instantiated using all of the features or simply by providing its name. There is only one TO-DO for you to finish in this class: the **compareTo** override. The comparison should be done by name (ascending order).

# BST Class

The BST class that was given for this project is very similar to the one discussed in class. The first difference that you will notice is that the **root** of the BST is redefined using **protected**. This was done to expose **root** to the specialized class PokemonCollection (see next section). 

You are asked to implement two methods: **size** (returns the number of elements in the BST) and **height** (returns the height of the BST). These two methods should be implemented using the recursive helper methods **sizeRecursively** and **heightRecursively**, respectively. 

Note that if the left side of the tree (with respect to some node) has height "L" and the right side has height "R", then the height (with respect to some node) is 1 (counting the node) plus "L" or "R" (depending on which one is larger). 

# PokemonCollection Class

A PokemonCollection is defined using an optional "type1". That parameter is used to check pokemon additions to the collection. In other words, if the collection is defined with type1=Water and I tried to add a Fire-type pokemon, the collection remains unchanged. 

The first method that you are asked to implement in PokemonCollection is **add** which adds the given pokemon card to the collection. If the type1 parameter is defined in the collection, check if the given pokemon card has the same type1 value. 

Searching for pokemons in the collection is slightly different from how search is done in BST. Remember that **search** in BST returned true/false.  In PokemonCollection **search** actually returns the Pokemon reference (null if not found). 

The last TO-DO in PokemonCollection is the **toString** override. At a minimum this method should display the following: 

For Pokemon collections without **type1**: 

```
Welcome to my Pokemon Cards Collection.
There are 800 pokemon cards.
The pokemon cards are stored in a BST for optimized search.
The current height of the BST is 23.
```

For Pokemon collection of a specific **type1**:

```
Welcome to my Pokemon Cards Collection.
This collection has pokemon cards of type1='Water' only.
There are 112 pokemon cards.
The pokemon cards are stored in a BST for optimized search.
The current height of the BST is 15.
```

# PokemonDriver Class

The driver class has the static **load** method which opens the (given) CSV filename and use it to create a return a PokemonCollection of the given **type1** (which can be blank). Finish your project by completing the **main** method which creates a PokemonCollection using "load" and then allows users to search (continuously) for pokemon cards in the collection. Example of a typical user interaction: 

``` 
Welcome to my Pokemon Cards Collection.
This collection has pokemon cards of type1='Water' only.
There are 112 pokemon cards.
The pokemon cards are stored in a BST for optimized search.
The current height of the BST is 15.
Enter the name of pokemon to search (blank to quit): Picachu
Pokemon with name='Picachu' was not found!
Enter the name of pokemon to search (blank to quit): Remoraid
Pokemon{name='Remoraid', type1='Water', type2='', total=300, hp=35, attack=65, defense=35, spAttack=65, spDefense=35, speed=65, generation=2, legendary=false}
Enter the name of pokemon to search (blank to quit): 
```

# Bonus Points 

Modify your driver to allow users to add and remove pokemon cards from the collection. 

# Submission

Zip the following source files only (use src.zip naming): 

* Pokemon
* BST
* PokemonCollection
* PokemonDriver

Upload your src.zip file to Canvas. 

# Rubric

+10 Pokemon
    TODO #1
+20 BST
    +5 TODO #2: return the number of elements in the BST from the given current node
    +5 TODO #3: return the number of elements in the BST
    +5 TODO #4: return the height of the BST from the current node
    +5 TODO #5: return the height of the BST
+35 PokemonCollection
    +10 TODO #6: add the given pokemon card to the collection; if type1 is defined, check if the given pokemon card has the same type1
    +10 TODO #7: similar to BST's searchRecursively, returning a Pokemon reference (instead of true/false); return null if the pokemon card is not found
    +5 TODO #8: similar to BST's search; however, this method takes the name of a Pokemon and it should return avPokemon reference (instead of true/false); return null if the pokemon card is not
    +10 TODO #9: return a string representation of a pokemon collection according to specifications in README file
+35 PokemonDriver
    +20 TODO #10: open the CSV filename and use it to create a return a PokemonCollection of the given type1
    +15 TODO #11: create a PokemonCollection using "load" and then allow users to search for pokemon cards in the collection

Bonus Points
+10 PokemonDriver
    +5 add functionality
    +5 remove functionality





