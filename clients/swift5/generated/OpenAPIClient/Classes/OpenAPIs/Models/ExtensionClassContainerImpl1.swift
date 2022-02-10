//
// ExtensionClassContainerImpl1.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct ExtensionClassContainerImpl1: Codable, JSONEncodable, Hashable {

    public var _class: String?
    public var links: ExtensionClassContainerImpl1links?
    public var map: ExtensionClassContainerImpl1map?

    public init(_class: String? = nil, links: ExtensionClassContainerImpl1links? = nil, map: ExtensionClassContainerImpl1map? = nil) {
        self._class = _class
        self.links = links
        self.map = map
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case _class
        case links = "_links"
        case map
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(_class, forKey: ._class)
        try container.encodeIfPresent(links, forKey: .links)
        try container.encodeIfPresent(map, forKey: .map)
    }
}

