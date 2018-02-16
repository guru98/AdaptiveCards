﻿using Newtonsoft.Json;
using System.ComponentModel;
using System.Xml.Serialization;

namespace AdaptiveCards
{
    /// <summary>
    ///     The TextBlock element allows for the inclusion of text, with various font sizes, weight and color, in Adaptive
    ///     Cards.
    /// </summary>
    [XmlType(TypeName = AdaptiveTextBlock.TypeName)]
    public class AdaptiveTextBlock : AdaptiveElement
    {
        public const string TypeName = "TextBlock";

        [XmlIgnore]
        public override string Type { get; set; } = TypeName;

        public AdaptiveTextBlock()
        {

        }

        public AdaptiveTextBlock(string text)
        {
            Text = text;
        }

        /// <summary>
        ///     The size of the text
        /// </summary>
        [JsonProperty(DefaultValueHandling = DefaultValueHandling.Ignore)]
        [XmlAttribute]
        [DefaultValue(typeof(AdaptiveTextSize), "normal")]
        public AdaptiveTextSize Size { get; set; }

        /// <summary>
        ///     The weight of the text
        /// </summary>
        [JsonProperty(DefaultValueHandling = DefaultValueHandling.Ignore)]
        [XmlAttribute]
        [DefaultValue(typeof(AdaptiveTextWeight), "normal")]
        public AdaptiveTextWeight Weight { get; set; }

        /// <summary>
        ///     The color of the text
        /// </summary>
        [JsonProperty(DefaultValueHandling = DefaultValueHandling.Ignore)]
        [XmlAttribute]
        [DefaultValue(typeof(AdaptiveTextColor), "default")]
        public AdaptiveTextColor Color { get; set; }

        /// <summary>
        ///     Make the text less prominent
        /// </summary>
        [JsonProperty(DefaultValueHandling = DefaultValueHandling.Ignore)]
        [XmlAttribute]
        [DefaultValue(false)]
        public bool IsSubtle { get; set; }

        /// <summary>
        ///     The text to display
        /// </summary>
        [JsonRequired]
        [XmlText]
        public string Text { get; set; } = " ";

        /// <summary>
        ///     Horizontal alignment for element
        /// </summary>
        [JsonProperty(DefaultValueHandling = DefaultValueHandling.Ignore)]
        [XmlAttribute]
        [DefaultValue(typeof(AdaptiveHorizontalAlignment), "left")]
        public AdaptiveHorizontalAlignment HorizontalAlignment { get; set; }

        /// <summary>
        ///     Is it allowed for the text to wrap
        /// </summary>
        [JsonProperty(DefaultValueHandling = DefaultValueHandling.Ignore)]
        [XmlAttribute]
        [DefaultValue(false)]
        public bool Wrap { get; set; }

        /// <summary>
        ///     When Wrap is true, you can specify the maximum number of lines to allow the textBlock to use.
        /// </summary>
        [JsonProperty(DefaultValueHandling = DefaultValueHandling.Ignore)]
        [XmlAttribute]
        [DefaultValue(0)]
        public int MaxLines { get; set; }
    }
}