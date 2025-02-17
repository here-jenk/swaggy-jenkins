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
    public partial class MultibranchPipeline : IEquatable<MultibranchPipeline>
    {
        /// <summary>
        /// Gets or Sets DisplayName
        /// </summary>
        [DataMember(Name="displayName", EmitDefaultValue=false)]
        public string DisplayName { get; set; }

        /// <summary>
        /// Gets or Sets EstimatedDurationInMillis
        /// </summary>
        [DataMember(Name="estimatedDurationInMillis", EmitDefaultValue=false)]
        public int EstimatedDurationInMillis { get; set; }

        /// <summary>
        /// Gets or Sets LatestRun
        /// </summary>
        [DataMember(Name="latestRun", EmitDefaultValue=false)]
        public string LatestRun { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Organization
        /// </summary>
        [DataMember(Name="organization", EmitDefaultValue=false)]
        public string Organization { get; set; }

        /// <summary>
        /// Gets or Sets WeatherScore
        /// </summary>
        [DataMember(Name="weatherScore", EmitDefaultValue=false)]
        public int WeatherScore { get; set; }

        /// <summary>
        /// Gets or Sets BranchNames
        /// </summary>
        [DataMember(Name="branchNames", EmitDefaultValue=false)]
        public List<string> BranchNames { get; set; }

        /// <summary>
        /// Gets or Sets NumberOfFailingBranches
        /// </summary>
        [DataMember(Name="numberOfFailingBranches", EmitDefaultValue=false)]
        public int NumberOfFailingBranches { get; set; }

        /// <summary>
        /// Gets or Sets NumberOfFailingPullRequests
        /// </summary>
        [DataMember(Name="numberOfFailingPullRequests", EmitDefaultValue=false)]
        public int NumberOfFailingPullRequests { get; set; }

        /// <summary>
        /// Gets or Sets NumberOfSuccessfulBranches
        /// </summary>
        [DataMember(Name="numberOfSuccessfulBranches", EmitDefaultValue=false)]
        public int NumberOfSuccessfulBranches { get; set; }

        /// <summary>
        /// Gets or Sets NumberOfSuccessfulPullRequests
        /// </summary>
        [DataMember(Name="numberOfSuccessfulPullRequests", EmitDefaultValue=false)]
        public int NumberOfSuccessfulPullRequests { get; set; }

        /// <summary>
        /// Gets or Sets TotalNumberOfBranches
        /// </summary>
        [DataMember(Name="totalNumberOfBranches", EmitDefaultValue=false)]
        public int TotalNumberOfBranches { get; set; }

        /// <summary>
        /// Gets or Sets TotalNumberOfPullRequests
        /// </summary>
        [DataMember(Name="totalNumberOfPullRequests", EmitDefaultValue=false)]
        public int TotalNumberOfPullRequests { get; set; }

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
            sb.Append("class MultibranchPipeline {\n");
            sb.Append("  DisplayName: ").Append(DisplayName).Append("\n");
            sb.Append("  EstimatedDurationInMillis: ").Append(EstimatedDurationInMillis).Append("\n");
            sb.Append("  LatestRun: ").Append(LatestRun).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Organization: ").Append(Organization).Append("\n");
            sb.Append("  WeatherScore: ").Append(WeatherScore).Append("\n");
            sb.Append("  BranchNames: ").Append(BranchNames).Append("\n");
            sb.Append("  NumberOfFailingBranches: ").Append(NumberOfFailingBranches).Append("\n");
            sb.Append("  NumberOfFailingPullRequests: ").Append(NumberOfFailingPullRequests).Append("\n");
            sb.Append("  NumberOfSuccessfulBranches: ").Append(NumberOfSuccessfulBranches).Append("\n");
            sb.Append("  NumberOfSuccessfulPullRequests: ").Append(NumberOfSuccessfulPullRequests).Append("\n");
            sb.Append("  TotalNumberOfBranches: ").Append(TotalNumberOfBranches).Append("\n");
            sb.Append("  TotalNumberOfPullRequests: ").Append(TotalNumberOfPullRequests).Append("\n");
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
            return obj.GetType() == GetType() && Equals((MultibranchPipeline)obj);
        }

        /// <summary>
        /// Returns true if MultibranchPipeline instances are equal
        /// </summary>
        /// <param name="other">Instance of MultibranchPipeline to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MultibranchPipeline other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    DisplayName == other.DisplayName ||
                    DisplayName != null &&
                    DisplayName.Equals(other.DisplayName)
                ) && 
                (
                    EstimatedDurationInMillis == other.EstimatedDurationInMillis ||
                    
                    EstimatedDurationInMillis.Equals(other.EstimatedDurationInMillis)
                ) && 
                (
                    LatestRun == other.LatestRun ||
                    LatestRun != null &&
                    LatestRun.Equals(other.LatestRun)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    Organization == other.Organization ||
                    Organization != null &&
                    Organization.Equals(other.Organization)
                ) && 
                (
                    WeatherScore == other.WeatherScore ||
                    
                    WeatherScore.Equals(other.WeatherScore)
                ) && 
                (
                    BranchNames == other.BranchNames ||
                    BranchNames != null &&
                    other.BranchNames != null &&
                    BranchNames.SequenceEqual(other.BranchNames)
                ) && 
                (
                    NumberOfFailingBranches == other.NumberOfFailingBranches ||
                    
                    NumberOfFailingBranches.Equals(other.NumberOfFailingBranches)
                ) && 
                (
                    NumberOfFailingPullRequests == other.NumberOfFailingPullRequests ||
                    
                    NumberOfFailingPullRequests.Equals(other.NumberOfFailingPullRequests)
                ) && 
                (
                    NumberOfSuccessfulBranches == other.NumberOfSuccessfulBranches ||
                    
                    NumberOfSuccessfulBranches.Equals(other.NumberOfSuccessfulBranches)
                ) && 
                (
                    NumberOfSuccessfulPullRequests == other.NumberOfSuccessfulPullRequests ||
                    
                    NumberOfSuccessfulPullRequests.Equals(other.NumberOfSuccessfulPullRequests)
                ) && 
                (
                    TotalNumberOfBranches == other.TotalNumberOfBranches ||
                    
                    TotalNumberOfBranches.Equals(other.TotalNumberOfBranches)
                ) && 
                (
                    TotalNumberOfPullRequests == other.TotalNumberOfPullRequests ||
                    
                    TotalNumberOfPullRequests.Equals(other.TotalNumberOfPullRequests)
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
                    if (DisplayName != null)
                    hashCode = hashCode * 59 + DisplayName.GetHashCode();
                    
                    hashCode = hashCode * 59 + EstimatedDurationInMillis.GetHashCode();
                    if (LatestRun != null)
                    hashCode = hashCode * 59 + LatestRun.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (Organization != null)
                    hashCode = hashCode * 59 + Organization.GetHashCode();
                    
                    hashCode = hashCode * 59 + WeatherScore.GetHashCode();
                    if (BranchNames != null)
                    hashCode = hashCode * 59 + BranchNames.GetHashCode();
                    
                    hashCode = hashCode * 59 + NumberOfFailingBranches.GetHashCode();
                    
                    hashCode = hashCode * 59 + NumberOfFailingPullRequests.GetHashCode();
                    
                    hashCode = hashCode * 59 + NumberOfSuccessfulBranches.GetHashCode();
                    
                    hashCode = hashCode * 59 + NumberOfSuccessfulPullRequests.GetHashCode();
                    
                    hashCode = hashCode * 59 + TotalNumberOfBranches.GetHashCode();
                    
                    hashCode = hashCode * 59 + TotalNumberOfPullRequests.GetHashCode();
                    if (Class != null)
                    hashCode = hashCode * 59 + Class.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(MultibranchPipeline left, MultibranchPipeline right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(MultibranchPipeline left, MultibranchPipeline right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
