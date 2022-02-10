/*
 * Swaggy Jenkins
 *
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.1.2-pre.0
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
    /// GithubContent
    /// </summary>
    [DataContract(Name = "GithubContent")]
    public partial class GithubContent : IEquatable<GithubContent>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GithubContent" /> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="sha">sha.</param>
        /// <param name="_class">_class.</param>
        /// <param name="repo">repo.</param>
        /// <param name="size">size.</param>
        /// <param name="owner">owner.</param>
        /// <param name="path">path.</param>
        /// <param name="base64Data">base64Data.</param>
        public GithubContent(string name = default(string), string sha = default(string), string _class = default(string), string repo = default(string), int size = default(int), string owner = default(string), string path = default(string), string base64Data = default(string))
        {
            this.Name = name;
            this.Sha = sha;
            this.Class = _class;
            this.Repo = repo;
            this.Size = size;
            this.Owner = owner;
            this.Path = path;
            this.Base64Data = base64Data;
        }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Sha
        /// </summary>
        [DataMember(Name = "sha", EmitDefaultValue = false)]
        public string Sha { get; set; }

        /// <summary>
        /// Gets or Sets Class
        /// </summary>
        [DataMember(Name = "_class", EmitDefaultValue = false)]
        public string Class { get; set; }

        /// <summary>
        /// Gets or Sets Repo
        /// </summary>
        [DataMember(Name = "repo", EmitDefaultValue = false)]
        public string Repo { get; set; }

        /// <summary>
        /// Gets or Sets Size
        /// </summary>
        [DataMember(Name = "size", EmitDefaultValue = false)]
        public int Size { get; set; }

        /// <summary>
        /// Gets or Sets Owner
        /// </summary>
        [DataMember(Name = "owner", EmitDefaultValue = false)]
        public string Owner { get; set; }

        /// <summary>
        /// Gets or Sets Path
        /// </summary>
        [DataMember(Name = "path", EmitDefaultValue = false)]
        public string Path { get; set; }

        /// <summary>
        /// Gets or Sets Base64Data
        /// </summary>
        [DataMember(Name = "base64Data", EmitDefaultValue = false)]
        public string Base64Data { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GithubContent {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Sha: ").Append(Sha).Append("\n");
            sb.Append("  Class: ").Append(Class).Append("\n");
            sb.Append("  Repo: ").Append(Repo).Append("\n");
            sb.Append("  Size: ").Append(Size).Append("\n");
            sb.Append("  Owner: ").Append(Owner).Append("\n");
            sb.Append("  Path: ").Append(Path).Append("\n");
            sb.Append("  Base64Data: ").Append(Base64Data).Append("\n");
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
            return this.Equals(input as GithubContent);
        }

        /// <summary>
        /// Returns true if GithubContent instances are equal
        /// </summary>
        /// <param name="input">Instance of GithubContent to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GithubContent input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Sha == input.Sha ||
                    (this.Sha != null &&
                    this.Sha.Equals(input.Sha))
                ) && 
                (
                    this.Class == input.Class ||
                    (this.Class != null &&
                    this.Class.Equals(input.Class))
                ) && 
                (
                    this.Repo == input.Repo ||
                    (this.Repo != null &&
                    this.Repo.Equals(input.Repo))
                ) && 
                (
                    this.Size == input.Size ||
                    this.Size.Equals(input.Size)
                ) && 
                (
                    this.Owner == input.Owner ||
                    (this.Owner != null &&
                    this.Owner.Equals(input.Owner))
                ) && 
                (
                    this.Path == input.Path ||
                    (this.Path != null &&
                    this.Path.Equals(input.Path))
                ) && 
                (
                    this.Base64Data == input.Base64Data ||
                    (this.Base64Data != null &&
                    this.Base64Data.Equals(input.Base64Data))
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Sha != null)
                {
                    hashCode = (hashCode * 59) + this.Sha.GetHashCode();
                }
                if (this.Class != null)
                {
                    hashCode = (hashCode * 59) + this.Class.GetHashCode();
                }
                if (this.Repo != null)
                {
                    hashCode = (hashCode * 59) + this.Repo.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Size.GetHashCode();
                if (this.Owner != null)
                {
                    hashCode = (hashCode * 59) + this.Owner.GetHashCode();
                }
                if (this.Path != null)
                {
                    hashCode = (hashCode * 59) + this.Path.GetHashCode();
                }
                if (this.Base64Data != null)
                {
                    hashCode = (hashCode * 59) + this.Base64Data.GetHashCode();
                }
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
