(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

type t = {
    _class: string option [@default None];
    expected_build_number: int32 option [@default None];
    id: string option [@default None];
    pipeline: string option [@default None];
    queued_time: int32 option [@default None];
} [@@deriving yojson { strict = false }, show ];;

let create () : t = {
    _class = None;
    expected_build_number = None;
    id = None;
    pipeline = None;
    queued_time = None;
}

