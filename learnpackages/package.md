# Package

- Package names and directory structure are closely related. For example if a package name is college.staff.cse, then there are three directories, college, staff and cse such that cse is present in staff and staff is present college. 

- Package in java can be categorized in two form, built-in package and user-defined package.

- There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.

- Preventing naming conflicts. For example there can be two classes with name Employee in two packages, college.staff.cse.Employee and college.staff.ee.Employee

- Making searching/locating and usage of classes, interfaces, enumerations and annotations easier.

- Providing controlled access: protected and default have package level access control. A protected member is accessible by classes in the same package and its subclasses. A default member (without any access specifier) is accessible by classes in the same package only.

- Packages can be considered as data encapsulation (or data-hiding).

## User defined Packages

- Create a directory and place the java file in that directory.

- DIR/myjava.java , the main method which will access the myjava class must be in DIR/ directory.

- On the top of the code provide the package name as directory/nested directory name e.g for myjava.java , package.DIR;

- In the main method, import the package with class name. E.g import package.DIR.myjava;