## 📂 Project Structure

```
email-assistant/
├── build.gradle                 # Dependency management & build logic
├── src/main/java/com/email/assistant/
│   ├── EmailAssistantApplication.java # Entry point
│   └── app/
│       ├── EmailGenController.java  # REST API Layer
│       ├── EmailGenService.java     # Business & AI Logic
│       ├── EmailRequest.java        # Input Data Model (DTO)
│       ├── GeminiProperties.java    # API Configuration
│       └── WebClientConfig.java     # WebClient Bean setup
└── src/main/resources/
    └── application.yml.example      # Configuration template

```
