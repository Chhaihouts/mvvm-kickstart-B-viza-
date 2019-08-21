package com.planbcambodia.projectkickstart.di.module;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'\u00a8\u0006\u0005"}, d2 = {"Lcom/planbcambodia/projectkickstart/di/module/ActivitiesBindingModule;", "", "()V", "mainActivity", "Lcom/planbcambodia/projectkickstart/view/ui/activity/MainActivity;", "app_debug"})
@dagger.Module()
public abstract class ActivitiesBindingModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.planbcambodia.projectkickstart.di.module.MainActivityModule.class})
    public abstract com.planbcambodia.projectkickstart.view.ui.activity.MainActivity mainActivity();
    
    public ActivitiesBindingModule() {
        super();
    }
}