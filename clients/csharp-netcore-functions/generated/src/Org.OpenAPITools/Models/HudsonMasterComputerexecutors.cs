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
    public partial class HudsonMasterComputerexecutors : IEquatable<HudsonMasterComputerexecutors>
    {
        /// <summary>
        /// Gets or Sets CurrentExecutable
        /// </summary>
        [DataMember(Name="currentExecutable", EmitDefaultValue=false)]
        public FreeStyleBuild CurrentExecutable { get; set; }

        /// <summary>
        /// Gets or Sets Idle
        /// </summary>
        [DataMember(Name="idle", EmitDefaultValue=false)]
        public bool Idle { get; set; }

        /// <summary>
        /// Gets or Sets LikelyStuck
        /// </summary>
        [DataMember(Name="likelyStuck", EmitDefaultValue=false)]
        public bool LikelyStuck { get; set; }

        /// <summary>
        /// Gets or Sets Number
        /// </summary>
        [DataMember(Name="number", EmitDefaultValue=false)]
        public int Number { get; set; }

        /// <summary>
        /// Gets or Sets Progress
        /// </summary>
        [DataMember(Name="progress", EmitDefaultValue=false)]
        public int Progress { get; set; }

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
            sb.Append("class HudsonMasterComputerexecutors {\n");
            sb.Append("  CurrentExecutable: ").Append(CurrentExecutable).Append("\n");
            sb.Append("  Idle: ").Append(Idle).Append("\n");
            sb.Append("  LikelyStuck: ").Append(LikelyStuck).Append("\n");
            sb.Append("  Number: ").Append(Number).Append("\n");
            sb.Append("  Progress: ").Append(Progress).Append("\n");
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
            return obj.GetType() == GetType() && Equals((HudsonMasterComputerexecutors)obj);
        }

        /// <summary>
        /// Returns true if HudsonMasterComputerexecutors instances are equal
        /// </summary>
        /// <param name="other">Instance of HudsonMasterComputerexecutors to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(HudsonMasterComputerexecutors other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CurrentExecutable == other.CurrentExecutable ||
                    CurrentExecutable != null &&
                    CurrentExecutable.Equals(other.CurrentExecutable)
                ) && 
                (
                    Idle == other.Idle ||
                    
                    Idle.Equals(other.Idle)
                ) && 
                (
                    LikelyStuck == other.LikelyStuck ||
                    
                    LikelyStuck.Equals(other.LikelyStuck)
                ) && 
                (
                    Number == other.Number ||
                    
                    Number.Equals(other.Number)
                ) && 
                (
                    Progress == other.Progress ||
                    
                    Progress.Equals(other.Progress)
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
                    if (CurrentExecutable != null)
                    hashCode = hashCode * 59 + CurrentExecutable.GetHashCode();
                    
                    hashCode = hashCode * 59 + Idle.GetHashCode();
                    
                    hashCode = hashCode * 59 + LikelyStuck.GetHashCode();
                    
                    hashCode = hashCode * 59 + Number.GetHashCode();
                    
                    hashCode = hashCode * 59 + Progress.GetHashCode();
                    if (Class != null)
                    hashCode = hashCode * 59 + Class.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(HudsonMasterComputerexecutors left, HudsonMasterComputerexecutors right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(HudsonMasterComputerexecutors left, HudsonMasterComputerexecutors right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
