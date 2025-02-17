/*
 * Swaggy Jenkins
 *
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.5.1-pre.0
 * Contact: blah@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// QueueBlockedItem
    /// </summary>
    [DataContract]
    public partial class QueueBlockedItem :  IEquatable<QueueBlockedItem>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="QueueBlockedItem" /> class.
        /// </summary>
        /// <param name="_class">_class.</param>
        /// <param name="actions">actions.</param>
        /// <param name="blocked">blocked.</param>
        /// <param name="buildable">buildable.</param>
        /// <param name="id">id.</param>
        /// <param name="inQueueSince">inQueueSince.</param>
        /// <param name="_params">_params.</param>
        /// <param name="stuck">stuck.</param>
        /// <param name="task">task.</param>
        /// <param name="url">url.</param>
        /// <param name="why">why.</param>
        /// <param name="buildableStartMilliseconds">buildableStartMilliseconds.</param>
        public QueueBlockedItem(string _class = default(string), List<CauseAction> actions = default(List<CauseAction>), bool blocked = default(bool), bool buildable = default(bool), int id = default(int), int inQueueSince = default(int), string _params = default(string), bool stuck = default(bool), FreeStyleProject task = default(FreeStyleProject), string url = default(string), string why = default(string), int buildableStartMilliseconds = default(int))
        {
            this.Class = _class;
            this.Actions = actions;
            this.Blocked = blocked;
            this.Buildable = buildable;
            this.Id = id;
            this.InQueueSince = inQueueSince;
            this.Params = _params;
            this.Stuck = stuck;
            this.Task = task;
            this.Url = url;
            this.Why = why;
            this.BuildableStartMilliseconds = buildableStartMilliseconds;
        }

        /// <summary>
        /// Gets or Sets Class
        /// </summary>
        [DataMember(Name="_class", EmitDefaultValue=false)]
        public string Class { get; set; }

        /// <summary>
        /// Gets or Sets Actions
        /// </summary>
        [DataMember(Name="actions", EmitDefaultValue=false)]
        public List<CauseAction> Actions { get; set; }

        /// <summary>
        /// Gets or Sets Blocked
        /// </summary>
        [DataMember(Name="blocked", EmitDefaultValue=false)]
        public bool Blocked { get; set; }

        /// <summary>
        /// Gets or Sets Buildable
        /// </summary>
        [DataMember(Name="buildable", EmitDefaultValue=false)]
        public bool Buildable { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public int Id { get; set; }

        /// <summary>
        /// Gets or Sets InQueueSince
        /// </summary>
        [DataMember(Name="inQueueSince", EmitDefaultValue=false)]
        public int InQueueSince { get; set; }

        /// <summary>
        /// Gets or Sets Params
        /// </summary>
        [DataMember(Name="params", EmitDefaultValue=false)]
        public string Params { get; set; }

        /// <summary>
        /// Gets or Sets Stuck
        /// </summary>
        [DataMember(Name="stuck", EmitDefaultValue=false)]
        public bool Stuck { get; set; }

        /// <summary>
        /// Gets or Sets Task
        /// </summary>
        [DataMember(Name="task", EmitDefaultValue=false)]
        public FreeStyleProject Task { get; set; }

        /// <summary>
        /// Gets or Sets Url
        /// </summary>
        [DataMember(Name="url", EmitDefaultValue=false)]
        public string Url { get; set; }

        /// <summary>
        /// Gets or Sets Why
        /// </summary>
        [DataMember(Name="why", EmitDefaultValue=false)]
        public string Why { get; set; }

        /// <summary>
        /// Gets or Sets BuildableStartMilliseconds
        /// </summary>
        [DataMember(Name="buildableStartMilliseconds", EmitDefaultValue=false)]
        public int BuildableStartMilliseconds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class QueueBlockedItem {\n");
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
            sb.Append("  BuildableStartMilliseconds: ").Append(BuildableStartMilliseconds).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as QueueBlockedItem);
        }

        /// <summary>
        /// Returns true if QueueBlockedItem instances are equal
        /// </summary>
        /// <param name="input">Instance of QueueBlockedItem to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(QueueBlockedItem input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Class == input.Class ||
                    (this.Class != null &&
                    this.Class.Equals(input.Class))
                ) && 
                (
                    this.Actions == input.Actions ||
                    this.Actions != null &&
                    input.Actions != null &&
                    this.Actions.SequenceEqual(input.Actions)
                ) && 
                (
                    this.Blocked == input.Blocked ||
                    (this.Blocked != null &&
                    this.Blocked.Equals(input.Blocked))
                ) && 
                (
                    this.Buildable == input.Buildable ||
                    (this.Buildable != null &&
                    this.Buildable.Equals(input.Buildable))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.InQueueSince == input.InQueueSince ||
                    (this.InQueueSince != null &&
                    this.InQueueSince.Equals(input.InQueueSince))
                ) && 
                (
                    this.Params == input.Params ||
                    (this.Params != null &&
                    this.Params.Equals(input.Params))
                ) && 
                (
                    this.Stuck == input.Stuck ||
                    (this.Stuck != null &&
                    this.Stuck.Equals(input.Stuck))
                ) && 
                (
                    this.Task == input.Task ||
                    (this.Task != null &&
                    this.Task.Equals(input.Task))
                ) && 
                (
                    this.Url == input.Url ||
                    (this.Url != null &&
                    this.Url.Equals(input.Url))
                ) && 
                (
                    this.Why == input.Why ||
                    (this.Why != null &&
                    this.Why.Equals(input.Why))
                ) && 
                (
                    this.BuildableStartMilliseconds == input.BuildableStartMilliseconds ||
                    (this.BuildableStartMilliseconds != null &&
                    this.BuildableStartMilliseconds.Equals(input.BuildableStartMilliseconds))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Class != null)
                    hashCode = hashCode * 59 + this.Class.GetHashCode();
                if (this.Actions != null)
                    hashCode = hashCode * 59 + this.Actions.GetHashCode();
                if (this.Blocked != null)
                    hashCode = hashCode * 59 + this.Blocked.GetHashCode();
                if (this.Buildable != null)
                    hashCode = hashCode * 59 + this.Buildable.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.InQueueSince != null)
                    hashCode = hashCode * 59 + this.InQueueSince.GetHashCode();
                if (this.Params != null)
                    hashCode = hashCode * 59 + this.Params.GetHashCode();
                if (this.Stuck != null)
                    hashCode = hashCode * 59 + this.Stuck.GetHashCode();
                if (this.Task != null)
                    hashCode = hashCode * 59 + this.Task.GetHashCode();
                if (this.Url != null)
                    hashCode = hashCode * 59 + this.Url.GetHashCode();
                if (this.Why != null)
                    hashCode = hashCode * 59 + this.Why.GetHashCode();
                if (this.BuildableStartMilliseconds != null)
                    hashCode = hashCode * 59 + this.BuildableStartMilliseconds.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
