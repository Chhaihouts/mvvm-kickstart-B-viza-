package com.planbcambodia.projectkickstart.viewmodel;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002Jl\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\n2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r0\f2\'\u0010\u000e\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\n0\r\u00a2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00060\u000f2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00060\u000fJ\b\u0010\u0015\u001a\u00020\u0006H\u0014J\b\u0010\u0016\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/planbcambodia/projectkickstart/viewmodel/NetworkViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "subscription", "Lio/reactivex/disposables/CompositeDisposable;", "addDisposable", "", "d", "Lio/reactivex/disposables/Disposable;", "callApi", "T", "api", "Lio/reactivex/Observable;", "Lcom/planbcambodia/projectkickstart/data/model/base/BaseModel;", "onNext", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "t", "onError", "", "onCleared", "onCreate", "app_debug"})
public class NetworkViewModel extends android.arch.lifecycle.ViewModel {
    private io.reactivex.disposables.CompositeDisposable subscription;
    
    private final void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.disposables.Disposable callApi(@org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<com.planbcambodia.projectkickstart.data.model.base.BaseModel<T>> api, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.planbcambodia.projectkickstart.data.model.base.BaseModel<T>, kotlin.Unit> onNext, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError) {
        return null;
    }
    
    private final void addDisposable(io.reactivex.disposables.Disposable d) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public NetworkViewModel() {
        super();
    }
}