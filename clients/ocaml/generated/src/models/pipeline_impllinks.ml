(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

type t = {
    runs: Link.t option [@default None];
    self: Link.t option [@default None];
    queue: Link.t option [@default None];
    actions: Link.t option [@default None];
    _class: string option [@default None];
} [@@deriving yojson { strict = false }, show ];;

let create () : t = {
    runs = None;
    self = None;
    queue = None;
    actions = None;
    _class = None;
}

