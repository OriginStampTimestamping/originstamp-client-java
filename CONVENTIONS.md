# Coding Conventions

Please also [check our wiki](https://team.originstamp.com/confluence/dosearchsite.action?queryString=coding+conventions).

For this project rough guidelines apply in dealing with the source code. Since we are aware that in the Java world, many different guidelines exists, we limit ourselves to a few key points.

We also provide a Checkstyle configuration which reflect some rules we state here.

## Setup Plugins in IntelliJ 
- Go to `File`>`Settings`>`Plugins` and install "Checkstyle-IDEA" and "Lombok" and activate them.
- Go to `File`>`Settings`>`Other Settings`>`Checkstyle` and import and activate the checkstyle file from `./config/checkstyle.xml`.

For further information check the Wiki pages for [Checkstyle](https://team.originstamp.com/confluence/display/SD/Checkstyle) and [Lombok](https://team.originstamp.com/confluence/display/SD/Lombok).

## Naming
- Naming for classes, methods and fields: use common Java Standard.
- Classnames in CamelCase, starting with upper case: IndexingController.
- Attributes in CamelCase, starting with lower case: sourceDocument.
- Additional conventions:
    - Class names: Interfaces end with I and abstract classes end with A (e. g. IndexingProcessI or HeuristicAlgorithmA).
    - Use 'mail' instead of 'email'; pay attention to own terms like
        - API, SHA-1, SHA-256, UUID, URL, Mail, PDF, JSON, ID, REST
  - Parameter naming always without 'pParam'
      - RegEx for parameter renaming: 
          - find:  "\?p([A-Z]{1})([a-z]+{2})"
          - replace: "\?\l$1$2"
          - replace "\?" e.g. with blank, "\(", "\!" etc.

## Code Complexity
- Methods Line Count: max. 50
- Methods Complexity: not deeper than 6
- Use Blank Lines for formatting - good code should be readable.

## General
- Initiate lists with a size constructor, if possible.
- Use Java 7 (and higher) notation for data types, e.g. ... = new List<> instead of ... = new List<String>.
- Use AutoCloseable whenever possible, e.g. try (BufferedReader reader = new Buf...) {.
- Use comfort functions for better readability, e.g. foreach-loop for (String arg : argv) {.
- Use streams introduced with Java 8
- Log via a Logger instead of System.outs (no-go).

## Error Handling
- If local error handling is not reasonable or possible, then log and throw.
- If an exception is an ExternalApiException and the exception does not add any value because they cover expected error conditions and are usually already represented by normal log messages, set exception logging to `false`.
- Do not use System.out's, instead learn to debug your code. (System.outs in test cases will be tolerated)

## JavaDoc
- Use present tense to document classes and methods, e.g. "Generates the usage report" instead of "Generating the usage report"
- Start class and method documentation with a capital letter, e.g. "Generates" instead of "generates"

## Logging
- Use gerund for logging output, e.g. "Sending mail" instead of "Send mail"
- Start logging output with a capital letter, e.g. "Sending" instead of "sending"

## Enum / Status Class
- If a status or enum is saved in the database, use number format as a db field type.
- It is recommended to create a descriptive table to persist these status also in the database.

## Authorship
- Don't use authorship comments (@author) as they aren't up to date or fine-granular. Authorship is easily visible from GitHub Blame or IntelliJ Annotate.

## Bugs
- For bugs, reference e.g. test cases with `@see` annotation and related issue in the JavaDoc. Additionally, provide a short description of the bug and what you fixed in order to prevent the deletion of fixes or necessary test cases.

    `@see https://team.originstamp.com/jira/browse/OWD-298`

# Library Guidelines

- Do NOT use the JavaFX libraries because JavaFX is not supported by OpenJDK which is used by Amazon AWS.

# Swagger Guidelines

General: we do not use "_" in any "value" or "name" field in any Swagger annotation.

## Controller annotations
For controllers, Swagger provides an equivalent construct called 
`@Api(value = "", description = "", tags = {})`
- The field "value" should be filled with a one-word-description (lowercase) for the controller (like "scheduler").
- The field "description" contains a short description for the interfaces of the controller.
-In the "tags"-array, a value which is defined in CommonConstants.SwaggerConfig.Tags should be inserted (also lowercase). This could be the same as the "value" field.

## Method annotions
Methods are annotated with
`@ApiOperation(value = "", notes = "", nickname = "")`
- Field "value" is a description field for the method. It shall be one word starting with an uppercase letter (like "NextSchedule").
- "notes" contains a short description of the method.
- The field "nickname" represents the actual method name in the Swagger client. We use here the normal naming conventions of Java (like "getNextSchedulingTime").

## Method parameter annotations
Each method parameter is annotated with
`@ApiParam(required = bool, name = "", value = "")`
- Boolean "required" indicates whether the parameter is required for the request or not.
- "name" is the actual naming of the parameter. It always starts with an uppercase letter and is only one word.
- Field "value" contains a very short description of the input parameter.
