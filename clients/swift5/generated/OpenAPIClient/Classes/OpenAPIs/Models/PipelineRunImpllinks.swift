//
// PipelineRunImpllinks.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct PipelineRunImpllinks: Codable, JSONEncodable, Hashable {

    public var nodes: Link?
    public var log: Link?
    public var _self: Link?
    public var actions: Link?
    public var steps: Link?
    public var _class: String?

    public init(nodes: Link? = nil, log: Link? = nil, _self: Link? = nil, actions: Link? = nil, steps: Link? = nil, _class: String? = nil) {
        self.nodes = nodes
        self.log = log
        self._self = _self
        self.actions = actions
        self.steps = steps
        self._class = _class
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case nodes
        case log
        case _self = "self"
        case actions
        case steps
        case _class
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(nodes, forKey: .nodes)
        try container.encodeIfPresent(log, forKey: .log)
        try container.encodeIfPresent(_self, forKey: ._self)
        try container.encodeIfPresent(actions, forKey: .actions)
        try container.encodeIfPresent(steps, forKey: .steps)
        try container.encodeIfPresent(_class, forKey: ._class)
    }
}

