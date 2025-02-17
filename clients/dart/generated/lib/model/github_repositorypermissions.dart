//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GithubRepositorypermissions {
  /// Returns a new [GithubRepositorypermissions] instance.
  GithubRepositorypermissions({
    this.admin,
    this.push,
    this.pull,
    this.class_,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? admin;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? push;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? pull;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? class_;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GithubRepositorypermissions &&
     other.admin == admin &&
     other.push == push &&
     other.pull == pull &&
     other.class_ == class_;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (admin == null ? 0 : admin!.hashCode) +
    (push == null ? 0 : push!.hashCode) +
    (pull == null ? 0 : pull!.hashCode) +
    (class_ == null ? 0 : class_!.hashCode);

  @override
  String toString() => 'GithubRepositorypermissions[admin=$admin, push=$push, pull=$pull, class_=$class_]';

  Map<String, dynamic> toJson() {
    final _json = <String, dynamic>{};
    if (admin != null) {
      _json[r'admin'] = admin;
    }
    if (push != null) {
      _json[r'push'] = push;
    }
    if (pull != null) {
      _json[r'pull'] = pull;
    }
    if (class_ != null) {
      _json[r'_class'] = class_;
    }
    return _json;
  }

  /// Returns a new [GithubRepositorypermissions] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GithubRepositorypermissions? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GithubRepositorypermissions[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GithubRepositorypermissions[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GithubRepositorypermissions(
        admin: mapValueOfType<bool>(json, r'admin'),
        push: mapValueOfType<bool>(json, r'push'),
        pull: mapValueOfType<bool>(json, r'pull'),
        class_: mapValueOfType<String>(json, r'_class'),
      );
    }
    return null;
  }

  static List<GithubRepositorypermissions>? listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GithubRepositorypermissions>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GithubRepositorypermissions.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GithubRepositorypermissions> mapFromJson(dynamic json) {
    final map = <String, GithubRepositorypermissions>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GithubRepositorypermissions.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GithubRepositorypermissions-objects as value to a dart map
  static Map<String, List<GithubRepositorypermissions>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GithubRepositorypermissions>>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GithubRepositorypermissions.listFromJson(entry.value, growable: growable,);
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

