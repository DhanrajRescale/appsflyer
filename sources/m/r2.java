package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.assetgro.stockgro.prod.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r2 {

    /* renamed from: g, reason: collision with root package name */
    public static r2 f25700g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f25702a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f25703b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f25704c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25705d;

    /* renamed from: e, reason: collision with root package name */
    public w f25706e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f25699f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final q2 f25701h = new t.q(6);

    public static synchronized r2 c() {
        r2 r2Var;
        synchronized (r2.class) {
            try {
                if (f25700g == null) {
                    f25700g = new r2();
                }
                r2Var = f25700g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return r2Var;
    }

    public static synchronized PorterDuffColorFilter g(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (r2.class) {
            q2 q2Var = f25701h;
            q2Var.getClass();
            int i11 = (31 + i10) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) q2Var.get(Integer.valueOf(mode.hashCode() + i11));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final synchronized void a(Context context, long j10, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                t.o oVar = (t.o) this.f25703b.get(context);
                if (oVar == null) {
                    oVar = new t.o((Object) null);
                    this.f25703b.put(context, oVar);
                }
                oVar.g(j10, new WeakReference(constantState));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final Drawable b(int i10, Context context) {
        if (this.f25704c == null) {
            this.f25704c = new TypedValue();
        }
        TypedValue typedValue = this.f25704c;
        context.getResources().getValue(i10, typedValue, true);
        long j10 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable d10 = d(j10, context);
        if (d10 != null) {
            return d10;
        }
        LayerDrawable layerDrawable = null;
        if (this.f25706e != null) {
            if (i10 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{e(context, R.drawable.abc_cab_background_internal_bg), e(context, 2131230832)});
            } else if (i10 == R.drawable.abc_ratingbar_material) {
                layerDrawable = w.f(this, context, R.dimen.abc_star_big);
            } else if (i10 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = w.f(this, context, R.dimen.abc_star_medium);
            } else if (i10 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = w.f(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, j10, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable d(long j10, Context context) {
        t.o oVar = (t.o) this.f25703b.get(context);
        if (oVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) oVar.c(j10);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            oVar.h(j10);
        }
        return null;
    }

    public final synchronized Drawable e(Context context, int i10) {
        return f(context, i10, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        v3.b.i(r0, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.drawable.Drawable f(android.content.Context r9, int r10, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.f25705d     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L6
            goto L26
        L6:
            r0 = 1
            r8.f25705d = r0     // Catch: java.lang.Throwable -> L31
            r0 = 2131230893(0x7f0800ad, float:1.8077852E38)
            android.graphics.drawable.Drawable r0 = r8.e(r9, r0)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto Ldd
            boolean r1 = r0 instanceof u7.p     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L26
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "android.graphics.drawable.VectorDrawable"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto Ldd
        L26:
            android.graphics.drawable.Drawable r0 = r8.b(r10, r9)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L34
            android.graphics.drawable.Drawable r0 = r3.k.getDrawable(r9, r10)     // Catch: java.lang.Throwable -> L31
            goto L34
        L31:
            r9 = move-exception
            goto Le8
        L34:
            if (r0 == 0) goto Ld6
            android.content.res.ColorStateList r1 = r8.h(r10, r9)     // Catch: java.lang.Throwable -> L31
            r2 = 0
            if (r1 == 0) goto L59
            int[] r9 = m.q1.f25681a     // Catch: java.lang.Throwable -> L31
            android.graphics.drawable.Drawable r0 = r0.mutate()     // Catch: java.lang.Throwable -> L31
            v3.b.h(r0, r1)     // Catch: java.lang.Throwable -> L31
            m.w r9 = r8.f25706e     // Catch: java.lang.Throwable -> L31
            if (r9 != 0) goto L4b
            goto L52
        L4b:
            r9 = 2131230880(0x7f0800a0, float:1.8077825E38)
            if (r10 != r9) goto L52
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch: java.lang.Throwable -> L31
        L52:
            if (r2 == 0) goto Ld6
            v3.b.i(r0, r2)     // Catch: java.lang.Throwable -> L31
            goto Ld6
        L59:
            m.w r1 = r8.f25706e     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto Lcd
            r1 = 2131230875(0x7f08009b, float:1.8077815E38)
            r3 = 16908301(0x102000d, float:2.3877265E-38)
            r4 = 16908303(0x102000f, float:2.387727E-38)
            r5 = 16908288(0x1020000, float:2.387723E-38)
            r6 = 2130968851(0x7f040113, float:1.7546367E38)
            r7 = 2130968853(0x7f040115, float:1.7546371E38)
            if (r10 != r1) goto L97
            r10 = r0
            android.graphics.drawable.LayerDrawable r10 = (android.graphics.drawable.LayerDrawable) r10     // Catch: java.lang.Throwable -> L31
            android.graphics.drawable.Drawable r11 = r10.findDrawableByLayerId(r5)     // Catch: java.lang.Throwable -> L31
            int r1 = m.m3.c(r7, r9)     // Catch: java.lang.Throwable -> L31
            android.graphics.PorterDuff$Mode r2 = m.x.f25795b     // Catch: java.lang.Throwable -> L31
            m.w.j(r11, r1, r2)     // Catch: java.lang.Throwable -> L31
            android.graphics.drawable.Drawable r11 = r10.findDrawableByLayerId(r4)     // Catch: java.lang.Throwable -> L31
            int r1 = m.m3.c(r7, r9)     // Catch: java.lang.Throwable -> L31
            m.w.j(r11, r1, r2)     // Catch: java.lang.Throwable -> L31
            android.graphics.drawable.Drawable r10 = r10.findDrawableByLayerId(r3)     // Catch: java.lang.Throwable -> L31
            int r9 = m.m3.c(r6, r9)     // Catch: java.lang.Throwable -> L31
            m.w.j(r10, r9, r2)     // Catch: java.lang.Throwable -> L31
            goto Ld6
        L97:
            r1 = 2131230866(0x7f080092, float:1.8077797E38)
            if (r10 == r1) goto La6
            r1 = 2131230865(0x7f080091, float:1.8077795E38)
            if (r10 == r1) goto La6
            r1 = 2131230867(0x7f080093, float:1.8077799E38)
            if (r10 != r1) goto Lcd
        La6:
            r10 = r0
            android.graphics.drawable.LayerDrawable r10 = (android.graphics.drawable.LayerDrawable) r10     // Catch: java.lang.Throwable -> L31
            android.graphics.drawable.Drawable r11 = r10.findDrawableByLayerId(r5)     // Catch: java.lang.Throwable -> L31
            int r1 = m.m3.b(r7, r9)     // Catch: java.lang.Throwable -> L31
            android.graphics.PorterDuff$Mode r2 = m.x.f25795b     // Catch: java.lang.Throwable -> L31
            m.w.j(r11, r1, r2)     // Catch: java.lang.Throwable -> L31
            android.graphics.drawable.Drawable r11 = r10.findDrawableByLayerId(r4)     // Catch: java.lang.Throwable -> L31
            int r1 = m.m3.c(r6, r9)     // Catch: java.lang.Throwable -> L31
            m.w.j(r11, r1, r2)     // Catch: java.lang.Throwable -> L31
            android.graphics.drawable.Drawable r10 = r10.findDrawableByLayerId(r3)     // Catch: java.lang.Throwable -> L31
            int r9 = m.m3.c(r6, r9)     // Catch: java.lang.Throwable -> L31
            m.w.j(r10, r9, r2)     // Catch: java.lang.Throwable -> L31
            goto Ld6
        Lcd:
            boolean r9 = r8.i(r9, r10, r0)     // Catch: java.lang.Throwable -> L31
            if (r9 != 0) goto Ld6
            if (r11 == 0) goto Ld6
            r0 = r2
        Ld6:
            if (r0 == 0) goto Ldb
            m.q1.a(r0)     // Catch: java.lang.Throwable -> L31
        Ldb:
            monitor-exit(r8)
            return r0
        Ldd:
            r9 = 0
            r8.f25705d = r9     // Catch: java.lang.Throwable -> L31
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L31
            java.lang.String r10 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L31
            throw r9     // Catch: java.lang.Throwable -> L31
        Le8:
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m.r2.f(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized ColorStateList h(int i10, Context context) {
        ColorStateList colorStateList;
        t.k0 k0Var;
        WeakHashMap weakHashMap = this.f25702a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (k0Var = (t.k0) weakHashMap.get(context)) != null) {
            colorStateList = (ColorStateList) k0Var.e(i10);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            w wVar = this.f25706e;
            if (wVar != null) {
                colorStateList2 = wVar.g(i10, context);
            }
            if (colorStateList2 != null) {
                if (this.f25702a == null) {
                    this.f25702a = new WeakHashMap();
                }
                t.k0 k0Var2 = (t.k0) this.f25702a.get(context);
                if (k0Var2 == null) {
                    k0Var2 = new t.k0();
                    this.f25702a.put(context, k0Var2);
                }
                k0Var2.a(i10, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            m.w r0 = r7.f25706e
            r1 = 0
            if (r0 == 0) goto L6e
            android.graphics.PorterDuff$Mode r2 = m.x.f25795b
            java.lang.Object r3 = r0.f25760a
            int[] r3 = (int[]) r3
            boolean r3 = m.w.b(r3, r9)
            r4 = 1
            r5 = -1
            if (r3 == 0) goto L19
            r9 = 2130968853(0x7f040115, float:1.7546371E38)
        L16:
            r3 = r4
        L17:
            r0 = r5
            goto L55
        L19:
            java.lang.Object r3 = r0.f25762c
            int[] r3 = (int[]) r3
            boolean r3 = m.w.b(r3, r9)
            if (r3 == 0) goto L27
            r9 = 2130968851(0x7f040113, float:1.7546367E38)
            goto L16
        L27:
            java.lang.Object r0 = r0.f25763d
            int[] r0 = (int[]) r0
            boolean r0 = m.w.b(r0, r9)
            r3 = 16842801(0x1010031, float:2.3693695E-38)
            if (r0 == 0) goto L38
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
        L36:
            r9 = r3
            goto L16
        L38:
            r0 = 2131230852(0x7f080084, float:1.8077768E38)
            if (r9 != r0) goto L4c
            r9 = 1109603123(0x42233333, float:40.8)
            int r9 = java.lang.Math.round(r9)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r3 = r4
            r6 = r0
            r0 = r9
            r9 = r6
            goto L55
        L4c:
            r0 = 2131230834(0x7f080072, float:1.8077732E38)
            if (r9 != r0) goto L52
            goto L36
        L52:
            r9 = r1
            r3 = r9
            goto L17
        L55:
            if (r3 == 0) goto L6e
            int[] r1 = m.q1.f25681a
            android.graphics.drawable.Drawable r10 = r10.mutate()
            int r8 = m.m3.c(r9, r8)
            android.graphics.PorterDuffColorFilter r8 = m.x.c(r8, r2)
            r10.setColorFilter(r8)
            if (r0 == r5) goto L6d
            r10.setAlpha(r0)
        L6d:
            r1 = r4
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m.r2.i(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
