(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

type t = {
    _class: string option [@default None];
    causes: Cause_user_id_cause.t list;
} [@@deriving yojson { strict = false }, show ];;

let create () : t = {
    _class = None;
    causes = [];
}

