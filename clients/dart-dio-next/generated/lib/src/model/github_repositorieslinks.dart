//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:openapi/src/model/link.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'github_repositorieslinks.g.dart';

/// GithubRepositorieslinks
///
/// Properties:
/// * [self] 
/// * [class_] 
abstract class GithubRepositorieslinks implements Built<GithubRepositorieslinks, GithubRepositorieslinksBuilder> {
    @BuiltValueField(wireName: r'self')
    Link? get self;

    @BuiltValueField(wireName: r'_class')
    String? get class_;

    GithubRepositorieslinks._();

    @BuiltValueHook(initializeBuilder: true)
    static void _defaults(GithubRepositorieslinksBuilder b) => b;

    factory GithubRepositorieslinks([void updates(GithubRepositorieslinksBuilder b)]) = _$GithubRepositorieslinks;

    @BuiltValueSerializer(custom: true)
    static Serializer<GithubRepositorieslinks> get serializer => _$GithubRepositorieslinksSerializer();
}

class _$GithubRepositorieslinksSerializer implements StructuredSerializer<GithubRepositorieslinks> {
    @override
    final Iterable<Type> types = const [GithubRepositorieslinks, _$GithubRepositorieslinks];

    @override
    final String wireName = r'GithubRepositorieslinks';

    @override
    Iterable<Object?> serialize(Serializers serializers, GithubRepositorieslinks object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
        if (object.self != null) {
            result
                ..add(r'self')
                ..add(serializers.serialize(object.self,
                    specifiedType: const FullType(Link)));
        }
        if (object.class_ != null) {
            result
                ..add(r'_class')
                ..add(serializers.serialize(object.class_,
                    specifiedType: const FullType(String)));
        }
        return result;
    }

    @override
    GithubRepositorieslinks deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = GithubRepositorieslinksBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final Object? value = iterator.current;
            
            switch (key) {
                case r'self':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(Link)) as Link;
                    result.self.replace(valueDes);
                    break;
                case r'_class':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    result.class_ = valueDes;
                    break;
            }
        }
        return result.build();
    }
}

