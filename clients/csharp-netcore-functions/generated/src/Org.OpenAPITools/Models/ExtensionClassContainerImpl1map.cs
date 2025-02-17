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
    public partial class ExtensionClassContainerImpl1map : IEquatable<ExtensionClassContainerImpl1map>
    {
        /// <summary>
        /// Gets or Sets IoJenkinsBlueoceanServiceEmbeddedRestPipelineImpl
        /// </summary>
        [DataMember(Name="io.jenkins.blueocean.service.embedded.rest.PipelineImpl", EmitDefaultValue=false)]
        public ExtensionClassImpl IoJenkinsBlueoceanServiceEmbeddedRestPipelineImpl { get; set; }

        /// <summary>
        /// Gets or Sets IoJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImpl
        /// </summary>
        [DataMember(Name="io.jenkins.blueocean.service.embedded.rest.MultiBranchPipelineImpl", EmitDefaultValue=false)]
        public ExtensionClassImpl IoJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImpl { get; set; }

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
            sb.Append("class ExtensionClassContainerImpl1map {\n");
            sb.Append("  IoJenkinsBlueoceanServiceEmbeddedRestPipelineImpl: ").Append(IoJenkinsBlueoceanServiceEmbeddedRestPipelineImpl).Append("\n");
            sb.Append("  IoJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImpl: ").Append(IoJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImpl).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ExtensionClassContainerImpl1map)obj);
        }

        /// <summary>
        /// Returns true if ExtensionClassContainerImpl1map instances are equal
        /// </summary>
        /// <param name="other">Instance of ExtensionClassContainerImpl1map to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ExtensionClassContainerImpl1map other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    IoJenkinsBlueoceanServiceEmbeddedRestPipelineImpl == other.IoJenkinsBlueoceanServiceEmbeddedRestPipelineImpl ||
                    IoJenkinsBlueoceanServiceEmbeddedRestPipelineImpl != null &&
                    IoJenkinsBlueoceanServiceEmbeddedRestPipelineImpl.Equals(other.IoJenkinsBlueoceanServiceEmbeddedRestPipelineImpl)
                ) && 
                (
                    IoJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImpl == other.IoJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImpl ||
                    IoJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImpl != null &&
                    IoJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImpl.Equals(other.IoJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImpl)
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
                    if (IoJenkinsBlueoceanServiceEmbeddedRestPipelineImpl != null)
                    hashCode = hashCode * 59 + IoJenkinsBlueoceanServiceEmbeddedRestPipelineImpl.GetHashCode();
                    if (IoJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImpl != null)
                    hashCode = hashCode * 59 + IoJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImpl.GetHashCode();
                    if (Class != null)
                    hashCode = hashCode * 59 + Class.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ExtensionClassContainerImpl1map left, ExtensionClassContainerImpl1map right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ExtensionClassContainerImpl1map left, ExtensionClassContainerImpl1map right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
