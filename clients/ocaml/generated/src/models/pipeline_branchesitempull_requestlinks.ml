(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

type t = {
    self: string option [@default None];
    _class: string option [@default None];
} [@@deriving yojson { strict = false }, show ];;

let create () : t = {
    self = None;
    _class = None;
}

