//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CauseAction {
  /// Returns a new [CauseAction] instance.
  CauseAction({
    this.class_,
    this.causes = const [],
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? class_;

  List<CauseUserIdCause> causes;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CauseAction &&
     other.class_ == class_ &&
     other.causes == causes;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (class_ == null ? 0 : class_!.hashCode) +
    (causes.hashCode);

  @override
  String toString() => 'CauseAction[class_=$class_, causes=$causes]';

  Map<String, dynamic> toJson() {
    final _json = <String, dynamic>{};
    if (class_ != null) {
      _json[r'_class'] = class_;
    }
      _json[r'causes'] = causes;
    return _json;
  }

  /// Returns a new [CauseAction] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CauseAction? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CauseAction[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CauseAction[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CauseAction(
        class_: mapValueOfType<String>(json, r'_class'),
        causes: CauseUserIdCause.listFromJson(json[r'causes']) ?? const [],
      );
    }
    return null;
  }

  static List<CauseAction>? listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CauseAction>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CauseAction.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CauseAction> mapFromJson(dynamic json) {
    final map = <String, CauseAction>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CauseAction.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CauseAction-objects as value to a dart map
  static Map<String, List<CauseAction>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CauseAction>>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CauseAction.listFromJson(entry.value, growable: growable,);
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

