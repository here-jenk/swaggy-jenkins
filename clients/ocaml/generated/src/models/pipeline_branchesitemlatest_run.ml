(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

type t = {
    duration_in_millis: int32 option [@default None];
    estimated_duration_in_millis: int32 option [@default None];
    en_queue_time: string option [@default None];
    end_time: string option [@default None];
    id: string option [@default None];
    organization: string option [@default None];
    pipeline: string option [@default None];
    _result: string option [@default None];
    run_summary: string option [@default None];
    start_time: string option [@default None];
    state: string option [@default None];
    _type: string option [@default None];
    commit_id: string option [@default None];
    _class: string option [@default None];
} [@@deriving yojson { strict = false }, show ];;

let create () : t = {
    duration_in_millis = None;
    estimated_duration_in_millis = None;
    en_queue_time = None;
    end_time = None;
    id = None;
    organization = None;
    pipeline = None;
    _result = None;
    run_summary = None;
    start_time = None;
    state = None;
    _type = None;
    commit_id = None;
    _class = None;
}

