=begin comment

Swaggy Jenkins

Jenkins API clients generated from Swagger / Open API specification

The version of the OpenAPI document: 1.5.1-pre.0
Contact: blah@cliffano.com
Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# Do not edit the class manually.
# Ref: https://openapi-generator.tech
#
package WWW::OpenAPIClient::Object::HudsonMasterComputer;

require 5.6.0;
use strict;
use warnings;
use utf8;
use JSON qw(decode_json);
use Data::Dumper;
use Module::Runtime qw(use_module);
use Log::Any qw($log);
use Date::Parse;
use DateTime;

use WWW::OpenAPIClient::Object::HudsonMasterComputerexecutors;
use WWW::OpenAPIClient::Object::HudsonMasterComputermonitorData;
use WWW::OpenAPIClient::Object::Label1;

use base ("Class::Accessor", "Class::Data::Inheritable");

#
#
#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech). Do not edit the class manually.
# REF: https://openapi-generator.tech
#

=begin comment

Swaggy Jenkins

Jenkins API clients generated from Swagger / Open API specification

The version of the OpenAPI document: 1.5.1-pre.0
Contact: blah@cliffano.com
Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# Do not edit the class manually.
# Ref: https://openapi-generator.tech
#
__PACKAGE__->mk_classdata('attribute_map' => {});
__PACKAGE__->mk_classdata('openapi_types' => {});
__PACKAGE__->mk_classdata('method_documentation' => {});
__PACKAGE__->mk_classdata('class_documentation' => {});

# new plain object
sub new {
    my ($class, %args) = @_;

    my $self = bless {}, $class;

    $self->init(%args);

    return $self;
}

# initialize the object
sub init
{
    my ($self, %args) = @_;

    foreach my $attribute (keys %{$self->attribute_map}) {
        my $args_key = $self->attribute_map->{$attribute};
        $self->$attribute( $args{ $args_key } );
    }
}

# return perl hash
sub to_hash {
    my $self = shift;
    my $_hash = decode_json(JSON->new->convert_blessed->encode($self));

    return $_hash;
}

# used by JSON for serialization
sub TO_JSON {
    my $self = shift;
    my $_data = {};
    foreach my $_key (keys %{$self->attribute_map}) {
        if (defined $self->{$_key}) {
            $_data->{$self->attribute_map->{$_key}} = $self->{$_key};
        }
    }

    return $_data;
}

# from Perl hashref
sub from_hash {
    my ($self, $hash) = @_;

    # loop through attributes and use openapi_types to deserialize the data
    while ( my ($_key, $_type) = each %{$self->openapi_types} ) {
        my $_json_attribute = $self->attribute_map->{$_key};
        if ($_type =~ /^array\[(.+)\]$/i) { # array
            my $_subclass = $1;
            my @_array = ();
            foreach my $_element (@{$hash->{$_json_attribute}}) {
                push @_array, $self->_deserialize($_subclass, $_element);
            }
            $self->{$_key} = \@_array;
        } elsif ($_type =~ /^hash\[string,(.+)\]$/i) { # hash
            my $_subclass = $1;
            my %_hash = ();
            while (my($_key, $_element) = each %{$hash->{$_json_attribute}}) {
                $_hash{$_key} = $self->_deserialize($_subclass, $_element);
            }
            $self->{$_key} = \%_hash;
        } elsif (exists $hash->{$_json_attribute}) { #hash(model), primitive, datetime
            $self->{$_key} = $self->_deserialize($_type, $hash->{$_json_attribute});
        } else {
            $log->debugf("Warning: %s (%s) does not exist in input hash\n", $_key, $_json_attribute);
        }
    }

    return $self;
}

# deserialize non-array data
sub _deserialize {
    my ($self, $type, $data) = @_;
    $log->debugf("deserializing %s with %s",Dumper($data), $type);

    if ($type eq 'DateTime') {
        return DateTime->from_epoch(epoch => str2time($data));
    } elsif ( grep( /^$type$/, ('int', 'double', 'string', 'boolean'))) {
        return $data;
    } else { # hash(model)
        my $_instance = eval "WWW::OpenAPIClient::Object::$type->new()";
        return $_instance->from_hash($data);
    }
}


