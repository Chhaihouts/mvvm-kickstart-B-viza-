package com.planbcambodia.projectkickstart.viewmodel;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0006\u0010\u0018\u001a\u00020\u0017R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0004R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\t\u00a8\u0006\u0019"}, d2 = {"Lcom/planbcambodia/projectkickstart/viewmodel/MainViewModel;", "Lcom/planbcambodia/projectkickstart/viewmodel/NetworkViewModel;", "repository", "Lcom/planbcambodia/projectkickstart/data/repository/Repository;", "(Lcom/planbcambodia/projectkickstart/data/repository/Repository;)V", "loadingVisibility", "Landroid/arch/lifecycle/MutableLiveData;", "", "getLoadingVisibility", "()Landroid/arch/lifecycle/MutableLiveData;", "name", "", "getName", "getRepository", "()Lcom/planbcambodia/projectkickstart/data/repository/Repository;", "setRepository", "services", "", "Lcom/planbcambodia/projectkickstart/data/model/Service;", "getServices", "status", "getStatus", "onCreate", "", "onOKClicked", "app_debug"})
public final class MainViewModel extends com.planbcambodia.projectkickstart.viewmodel.NetworkViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Integer> loadingVisibility = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.util.List<com.planbcambodia.projectkickstart.data.model.Service>> services = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.String> name = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.String> status = null;
    @org.jetbrains.annotations.NotNull()
    private com.planbcambodia.projectkickstart.data.repository.Repository repository;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Integer> getLoadingVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.util.List<com.planbcambodia.projectkickstart.data.model.Service>> getServices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.String> getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.String> getStatus() {
        return null;
    }
    
    private final void onCreate() {
    }
    
    public final void onOKClicked() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.planbcambodia.projectkickstart.data.repository.Repository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.planbcambodia.projectkickstart.data.repository.Repository p0) {
    }
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.planbcambodia.projectkickstart.data.repository.Repository repository) {
        super();
    }
}