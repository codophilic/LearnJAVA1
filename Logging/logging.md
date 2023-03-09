# Logging

- In Java, Logging is an API that provides the ability to trace out the errors of the applications. When an application generates the logging call, the Logger records the event in the LogRecord. After that, it sends to the corresponding handlers or appenders. Before sending it to the console or file, the appenders format that log record by using the formatter or layouts.

- In a code we use `System.out.println()` to get the output on the console which is like a logging.

- There are multiple disadvanstages by using such print methods.

1. It won't send the log message/information in a file or DB, it just print on the console.

2. It is a synchronized method, which takes time.

3. Too many such methods causes to reduce application performance

4. When we use print methods in a code , it will get display at server console where the application is running and not at client side.

## Logging Components

- In Java logging, handlers, formatters, and filters are used to control how log messages are processed and output. Here's an overview of each:

1. **Handlers:** Handlers are responsible for processing log messages and sending them to their destination. They can be used to output log messages to a file, a database, or the console. You can create your own custom handlers by extending the java.util.logging.Handler class.

- Different types of Handlers:

1. ConsoleHandler: This handler outputs log messages to the console. It's useful for debugging and development purposes.

2. FileHandler: This handler outputs log messages to a file. It can be configured to rotate log files based on size or time, and to limit the number of files that are kept.

3. SocketHandler: This handler sends log messages to a remote server over a network socket. It can be used to centralize logging from multiple machines or applications.

4. SMTPHandler: This handler sends log messages as email messages. It can be used to alert developers or system administrators of errors or warnings.

2. **Formatters:** Formatters are used to control the format of log messages. They can be used to change the layout of log messages, add metadata to log messages, or remove sensitive information from log messages. You can create your own custom formatters by implementing the java.util.logging.Formatter interface.

- Different types of formatters:

1. SimpleFormatter: This formatter outputs log messages in a simple text format that includes the logger name, log level, and message.

2. XMLFormatter: This formatter outputs log messages in XML format, which can be parsed and analyzed by other tools.

3. JSONFormatter: This formatter outputs log messages in JSON format, which is widely used in modern web applications and can be easily processed by other tools.

3. **Filters:** Filters are used to control which log messages are processed and output. They can be used to exclude log messages with a certain severity level or exclude log messages from a certain logger. You can create your own custom filters by implementing the java.util.logging.Filter interface.

## Logging Framework

- Loggin Framework overcomes these problem by providing its own frameworks. Some of the commonly used are:

1. Logging API - java.util.logging (core java provides this)

2. Log4j 

3. LogBack

4. Commons Logging

- Drawback is it increases the lines of codes.

## Logging API / JUL (Java Util Logging)

- The log levels control the logging details. They determine the extent to which depth the log files are generated. Each level is associated with a numeric value and there are 7 basic log levels and 2 special ones.

```
Level	Value	Used for
SEVERE	1000	Indicates some serious failure
WARNING	900	    Potential Problem
INFO	800	    General Info
CONFIG	700	    Configuration Info
FINE	500	    General developer info
FINER	400	    Detailed developer info
FINEST	300	    Specialized Developer Info
```

1. Severe occurs when something terrible has occurred and the application cannot continue further. Ex like database unavailable, out of memory.

2. Warning may occur whenever the user has given wrong input or credentials.

3. Info is for the use of administrators or advanced users. It denotes mostly the actions that have lead to a change in state for the application.

4. Configuration Information may be like what CPU the application is running on, how much is the disk and memory space.

- Fine Finer and Finest provide tracing information. When what is happening/ has happened in our application.

5. FINE displays the most important messages out of these.

6. FINER outputs a detailed tracing message and may include logging calls regarding method entering, exiting, throwing exceptions.

7. FINEST provides highly detailed tracing message.

- Furthermore, there are two special Logging levels

```
OFF	Integer.MAX_VALUE	Capturing nothing
ALL	Integer.MIN_VALUE	Capturing Everything
```

- Capturing everything may mean every field declaration, definition, every method call, every assignment performed etc.
















