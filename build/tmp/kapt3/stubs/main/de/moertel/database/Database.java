package de.moertel.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lde/moertel/database/Database;", "", "mongoClient", "Lorg/litote/kmongo/coroutine/CoroutineClient;", "(Lorg/litote/kmongo/coroutine/CoroutineClient;)V", "database", "Lorg/litote/kmongo/coroutine/CoroutineDatabase;", "userCollection", "Lorg/litote/kmongo/coroutine/CoroutineCollection;", "Lde/moertel/data/user/model/User;", "getUserCollection", "()Lorg/litote/kmongo/coroutine/CoroutineCollection;", "ktortest"})
public final class Database {
    private final org.litote.kmongo.coroutine.CoroutineDatabase database = null;
    @org.jetbrains.annotations.NotNull()
    private final org.litote.kmongo.coroutine.CoroutineCollection<de.moertel.data.user.model.User> userCollection = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.litote.kmongo.coroutine.CoroutineCollection<de.moertel.data.user.model.User> getUserCollection() {
        return null;
    }
    
    public Database(@org.jetbrains.annotations.NotNull()
    org.litote.kmongo.coroutine.CoroutineClient mongoClient) {
        super();
    }
}