public class WarningService {
    private WindService windService;
    private EmailService emailService;

    public WarningService(WindService windService, EmailService emailService) {
        this.windService = windService;
        this.emailService = emailService;
    }

    public void checkForWarnings() {
        if (windService.getMessage() == WeatherMesage.TORNADO){
            emailService.sendMessage("Warning!!!");
        }
    }
}
