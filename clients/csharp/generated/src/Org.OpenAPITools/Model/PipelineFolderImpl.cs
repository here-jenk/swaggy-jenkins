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
    /// PipelineFolderImpl
    /// </summary>
    [DataContract]
    public partial class PipelineFolderImpl :  IEquatable<PipelineFolderImpl>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PipelineFolderImpl" /> class.
        /// </summary>
        /// <param name="_class">_class.</param>
        /// <param name="displayName">displayName.</param>
        /// <param name="fullName">fullName.</param>
        /// <param name="name">name.</param>
        /// <param name="organization">organization.</param>
        /// <param name="numberOfFolders">numberOfFolders.</param>
        /// <param name="numberOfPipelines">numberOfPipelines.</param>
        public PipelineFolderImpl(string _class = default(string), string displayName = default(string), string fullName = default(string), string name = default(string), string organization = default(string), int numberOfFolders = default(int), int numberOfPipelines = default(int))
        {
            this.Class = _class;
            this.DisplayName = displayName;
            this.FullName = fullName;
            this.Name = name;
            this.Organization = organization;
            this.NumberOfFolders = numberOfFolders;
            this.NumberOfPipelines = numberOfPipelines;
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
        /// Gets or Sets FullName
        /// </summary>
        [DataMember(Name="fullName", EmitDefaultValue=false)]
        public string FullName { get; set; }

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
        /// Gets or Sets NumberOfFolders
        /// </summary>
        [DataMember(Name="numberOfFolders", EmitDefaultValue=false)]
        public int NumberOfFolders { get; set; }

        /// <summary>
        /// Gets or Sets NumberOfPipelines
        /// </summary>
        [DataMember(Name="numberOfPipelines", EmitDefaultValue=false)]
        public int NumberOfPipelines { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PipelineFolderImpl {\n");
            sb.Append("  Class: ").Append(Class).Append("\n");
            sb.Append("  DisplayName: ").Append(DisplayName).Append("\n");
            sb.Append("  FullName: ").Append(FullName).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Organization: ").Append(Organization).Append("\n");
            sb.Append("  NumberOfFolders: ").Append(NumberOfFolders).Append("\n");
            sb.Append("  NumberOfPipelines: ").Append(NumberOfPipelines).Append("\n");
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
            return this.Equals(input as PipelineFolderImpl);
        }

        /// <summary>
        /// Returns true if PipelineFolderImpl instances are equal
        /// </summary>
        /// <param name="input">Instance of PipelineFolderImpl to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PipelineFolderImpl input)
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
                    this.FullName == input.FullName ||
                    (this.FullName != null &&
                    this.FullName.Equals(input.FullName))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Organization == input.Organization ||
                    (this.Organization != null &&
                    this.Organization.Equals(input.Organization))
                ) && 
                (
                    this.NumberOfFolders == input.NumberOfFolders ||
                    (this.NumberOfFolders != null &&
                    this.NumberOfFolders.Equals(input.NumberOfFolders))
                ) && 
                (
                    this.NumberOfPipelines == input.NumberOfPipelines ||
                    (this.NumberOfPipelines != null &&
                    this.NumberOfPipelines.Equals(input.NumberOfPipelines))
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
                if (this.FullName != null)
                    hashCode = hashCode * 59 + this.FullName.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Organization != null)
                    hashCode = hashCode * 59 + this.Organization.GetHashCode();
                if (this.NumberOfFolders != null)
                    hashCode = hashCode * 59 + this.NumberOfFolders.GetHashCode();
                if (this.NumberOfPipelines != null)
                    hashCode = hashCode * 59 + this.NumberOfPipelines.GetHashCode();
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
