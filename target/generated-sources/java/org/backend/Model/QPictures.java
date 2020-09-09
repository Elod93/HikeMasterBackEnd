package org.backend.Model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPictures is a Querydsl query type for Pictures
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPictures extends EntityPathBase<Pictures> {

    private static final long serialVersionUID = 1374673278L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPictures pictures = new QPictures("pictures");

    public final QHikeRoute hikeRoute;

    public final BooleanPath isApprove = createBoolean("isApprove");

    public final StringPath name = createString("name");

    public final ArrayPath<byte[], Byte> picByte = createArray("picByte", byte[].class);

    public final NumberPath<Long> picturesId = createNumber("picturesId", Long.class);

    public final StringPath type = createString("type");

    public QPictures(String variable) {
        this(Pictures.class, forVariable(variable), INITS);
    }

    public QPictures(Path<? extends Pictures> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPictures(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPictures(PathMetadata metadata, PathInits inits) {
        this(Pictures.class, metadata, inits);
    }

    public QPictures(Class<? extends Pictures> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.hikeRoute = inits.isInitialized("hikeRoute") ? new QHikeRoute(forProperty("hikeRoute")) : null;
    }

}

