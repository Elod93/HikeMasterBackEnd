package org.backend.Model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMessage is a Querydsl query type for Message
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMessage extends EntityPathBase<Message> {

    private static final long serialVersionUID = -1193935714L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMessage message = new QMessage("message");

    public final QHikeRoute hikeRoute;

    public final NumberPath<Long> massageId = createNumber("massageId", Long.class);

    public final DateTimePath<java.time.LocalDateTime> messageDate = createDateTime("messageDate", java.time.LocalDateTime.class);

    public final StringPath text = createString("text");

    public final StringPath userName = createString("userName");

    public QMessage(String variable) {
        this(Message.class, forVariable(variable), INITS);
    }

    public QMessage(Path<? extends Message> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMessage(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMessage(PathMetadata metadata, PathInits inits) {
        this(Message.class, metadata, inits);
    }

    public QMessage(Class<? extends Message> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.hikeRoute = inits.isInitialized("hikeRoute") ? new QHikeRoute(forProperty("hikeRoute")) : null;
    }

}

