//
// BranchImpl.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct BranchImpl: Codable, JSONEncodable, Hashable {

    public var _class: String?
    public var displayName: String?
    public var estimatedDurationInMillis: Int?
    public var fullDisplayName: String?
    public var fullName: String?
    public var name: String?
    public var organization: String?
    public var parameters: [StringParameterDefinition]?
    public var permissions: BranchImplpermissions?
    public var weatherScore: Int?
    public var pullRequest: String?
    public var links: BranchImpllinks?
    public var latestRun: PipelineRunImpl?

    public init(_class: String? = nil, displayName: String? = nil, estimatedDurationInMillis: Int? = nil, fullDisplayName: String? = nil, fullName: String? = nil, name: String? = nil, organization: String? = nil, parameters: [StringParameterDefinition]? = nil, permissions: BranchImplpermissions? = nil, weatherScore: Int? = nil, pullRequest: String? = nil, links: BranchImpllinks? = nil, latestRun: PipelineRunImpl? = nil) {
        self._class = _class
        self.displayName = displayName
        self.estimatedDurationInMillis = estimatedDurationInMillis
        self.fullDisplayName = fullDisplayName
        self.fullName = fullName
        self.name = name
        self.organization = organization
        self.parameters = parameters
        self.permissions = permissions
        self.weatherScore = weatherScore
        self.pullRequest = pullRequest
        self.links = links
        self.latestRun = latestRun
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case _class
        case displayName
        case estimatedDurationInMillis
        case fullDisplayName
        case fullName
        case name
        case organization
        case parameters
        case permissions
        case weatherScore
        case pullRequest
        case links = "_links"
        case latestRun
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(_class, forKey: ._class)
        try container.encodeIfPresent(displayName, forKey: .displayName)
        try container.encodeIfPresent(estimatedDurationInMillis, forKey: .estimatedDurationInMillis)
        try container.encodeIfPresent(fullDisplayName, forKey: .fullDisplayName)
        try container.encodeIfPresent(fullName, forKey: .fullName)
        try container.encodeIfPresent(name, forKey: .name)
        try container.encodeIfPresent(organization, forKey: .organization)
        try container.encodeIfPresent(parameters, forKey: .parameters)
        try container.encodeIfPresent(permissions, forKey: .permissions)
        try container.encodeIfPresent(weatherScore, forKey: .weatherScore)
        try container.encodeIfPresent(pullRequest, forKey: .pullRequest)
        try container.encodeIfPresent(links, forKey: .links)
        try container.encodeIfPresent(latestRun, forKey: .latestRun)
    }
}

