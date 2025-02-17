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
    public partial class HudsonMasterComputer : IEquatable<HudsonMasterComputer>
    {
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
        /// Gets or Sets Executors
        /// </summary>
        [DataMember(Name="executors", EmitDefaultValue=false)]
        public List<HudsonMasterComputerexecutors> Executors { get; set; }

        /// <summary>
        /// Gets or Sets Icon
        /// </summary>
        [DataMember(Name="icon", EmitDefaultValue=false)]
        public string Icon { get; set; }

        /// <summary>
        /// Gets or Sets IconClassName
        /// </summary>
        [DataMember(Name="iconClassName", EmitDefaultValue=false)]
        public string IconClassName { get; set; }

        /// <summary>
        /// Gets or Sets Idle
        /// </summary>
        [DataMember(Name="idle", EmitDefaultValue=false)]
        public bool Idle { get; set; }

        /// <summary>
        /// Gets or Sets JnlpAgent
        /// </summary>
        [DataMember(Name="jnlpAgent", EmitDefaultValue=false)]
        public bool JnlpAgent { get; set; }

        /// <summary>
        /// Gets or Sets LaunchSupported
        /// </summary>
        [DataMember(Name="launchSupported", EmitDefaultValue=false)]
        public bool LaunchSupported { get; set; }

        /// <summary>
        /// Gets or Sets LoadStatistics
        /// </summary>
        [DataMember(Name="loadStatistics", EmitDefaultValue=false)]
        public Label1 LoadStatistics { get; set; }

        /// <summary>
        /// Gets or Sets ManualLaunchAllowed
        /// </summary>
        [DataMember(Name="manualLaunchAllowed", EmitDefaultValue=false)]
        public bool ManualLaunchAllowed { get; set; }

        /// <summary>
        /// Gets or Sets MonitorData
        /// </summary>
        [DataMember(Name="monitorData", EmitDefaultValue=false)]
        public HudsonMasterComputermonitorData MonitorData { get; set; }

        /// <summary>
        /// Gets or Sets NumExecutors
        /// </summary>
        [DataMember(Name="numExecutors", EmitDefaultValue=false)]
        public int NumExecutors { get; set; }

        /// <summary>
        /// Gets or Sets Offline
        /// </summary>
        [DataMember(Name="offline", EmitDefaultValue=false)]
        public bool Offline { get; set; }

        /// <summary>
        /// Gets or Sets OfflineCause
        /// </summary>
        [DataMember(Name="offlineCause", EmitDefaultValue=false)]
        public string OfflineCause { get; set; }

        /// <summary>
        /// Gets or Sets OfflineCauseReason
        /// </summary>
        [DataMember(Name="offlineCauseReason", EmitDefaultValue=false)]
        public string OfflineCauseReason { get; set; }

        /// <summary>
        /// Gets or Sets TemporarilyOffline
        /// </summary>
        [DataMember(Name="temporarilyOffline", EmitDefaultValue=false)]
        public bool TemporarilyOffline { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class HudsonMasterComputer {\n");
            sb.Append("  Class: ").Append(Class).Append("\n");
            sb.Append("  DisplayName: ").Append(DisplayName).Append("\n");
            sb.Append("  Executors: ").Append(Executors).Append("\n");
            sb.Append("  Icon: ").Append(Icon).Append("\n");
            sb.Append("  IconClassName: ").Append(IconClassName).Append("\n");
            sb.Append("  Idle: ").Append(Idle).Append("\n");
            sb.Append("  JnlpAgent: ").Append(JnlpAgent).Append("\n");
            sb.Append("  LaunchSupported: ").Append(LaunchSupported).Append("\n");
            sb.Append("  LoadStatistics: ").Append(LoadStatistics).Append("\n");
            sb.Append("  ManualLaunchAllowed: ").Append(ManualLaunchAllowed).Append("\n");
            sb.Append("  MonitorData: ").Append(MonitorData).Append("\n");
            sb.Append("  NumExecutors: ").Append(NumExecutors).Append("\n");
            sb.Append("  Offline: ").Append(Offline).Append("\n");
            sb.Append("  OfflineCause: ").Append(OfflineCause).Append("\n");
            sb.Append("  OfflineCauseReason: ").Append(OfflineCauseReason).Append("\n");
            sb.Append("  TemporarilyOffline: ").Append(TemporarilyOffline).Append("\n");
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
            return obj.GetType() == GetType() && Equals((HudsonMasterComputer)obj);
        }

        /// <summary>
        /// Returns true if HudsonMasterComputer instances are equal
        /// </summary>
        /// <param name="other">Instance of HudsonMasterComputer to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(HudsonMasterComputer other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Class == other.Class ||
                    Class != null &&
                    Class.Equals(other.Class)
                ) && 
                (
                    DisplayName == other.DisplayName ||
                    DisplayName != null &&
                    DisplayName.Equals(other.DisplayName)
                ) && 
                (
                    Executors == other.Executors ||
                    Executors != null &&
                    other.Executors != null &&
                    Executors.SequenceEqual(other.Executors)
                ) && 
                (
                    Icon == other.Icon ||
                    Icon != null &&
                    Icon.Equals(other.Icon)
                ) && 
                (
                    IconClassName == other.IconClassName ||
                    IconClassName != null &&
                    IconClassName.Equals(other.IconClassName)
                ) && 
                (
                    Idle == other.Idle ||
                    
                    Idle.Equals(other.Idle)
                ) && 
                (
                    JnlpAgent == other.JnlpAgent ||
                    
                    JnlpAgent.Equals(other.JnlpAgent)
                ) && 
                (
                    LaunchSupported == other.LaunchSupported ||
                    
                    LaunchSupported.Equals(other.LaunchSupported)
                ) && 
                (
                    LoadStatistics == other.LoadStatistics ||
                    LoadStatistics != null &&
                    LoadStatistics.Equals(other.LoadStatistics)
                ) && 
                (
                    ManualLaunchAllowed == other.ManualLaunchAllowed ||
                    
                    ManualLaunchAllowed.Equals(other.ManualLaunchAllowed)
                ) && 
                (
                    MonitorData == other.MonitorData ||
                    MonitorData != null &&
                    MonitorData.Equals(other.MonitorData)
                ) && 
                (
                    NumExecutors == other.NumExecutors ||
                    
                    NumExecutors.Equals(other.NumExecutors)
                ) && 
                (
                    Offline == other.Offline ||
                    
                    Offline.Equals(other.Offline)
                ) && 
                (
                    OfflineCause == other.OfflineCause ||
                    OfflineCause != null &&
                    OfflineCause.Equals(other.OfflineCause)
                ) && 
                (
                    OfflineCauseReason == other.OfflineCauseReason ||
                    OfflineCauseReason != null &&
                    OfflineCauseReason.Equals(other.OfflineCauseReason)
                ) && 
                (
                    TemporarilyOffline == other.TemporarilyOffline ||
                    
                    TemporarilyOffline.Equals(other.TemporarilyOffline)
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
                    if (Class != null)
                    hashCode = hashCode * 59 + Class.GetHashCode();
                    if (DisplayName != null)
                    hashCode = hashCode * 59 + DisplayName.GetHashCode();
                    if (Executors != null)
                    hashCode = hashCode * 59 + Executors.GetHashCode();
                    if (Icon != null)
                    hashCode = hashCode * 59 + Icon.GetHashCode();
                    if (IconClassName != null)
                    hashCode = hashCode * 59 + IconClassName.GetHashCode();
                    
                    hashCode = hashCode * 59 + Idle.GetHashCode();
                    
                    hashCode = hashCode * 59 + JnlpAgent.GetHashCode();
                    
                    hashCode = hashCode * 59 + LaunchSupported.GetHashCode();
                    if (LoadStatistics != null)
                    hashCode = hashCode * 59 + LoadStatistics.GetHashCode();
                    
                    hashCode = hashCode * 59 + ManualLaunchAllowed.GetHashCode();
                    if (MonitorData != null)
                    hashCode = hashCode * 59 + MonitorData.GetHashCode();
                    
                    hashCode = hashCode * 59 + NumExecutors.GetHashCode();
                    
                    hashCode = hashCode * 59 + Offline.GetHashCode();
                    if (OfflineCause != null)
                    hashCode = hashCode * 59 + OfflineCause.GetHashCode();
                    if (OfflineCauseReason != null)
                    hashCode = hashCode * 59 + OfflineCauseReason.GetHashCode();
                    
                    hashCode = hashCode * 59 + TemporarilyOffline.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(HudsonMasterComputer left, HudsonMasterComputer right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(HudsonMasterComputer left, HudsonMasterComputer right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
