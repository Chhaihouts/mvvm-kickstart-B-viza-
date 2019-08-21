package com.planbcambodia.projectkickstart.data.repository;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/planbcambodia/projectkickstart/data/repository/Repository;", "", "getService", "Lio/reactivex/Observable;", "Lcom/planbcambodia/projectkickstart/data/model/base/BaseModel;", "", "Lcom/planbcambodia/projectkickstart/data/model/Service;", "app_debug"})
public abstract interface Repository {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "service")
    public abstract io.reactivex.Observable<com.planbcambodia.projectkickstart.data.model.base.BaseModel<java.util.List<com.planbcambodia.projectkickstart.data.model.Service>>> getService();
}