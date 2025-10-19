package lovethefeel.splearn.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MemberTest {

    @Test
    void createMember() {
        var member = new Member("lovethefeel@splearn.app", "lovethefeel", "secret");

        assertThat(member.getStatus()).isEqualTo(MemberStatus.PENDING);
    }
}