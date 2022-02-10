//
// ExtensionClassContainerImpl1map.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct ExtensionClassContainerImpl1map: Codable, JSONEncodable, Hashable {

    public var ioJenkinsBlueoceanServiceEmbeddedRestPipelineImpl: ExtensionClassImpl?
    public var ioJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImpl: ExtensionClassImpl?
    public var _class: String?

    public init(ioJenkinsBlueoceanServiceEmbeddedRestPipelineImpl: ExtensionClassImpl? = nil, ioJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImpl: ExtensionClassImpl? = nil, _class: String? = nil) {
        self.ioJenkinsBlueoceanServiceEmbeddedRestPipelineImpl = ioJenkinsBlueoceanServiceEmbeddedRestPipelineImpl
        self.ioJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImpl = ioJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImpl
        self._class = _class
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case ioJenkinsBlueoceanServiceEmbeddedRestPipelineImpl = "io.jenkins.blueocean.service.embedded.rest.PipelineImpl"
        case ioJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImpl = "io.jenkins.blueocean.service.embedded.rest.MultiBranchPipelineImpl"
        case _class
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(ioJenkinsBlueoceanServiceEmbeddedRestPipelineImpl, forKey: .ioJenkinsBlueoceanServiceEmbeddedRestPipelineImpl)
        try container.encodeIfPresent(ioJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImpl, forKey: .ioJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImpl)
        try container.encodeIfPresent(_class, forKey: ._class)
    }
}

