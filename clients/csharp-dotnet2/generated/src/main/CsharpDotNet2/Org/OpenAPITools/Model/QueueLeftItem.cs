using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class QueueLeftItem {
    /// <summary>
    /// Gets or Sets Class
    /// </summary>
    [DataMember(Name="_class", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "_class")]
    public string Class { get; set; }

    /// <summary>
    /// Gets or Sets Actions
    /// </summary>
    [DataMember(Name="actions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "actions")]
    public List<CauseAction> Actions { get; set; }

    /// <summary>
    /// Gets or Sets Blocked
    /// </summary>
    [DataMember(Name="blocked", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "blocked")]
    public bool? Blocked { get; set; }

    /// <summary>
    /// Gets or Sets Buildable
    /// </summary>
    [DataMember(Name="buildable", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "buildable")]
    public bool? Buildable { get; set; }

    /// <summary>
    /// Gets or Sets Id
    /// </summary>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public int? Id { get; set; }

    /// <summary>
    /// Gets or Sets InQueueSince
    /// </summary>
    [DataMember(Name="inQueueSince", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "inQueueSince")]
    public int? InQueueSince { get; set; }

    /// <summary>
    /// Gets or Sets Params
    /// </summary>
    [DataMember(Name="params", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "params")]
    public string Params { get; set; }

    /// <summary>
    /// Gets or Sets Stuck
    /// </summary>
    [DataMember(Name="stuck", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stuck")]
    public bool? Stuck { get; set; }

    /// <summary>
    /// Gets or Sets Task
    /// </summary>
    [DataMember(Name="task", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "task")]
    public FreeStyleProject Task { get; set; }

    /// <summary>
    /// Gets or Sets Url
    /// </summary>
    [DataMember(Name="url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "url")]
    public string Url { get; set; }

    /// <summary>
    /// Gets or Sets Why
    /// </summary>
    [DataMember(Name="why", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "why")]
    public string Why { get; set; }

    /// <summary>
    /// Gets or Sets Cancelled
    /// </summary>
    [DataMember(Name="cancelled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cancelled")]
    public bool? Cancelled { get; set; }

    /// <summary>
    /// Gets or Sets Executable
    /// </summary>
    [DataMember(Name="executable", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "executable")]
    public FreeStyleBuild Executable { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class QueueLeftItem {\n");
      sb.Append("  Class: ").Append(Class).Append("\n");
      sb.Append("  Actions: ").Append(Actions).Append("\n");
      sb.Append("  Blocked: ").Append(Blocked).Append("\n");
      sb.Append("  Buildable: ").Append(Buildable).Append("\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  InQueueSince: ").Append(InQueueSince).Append("\n");
      sb.Append("  Params: ").Append(Params).Append("\n");
      sb.Append("  Stuck: ").Append(Stuck).Append("\n");
      sb.Append("  Task: ").Append(Task).Append("\n");
      sb.Append("  Url: ").Append(Url).Append("\n");
      sb.Append("  Why: ").Append(Why).Append("\n");
      sb.Append("  Cancelled: ").Append(Cancelled).Append("\n");
      sb.Append("  Executable: ").Append(Executable).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
    }

}
}
