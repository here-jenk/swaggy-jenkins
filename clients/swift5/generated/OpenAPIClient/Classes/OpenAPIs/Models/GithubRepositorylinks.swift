//
// GithubRepositorylinks.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct GithubRepositorylinks: Codable, JSONEncodable, Hashable {

    public var _self: Link?
    public var _class: String?

    public init(_self: Link? = nil, _class: String? = nil) {
        self._self = _self
        self._class = _class
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case _self = "self"
        case _class
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(_self, forKey: ._self)
        try container.encodeIfPresent(_class, forKey: ._class)
    }
}

