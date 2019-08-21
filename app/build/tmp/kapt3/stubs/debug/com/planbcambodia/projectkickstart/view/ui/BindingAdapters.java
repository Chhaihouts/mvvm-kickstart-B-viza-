package com.planbcambodia.projectkickstart.view.ui;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nH\u0007J\f\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\u0006\u00a8\u0006\r"}, d2 = {"Lcom/planbcambodia/projectkickstart/view/ui/BindingAdapters;", "", "()V", "getMutableVisibility", "", "view", "Landroid/view/View;", "setMutableVisibility", "", "visibility", "Landroid/arch/lifecycle/MutableLiveData;", "getParentActivity", "Landroid/support/v7/app/AppCompatActivity;", "app_debug"})
public final class BindingAdapters {
    public static final com.planbcambodia.projectkickstart.view.ui.BindingAdapters INSTANCE = null;
    
    @android.databinding.BindingAdapter(value = {"mutableVisibility"})
    public static final void setMutableVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.arch.lifecycle.MutableLiveData<java.lang.Integer> visibility) {
    }
    
    @android.databinding.InverseBindingAdapter(attribute = "mutableVisibility")
    public static final int getMutableVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.support.v7.app.AppCompatActivity getParentActivity(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver) {
        return null;
    }
    
    private BindingAdapters() {
        super();
    }
}