//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ExtensionClassContainerImpl1map {
  /// Returns a new [ExtensionClassContainerImpl1map] instance.
  ExtensionClassContainerImpl1map({
    this.ioPeriodJenkinsPeriodBlueoceanPeriodServicePeriodEmbeddedPeriodRestPeriodPipelineImpl,
    this.ioPeriodJenkinsPeriodBlueoceanPeriodServicePeriodEmbeddedPeriodRestPeriodMultiBranchPipelineImpl,
    this.class_,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ExtensionClassImpl? ioPeriodJenkinsPeriodBlueoceanPeriodServicePeriodEmbeddedPeriodRestPeriodPipelineImpl;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ExtensionClassImpl? ioPeriodJenkinsPeriodBlueoceanPeriodServicePeriodEmbeddedPeriodRestPeriodMultiBranchPipelineImpl;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? class_;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ExtensionClassContainerImpl1map &&
     other.ioPeriodJenkinsPeriodBlueoceanPeriodServicePeriodEmbeddedPeriodRestPeriodPipelineImpl == ioPeriodJenkinsPeriodBlueoceanPeriodServicePeriodEmbeddedPeriodRestPeriodPipelineImpl &&
     other.ioPeriodJenkinsPeriodBlueoceanPeriodServicePeriodEmbeddedPeriodRestPeriodMultiBranchPipelineImpl == ioPeriodJenkinsPeriodBlueoceanPeriodServicePeriodEmbeddedPeriodRestPeriodMultiBranchPipelineImpl &&
     other.class_ == class_;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (ioPeriodJenkinsPeriodBlueoceanPeriodServicePeriodEmbeddedPeriodRestPeriodPipelineImpl == null ? 0 : ioPeriodJenkinsPeriodBlueoceanPeriodServicePeriodEmbeddedPeriodRestPeriodPipelineImpl!.hashCode) +
    (ioPeriodJenkinsPeriodBlueoceanPeriodServicePeriodEmbeddedPeriodRestPeriodMultiBranchPipelineImpl == null ? 0 : ioPeriodJenkinsPeriodBlueoceanPeriodServicePeriodEmbeddedPeriodRestPeriodMultiBranchPipelineImpl!.hashCode) +
    (class_ == null ? 0 : class_!.hashCode);

  @override
  String toString() => 'ExtensionClassContainerImpl1map[ioPeriodJenkinsPeriodBlueoceanPeriodServicePeriodEmbeddedPeriodRestPeriodPipelineImpl=$ioPeriodJenkinsPeriodBlueoceanPeriodServicePeriodEmbeddedPeriodRestPeriodPipelineImpl, ioPeriodJenkinsPeriodBlueoceanPeriodServicePeriodEmbeddedPeriodRestPeriodMultiBranchPipelineImpl=$ioPeriodJenkinsPeriodBlueoceanPeriodServicePeriodEmbeddedPeriodRestPeriodMultiBranchPipelineImpl, class_=$class_]';

  Map<String, dynamic> toJson() {
    final _json = <String, dynamic>{};
    if (ioPeriodJenkinsPeriodBlueoceanPeriodServicePeriodEmbeddedPeriodRestPeriodPipelineImpl != null) {
      _json[r'io.jenkins.blueocean.service.embedded.rest.PipelineImpl'] = ioPeriodJenkinsPeriodBlueoceanPeriodServicePeriodEmbeddedPeriodRestPeriodPipelineImpl;
    }
    if (ioPeriodJenkinsPeriodBlueoceanPeriodServicePeriodEmbeddedPeriodRestPeriodMultiBranchPipelineImpl != null) {
      _json[r'io.jenkins.blueocean.service.embedded.rest.MultiBranchPipelineImpl'] = ioPeriodJenkinsPeriodBlueoceanPeriodServicePeriodEmbeddedPeriodRestPeriodMultiBranchPipelineImpl;
    }
    if (class_ != null) {
      _json[r'_class'] = class_;
    }
    return _json;
  }

  /// Returns a new [ExtensionClassContainerImpl1map] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ExtensionClassContainerImpl1map? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ExtensionClassContainerImpl1map[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ExtensionClassContainerImpl1map[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ExtensionClassContainerImpl1map(
        ioPeriodJenkinsPeriodBlueoceanPeriodServicePeriodEmbeddedPeriodRestPeriodPipelineImpl: ExtensionClassImpl.fromJson(json[r'io.jenkins.blueocean.service.embedded.rest.PipelineImpl']),
        ioPeriodJenkinsPeriodBlueoceanPeriodServicePeriodEmbeddedPeriodRestPeriodMultiBranchPipelineImpl: ExtensionClassImpl.fromJson(json[r'io.jenkins.blueocean.service.embedded.rest.MultiBranchPipelineImpl']),
        class_: mapValueOfType<String>(json, r'_class'),
      );
    }
    return null;
  }

  static List<ExtensionClassContainerImpl1map>? listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ExtensionClassContainerImpl1map>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ExtensionClassContainerImpl1map.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ExtensionClassContainerImpl1map> mapFromJson(dynamic json) {
    final map = <String, ExtensionClassContainerImpl1map>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ExtensionClassContainerImpl1map.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ExtensionClassContainerImpl1map-objects as value to a dart map
  static Map<String, List<ExtensionClassContainerImpl1map>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ExtensionClassContainerImpl1map>>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ExtensionClassContainerImpl1map.listFromJson(entry.value, growable: growable,);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

