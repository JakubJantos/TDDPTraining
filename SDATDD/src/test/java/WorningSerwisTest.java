import org.junit.Test;

import static org.mockito.Mockito.*;

public class WorningSerwisTest {

    @Test
    public void test(){
        WindService windService = mock(WindService.class);
        EmailService emailService = mock(EmailService.class);
        WarningService ws = new WarningService(windService,emailService);
        when(windService.getMessage()).thenReturn(WeatherMesage.TORNADO);

        ws.checkForWarnings();
        verify(emailService, times(1))
                .sendMessage("Warning!!!");
    }
}
