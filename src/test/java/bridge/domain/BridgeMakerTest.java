package bridge.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class BridgeMakerTest {
    @Test
    void bridgeSizeTest() {
        // Given
        BridgeRandomNumberGenerator generator = new BridgeRandomNumberGenerator();
        BridgeMaker bridgeMaker = new BridgeMaker(generator);

        // When
        List<String> bridge = bridgeMaker.makeBridge(3);

        // Then
        assertThat(bridge.size()).isEqualTo(3);
    }

    @Test
    void name() {
        // Given
        BridgeRandomNumberGenerator generator = new BridgeRandomNumberGenerator();
        BridgeMaker bridgeMaker = new BridgeMaker(generator);

        // When
        List<String> bridge = bridgeMaker.makeBridge(3);

        // Then
        assertThat(bridge).containsAnyOf("U", "D");
    }
}