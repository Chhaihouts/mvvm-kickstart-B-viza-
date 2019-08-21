package com.planbcambodia.projectkickstart.di.module;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/planbcambodia/projectkickstart/di/module/MainActivityModule;", "", "()V", "bindMainViewModel", "Landroid/arch/lifecycle/ViewModel;", "viewModel", "Lcom/planbcambodia/projectkickstart/viewmodel/MainViewModel;", "app_debug"})
@dagger.Module()
public abstract class MainActivityModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.planbcambodia.projectkickstart.di.viewmodelfactory.ViewModelKey(value = com.planbcambodia.projectkickstart.viewmodel.MainViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel bindMainViewModel(@org.jetbrains.annotations.NotNull()
    com.planbcambodia.projectkickstart.viewmodel.MainViewModel viewModel);
    
    public MainActivityModule() {
        super();
    }
}