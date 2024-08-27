package android.support.v4.media;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.datepicker.l;
import i5.o;
import java.lang.reflect.GenericDeclaration;
import java.util.Map;
import java.util.Set;
import kp.n;
import m.s;
import pn.e;
import r5.v;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public Object f809a;

    /* renamed from: b, reason: collision with root package name */
    public Object f810b;

    /* renamed from: c, reason: collision with root package name */
    public Object f811c;

    /* renamed from: d, reason: collision with root package name */
    public Object f812d;

    /* renamed from: e, reason: collision with root package name */
    public Object f813e;

    /* renamed from: f, reason: collision with root package name */
    public Object f814f;

    /* renamed from: g, reason: collision with root package name */
    public Object f815g;

    /* renamed from: h, reason: collision with root package name */
    public Object f816h;

    public d(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(e.w(context, R.attr.materialCalendarStyle, l.class.getCanonicalName()).data, un.a.f37314y);
        this.f809a = s.b(obtainStyledAttributes.getResourceId(3, 0), context);
        this.f815g = s.b(obtainStyledAttributes.getResourceId(1, 0), context);
        this.f810b = s.b(obtainStyledAttributes.getResourceId(2, 0), context);
        this.f811c = s.b(obtainStyledAttributes.getResourceId(4, 0), context);
        ColorStateList l12 = dp.b.l1(context, obtainStyledAttributes, 6);
        this.f812d = s.b(obtainStyledAttributes.getResourceId(8, 0), context);
        this.f813e = s.b(obtainStyledAttributes.getResourceId(7, 0), context);
        this.f814f = s.b(obtainStyledAttributes.getResourceId(9, 0), context);
        Paint paint = new Paint();
        this.f816h = paint;
        paint.setColor(l12.getDefaultColor());
        obtainStyledAttributes.recycle();
    }

    public final n a(int i10) {
        n nVar;
        n oVar;
        if (((Map) this.f810b).containsKey(Integer.valueOf(i10))) {
            return (n) ((Map) this.f810b).get(Integer.valueOf(i10));
        }
        final g5.e eVar = (g5.e) this.f813e;
        eVar.getClass();
        n nVar2 = null;
        try {
            if (i10 != 0) {
                final int i11 = 1;
                if (i10 != 1) {
                    final int i12 = 2;
                    if (i10 != 2) {
                        final int i13 = 3;
                        if (i10 != 3) {
                            if (i10 == 4) {
                                oVar = new n() { // from class: r5.i
                                    @Override // kp.n
                                    public final Object get() {
                                        int i14 = i13;
                                        g5.e eVar2 = eVar;
                                        Object obj = this;
                                        switch (i14) {
                                            case 0:
                                                return j.d((Class) obj, eVar2);
                                            case 1:
                                                return j.d((Class) obj, eVar2);
                                            case 2:
                                                return j.d((Class) obj, eVar2);
                                            default:
                                                return new o0(eVar2, (z5.s) ((android.support.v4.media.d) obj).f809a);
                                        }
                                    }
                                };
                            }
                        } else {
                            oVar = new o(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(v.class), i13);
                        }
                        nVar2 = oVar;
                    } else {
                        final GenericDeclaration asSubclass = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(v.class);
                        nVar = new n() { // from class: r5.i
                            @Override // kp.n
                            public final Object get() {
                                int i14 = i12;
                                g5.e eVar2 = eVar;
                                Object obj = asSubclass;
                                switch (i14) {
                                    case 0:
                                        return j.d((Class) obj, eVar2);
                                    case 1:
                                        return j.d((Class) obj, eVar2);
                                    case 2:
                                        return j.d((Class) obj, eVar2);
                                    default:
                                        return new o0(eVar2, (z5.s) ((android.support.v4.media.d) obj).f809a);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(v.class);
                    nVar = new n() { // from class: r5.i
                        @Override // kp.n
                        public final Object get() {
                            int i14 = i11;
                            g5.e eVar2 = eVar;
                            Object obj = asSubclass2;
                            switch (i14) {
                                case 0:
                                    return j.d((Class) obj, eVar2);
                                case 1:
                                    return j.d((Class) obj, eVar2);
                                case 2:
                                    return j.d((Class) obj, eVar2);
                                default:
                                    return new o0(eVar2, (z5.s) ((android.support.v4.media.d) obj).f809a);
                            }
                        }
                    };
                }
                nVar2 = nVar;
            } else {
                final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(v.class);
                final int i14 = 0;
                nVar2 = new n() { // from class: r5.i
                    @Override // kp.n
                    public final Object get() {
                        int i142 = i14;
                        g5.e eVar2 = eVar;
                        Object obj = asSubclass3;
                        switch (i142) {
                            case 0:
                                return j.d((Class) obj, eVar2);
                            case 1:
                                return j.d((Class) obj, eVar2);
                            case 2:
                                return j.d((Class) obj, eVar2);
                            default:
                                return new o0(eVar2, (z5.s) ((android.support.v4.media.d) obj).f809a);
                        }
                    }
                };
            }
        } catch (ClassNotFoundException unused) {
        }
        ((Map) this.f810b).put(Integer.valueOf(i10), nVar2);
        if (nVar2 != null) {
            ((Set) this.f811c).add(Integer.valueOf(i10));
        }
        return nVar2;
    }
}
