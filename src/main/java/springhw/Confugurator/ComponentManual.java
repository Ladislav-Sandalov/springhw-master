package springhw.Confugurator;



import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhw.Components_computer.BlockPower;
import springhw.Components_computer.MatherBoard;
import springhw.Components_computer.Processor;
import springhw.Components_computer.VideoCard;
import springhw.Disk_Modul.HardDisk;
import springhw.RAM_Modul.RAM;

import java.io.FileNotFoundException;

public class ComponentManual implements IComponent {

    private ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("test.xml");
    public void createBlockPower() throws FileNotFoundException {
        BlockPower blockPower = ctx.getBean("BlockPower", BlockPower.class);
        blockPower.newCreateBlockPowerManual();
    }
    public void createHardDisk() throws FileNotFoundException {
        HardDisk hrDisk = ctx.getBean("HardDisk", HardDisk.class);
        hrDisk.newCreateHardDiskManual();
    }
    public void createMatherBoard() throws FileNotFoundException {
        MatherBoard matherBoard = ctx.getBean("MatherBoard", MatherBoard.class);
        matherBoard.newCreateMatherBoardManual();
    }
    public void createProcessor() throws FileNotFoundException {
        Processor processor = ctx.getBean("Processor", Processor.class);
        processor.newCreateProcessorManual();
    }
    public void createRAM() throws FileNotFoundException {
        RAM ram = ctx.getBean("RAM", RAM.class);
        ram.CountSlotRamManual();
    }
    public void createVideoCard() throws FileNotFoundException {
        VideoCard videoCard = ctx.getBean("VideoCard", VideoCard.class);
        videoCard.newCreateVideoCardManual();
    }
}