service CloudBuffer {

  /**
   * A method definition looks like C code. It has a return type, arguments,
   * and optionally a list of exceptions that it may throw. Note that argument
   * lists and exception lists are specified using the exact same syntax as
   * field lists in struct or exception definitions.
   */

    oneway void push(1:binary obj);

    oneway void pushList(1:list<binary> obj);

    binary popFront();

    binary popBack();

    list<binary> popList(1:i32 maxSize);

    oneway void pushNoWait(1:list<binary> obj);

    oneway void pushListNoWait(1:list<binary> obj);

    i32 getBuffer();

    i32 size();

    bool clear();
}