package com.planbcambodia.projectkickstart.di.component;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/planbcambodia/projectkickstart/di/component/AppComponent;", "Ldagger/android/AndroidInjector;", "Lcom/planbcambodia/projectkickstart/app/App;", "Builder", "app_debug"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, com.planbcambodia.projectkickstart.di.module.AppModule.class, com.planbcambodia.projectkickstart.di.module.NetworkModule.class, com.planbcambodia.projectkickstart.di.module.ActivitiesBindingModule.class, com.planbcambodia.projectkickstart.di.viewmodelfactory.ViewModelBuilder.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends dagger.android.AndroidInjector<com.planbcambodia.projectkickstart.app.App> {
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/planbcambodia/projectkickstart/di/component/AppComponent$Builder;", "", "build", "Lcom/planbcambodia/projectkickstart/di/component/AppComponent;", "create", "app", "Landroid/app/Application;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.planbcambodia.projectkickstart.di.component.AppComponent.Builder create(@org.jetbrains.annotations.NotNull()
        android.app.Application app);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.planbcambodia.projectkickstart.di.component.AppComponent build();
    }
}