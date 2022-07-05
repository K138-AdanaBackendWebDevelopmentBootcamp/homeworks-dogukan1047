package com.proje.reporsitory;
import java.util.List;
public interface CrudReporsitory<Type> {
//// CRUD --> Create, Read, Update, Delete

     List<Type> findAll();//bulmak için
     Type findById(int id);
     void saveToDatabase(Type object);
     void deleteFromDatabase(Type object);
     void deleteFromDatabase(int id);
     void updateOnDatabase(Type object, int id);


}
