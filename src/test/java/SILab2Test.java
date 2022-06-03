import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;
public class SILab2Test {
    @Test
    void StatementTest(){
        IllegalArgumentException ilargexc;

        ilargexc = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of()));
        assertTrue(ilargexc.getMessage().contains("List length should be greater than 0"));

        ilargexc = assertThrows(IllegalArgumentException.class, () -> SILab2.function(asList("#","#","0")));
        assertTrue(ilargexc.getMessage().contains("List length should be a perfect square"));

        assertEquals(Arrays.asList("#", "2", "#", "#", "3", "#", "#", "#", "#"), SILab2.function(Arrays.asList("#", "0", "#", "#", "0", "#", "#", "#", "#")));
    }

    @Test
    void BranchTest(){
        IllegalArgumentException ilargexc;

        ilargexc = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of()));
        assertTrue(ilargexc.getMessage().contains("List length should be greater than 0"));

        ilargexc = assertThrows(IllegalArgumentException.class, () -> SILab2.function(asList("#","#","0")));
        assertTrue(ilargexc.getMessage().contains("List length should be a perfect square"));

        assertEquals(Arrays.asList("#", "2", "#", "#", "3", "#", "#", "#", "#"), SILab2.function(Arrays.asList("#", "0", "#", "#", "0", "#", "#", "#", "#")));
    }

}