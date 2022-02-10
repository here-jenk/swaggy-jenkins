//
// Queue.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct Queue: Codable, JSONEncodable, Hashable {

    public var _class: String?
    public var items: [QueueBlockedItem]?

    public init(_class: String? = nil, items: [QueueBlockedItem]? = nil) {
        self._class = _class
        self.items = items
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case _class
        case items
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(_class, forKey: ._class)
        try container.encodeIfPresent(items, forKey: .items)
    }
}

