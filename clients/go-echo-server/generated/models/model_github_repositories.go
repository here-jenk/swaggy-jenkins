package models

type GithubRepositories struct {

	Class string `json:"_class,omitempty"`

	Links GithubRepositorieslinks `json:"_links,omitempty"`

	Items []GithubRepository `json:"items,omitempty"`

	LastPage int32 `json:"lastPage,omitempty"`

	NextPage int32 `json:"nextPage,omitempty"`

	PageSize int32 `json:"pageSize,omitempty"`
}