__PACKAGE__->class_documentation({description => '',
                                  class => 'HudsonMasterComputer',
                                  required => [], # TODO
}                                 );

__PACKAGE__->method_documentation({
    '_class' => {
        datatype => 'string',
        base_name => '_class',
        description => '',
        format => '',
        read_only => '',
            },
    'display_name' => {
        datatype => 'string',
        base_name => 'displayName',
        description => '',
        format => '',
        read_only => '',
            },
    'executors' => {
        datatype => 'ARRAY[HudsonMasterComputerexecutors]',
        base_name => 'executors',
        description => '',
        format => '',
        read_only => '',
            },
    'icon' => {
        datatype => 'string',
        base_name => 'icon',
        description => '',
        format => '',
        read_only => '',
            },
    'icon_class_name' => {
        datatype => 'string',
        base_name => 'iconClassName',
        description => '',
        format => '',
        read_only => '',
            },
    'idle' => {
        datatype => 'boolean',
        base_name => 'idle',
        description => '',
        format => '',
        read_only => '',
            },
    'jnlp_agent' => {
        datatype => 'boolean',
        base_name => 'jnlpAgent',
        description => '',
        format => '',
        read_only => '',
            },
    'launch_supported' => {
        datatype => 'boolean',
        base_name => 'launchSupported',
        description => '',
        format => '',
        read_only => '',
            },
    'load_statistics' => {
        datatype => 'Label1',
        base_name => 'loadStatistics',
        description => '',
        format => '',
        read_only => '',
            },
    'manual_launch_allowed' => {
        datatype => 'boolean',
        base_name => 'manualLaunchAllowed',
        description => '',
        format => '',
        read_only => '',
            },
    'monitor_data' => {
        datatype => 'HudsonMasterComputermonitorData',
        base_name => 'monitorData',
        description => '',
        format => '',
        read_only => '',
            },
    'num_executors' => {
        datatype => 'int',
        base_name => 'numExecutors',
        description => '',
        format => '',
        read_only => '',
            },
    'offline' => {
        datatype => 'boolean',
        base_name => 'offline',
        description => '',
        format => '',
        read_only => '',
            },
    'offline_cause' => {
        datatype => 'string',
        base_name => 'offlineCause',
        description => '',
        format => '',
        read_only => '',
            },
    'offline_cause_reason' => {
        datatype => 'string',
        base_name => 'offlineCauseReason',
        description => '',
        format => '',
        read_only => '',
            },
    'temporarily_offline' => {
        datatype => 'boolean',
        base_name => 'temporarilyOffline',
        description => '',
        format => '',
        read_only => '',
            },
});

__PACKAGE__->openapi_types( {
    '_class' => 'string',
    'display_name' => 'string',
    'executors' => 'ARRAY[HudsonMasterComputerexecutors]',
    'icon' => 'string',
    'icon_class_name' => 'string',
    'idle' => 'boolean',
    'jnlp_agent' => 'boolean',
    'launch_supported' => 'boolean',
    'load_statistics' => 'Label1',
    'manual_launch_allowed' => 'boolean',
    'monitor_data' => 'HudsonMasterComputermonitorData',
    'num_executors' => 'int',
    'offline' => 'boolean',
    'offline_cause' => 'string',
    'offline_cause_reason' => 'string',
    'temporarily_offline' => 'boolean'
} );

__PACKAGE__->attribute_map( {
    '_class' => '_class',
    'display_name' => 'displayName',
    'executors' => 'executors',
    'icon' => 'icon',
    'icon_class_name' => 'iconClassName',
    'idle' => 'idle',
    'jnlp_agent' => 'jnlpAgent',
    'launch_supported' => 'launchSupported',
    'load_statistics' => 'loadStatistics',
    'manual_launch_allowed' => 'manualLaunchAllowed',
    'monitor_data' => 'monitorData',
    'num_executors' => 'numExecutors',
    'offline' => 'offline',
    'offline_cause' => 'offlineCause',
    'offline_cause_reason' => 'offlineCauseReason',
    'temporarily_offline' => 'temporarilyOffline'
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;
