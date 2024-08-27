package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class o extends Dialog implements androidx.lifecycle.t, y, o7.f {

    /* renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.v f861a;

    /* renamed from: b, reason: collision with root package name */
    public final o7.e f862b;

    /* renamed from: c, reason: collision with root package name */
    public final w f863c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, int i10) {
        super(context, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f862b = x2.c.m(this);
        this.f863c = new w(new b(this, 2));
    }

    public static void a(o this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    public final androidx.lifecycle.v b() {
        androidx.lifecycle.v vVar = this.f861a;
        if (vVar == null) {
            androidx.lifecycle.v vVar2 = new androidx.lifecycle.v(this);
            this.f861a = vVar2;
            return vVar2;
        }
        return vVar;
    }

    public final void d() {
        Window window = getWindow();
        Intrinsics.c(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window!!.decorView");
        yk.j.r1(decorView, this);
        Window window2 = getWindow();
        Intrinsics.c(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window!!.decorView");
        Intrinsics.checkNotNullParameter(decorView2, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        Intrinsics.c(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window!!.decorView");
        yk.g.Z(decorView3, this);
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.o getLifecycle() {
        return b();
    }

    @Override // androidx.activity.y
    public final w getOnBackPressedDispatcher() {
        return this.f863c;
    }

    @Override // o7.f
    public final o7.d getSavedStateRegistry() {
        return this.f862b.f29766b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f863c.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher invoker;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            invoker = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(invoker, "onBackInvokedDispatcher");
            w wVar = this.f863c;
            wVar.getClass();
            Intrinsics.checkNotNullParameter(invoker, "invoker");
            wVar.f883e = invoker;
            wVar.d();
        }
        this.f862b.b(bundle);
        b().f(androidx.lifecycle.m.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f862b.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        b().f(androidx.lifecycle.m.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().f(androidx.lifecycle.m.ON_DESTROY);
        this.f861a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        d();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
