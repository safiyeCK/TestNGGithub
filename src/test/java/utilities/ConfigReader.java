package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    /*
   .properties uzantili dosyadaki datalari test classimizda okuya bilmemiz icin return type
   string olan bir parametreli static method olustururuz ve bu method icinde properties class'indan bir obje
   olustururuz. Sonra FileInputStream ile bu dosyayi akisa alir Properties classindan olusturdurmus oldugumuz
   objeye load() ile yukleriz.  Son olarak olusturmus oldugumuz obje ile getProperty() methodunu kullanarak
   method icine parametre olarak girilen key'in degerini(value) bize return eder.
 */
    public static String getProperty(String key)  {
        Properties properties=new Properties();
      try {

          FileInputStream fis = new FileInputStream("configuration.properties");
          //fis dosya yolunu tanimladigimiz configuration.properties dosyasini okur.
          properties.load(fis);
          //fis in okudugu bilgileri properties e yukler
      }catch (IOException e){
          throw  new RuntimeException(e);
      }
      return properties.getProperty(key);
      /*test methodundan yolladigimiz string key degerini alip
       Properties Class indan getProperties() methodunu kullanarak
       bu key e ait value u bize getirir*/
    }
}
