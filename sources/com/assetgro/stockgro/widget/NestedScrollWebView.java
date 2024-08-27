package com.assetgro.stockgro.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import d4.y;
import d4.z;
import in.juspay.hyper.constants.LogCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import s0.g;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\rB\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"Lcom/assetgro/stockgro/widget/NestedScrollWebView;", "Landroid/webkit/WebView;", "Ld4/y;", HttpUrl.FRAGMENT_ENCODE_SET, "enabled", HttpUrl.FRAGMENT_ENCODE_SET, "setNestedScrollingEnabled", "Landroid/content/Context;", LogCategory.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ni/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class NestedScrollWebView extends WebView implements y {

    /* renamed from: a, reason: collision with root package name */
    public int f10665a;

    /* renamed from: b, reason: collision with root package name */
    public int f10666b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f10667c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f10668d;

    /* renamed from: e, reason: collision with root package name */
    public int f10669e;

    /* renamed from: f, reason: collision with root package name */
    public final z f10670f;

    static {
        Intrinsics.checkNotNullExpressionValue("NestedScrollWebView", "getSimpleName(...)");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollWebView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f10667c = new int[2];
        this.f10668d = new int[2];
        this.f10670f = new z(this);
        setNestedScrollingEnabled(true);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f10670f.a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f10670f.b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f10670f.c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f10670f.e(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f10670f.g(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f10670f.f13868d;
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        MotionEvent obtain = MotionEvent.obtain(event);
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f10669e = 0;
        }
        int x10 = (int) event.getX();
        int y10 = (int) event.getY();
        event.offsetLocation(g.f34069a, this.f10669e);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3 && actionMasked != 5) {
                        return false;
                    }
                } else {
                    int i10 = this.f10666b - y10;
                    if (Math.abs(i10) > Math.abs(this.f10665a - x10) && (canScrollVertically(1) || canScrollVertically(-1))) {
                        requestDisallowInterceptTouchEvent(true);
                    }
                    int[] iArr = this.f10668d;
                    int[] iArr2 = this.f10667c;
                    if (dispatchNestedPreScroll(0, i10, iArr, iArr2)) {
                        i10 -= iArr[1];
                        obtain.offsetLocation(g.f34069a, iArr2[1]);
                        this.f10669e += iArr2[1];
                    }
                    this.f10666b = y10 - iArr2[1];
                    int scrollY = getScrollY();
                    int max = Math.max(0, scrollY + i10) - scrollY;
                    if (dispatchNestedScroll(0, max, 0, i10 - max, this.f10667c)) {
                        int i11 = this.f10666b;
                        int i12 = iArr2[1];
                        this.f10666b = i11 - i12;
                        obtain.offsetLocation(g.f34069a, i12);
                        this.f10669e += iArr2[1];
                    }
                    boolean onTouchEvent = super.onTouchEvent(obtain);
                    obtain.recycle();
                    return onTouchEvent;
                }
            }
            stopNestedScroll();
            requestDisallowInterceptTouchEvent(false);
            return super.onTouchEvent(event);
        }
        this.f10665a = x10;
        this.f10666b = y10;
        startNestedScroll(2);
        return super.onTouchEvent(event);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean enabled) {
        this.f10670f.h(enabled);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return this.f10670f.i(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f10670f.j(0);
    }
}
