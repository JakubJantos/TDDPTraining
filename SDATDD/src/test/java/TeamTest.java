import static org.assertj.core.api.Assertions.assertThat;

public class TeamTest {
    public void sholdTestThatAddedNameIsPresent() {
        Team team = new Team();
//        team.addTeamMember("jim");
//        team.addTeamMember("john");
//        team.addTeamMember("Bill");

        assertThat(team.getTeamMembers()).contains("jim").contains("john").contains("Bill");

    }
}
