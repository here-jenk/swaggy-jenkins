(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

type t = {
    _class: string option [@default None];
    display_name: string option [@default None];
    full_name: string option [@default None];
    name: string option [@default None];
    organization: string option [@default None];
    number_of_folders: int32 option [@default None];
    number_of_pipelines: int32 option [@default None];
} [@@deriving yojson { strict = false }, show ];;

let create () : t = {
    _class = None;
    display_name = None;
    full_name = None;
    name = None;
    organization = None;
    number_of_folders = None;
    number_of_pipelines = None;
}

