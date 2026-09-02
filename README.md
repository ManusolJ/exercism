# Exercism

My solutions to [Exercism](https://exercism.org) exercises. I use it to practice with languages I know
and to get familiar with languages I don't write much.

Profile: [@ManusolJ](https://exercism.org/profiles/ManusolJ)

If you're working through the same tracks, solve the exercise before reading
what's here.

## What's in it

Java and Python so far. In the future, I'm planning to start the PHP, JavaScript, TypeScript, SQLITE and C++ tracks too.

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
cd java/<exercise> && ./gradlew test
```

Python uses pytest:

```bash
cd python/<exercise> && python -m pytest
```

## License

The briefs, hints and test files come from Exercism and are MIT licensed. The
solutions are mine.
