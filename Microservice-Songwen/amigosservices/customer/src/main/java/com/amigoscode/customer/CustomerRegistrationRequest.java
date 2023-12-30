package com.amigoscode.customer;


/*
record是一种特殊类型的类，它主要用于创建不可变的数据载体。
每一个record都会自动地为其所有字段生成equals()、hashCode()和toString()方法，
以及所有字段的公共读取方法（也就是getter）
 */

/*
在一个典型的应用程序中，CustomerRegistrationRequest可能用于携带用户提交的注册信息，
如姓名和电子邮件。这些信息会被用来创建一个新的Customer对象，该对象然后被保存到数据库中，
并分配一个唯一的id。Customer对象可以用来表示数据库中的完整记录，包括它的唯一标识符和任何其他与客户相关的信息。
因此，Customer类更适合作为业务逻辑的一部分，而CustomerRegistrationRequest更适合作为数据传输和处理请求的一部分。
 */

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
