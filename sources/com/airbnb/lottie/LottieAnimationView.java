package com.airbnb.lottie;

import a3.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.assetgro.stockgro.prod.R;
import d2.f1;
import j9.a0;
import j9.b;
import j9.b0;
import j9.d;
import j9.d0;
import j9.e;
import j9.e0;
import j9.f0;
import j9.g0;
import j9.h;
import j9.h0;
import j9.i;
import j9.i0;
import j9.o;
import j9.y;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import m.w;
import n9.s;
import r3.k;
import s0.g;
import w9.f;
import x9.c;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: r, reason: collision with root package name */
    public static final e f8358r = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final d f8359d;

    /* renamed from: e, reason: collision with root package name */
    public final s f8360e;

    /* renamed from: f, reason: collision with root package name */
    public a0 f8361f;

    /* renamed from: g, reason: collision with root package name */
    public int f8362g;

    /* renamed from: h, reason: collision with root package name */
    public final y f8363h;

    /* renamed from: i, reason: collision with root package name */
    public String f8364i;

    /* renamed from: j, reason: collision with root package name */
    public int f8365j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8366k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8367l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8368m;

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f8369n;

    /* renamed from: o, reason: collision with root package name */
    public final HashSet f8370o;

    /* renamed from: p, reason: collision with root package name */
    public d0 f8371p;

    /* renamed from: q, reason: collision with root package name */
    public i f8372q;

    /* JADX WARN: Type inference failed for: r11v1, types: [j9.d] */
    /* JADX WARN: Type inference failed for: r3v9, types: [j9.h0, android.graphics.PorterDuffColorFilter] */
    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String string;
        this.f8359d = new a0() { // from class: j9.d
            @Override // j9.a0
            public final void onResult(Object obj) {
                LottieAnimationView.this.setComposition((i) obj);
            }
        };
        this.f8360e = new s(this, 2);
        this.f8362g = 0;
        y yVar = new y();
        this.f8363h = yVar;
        this.f8366k = false;
        this.f8367l = false;
        this.f8368m = true;
        HashSet hashSet = new HashSet();
        this.f8369n = hashSet;
        this.f8370o = new HashSet();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f0.f21147a, R.attr.lottieAnimationViewStyle, 0);
        this.f8368m = obtainStyledAttributes.getBoolean(1, true);
        boolean hasValue = obtainStyledAttributes.hasValue(12);
        boolean hasValue2 = obtainStyledAttributes.hasValue(7);
        boolean hasValue3 = obtainStyledAttributes.hasValue(17);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(12, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(7);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(17)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(6, 0));
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.f8367l = true;
        }
        if (obtainStyledAttributes.getBoolean(10, false)) {
            yVar.f21225b.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setRepeatMode(obtainStyledAttributes.getInt(15, 1));
        }
        if (obtainStyledAttributes.hasValue(14)) {
            setRepeatCount(obtainStyledAttributes.getInt(14, -1));
        }
        if (obtainStyledAttributes.hasValue(16)) {
            setSpeed(obtainStyledAttributes.getFloat(16, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(2)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(2, true));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            setDefaultFontFileExtension(obtainStyledAttributes.getString(4));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(9));
        boolean hasValue4 = obtainStyledAttributes.hasValue(11);
        float f10 = obtainStyledAttributes.getFloat(11, g.f34069a);
        if (hasValue4) {
            hashSet.add(h.f21160b);
        }
        yVar.x(f10);
        boolean z10 = obtainStyledAttributes.getBoolean(5, false);
        if (yVar.f21235l != z10) {
            yVar.f21235l = z10;
            if (yVar.f21224a != null) {
                yVar.c();
            }
        }
        if (obtainStyledAttributes.hasValue(3)) {
            yVar.a(new p9.e("**"), b0.K, new c((h0) new PorterDuffColorFilter(k.getColorStateList(getContext(), obtainStyledAttributes.getResourceId(3, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (obtainStyledAttributes.hasValue(13)) {
            int i10 = obtainStyledAttributes.getInt(13, 0);
            setRenderMode(g0.values()[i10 >= g0.values().length ? 0 : i10]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(8, false));
        if (obtainStyledAttributes.hasValue(18)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(18, false));
        }
        obtainStyledAttributes.recycle();
        Context context2 = getContext();
        f1 f1Var = f.f38892a;
        yVar.f21226c = Boolean.valueOf(Settings.Global.getFloat(context2.getContentResolver(), "animator_duration_scale", 1.0f) != g.f34069a).booleanValue();
    }

    private void setCompositionTask(d0 d0Var) {
        this.f8369n.add(h.f21159a);
        this.f8372q = null;
        this.f8363h.d();
        b();
        d0Var.b(this.f8359d);
        d0Var.a(this.f8360e);
        this.f8371p = d0Var;
    }

    public final void b() {
        d0 d0Var = this.f8371p;
        if (d0Var != null) {
            d dVar = this.f8359d;
            synchronized (d0Var) {
                d0Var.f21137a.remove(dVar);
            }
            d0 d0Var2 = this.f8371p;
            s sVar = this.f8360e;
            synchronized (d0Var2) {
                d0Var2.f21138b.remove(sVar);
            }
        }
    }

    public final void d() {
        this.f8369n.add(h.f21164f);
        this.f8363h.j();
    }

    public boolean getClipToCompositionBounds() {
        return this.f8363h.f21237n;
    }

    public i getComposition() {
        return this.f8372q;
    }

    public long getDuration() {
        if (this.f8372q != null) {
            return r0.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.f8363h.f21225b.f38883h;
    }

    public String getImageAssetsFolder() {
        return this.f8363h.f21231h;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f8363h.f21236m;
    }

    public float getMaxFrame() {
        return this.f8363h.f21225b.e();
    }

    public float getMinFrame() {
        return this.f8363h.f21225b.f();
    }

    public e0 getPerformanceTracker() {
        i iVar = this.f8363h.f21224a;
        if (iVar != null) {
            return iVar.f21166a;
        }
        return null;
    }

    public float getProgress() {
        return this.f8363h.f21225b.d();
    }

    public g0 getRenderMode() {
        if (this.f8363h.f21244u) {
            return g0.f21157c;
        }
        return g0.f21156b;
    }

    public int getRepeatCount() {
        return this.f8363h.f21225b.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f8363h.f21225b.getRepeatMode();
    }

    public float getSpeed() {
        return this.f8363h.f21225b.f38879d;
    }

    @Override // android.view.View
    public final void invalidate() {
        g0 g0Var;
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof y) {
            boolean z10 = ((y) drawable).f21244u;
            g0 g0Var2 = g0.f21157c;
            if (z10) {
                g0Var = g0Var2;
            } else {
                g0Var = g0.f21156b;
            }
            if (g0Var == g0Var2) {
                this.f8363h.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        y yVar = this.f8363h;
        if (drawable2 == yVar) {
            super.invalidateDrawable(yVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.f8367l) {
            this.f8363h.j();
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof j9.g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j9.g gVar = (j9.g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        this.f8364i = gVar.f21148a;
        HashSet hashSet = this.f8369n;
        h hVar = h.f21159a;
        if (!hashSet.contains(hVar) && !TextUtils.isEmpty(this.f8364i)) {
            setAnimation(this.f8364i);
        }
        this.f8365j = gVar.f21149b;
        if (!hashSet.contains(hVar) && (i10 = this.f8365j) != 0) {
            setAnimation(i10);
        }
        if (!hashSet.contains(h.f21160b)) {
            this.f8363h.x(gVar.f21150c);
        }
        if (!hashSet.contains(h.f21164f) && gVar.f21151d) {
            d();
        }
        if (!hashSet.contains(h.f21163e)) {
            setImageAssetsFolder(gVar.f21152e);
        }
        if (!hashSet.contains(h.f21161c)) {
            setRepeatMode(gVar.f21153f);
        }
        if (!hashSet.contains(h.f21162d)) {
            setRepeatCount(gVar.f21154g);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, j9.g] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f21148a = this.f8364i;
        baseSavedState.f21149b = this.f8365j;
        y yVar = this.f8363h;
        baseSavedState.f21150c = yVar.f21225b.d();
        boolean isVisible = yVar.isVisible();
        w9.c cVar = yVar.f21225b;
        if (isVisible) {
            z10 = cVar.f38888m;
        } else {
            int i10 = yVar.I;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        baseSavedState.f21151d = z10;
        baseSavedState.f21152e = yVar.f21231h;
        baseSavedState.f21153f = cVar.getRepeatMode();
        baseSavedState.f21154g = cVar.getRepeatCount();
        return baseSavedState;
    }

    public void setAnimation(final int i10) {
        d0 e10;
        d0 d0Var;
        this.f8365j = i10;
        this.f8364i = null;
        if (isInEditMode()) {
            d0Var = new d0(new Callable() { // from class: j9.c
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                    boolean z10 = lottieAnimationView.f8368m;
                    int i11 = i10;
                    if (z10) {
                        Context context = lottieAnimationView.getContext();
                        return o.f(context, i11, o.j(i11, context));
                    }
                    return o.f(lottieAnimationView.getContext(), i11, null);
                }
            }, true);
        } else {
            if (this.f8368m) {
                Context context = getContext();
                e10 = o.e(context, i10, o.j(i10, context));
            } else {
                e10 = o.e(getContext(), i10, null);
            }
            d0Var = e10;
        }
        setCompositionTask(d0Var);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setCompositionTask(o.a(null, new j9.f(2, new ByteArrayInputStream(str.getBytes()), null)));
    }

    public void setAnimationFromUrl(String str) {
        d0 a10;
        int i10 = 0;
        if (this.f8368m) {
            Context context = getContext();
            HashMap hashMap = o.f21198a;
            String f10 = a.f("url_", str);
            a10 = o.a(f10, new j9.k(i10, context, str, f10));
        } else {
            a10 = o.a(null, new j9.k(i10, getContext(), str, null));
        }
        setCompositionTask(a10);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f8363h.f21242s = z10;
    }

    public void setCacheComposition(boolean z10) {
        this.f8368m = z10;
    }

    public void setClipToCompositionBounds(boolean z10) {
        y yVar = this.f8363h;
        if (z10 != yVar.f21237n) {
            yVar.f21237n = z10;
            s9.c cVar = yVar.f21238o;
            if (cVar != null) {
                cVar.H = z10;
            }
            yVar.invalidateSelf();
        }
    }

    public void setComposition(@NonNull i iVar) {
        y yVar = this.f8363h;
        yVar.setCallback(this);
        this.f8372q = iVar;
        this.f8366k = true;
        boolean m10 = yVar.m(iVar);
        boolean z10 = false;
        this.f8366k = false;
        if (getDrawable() == yVar && !m10) {
            return;
        }
        if (!m10) {
            w9.c cVar = yVar.f21225b;
            if (cVar != null) {
                z10 = cVar.f38888m;
            }
            setImageDrawable(null);
            setImageDrawable(yVar);
            if (z10) {
                yVar.l();
            }
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator it = this.f8370o.iterator();
        if (!it.hasNext()) {
            return;
        }
        a.u(it.next());
        throw null;
    }

    public void setDefaultFontFileExtension(String str) {
        y yVar = this.f8363h;
        yVar.f21234k = str;
        w h10 = yVar.h();
        if (h10 != null) {
            h10.f25765f = str;
        }
    }

    public void setFailureListener(a0 a0Var) {
        this.f8361f = a0Var;
    }

    public void setFallbackResource(int i10) {
        this.f8362g = i10;
    }

    public void setFontAssetDelegate(j9.a aVar) {
        w wVar = this.f8363h.f21232i;
        if (wVar != null) {
            wVar.f25764e = aVar;
        }
    }

    public void setFontMap(Map<String, Typeface> map) {
        y yVar = this.f8363h;
        if (map != yVar.f21233j) {
            yVar.f21233j = map;
            yVar.invalidateSelf();
        }
    }

    public void setFrame(int i10) {
        this.f8363h.n(i10);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f8363h.f21227d = z10;
    }

    public void setImageAssetDelegate(b bVar) {
        o9.a aVar = this.f8363h.f21230g;
    }

    public void setImageAssetsFolder(String str) {
        this.f8363h.f21231h = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        b();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        b();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        b();
        super.setImageResource(i10);
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.f8363h.f21236m = z10;
    }

    public void setMaxFrame(int i10) {
        this.f8363h.o(i10);
    }

    public void setMaxProgress(float f10) {
        this.f8363h.q(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.f8363h.s(str);
    }

    public void setMinFrame(int i10) {
        this.f8363h.u(i10);
    }

    public void setMinProgress(float f10) {
        this.f8363h.w(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        y yVar = this.f8363h;
        if (yVar.f21241r != z10) {
            yVar.f21241r = z10;
            s9.c cVar = yVar.f21238o;
            if (cVar != null) {
                cVar.r(z10);
            }
        }
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        y yVar = this.f8363h;
        yVar.f21240q = z10;
        i iVar = yVar.f21224a;
        if (iVar != null) {
            iVar.f21166a.f21141a = z10;
        }
    }

    public void setProgress(float f10) {
        this.f8369n.add(h.f21160b);
        this.f8363h.x(f10);
    }

    public void setRenderMode(g0 g0Var) {
        y yVar = this.f8363h;
        yVar.f21243t = g0Var;
        yVar.e();
    }

    public void setRepeatCount(int i10) {
        this.f8369n.add(h.f21162d);
        this.f8363h.f21225b.setRepeatCount(i10);
    }

    public void setRepeatMode(int i10) {
        this.f8369n.add(h.f21161c);
        this.f8363h.f21225b.setRepeatMode(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f8363h.f21228e = z10;
    }

    public void setSpeed(float f10) {
        this.f8363h.f21225b.f38879d = f10;
    }

    public void setTextDelegate(i0 i0Var) {
        this.f8363h.getClass();
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.f8363h.f21225b.f38889n = z10;
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        y yVar;
        w9.c cVar;
        y yVar2;
        w9.c cVar2;
        boolean z10 = this.f8366k;
        if (!z10 && drawable == (yVar2 = this.f8363h) && (cVar2 = yVar2.f21225b) != null && cVar2.f38888m) {
            this.f8367l = false;
            yVar2.i();
        } else if (!z10 && (drawable instanceof y) && (cVar = (yVar = (y) drawable).f21225b) != null && cVar.f38888m) {
            yVar.i();
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.f8363h.p(str);
    }

    public void setMinFrame(String str) {
        this.f8363h.v(str);
    }

    public void setAnimation(String str) {
        d0 a10;
        d0 d0Var;
        this.f8364i = str;
        int i10 = 0;
        this.f8365j = 0;
        int i11 = 1;
        if (isInEditMode()) {
            d0Var = new d0(new j9.f(i10, this, str), true);
        } else {
            if (this.f8368m) {
                Context context = getContext();
                HashMap hashMap = o.f21198a;
                String f10 = a.f("asset_", str);
                a10 = o.a(f10, new j9.k(i11, context.getApplicationContext(), str, f10));
            } else {
                Context context2 = getContext();
                HashMap hashMap2 = o.f21198a;
                a10 = o.a(null, new j9.k(i11, context2.getApplicationContext(), str, null));
            }
            d0Var = a10;
        }
        setCompositionTask(d0Var);
    }
}
