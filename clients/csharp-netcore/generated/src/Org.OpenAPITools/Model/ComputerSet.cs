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
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// ComputerSet
    /// </summary>
    [DataContract(Name = "ComputerSet")]
    public partial class ComputerSet : IEquatable<ComputerSet>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ComputerSet" /> class.
        /// </summary>
        /// <param name="_class">_class.</param>
        /// <param name="busyExecutors">busyExecutors.</param>
        /// <param name="computer">computer.</param>
        /// <param name="displayName">displayName.</param>
        /// <param name="totalExecutors">totalExecutors.</param>
        public ComputerSet(string _class = default(string), int busyExecutors = default(int), List<HudsonMasterComputer> computer = default(List<HudsonMasterComputer>), string displayName = default(string), int totalExecutors = default(int))
        {
            this.Class = _class;
            this.BusyExecutors = busyExecutors;
            this.Computer = computer;
            this.DisplayName = displayName;
            this.TotalExecutors = totalExecutors;
        }

        /// <summary>
        /// Gets or Sets Class
        /// </summary>
        [DataMember(Name = "_class", EmitDefaultValue = false)]
        public string Class { get; set; }

        /// <summary>
        /// Gets or Sets BusyExecutors
        /// </summary>
        [DataMember(Name = "busyExecutors", EmitDefaultValue = false)]
        public int BusyExecutors { get; set; }

        /// <summary>
        /// Gets or Sets Computer
        /// </summary>
        [DataMember(Name = "computer", EmitDefaultValue = false)]
        public List<HudsonMasterComputer> Computer { get; set; }

        /// <summary>
        /// Gets or Sets DisplayName
        /// </summary>
        [DataMember(Name = "displayName", EmitDefaultValue = false)]
        public string DisplayName { get; set; }

        /// <summary>
        /// Gets or Sets TotalExecutors
        /// </summary>
        [DataMember(Name = "totalExecutors", EmitDefaultValue = false)]
        public int TotalExecutors { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ComputerSet {\n");
            sb.Append("  Class: ").Append(Class).Append("\n");
            sb.Append("  BusyExecutors: ").Append(BusyExecutors).Append("\n");
            sb.Append("  Computer: ").Append(Computer).Append("\n");
            sb.Append("  DisplayName: ").Append(DisplayName).Append("\n");
            sb.Append("  TotalExecutors: ").Append(TotalExecutors).Append("\n");
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
            return this.Equals(input as ComputerSet);
        }

        /// <summary>
        /// Returns true if ComputerSet instances are equal
        /// </summary>
        /// <param name="input">Instance of ComputerSet to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComputerSet input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Class == input.Class ||
                    (this.Class != null &&
                    this.Class.Equals(input.Class))
                ) && 
                (
                    this.BusyExecutors == input.BusyExecutors ||
                    this.BusyExecutors.Equals(input.BusyExecutors)
                ) && 
                (
                    this.Computer == input.Computer ||
                    this.Computer != null &&
                    input.Computer != null &&
                    this.Computer.SequenceEqual(input.Computer)
                ) && 
                (
                    this.DisplayName == input.DisplayName ||
                    (this.DisplayName != null &&
                    this.DisplayName.Equals(input.DisplayName))
                ) && 
                (
                    this.TotalExecutors == input.TotalExecutors ||
                    this.TotalExecutors.Equals(input.TotalExecutors)
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
                {
                    hashCode = (hashCode * 59) + this.Class.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.BusyExecutors.GetHashCode();
                if (this.Computer != null)
                {
                    hashCode = (hashCode * 59) + this.Computer.GetHashCode();
                }
                if (this.DisplayName != null)
                {
                    hashCode = (hashCode * 59) + this.DisplayName.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.TotalExecutors.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
