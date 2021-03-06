#pragma once

#include "BaseCardElement.h"
#include "BaseActionElement.h"
#include "Enums.h"
#include "pch.h"

namespace AdaptiveCards
{
class Container;

class AdaptiveCard
{
public:
    AdaptiveCard();
    AdaptiveCard(
        std::string version,
        std::string fallbackText,
        std::string backgroundImage,
        ContainerStyle style,
        std::string speak,
        std::string language);
    AdaptiveCard(
        std::string version,
        std::string fallbackText,
        std::string backgroundImage,
        ContainerStyle style,
        std::string speak,
        std::string language,
        std::vector<std::shared_ptr<BaseCardElement>>& body,
        std::vector<std::shared_ptr<BaseActionElement>>& actions);

    std::string GetVersion() const;
    void SetVersion(const std::string value);
    std::string GetFallbackText() const;
    void SetFallbackText(const std::string value);
    std::string GetBackgroundImage() const;
    void SetBackgroundImage(const std::string value);
    std::string GetSpeak() const;
    void SetSpeak(const std::string value);
    ContainerStyle GetStyle() const;
    void SetStyle(const ContainerStyle value);
    std::string GetLanguage() const;
    void SetLanguage(const std::string& value);

    std::vector<std::shared_ptr<BaseCardElement>>& GetBody();
    std::vector<std::shared_ptr<BaseActionElement>>& GetActions();

    const CardElementType GetElementType() const;
#ifdef __ANDROID__
    static std::shared_ptr<AdaptiveCard> DeserializeFromFile(const std::string& jsonFile,
        double rendererVersion,
        std::shared_ptr<ElementParserRegistration> elementParserRegistration = nullptr,
        std::shared_ptr<ActionParserRegistration> actionParserRegistration = nullptr) throw(AdaptiveCards::AdaptiveCardParseException);
    static std::shared_ptr<AdaptiveCard> Deserialize(const Json::Value& json,
        double rendererVersion,
        std::shared_ptr<ElementParserRegistration> elementParserRegistration = nullptr,
        std::shared_ptr<ActionParserRegistration> actionParserRegistration = nullptr) throw(AdaptiveCards::AdaptiveCardParseException);
    static std::shared_ptr<AdaptiveCard> DeserializeFromString(const std::string& jsonString,
        double rendererVersion,
        std::shared_ptr<ElementParserRegistration> elementParserRegistration = nullptr,
        std::shared_ptr<ActionParserRegistration> actionParserRegistration = nullptr) throw(AdaptiveCards::AdaptiveCardParseException);
    static std::shared_ptr<AdaptiveCard> MakeFallbackTextCard(
        const std::string& fallbackText,
        const std::string& language) throw(AdaptiveCards::AdaptiveCardParseException);
#else
    static std::shared_ptr<AdaptiveCard> DeserializeFromFile(
        const std::string& jsonFile,
        double rendererVersion,
        std::shared_ptr<ElementParserRegistration> elementParserRegistration = nullptr,
        std::shared_ptr<ActionParserRegistration> actionParserRegistration = nullptr);

    static std::shared_ptr<AdaptiveCard> Deserialize(const Json::Value& json,
        double rendererVersion,
        std::shared_ptr<ElementParserRegistration> elementParserRegistration = nullptr,
        std::shared_ptr<ActionParserRegistration> actionParserRegistration = nullptr);

    static std::shared_ptr<AdaptiveCard> DeserializeFromString(const std::string& jsonString,
        double rendererVersion,
        std::shared_ptr<ElementParserRegistration> elementParserRegistration = nullptr,
        std::shared_ptr<ActionParserRegistration> actionParserRegistration = nullptr);

    static std::shared_ptr<AdaptiveCard> MakeFallbackTextCard(
        const std::string& fallbackText,
        const std::string& language);

#endif // __ANDROID__
    Json::Value SerializeToJsonValue();
    std::string Serialize();

private:
    std::string m_version;
    std::string m_fallbackText;
    std::string m_backgroundImage;
    std::string m_speak;
    ContainerStyle m_style;
    std::string m_language;

    std::vector<std::shared_ptr<BaseCardElement>> m_body;
    std::vector<std::shared_ptr<BaseActionElement>> m_actions;

};
}