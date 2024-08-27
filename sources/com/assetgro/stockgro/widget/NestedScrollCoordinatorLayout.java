package com.assetgro.stockgro.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d4.y;
import d4.z;
import in.juspay.hyper.constants.LogCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"Lcom/assetgro/stockgro/widget/NestedScrollCoordinatorLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "enabled", HttpUrl.FRAGMENT_ENCODE_SET, "setNestedScrollingEnabled", "Landroid/content/Context;", LogCategory.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class NestedScrollCoordinatorLayout extends CoordinatorLayout implements y {

    /* renamed from: y, reason: collision with root package name */
    public final z f10664y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.c(context);
        this.f10664y = new z(this);
        setNestedScrollingEnabled(true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, d4.a0
    public final void d(View target, int i10, int i11, int i12, int i13, int i14) {
        Intrinsics.checkNotNullParameter(target, "target");
        super.d(target, i10, i11, i12, i13, i14);
        this.f10664y.e(i10, i11, i12, i13, null, i14, null);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f10664y.a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f10664y.b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f10664y.c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f10664y.e(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, d4.a0
    public final boolean e(View child, View target, int i10, int i11) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        boolean e10 = super.e(child, target, i10, i11);
        if (!this.f10664y.i(i10, i11) && !e10) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, d4.a0
    public final void g(View target, int i10) {
        Intrinsics.checkNotNullParameter(target, "target");
        super.g(target, i10);
        this.f10664y.j(i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, d4.a0
    public final void h(View target, int i10, int i11, int[] consumed, int i12) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        this.f10664y.c(i10, i11, i12, consumed, null);
        if (consumed[1] == 0) {
            super.h(target, i10, i11, consumed, i12);
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f10664y.g(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f10664y.f13868d;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View target, float f10, float f11, boolean z10) {
        Intrinsics.checkNotNullParameter(target, "target");
        super.onNestedFling(target, f10, f11, z10);
        return this.f10664y.a(f10, f11, z10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View target, float f10, float f11) {
        Intrinsics.checkNotNullParameter(target, "target");
        boolean onNestedPreFling = super.onNestedPreFling(target, f10, f11);
        if (!this.f10664y.b(f10, f11) && !onNestedPreFling) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View target, int i10, int i11, int[] consumed) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        dispatchNestedPreScroll(i10, i11, consumed, null);
        if (consumed[1] == 0) {
            super.h(target, i10, i11, consumed, 0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View target, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(target, "target");
        d(target, i10, i11, i12, i13, 0);
        dispatchNestedScroll(i10, i11, i12, i13, null);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View child, View target, int i10) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        boolean e10 = e(child, target, i10, 0);
        if (!startNestedScroll(i10) && !e10) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View target) {
        Intrinsics.checkNotNullParameter(target, "target");
        g(target, 0);
        stopNestedScroll();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean enabled) {
        this.f10664y.h(enabled);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return this.f10664y.i(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f10664y.j(0);
    }
}
