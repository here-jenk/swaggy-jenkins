//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UnlabeledLoadStatistics {
  /// Returns a new [UnlabeledLoadStatistics] instance.
  UnlabeledLoadStatistics({
    this.class_,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? class_;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UnlabeledLoadStatistics &&
     other.class_ == class_;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (class_ == null ? 0 : class_!.hashCode);

  @override
  String toString() => 'UnlabeledLoadStatistics[class_=$class_]';

  Map<String, dynamic> toJson() {
    final _json = <String, dynamic>{};
    if (class_ != null) {
      _json[r'_class'] = class_;
    }
    return _json;
  }

  /// Returns a new [UnlabeledLoadStatistics] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UnlabeledLoadStatistics? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UnlabeledLoadStatistics[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UnlabeledLoadStatistics[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UnlabeledLoadStatistics(
        class_: mapValueOfType<String>(json, r'_class'),
      );
    }
    return null;
  }

  static List<UnlabeledLoadStatistics>? listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UnlabeledLoadStatistics>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UnlabeledLoadStatistics.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UnlabeledLoadStatistics> mapFromJson(dynamic json) {
    final map = <String, UnlabeledLoadStatistics>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UnlabeledLoadStatistics.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UnlabeledLoadStatistics-objects as value to a dart map
  static Map<String, List<UnlabeledLoadStatistics>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UnlabeledLoadStatistics>>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UnlabeledLoadStatistics.listFromJson(entry.value, growable: growable,);
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

