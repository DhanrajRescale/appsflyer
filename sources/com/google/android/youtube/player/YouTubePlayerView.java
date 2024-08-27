package com.google.android.youtube.player;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.flipkart.youtubeview.activity.YouTubeActivity;
import ip.b;
import ip.c;
import ip.e;
import ip.h;
import java.util.ArrayList;
import java.util.HashSet;
import jp.k;
import jp.l;
import jp.t;

/* loaded from: classes2.dex */
public final class YouTubePlayerView extends ViewGroup {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f11614k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final h f11615a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f11616b;

    /* renamed from: c, reason: collision with root package name */
    public final b f11617c;

    /* renamed from: d, reason: collision with root package name */
    public l f11618d;

    /* renamed from: e, reason: collision with root package name */
    public t f11619e;

    /* renamed from: f, reason: collision with root package name */
    public View f11620f;

    /* renamed from: g, reason: collision with root package name */
    public final k f11621g;

    /* renamed from: h, reason: collision with root package name */
    public Bundle f11622h;

    /* renamed from: i, reason: collision with root package name */
    public e f11623i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11624j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (context instanceof c) {
            b bVar = ((c) context).f20464a;
            if (context != null) {
                if (bVar != null) {
                    this.f11617c = bVar;
                    if (getBackground() == null) {
                        setBackgroundColor(-16777216);
                    }
                    setClipToPadding(false);
                    k kVar = new k(context);
                    this.f11621g = kVar;
                    requestTransparentRegion(kVar);
                    addView(kVar);
                    this.f11616b = new HashSet();
                    this.f11615a = new h(this);
                    return;
                }
                throw new NullPointerException("listener cannot be null");
            }
            throw new NullPointerException("context cannot be null");
        }
        throw new IllegalStateException("A YouTubePlayerView can only be created with an Activity  which extends YouTubeBaseActivity as its context.");
    }

    public final void a() {
        this.f11619e = null;
        k kVar = this.f11621g;
        kVar.f21539a.setVisibility(8);
        kVar.f21540b.setVisibility(0);
        e eVar = this.f11623i;
        if (eVar != null) {
            ((YouTubeActivity) eVar).f10968f = null;
            this.f11623i = null;
        }
    }

    @Override // android.view.View
    public final void addFocusables(ArrayList arrayList, int i10) {
        ArrayList<View> arrayList2 = new ArrayList<>();
        super.addFocusables(arrayList2, i10);
        arrayList.addAll(arrayList2);
        HashSet hashSet = this.f11616b;
        hashSet.clear();
        hashSet.addAll(arrayList2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b(view);
        super.addView(view);
    }

    public final void b(View view) {
        if (view != this.f11621g) {
            if (this.f11619e == null || view != this.f11620f) {
                throw new UnsupportedOperationException("No views can be added on top of the player");
            }
        }
    }

    public final void c() {
        t tVar = this.f11619e;
        if (tVar != null) {
            tVar.getClass();
            try {
                jp.b bVar = (jp.b) tVar.f21565b;
                bVar.getClass();
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    bVar.f21533a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void clearChildFocus(View view) {
        if (hasFocusable()) {
            requestFocus();
        } else {
            super.clearChildFocus(view);
        }
    }

    public final void d() {
        t tVar = this.f11619e;
        if (tVar != null) {
            tVar.getClass();
            try {
                jp.b bVar = (jp.b) tVar.f21565b;
                bVar.getClass();
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    bVar.f21533a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f11619e != null) {
            if (keyEvent.getAction() == 0) {
                t tVar = this.f11619e;
                int keyCode = keyEvent.getKeyCode();
                tVar.getClass();
                try {
                    if (!((jp.b) tVar.f21565b).m(keyCode, keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                        return false;
                    }
                    return true;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }
            if (keyEvent.getAction() == 1) {
                t tVar2 = this.f11619e;
                int keyCode2 = keyEvent.getKeyCode();
                tVar2.getClass();
                try {
                    if (!((jp.b) tVar2.f21565b).p(keyCode2, keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                        return false;
                    }
                    return true;
                } catch (RemoteException e11) {
                    throw new RuntimeException(e11);
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void focusableViewAvailable(View view) {
        super.focusableViewAvailable(view);
        this.f11616b.add(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.f11615a);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        t tVar = this.f11619e;
        if (tVar != null) {
            tVar.getClass();
            try {
                ((jp.b) tVar.f21565b).i(configuration);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.f11615a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (getChildCount() > 0) {
            getChildAt(0).layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (getChildCount() <= 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        View childAt = getChildAt(0);
        childAt.measure(i10, i11);
        setMeasuredDimension(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        this.f11616b.add(view2);
    }

    @Override // android.view.ViewGroup
    public final void setClipToPadding(boolean z10) {
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        ArrayList<View> arrayList2 = new ArrayList<>();
        super.addFocusables(arrayList2, i10, i11);
        arrayList.addAll(arrayList2);
        HashSet hashSet = this.f11616b;
        hashSet.clear();
        hashSet.addAll(arrayList2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        b(view);
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, int i11) {
        b(view);
        super.addView(view, i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        b(view);
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b(view);
        super.addView(view, layoutParams);
    }
}
