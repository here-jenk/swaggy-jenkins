//
// GithubRepositories.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct GithubRepositories: Codable, JSONEncodable, Hashable {

    public var _class: String?
    public var links: GithubRepositorieslinks?
    public var items: [GithubRepository]?
    public var lastPage: Int?
    public var nextPage: Int?
    public var pageSize: Int?

    public init(_class: String? = nil, links: GithubRepositorieslinks? = nil, items: [GithubRepository]? = nil, lastPage: Int? = nil, nextPage: Int? = nil, pageSize: Int? = nil) {
        self._class = _class
        self.links = links
        self.items = items
        self.lastPage = lastPage
        self.nextPage = nextPage
        self.pageSize = pageSize
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case _class
        case links = "_links"
        case items
        case lastPage
        case nextPage
        case pageSize
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(_class, forKey: ._class)
        try container.encodeIfPresent(links, forKey: .links)
        try container.encodeIfPresent(items, forKey: .items)
        try container.encodeIfPresent(lastPage, forKey: .lastPage)
        try container.encodeIfPresent(nextPage, forKey: .nextPage)
        try container.encodeIfPresent(pageSize, forKey: .pageSize)
    }
}

