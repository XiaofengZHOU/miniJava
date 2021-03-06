# The minijavac compiler

A compilation project for Thrid year students of IMT Atlantique (the former Telecom Bretagne)

The specification of the project can be found [here](https://svn.telecom-bretagne.eu/repository/ens-eleves/3a/f2b/304/minijava.pdf) (Authorization Required)

## How to clone the project

Using `git clone`

```sh
git clone https://redmine-df.telecom-bretagne.eu/git/f2b304_compiler_cn
```

then input your Username and Password in the command prompt

## The project structure

The project is divided by 2 parts

- phase1: the first delivery which contains the lexical and syntax analyzer for the language minijava
- phase2: the second delivery which contains the semantic analyzer for the language minijava based on the lexical and syntax analyzer that offered by professors

to build or execute the compiler, you should entre one of these folder, `cd ./phase1` or `cd ./phase2`

## How to build the compiler

Using the shell script `build`

```sh
./build
```

or using `ocamlbuild` to build the compiler

```sh
ocamlbuild Main.byte
```

*Notes*
> The main file is `Main/Main.ml`, it should not be modified. It opens the given file,creates a lexing buffer, initializes the location and call the compile function of the module `Main/compile.ml`. It is this function that you should modify to call your parser.


## How to execute the compiler


Using the shell script `minijavac`

```sh
./minijavac <filename>
```

or using the following command to build and then execute the compiler on the given file named `<filename>`

```sh
ocamlbuild Main.byte -- <filename>
```

> By default, the program searches for file with the extension `.java` and append it to the given filename if
it does not end with it.

## How to test the Compiler

Using the shell script `test`

```sh
./test
```

it will execute `Main.byte` on all files in the directory `Evaluator`

## How to contribute to the Project

If you are a team member of the project, please follow the [Working Standard](./WorkingStandard.md) to make appropriate contributions

## To do list

### First part: Lexical and syntactic analyzers

*Deadline 15/01/2018*

#### Expression

- [x] Line Terminators
- [ ] Input Elements and Tokens
- [x] White Space
- [x] Comments
- [x] Identifiers
- [x] Keywords
    - [ ] for
    - [ ] while
    - [x] else
    - [x] if
- [x] Literals
    - [x] Int
    - [x] String
- [x] Separators
    - [x] brace
    - [x] parenthese
    - [x] dot
    - [x] comma
    - [x] semicolon
- [x] Operators
    - [x] `=` Simple Assignment Operator
    - [x] `+ - * / %` Arithmetic Operators
    - [x] `+ - ++ -- !` Unary Operators
    - [x] `== != > < <= >=` Equality and Relational Operators
    - [x] `&& ||` Conditional Operators

#### Classes

- [x] Keywords
    - [x] class
    - [x] static
    - [x] extends
    - [x] return
    - [ ] new
- [x] Classes
    - [x] Class Declaration
        - [x] simple class declaration
        - [x] simple class declaration with extends
    - [x] Field Declarations
        - [x] static Fields
        - [x] non-static Fields
    - [x] Method Declarations
        - [x] static Methods
        - [x] non-static Methods
---

### Second part: The typer and the execution support

*Deadline 25/02/2018*

#### Type

- [] The construction of the class definition environment. This environment contains the type of methods for each class. This phase ignores the attributes (which are not visible outside the class) and the method bodies.
- [] The second phase is concerned with verifying that the inside of classes is correct (mainly the body of methods). She will also make sure of the correction of the higher level expression.

#### Execution

Evaluation and execute by certain means

##### 1. Complilation

Construction of descriptors and tables

Construction of descriptors
- [] object descriptor ? object descriptor space
- [] class descriptor ? class descriptor space
- [] methode descriptor ? methode descriptor space

Allocations

working from specail cases:
- object -> null, true, false
- class -> Object, Int, Boolean, String

- [] allocation of special classes
- [] allocation of special objects
- [] allocation of class if it is not allocated

##### 2. Execution


## Problems

### Problems of Type

### Problems of Execution