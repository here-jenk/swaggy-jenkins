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
    public partial class BranchImplpermissions : IEquatable<BranchImplpermissions>
    {
        /// <summary>
        /// Gets or Sets Create
        /// </summary>
        [DataMember(Name="create", EmitDefaultValue=false)]
        public bool Create { get; set; }

        /// <summary>
        /// Gets or Sets Read
        /// </summary>
        [DataMember(Name="read", EmitDefaultValue=false)]
        public bool Read { get; set; }

        /// <summary>
        /// Gets or Sets Start
        /// </summary>
        [DataMember(Name="start", EmitDefaultValue=false)]
        public bool Start { get; set; }

        /// <summary>
        /// Gets or Sets Stop
        /// </summary>
        [DataMember(Name="stop", EmitDefaultValue=false)]
        public bool Stop { get; set; }

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
            sb.Append("class BranchImplpermissions {\n");
            sb.Append("  Create: ").Append(Create).Append("\n");
            sb.Append("  Read: ").Append(Read).Append("\n");
            sb.Append("  Start: ").Append(Start).Append("\n");
            sb.Append("  Stop: ").Append(Stop).Append("\n");
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
            return obj.GetType() == GetType() && Equals((BranchImplpermissions)obj);
        }

        /// <summary>
        /// Returns true if BranchImplpermissions instances are equal
        /// </summary>
        /// <param name="other">Instance of BranchImplpermissions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BranchImplpermissions other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Create == other.Create ||
                    
                    Create.Equals(other.Create)
                ) && 
                (
                    Read == other.Read ||
                    
                    Read.Equals(other.Read)
                ) && 
                (
                    Start == other.Start ||
                    
                    Start.Equals(other.Start)
                ) && 
                (
                    Stop == other.Stop ||
                    
                    Stop.Equals(other.Stop)
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
                    
                    hashCode = hashCode * 59 + Create.GetHashCode();
                    
                    hashCode = hashCode * 59 + Read.GetHashCode();
                    
                    hashCode = hashCode * 59 + Start.GetHashCode();
                    
                    hashCode = hashCode * 59 + Stop.GetHashCode();
                    if (Class != null)
                    hashCode = hashCode * 59 + Class.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(BranchImplpermissions left, BranchImplpermissions right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(BranchImplpermissions left, BranchImplpermissions right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
