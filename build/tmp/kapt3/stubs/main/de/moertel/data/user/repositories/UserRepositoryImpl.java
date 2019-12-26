package de.moertel.data.user.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lde/moertel/data/user/repositories/UserRepositoryImpl;", "Lde/moertel/data/user/UserRepository;", "userCollection", "Lorg/litote/kmongo/coroutine/CoroutineCollection;", "Lde/moertel/data/user/model/User;", "(Lorg/litote/kmongo/coroutine/CoroutineCollection;)V", "createUser", "Lcom/mongodb/reactivestreams/client/Success;", "user", "(Lde/moertel/data/user/model/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryUser", "Larrow/core/Option;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktortest"})
public final class UserRepositoryImpl implements de.moertel.data.user.UserRepository {
    private final org.litote.kmongo.coroutine.CoroutineCollection<de.moertel.data.user.model.User> userCollection = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object createUser(@org.jetbrains.annotations.NotNull()
    de.moertel.data.user.model.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mongodb.reactivestreams.client.Success> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object queryUser(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super arrow.core.Option<de.moertel.data.user.model.User>> p1) {
        return null;
    }
    
    public UserRepositoryImpl(@org.jetbrains.annotations.NotNull()
    org.litote.kmongo.coroutine.CoroutineCollection<de.moertel.data.user.model.User> userCollection) {
        super();
    }
}