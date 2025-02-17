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
    /// PipelineRunNode
    /// </summary>
    [DataContract]
    public partial class PipelineRunNode :  IEquatable<PipelineRunNode>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PipelineRunNode" /> class.
        /// </summary>
        /// <param name="_class">_class.</param>
        /// <param name="displayName">displayName.</param>
        /// <param name="durationInMillis">durationInMillis.</param>
        /// <param name="edges">edges.</param>
        /// <param name="id">id.</param>
        /// <param name="result">result.</param>
        /// <param name="startTime">startTime.</param>
        /// <param name="state">state.</param>
        public PipelineRunNode(string _class = default(string), string displayName = default(string), int durationInMillis = default(int), List<PipelineRunNodeedges> edges = default(List<PipelineRunNodeedges>), string id = default(string), string result = default(string), string startTime = default(string), string state = default(string))
        {
            this.Class = _class;
            this.DisplayName = displayName;
            this.DurationInMillis = durationInMillis;
            this.Edges = edges;
            this.Id = id;
            this.Result = result;
            this.StartTime = startTime;
            this.State = state;
        }

        /// <summary>
        /// Gets or Sets Class
        /// </summary>
        [DataMember(Name="_class", EmitDefaultValue=false)]
        public string Class { get; set; }

        /// <summary>
        /// Gets or Sets DisplayName
        /// </summary>
        [DataMember(Name="displayName", EmitDefaultValue=false)]
        public string DisplayName { get; set; }

        /// <summary>
        /// Gets or Sets DurationInMillis
        /// </summary>
        [DataMember(Name="durationInMillis", EmitDefaultValue=false)]
        public int DurationInMillis { get; set; }

        /// <summary>
        /// Gets or Sets Edges
        /// </summary>
        [DataMember(Name="edges", EmitDefaultValue=false)]
        public List<PipelineRunNodeedges> Edges { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Result
        /// </summary>
        [DataMember(Name="result", EmitDefaultValue=false)]
        public string Result { get; set; }

        /// <summary>
        /// Gets or Sets StartTime
        /// </summary>
        [DataMember(Name="startTime", EmitDefaultValue=false)]
        public string StartTime { get; set; }

        /// <summary>
        /// Gets or Sets State
        /// </summary>
        [DataMember(Name="state", EmitDefaultValue=false)]
        public string State { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PipelineRunNode {\n");
            sb.Append("  Class: ").Append(Class).Append("\n");
            sb.Append("  DisplayName: ").Append(DisplayName).Append("\n");
            sb.Append("  DurationInMillis: ").Append(DurationInMillis).Append("\n");
            sb.Append("  Edges: ").Append(Edges).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Result: ").Append(Result).Append("\n");
            sb.Append("  StartTime: ").Append(StartTime).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
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
            return this.Equals(input as PipelineRunNode);
        }

        /// <summary>
        /// Returns true if PipelineRunNode instances are equal
        /// </summary>
        /// <param name="input">Instance of PipelineRunNode to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PipelineRunNode input)
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
                    this.DisplayName == input.DisplayName ||
                    (this.DisplayName != null &&
                    this.DisplayName.Equals(input.DisplayName))
                ) && 
                (
                    this.DurationInMillis == input.DurationInMillis ||
                    (this.DurationInMillis != null &&
                    this.DurationInMillis.Equals(input.DurationInMillis))
                ) && 
                (
                    this.Edges == input.Edges ||
                    this.Edges != null &&
                    input.Edges != null &&
                    this.Edges.SequenceEqual(input.Edges)
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Result == input.Result ||
                    (this.Result != null &&
                    this.Result.Equals(input.Result))
                ) && 
                (
                    this.StartTime == input.StartTime ||
                    (this.StartTime != null &&
                    this.StartTime.Equals(input.StartTime))
                ) && 
                (
                    this.State == input.State ||
                    (this.State != null &&
                    this.State.Equals(input.State))
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
                if (this.DisplayName != null)
                    hashCode = hashCode * 59 + this.DisplayName.GetHashCode();
                if (this.DurationInMillis != null)
                    hashCode = hashCode * 59 + this.DurationInMillis.GetHashCode();
                if (this.Edges != null)
                    hashCode = hashCode * 59 + this.Edges.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Result != null)
                    hashCode = hashCode * 59 + this.Result.GetHashCode();
                if (this.StartTime != null)
                    hashCode = hashCode * 59 + this.StartTime.GetHashCode();
                if (this.State != null)
                    hashCode = hashCode * 59 + this.State.GetHashCode();
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
