/*
 * Swaggy Jenkins
 *
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.5.1-pre.0
 * Contact: blah@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Org.OpenAPITools.Converters;

namespace Org.OpenAPITools.Models
{ 
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class PipelinelatestRun : IEquatable<PipelinelatestRun>
    {
        /// <summary>
        /// Gets or Sets Artifacts
        /// </summary>
        [DataMember(Name="artifacts", EmitDefaultValue=false)]
        public List<PipelinelatestRunartifacts> Artifacts { get; set; }

        /// <summary>
        /// Gets or Sets DurationInMillis
        /// </summary>
        [DataMember(Name="durationInMillis", EmitDefaultValue=true)]
        public int DurationInMillis { get; set; }

        /// <summary>
        /// Gets or Sets EstimatedDurationInMillis
        /// </summary>
        [DataMember(Name="estimatedDurationInMillis", EmitDefaultValue=true)]
        public int EstimatedDurationInMillis { get; set; }

        /// <summary>
        /// Gets or Sets EnQueueTime
        /// </summary>
        [DataMember(Name="enQueueTime", EmitDefaultValue=false)]
        public string EnQueueTime { get; set; }

        /// <summary>
        /// Gets or Sets EndTime
        /// </summary>
        [DataMember(Name="endTime", EmitDefaultValue=false)]
        public string EndTime { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Organization
        /// </summary>
        [DataMember(Name="organization", EmitDefaultValue=false)]
        public string Organization { get; set; }

        /// <summary>
        /// Gets or Sets Pipeline
        /// </summary>
        [DataMember(Name="pipeline", EmitDefaultValue=false)]
        public string Pipeline { get; set; }

        /// <summary>
        /// Gets or Sets Result
        /// </summary>
        [DataMember(Name="result", EmitDefaultValue=false)]
        public string Result { get; set; }

        /// <summary>
        /// Gets or Sets RunSummary
        /// </summary>
        [DataMember(Name="runSummary", EmitDefaultValue=false)]
        public string RunSummary { get; set; }

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
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets CommitId
        /// </summary>
        [DataMember(Name="commitId", EmitDefaultValue=false)]
        public string CommitId { get; set; }

        /// <summary>
        /// Gets or Sets Class
        /// </summary>
        [DataMember(Name="_class", EmitDefaultValue=false)]
        public string Class { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PipelinelatestRun {\n");
            sb.Append("  Artifacts: ").Append(Artifacts).Append("\n");
            sb.Append("  DurationInMillis: ").Append(DurationInMillis).Append("\n");
            sb.Append("  EstimatedDurationInMillis: ").Append(EstimatedDurationInMillis).Append("\n");
            sb.Append("  EnQueueTime: ").Append(EnQueueTime).Append("\n");
            sb.Append("  EndTime: ").Append(EndTime).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Organization: ").Append(Organization).Append("\n");
            sb.Append("  Pipeline: ").Append(Pipeline).Append("\n");
            sb.Append("  Result: ").Append(Result).Append("\n");
            sb.Append("  RunSummary: ").Append(RunSummary).Append("\n");
            sb.Append("  StartTime: ").Append(StartTime).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  CommitId: ").Append(CommitId).Append("\n");
            sb.Append("  Class: ").Append(Class).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((PipelinelatestRun)obj);
        }

        /// <summary>
        /// Returns true if PipelinelatestRun instances are equal
        /// </summary>
        /// <param name="other">Instance of PipelinelatestRun to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PipelinelatestRun other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Artifacts == other.Artifacts ||
                    Artifacts != null &&
                    other.Artifacts != null &&
                    Artifacts.SequenceEqual(other.Artifacts)
                ) && 
                (
                    DurationInMillis == other.DurationInMillis ||
                    
                    DurationInMillis.Equals(other.DurationInMillis)
                ) && 
                (
                    EstimatedDurationInMillis == other.EstimatedDurationInMillis ||
                    
                    EstimatedDurationInMillis.Equals(other.EstimatedDurationInMillis)
                ) && 
                (
                    EnQueueTime == other.EnQueueTime ||
                    EnQueueTime != null &&
                    EnQueueTime.Equals(other.EnQueueTime)
                ) && 
                (
                    EndTime == other.EndTime ||
                    EndTime != null &&
                    EndTime.Equals(other.EndTime)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    Organization == other.Organization ||
                    Organization != null &&
                    Organization.Equals(other.Organization)
                ) && 
                (
                    Pipeline == other.Pipeline ||
                    Pipeline != null &&
                    Pipeline.Equals(other.Pipeline)
                ) && 
                (
                    Result == other.Result ||
                    Result != null &&
                    Result.Equals(other.Result)
                ) && 
                (
                    RunSummary == other.RunSummary ||
                    RunSummary != null &&
                    RunSummary.Equals(other.RunSummary)
                ) && 
                (
                    StartTime == other.StartTime ||
                    StartTime != null &&
                    StartTime.Equals(other.StartTime)
                ) && 
                (
                    State == other.State ||
                    State != null &&
                    State.Equals(other.State)
                ) && 
                (
                    Type == other.Type ||
                    Type != null &&
                    Type.Equals(other.Type)
                ) && 
                (
                    CommitId == other.CommitId ||
                    CommitId != null &&
                    CommitId.Equals(other.CommitId)
                ) && 
                (
                    Class == other.Class ||
                    Class != null &&
                    Class.Equals(other.Class)
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
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    if (Artifacts != null)
                    hashCode = hashCode * 59 + Artifacts.GetHashCode();
                    
                    hashCode = hashCode * 59 + DurationInMillis.GetHashCode();
                    
                    hashCode = hashCode * 59 + EstimatedDurationInMillis.GetHashCode();
                    if (EnQueueTime != null)
                    hashCode = hashCode * 59 + EnQueueTime.GetHashCode();
                    if (EndTime != null)
                    hashCode = hashCode * 59 + EndTime.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Organization != null)
                    hashCode = hashCode * 59 + Organization.GetHashCode();
                    if (Pipeline != null)
                    hashCode = hashCode * 59 + Pipeline.GetHashCode();
                    if (Result != null)
                    hashCode = hashCode * 59 + Result.GetHashCode();
                    if (RunSummary != null)
                    hashCode = hashCode * 59 + RunSummary.GetHashCode();
                    if (StartTime != null)
                    hashCode = hashCode * 59 + StartTime.GetHashCode();
                    if (State != null)
                    hashCode = hashCode * 59 + State.GetHashCode();
                    if (Type != null)
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    if (CommitId != null)
                    hashCode = hashCode * 59 + CommitId.GetHashCode();
                    if (Class != null)
                    hashCode = hashCode * 59 + Class.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PipelinelatestRun left, PipelinelatestRun right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PipelinelatestRun left, PipelinelatestRun right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
