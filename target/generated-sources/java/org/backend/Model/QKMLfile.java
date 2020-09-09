package org.backend.Model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QKMLfile is a Querydsl query type for KMLfile
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QKMLfile extends EntityPathBase<KMLfile> {

    private static final long serialVersionUID = 602527837L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QKMLfile kMLfile = new QKMLfile("kMLfile");

    public final QHikeRoute hikeRoute;

    public final NumberPath<Long> kml_Id = createNumber("kml_Id", Long.class);

    public final StringPath routeKMLInString = createString("routeKMLInString");

    public QKMLfile(String variable) {
        this(KMLfile.class, forVariable(variable), INITS);
    }

    public QKMLfile(Path<? extends KMLfile> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QKMLfile(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QKMLfile(PathMetadata metadata, PathInits inits) {
        this(KMLfile.class, metadata, inits);
    }

    public QKMLfile(Class<? extends KMLfile> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.hikeRoute = inits.isInitialized("hikeRoute") ? new QHikeRoute(forProperty("hikeRoute")) : null;
    }

}

