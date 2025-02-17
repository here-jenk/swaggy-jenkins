//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PipelineFolderImpl {
  /// Returns a new [PipelineFolderImpl] instance.
  PipelineFolderImpl({
    this.class_,
    this.displayName,
    this.fullName,
    this.name,
    this.organization,
    this.numberOfFolders,
    this.numberOfPipelines,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? class_;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? displayName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? fullName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? organization;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? numberOfFolders;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? numberOfPipelines;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PipelineFolderImpl &&
     other.class_ == class_ &&
     other.displayName == displayName &&
     other.fullName == fullName &&
     other.name == name &&
     other.organization == organization &&
     other.numberOfFolders == numberOfFolders &&
     other.numberOfPipelines == numberOfPipelines;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (class_ == null ? 0 : class_!.hashCode) +
    (displayName == null ? 0 : displayName!.hashCode) +
    (fullName == null ? 0 : fullName!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (organization == null ? 0 : organization!.hashCode) +
    (numberOfFolders == null ? 0 : numberOfFolders!.hashCode) +
    (numberOfPipelines == null ? 0 : numberOfPipelines!.hashCode);

  @override
  String toString() => 'PipelineFolderImpl[class_=$class_, displayName=$displayName, fullName=$fullName, name=$name, organization=$organization, numberOfFolders=$numberOfFolders, numberOfPipelines=$numberOfPipelines]';

  Map<String, dynamic> toJson() {
    final _json = <String, dynamic>{};
    if (class_ != null) {
      _json[r'_class'] = class_;
    }
    if (displayName != null) {
      _json[r'displayName'] = displayName;
    }
    if (fullName != null) {
      _json[r'fullName'] = fullName;
    }
    if (name != null) {
      _json[r'name'] = name;
    }
    if (organization != null) {
      _json[r'organization'] = organization;
    }
    if (numberOfFolders != null) {
      _json[r'numberOfFolders'] = numberOfFolders;
    }
    if (numberOfPipelines != null) {
      _json[r'numberOfPipelines'] = numberOfPipelines;
    }
    return _json;
  }

  /// Returns a new [PipelineFolderImpl] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PipelineFolderImpl? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PipelineFolderImpl[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PipelineFolderImpl[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PipelineFolderImpl(
        class_: mapValueOfType<String>(json, r'_class'),
        displayName: mapValueOfType<String>(json, r'displayName'),
        fullName: mapValueOfType<String>(json, r'fullName'),
        name: mapValueOfType<String>(json, r'name'),
        organization: mapValueOfType<String>(json, r'organization'),
        numberOfFolders: mapValueOfType<int>(json, r'numberOfFolders'),
        numberOfPipelines: mapValueOfType<int>(json, r'numberOfPipelines'),
      );
    }
    return null;
  }

  static List<PipelineFolderImpl>? listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PipelineFolderImpl>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PipelineFolderImpl.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PipelineFolderImpl> mapFromJson(dynamic json) {
    final map = <String, PipelineFolderImpl>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PipelineFolderImpl.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PipelineFolderImpl-objects as value to a dart map
  static Map<String, List<PipelineFolderImpl>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PipelineFolderImpl>>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PipelineFolderImpl.listFromJson(entry.value, growable: growable,);
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

