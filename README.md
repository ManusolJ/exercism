# Exercism

My solutions to [Exercism](https://exercism.org) exercises. I use it to practice with languages I know
and to get familiar with languages I don't write much.

Profile: [@ManusolJ](https://exercism.org/profiles/ManusolJ)

If you're working through the same tracks, solve the exercise before reading
what's here.

## What's in it

Java and Python so far. In the future, I'm planning to start the PHP, JavaScript, TypeScript, SQLITE and C++ tracks too.

**Java**

| Exercise                                           | What it covers                              |
| -------------------------------------------------- | ------------------------------------------- |
| [squeaky-clean](java/squeaky-clean/)               | `char` handling, `StringBuilder`            |
| [need-for-speed](java/need-for-speed/)             | Constructors and static factory methods     |
| [jedliks-toy-car](java/jedliks-toy-car/)           | Classes and fields                          |
| [calculator-conundrum](java/calculator-conundrum/) | Exceptions, writing a custom exception type |

**Python**

| Exercise                                                     | What it covers                   |
| ------------------------------------------------------------ | -------------------------------- |
| [hello-world](python/hello-world/)                           | Setting up the track             |
| [guidos-gorgeous-lasagna](python/guidos-gorgeous-lasagna/)   | Functions, constants, docstrings |
| [ghost-gobble-arcade-game](python/ghost-gobble-arcade-game/) | Booleans                         |

Exercises I haven't finished yet aren't committed.

## Layout

The Exercism CLI makes one folder per exercise, so I've kept the structure:

```
<track>/<exercise>/
├── .exercism/     CLI metadata
├── README.md      the exercise brief
├── HINTS.md       hints, on tracks that have them
└── solution and test files
```

Build output and virtual environments aren't tracked. See [`.gitignore`](.gitignore).

## Running the tests

Java uses the Gradle wrapper, so you don't need Gradle installed:

```bash
cd java/squeaky-clean && ./gradlew test
```

Python uses pytest:

```bash
cd python/ghost-gobble-arcade-game && python -m pytest
```

## License

The briefs, hints and test files come from Exercism and are MIT licensed. The
solutions are mine.
