email-assistant/
├── build.gradle               # Gradle build configuration & dependencies
├── gradlew                    # Gradle wrapper for consistent builds
├── src/
│   └── main/
│       ├── java/com/email/assistant/
|       |   ├── app/
|       |   |    ├── EmailGenController.java  # REST API endpoints
│       │   |    ├── EmailGenService.java     # Business logic & AI integration
│       │   |    ├── EmailRequest.java        # Data to be given as input by user
|       |   |    ├── GeminiProperties.java    # Gemini API configuration beans
|       |   |    └── WebClientConfig.java     # WebClient configuration beans
│       │   └──  EmailAssistantApplication.java  # Email Assistant Application(Entry-point)
│       └── resources/
│           └── application.yml.example # Centralized application settings and API Keys
└── README.md