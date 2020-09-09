package org.backend.Model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPictureURL is a Querydsl query type for PictureURL
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPictureURL extends EntityPathBase<PictureURL> {

    private static final long serialVersionUID = -1788933222L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPictureURL pictureURL = new QPictureURL("pictureURL");

    public final QHikeRoute hikeRoute;

    public final NumberPath<Long> pictureId = createNumber("pictureId", Long.class);

    public final SimplePath<java.net.URL> pictureUrl = createSimple("pictureUrl", java.net.URL.class);

    public final NumberPath<Long> urlId = createNumber("urlId", Long.class);

    public QPictureURL(String variable) {
        this(PictureURL.class, forVariable(variable), INITS);
    }

    public QPictureURL(Path<? extends PictureURL> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPictureURL(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPictureURL(PathMetadata metadata, PathInits inits) {
        this(PictureURL.class, metadata, inits);
    }

    public QPictureURL(Class<? extends PictureURL> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.hikeRoute = inits.isInitialized("hikeRoute") ? new QHikeRoute(forProperty("hikeRoute")) : null;
    }

}

