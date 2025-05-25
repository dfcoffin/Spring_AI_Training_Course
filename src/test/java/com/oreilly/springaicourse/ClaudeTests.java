package com.oreilly.springaicourse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.ai.anthropic.AnthropicChatModel;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.Resource;
import org.springframework.util.MimeTypeUtils;
import reactor.core.publisher.Flux;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import static org.junit.jupiter.api.Assertions.assertNotNull;

// Same lab exercises as OpenAiTests, but using Anthropic Claude model
// NOTE: Requires ANTHROPIC_API_KEY environment variable
@SpringBootTest
public class ClaudeTests {

    @Value("classpath:movie_prompt.st")
    private Resource promptTemplate;

    @Value("classpath:bowl_of_fruit.png")
    private Resource imageResource;

    @Autowired
    private AnthropicChatModel model;

    @Autowired
    private ChatMemory memory;

    private ChatClient chatClient;

    @BeforeEach
    void setUp() {
        // TODO: Initialize ChatClient using ChatClient.create(model)
        // For more advanced features, use ChatClient.builder(model) with advisors
    }

    // === Lab 1: Basic Chat Interactions ===

    @Test
    void simpleQuery() {
        // TODO: Create a simple chat interaction using Claude
        // Same as OpenAI test but with AnthropicChatModel
    }

    @Test
    void simpleQueryRespondLikeAPirate() {
        // TODO: Add system message for pirate responses
    }

    @Test
    void simpleQueryWithChatResponse() {
        // TODO: Get full ChatResponse with metadata
    }

    // === Lab 3: Streaming Responses ===

    @Test
    void streamingChatCountDownLatch() throws InterruptedException {
        // TODO: Implement streaming with CountDownLatch
    }

    @Test
    void streamingChatDoOnNext() {
        // TODO: Implement streaming with reactive operators
    }

    // === Lab 4: Structured Data Extraction ===

    @Test
    void actorFilmsTest() {
        // TODO: Extract ActorFilms record
    }

    @Test
    void listOfActorFilms() {
        // TODO: Extract list of ActorFilms
    }

    // === Lab 5: Prompt Templates ===

    @Test
    void promptTemplate() {
        // TODO: Use inline prompt template
    }

    @Test
    void promptTemplateFromResource() {
        // TODO: Use resource-based prompt template
    }

    // === Lab 6: Chat Memory ===

    @Test
    void requestsAreStateless() {
        // TODO: Demonstrate memory functionality
    }

    // === Lab 7: Vision Capabilities ===

    @Test
    void localVisionTest() {
        // TODO: Analyze local image with Claude
    }

    @Test
    void remoteVisionTest() {
        // TODO: Analyze remote image with Claude
    }

    // === Lab 9: AI Tools ===

    @Test
    void useDateTimeTools() {
        // TODO: Use DateTimeTools with Claude
    }

}