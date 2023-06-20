fun main(args: Array<String>) {

    val mobilePhone = MobilePhone("8(800)555-35-35")

    println("\n Добавить новый контакт: ")
    mobilePhone.addNewContact(Contact("Максим", "8(910)123-45-67"))
    mobilePhone.printContacts()

    println("\n Обновить контакт: ")
    mobilePhone.updateContact(Contact("Максим", "8(910)123-45-67"), Contact("Максим", "8(800)555-35-35"))
    mobilePhone.printContacts()

    println("\n Удалить контакт: ")
    mobilePhone.removeContact(Contact("Максим", "8(800)555-35-35"))
    mobilePhone.printContacts()

    println("\n Найти контакт: ")
    val position = mobilePhone.findContact(Contact("Максим", "8(800)555-35-35"))
    if (position >= 0) {
        println("Контакт существует")
    }
    else {
        println("Контакт не существует")
    }

    println("\n Добавить новый контакт: ")
    mobilePhone.addNewContact(Contact("Максим", "8(910)123-45-67"))
    mobilePhone.printContacts()

    println("\n Запрашиваемый контакт: ")
    val foundContact = mobilePhone.queryContact("Максим")
    if (foundContact != null) {
        println("${foundContact.name}  ${foundContact.phoneNumber}")
    }
}


