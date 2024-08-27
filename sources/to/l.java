package to;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: m, reason: collision with root package name */
    public static final j f36278m = new j(0.5f);

    /* renamed from: a, reason: collision with root package name */
    public vl.b f36279a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public vl.b f36280b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public vl.b f36281c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public vl.b f36282d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public c f36283e = new a(s0.g.f34069a);

    /* renamed from: f, reason: collision with root package name */
    public c f36284f = new a(s0.g.f34069a);

    /* renamed from: g, reason: collision with root package name */
    public c f36285g = new a(s0.g.f34069a);

    /* renamed from: h, reason: collision with root package name */
    public c f36286h = new a(s0.g.f34069a);

    /* renamed from: i, reason: collision with root package name */
    public e f36287i = dp.b.d1();

    /* renamed from: j, reason: collision with root package name */
    public e f36288j = dp.b.d1();

    /* renamed from: k, reason: collision with root package name */
    public e f36289k = dp.b.d1();

    /* renamed from: l, reason: collision with root package name */
    public e f36290l = dp.b.d1();

    public static in.i a(Context context, int i10, int i11) {
        return b(context, i10, i11, new a(0));
    }

    public static in.i b(Context context, int i10, int i11, c cVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(un.a.N);
        try {
            int i12 = obtainStyledAttributes.getInt(0, 0);
            int i13 = obtainStyledAttributes.getInt(3, i12);
            int i14 = obtainStyledAttributes.getInt(4, i12);
            int i15 = obtainStyledAttributes.getInt(2, i12);
            int i16 = obtainStyledAttributes.getInt(1, i12);
            c d10 = d(obtainStyledAttributes, 5, cVar);
            c d11 = d(obtainStyledAttributes, 8, d10);
            c d12 = d(obtainStyledAttributes, 9, d10);
            c d13 = d(obtainStyledAttributes, 7, d10);
            c d14 = d(obtainStyledAttributes, 6, d10);
            in.i iVar = new in.i(1);
            vl.b c12 = dp.b.c1(i13);
            iVar.f20162a = c12;
            in.i.b(c12);
            iVar.f20166e = d11;
            vl.b c13 = dp.b.c1(i14);
            iVar.f20163b = c13;
            in.i.b(c13);
            iVar.f20167f = d12;
            vl.b c14 = dp.b.c1(i15);
            iVar.f20164c = c14;
            in.i.b(c14);
            iVar.f20168g = d13;
            vl.b c15 = dp.b.c1(i16);
            iVar.f20165d = c15;
            in.i.b(c15);
            iVar.f20169h = d14;
            return iVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static in.i c(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, un.a.D, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, aVar);
    }

    public static c d(TypedArray typedArray, int i10, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return cVar;
        }
        int i11 = peekValue.type;
        if (i11 == 5) {
            return new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i11 == 6) {
            return new j(peekValue.getFraction(1.0f, 1.0f));
        }
        return cVar;
    }

    public final boolean e(RectF rectF) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f36290l.getClass().equals(e.class) && this.f36288j.getClass().equals(e.class) && this.f36287i.getClass().equals(e.class) && this.f36289k.getClass().equals(e.class)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float a10 = this.f36283e.a(rectF);
        if (this.f36284f.a(rectF) == a10 && this.f36286h.a(rectF) == a10 && this.f36285g.a(rectF) == a10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((this.f36280b instanceof k) && (this.f36279a instanceof k) && (this.f36281c instanceof k) && (this.f36282d instanceof k)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z10 || !z11 || !z12) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [in.i, java.lang.Object] */
    public final in.i f() {
        ?? obj = new Object();
        obj.f20162a = new Object();
        obj.f20163b = new Object();
        obj.f20164c = new Object();
        obj.f20165d = new Object();
        obj.f20166e = new a(s0.g.f34069a);
        obj.f20167f = new a(s0.g.f34069a);
        obj.f20168g = new a(s0.g.f34069a);
        obj.f20169h = new a(s0.g.f34069a);
        obj.f20170i = dp.b.d1();
        obj.f20171j = dp.b.d1();
        obj.f20172k = dp.b.d1();
        obj.f20162a = this.f36279a;
        obj.f20163b = this.f36280b;
        obj.f20164c = this.f36281c;
        obj.f20165d = this.f36282d;
        obj.f20166e = this.f36283e;
        obj.f20167f = this.f36284f;
        obj.f20168g = this.f36285g;
        obj.f20169h = this.f36286h;
        obj.f20170i = this.f36287i;
        obj.f20171j = this.f36288j;
        obj.f20172k = this.f36289k;
        obj.f20173l = this.f36290l;
        return obj;
    }
}
