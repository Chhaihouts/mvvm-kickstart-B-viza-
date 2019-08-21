package com.planbcambodia.projectkickstart.di.module;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\r\u0010\b\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/planbcambodia/projectkickstart/di/module/NetworkModule;", "", "()V", "provideRepository", "Lcom/planbcambodia/projectkickstart/data/repository/Repository;", "retrofit", "Lretrofit2/Retrofit;", "provideRepository$app_debug", "provideRetrofitInterface", "provideRetrofitInterface$app_debug", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.planbcambodia.projectkickstart.data.repository.Repository provideRepository$app_debug(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofitInterface$app_debug() {
        return null;
    }
    
    public NetworkModule() {
        super();
    }
}