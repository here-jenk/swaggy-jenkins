(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

type t = {
    _class: string option [@default None];
    _links: Pipeline_step_impllinks.t option [@default None];
    display_name: string option [@default None];
    duration_in_millis: int32 option [@default None];
    id: string option [@default None];
    input: Input_step_impl.t option [@default None];
    _result: string option [@default None];
    start_time: string option [@default None];
    state: string option [@default None];
} [@@deriving yojson { strict = false }, show ];;

let create () : t = {
    _class = None;
    _links = None;
    display_name = None;
    duration_in_millis = None;
    id = None;
    input = None;
    _result = None;
    start_time = None;
    state = None;
}

