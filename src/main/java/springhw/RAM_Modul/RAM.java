package springhw.RAM_Modul;



import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhw.Singleton.Characteristics;
import springhw.Singleton.Logger;
import springhw.Singleton.NameComponents;

import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class RAM {
    private int countRam;
    private ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("test.xml");
    private RAM_One ramOne = ctx.getBean("RAM_One", RAM_One.class);
    private RAM_Two ramTwo = ctx.getBean("RAM_Two", RAM_Two.class);
    private RAM_Tree ramTree = ctx.getBean("RAM_Tree", RAM_Tree.class);
    private RAM_Four ramFour = ctx.getBean("RAM_Four", RAM_Four.class);



    public void CountSlotRamManual() throws FileNotFoundException {
        //Logger logger = ctx.getBean("Logger", Logger.class);
        String method = "CountSlotRamManual()";
        //logger.Start(method);
        Characteristics characteristics = Characteristics.getInstance();
        countRam = characteristics.getCountSlot();
        NameComponents nameComponents = NameComponents.getInstance();

        Scanner RAM = new Scanner(System.in);

        System.out.print("Чаще всего в материнскую плату вставляется, \n" +
                "2 плашки оперативной памяти, либо же 4. Все зависит от того, сколько \n" +
                "слотов у материнской платы. \n" +
                "У вашей материнской платы " + countRam + " слотов \n" +
                "Вы хотите воспользоваться данной стратегией ?! \n" +
                "0 - Нет, хочу сам все сделать. \n" +
                "1 - Да. \n");
        String line = RAM.nextLine();
        int query1 = Integer.parseInt(line);
        if (query1 == 0) {
            System.out.println("Вам доступно " + countRam + " слота для оперативной памяти");

            Scanner query = new Scanner(System.in);
            System.out.print("Сколько хотите плашек добавить: ");
            String line2 = query.nextLine();

            int count2 = Integer.parseInt(line2);

            for (int i = 0; i < count2; i++) {
                if (i == 0) {
                    System.out.print(i + ": ");
                    ramOne.createRamOneManual();
                    System.out.println("");
                } else if (i == 1) {
                    System.out.print(i + ": ");
                    ramTwo.createRamTwoManual();
                    System.out.println("");
                } else if (i == 2) {
                    System.out.print(i + ": ");
                    ramTree.createRamTreeManual();
                    System.out.println("");
                } else if (i == 3) {
                    System.out.print(i + ": ");
                    ramFour.createRamFourManual();
                    System.out.println("");
                }
            }
            if(count2 == 1){
                String[] temp = {ramOne.getName()};
                nameComponents.setNameRAM(temp);
            } else if(count2 == 2){
                String[] temp = {ramOne.getName(), ramTwo.getName()};
                nameComponents.setNameRAM(temp);
            } else if(count2 == 3){
                String[] temp = {ramOne.getName(), ramTwo.getName(), ramTree.getName()};
                nameComponents.setNameRAM(temp);
            } else{
                String[] temp = {ramOne.getName(), ramTwo.getName(), ramTree.getName(), ramFour.getName()};
                nameComponents.setNameRAM(temp);
            }
        } else if (query1 == 1) {
            Scanner query2 = new Scanner(System.in);
            String line3;
            if (countRam == 4) {
                System.out.print("Сколько хотите плашек добавить, 2 или 4: ");
                line3 = query2.nextLine();
            } else {
                System.out.print("В вашу материнскую плату вмещается только 2 \n");
                line3 = "2";
            }

            int count3 = Integer.parseInt(line3);
            if (count3 == 2) {
                ramOne.createRamOneManual();

                ramTwo.setName(ramOne.getName());
                ramTwo.setCountMemory(ramOne.getCountMemory());
                ramTwo.setDDR(ramOne.getDDR());

                String[] temp = {ramOne.getName(), ramTwo.getName()};
                nameComponents.setNameRAM(temp);
            } else if (count3 == 4) {
                ramOne.createRamOneManual();
                ramTwo.setName(ramOne.getName());
                ramTwo.setCountMemory(ramOne.getCountMemory());
                ramTwo.setDDR(ramOne.getDDR());

                ramTree.setName(ramOne.getName());
                ramTree.setCountMemory(ramOne.getCountMemory());
                ramTree.setDDR(ramOne.getDDR());

                ramFour.setName(ramOne.getName());
                ramFour.setCountMemory(ramOne.getCountMemory());
                ramFour.setDDR(ramOne.getDDR());

                String[] temp = {ramOne.getName(), ramTwo.getName(), ramTree.getName(), ramFour.getName()};
                nameComponents.setNameRAM(temp);
            }
        }
        System.out.println("Создана ОЗУ");
        //logger.End(method);
    }

    public void CountSlotRamRandom() throws FileNotFoundException {
        //Logger logger = ctx.getBean("Logger", Logger.class);
        String method = "CountSlotRamRandom()";
        //logger.Start(method);
        Characteristics characteristics = Characteristics.getInstance();
        countRam = characteristics.getCountSlot();
        NameComponents nameComponents = NameComponents.getInstance();
        int randNumb;
        if (countRam == 4) {
            Random rand = new Random();
            randNumb = rand.nextInt(2) * 2 + 2;
        } else {
            randNumb = 2;
        }


        if (randNumb == 2) {
            ramOne.createRamOneRandom();

            ramTwo.setName(ramOne.getName());
            ramTwo.setCountMemory(ramOne.getCountMemory());
            ramTwo.setDDR(ramOne.getDDR());

            String[] temp = {ramOne.getName(), ramTwo.getName()};

            nameComponents.setNameRAM(temp);
        } else if (randNumb == 4) {
            ramOne.createRamOneRandom();
            ramTwo.setName(ramOne.getName());
            ramTwo.setCountMemory(ramOne.getCountMemory());
            ramTwo.setDDR(ramOne.getDDR());

            ramTree.setName(ramOne.getName());
            ramTree.setCountMemory(ramOne.getCountMemory());
            ramTree.setDDR(ramOne.getDDR());

            ramFour.setName(ramOne.getName());
            ramFour.setCountMemory(ramOne.getCountMemory());
            ramFour.setDDR(ramOne.getDDR());

            String[] temp = {ramOne.getName(), ramTwo.getName(), ramTree.getName(), ramFour.getName()};
            nameComponents.setNameRAM(temp);
        }

        System.out.println("Создана ОЗУ");
        //logger.End(method);
    }


}