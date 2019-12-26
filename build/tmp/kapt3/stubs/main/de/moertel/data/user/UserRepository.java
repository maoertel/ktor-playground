package de.moertel.data.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lde/moertel/data/user/UserRepository;", "", "createUser", "Lcom/mongodb/reactivestreams/client/Success;", "user", "Lde/moertel/data/user/model/User;", "(Lde/moertel/data/user/model/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryUser", "Larrow/core/Option;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktortest"})
public abstract interface UserRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createUser(@org.jetbrains.annotations.NotNull()
    de.moertel.data.user.model.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mongodb.reactivestreams.client.Success> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryUser(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super arrow.core.Option<de.moertel.data.user.model.User>> p1);
}