package org.backend.Model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHikeRoute is a Querydsl query type for HikeRoute
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QHikeRoute extends EntityPathBase<HikeRoute> {

    private static final long serialVersionUID = -711807035L;

    public static final QHikeRoute hikeRoute = new QHikeRoute("hikeRoute");

    public final StringPath createdBy = createString("createdBy");

    public final StringPath difficulty = createString("difficulty");

    public final NumberPath<Double> endLat = createNumber("endLat", Double.class);

    public final NumberPath<Double> endLong = createNumber("endLong", Double.class);

    public final NumberPath<Integer> levelRise = createNumber("levelRise", Integer.class);

    public final ListPath<Message, QMessage> messages = this.<Message, QMessage>createList("messages", Message.class, QMessage.class, PathInits.DIRECT2);

    public final ListPath<PictureURL, QPictureURL> pictureUrlList = this.<PictureURL, QPictureURL>createList("pictureUrlList", PictureURL.class, QPictureURL.class, PathInits.DIRECT2);

    public final NumberPath<Integer> rate = createNumber("rate", Integer.class);

    public final NumberPath<Long> routeId = createNumber("routeId", Long.class);

    public final StringPath routeType = createString("routeType");

    public final NumberPath<Double> startLat = createNumber("startLat", Double.class);

    public final NumberPath<Double> startLong = createNumber("startLong", Double.class);

    public final StringPath text = createString("text");

    public final StringPath title = createString("title");

    public final DateTimePath<java.time.LocalDateTime> tourDate = createDateTime("tourDate", java.time.LocalDateTime.class);

    public final NumberPath<Double> tourLength = createNumber("tourLength", Double.class);

    public final StringPath tourType = createString("tourType");

    public final SetPath<HikeMasterUser, QHikeMasterUser> wisherUsers = this.<HikeMasterUser, QHikeMasterUser>createSet("wisherUsers", HikeMasterUser.class, QHikeMasterUser.class, PathInits.DIRECT2);

    public QHikeRoute(String variable) {
        super(HikeRoute.class, forVariable(variable));
    }

    public QHikeRoute(Path<? extends HikeRoute> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHikeRoute(PathMetadata metadata) {
        super(HikeRoute.class, metadata);
    }

}

