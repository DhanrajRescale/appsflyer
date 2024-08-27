package hr;

import ak.y;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.v;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import com.google.android.gms.common.api.Api;
import d4.j;
import d4.k0;
import d4.n;
import e.l;
import ea.p0;
import ea.s0;
import ek.a0;
import ek.c0;
import ek.f;
import ek.u;
import ek.w;
import ek.x;
import g7.b1;
import g7.t0;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import k5.h0;
import kotlin.jvm.internal.Intrinsics;
import l.b0;
import l.i0;
import l.m;
import l.o;
import l5.h;
import m.a4;
import m.p2;
import okhttp3.logging.HttpLoggingInterceptor;
import s0.g;
import tu.w0;
import u3.k;
import v5.p;

/* loaded from: classes2.dex */
public class c implements m, b0, n, j, p, p.a, xs.b, sk.a, ek.c, x {

    /* renamed from: c, reason: collision with root package name */
    public static volatile c f18688c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18689a;

    /* renamed from: b, reason: collision with root package name */
    public Object f18690b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f18689a = i10;
        this.f18690b = obj;
    }

    public static Object o(Object[] objArr, int i10, k kVar) {
        int i11;
        boolean z10;
        int i12;
        if ((i10 & 1) == 0) {
            i11 = 400;
        } else {
            i11 = 700;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object obj = null;
        int i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (Object obj2 : objArr) {
            int abs = Math.abs(kVar.x(obj2) - i11) * 2;
            if (kVar.z(obj2) == z10) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            int i14 = abs + i12;
            if (obj == null || i13 > i14) {
                obj = obj2;
                i13 = i14;
            }
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:400:0x015f, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0402  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList s(hr.c r38, java.lang.String r39) {
        /*
            Method dump skipped, instructions count: 1808
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hr.c.s(hr.c, java.lang.String):java.util.ArrayList");
    }

    @Override // ek.c
    public final Object C(byte[] bArr) {
        return ByteBuffer.wrap(bArr);
    }

    @Override // ek.c
    public final Class a() {
        return ByteBuffer.class;
    }

    @Override // p.a
    public final Object apply(Object obj) {
        List list = (List) obj;
        if (list != null && list.size() > 0) {
            return ((j8.j) list.get(0)).a();
        }
        return null;
    }

    @Override // l.b0
    public final void b(o oVar, boolean z10) {
        if (oVar instanceof i0) {
            oVar.k().c(false);
        }
        b0 b0Var = ((m.n) this.f18690b).f25635e;
        if (b0Var != null) {
            b0Var.b(oVar, z10);
        }
    }

    @Override // v5.p
    public final void c() {
        ((h) this.f18690b).B.c();
        DashManifestStaleException dashManifestStaleException = ((h) this.f18690b).D;
        if (dashManifestStaleException == null) {
        } else {
            throw dashManifestStaleException;
        }
    }

    @Override // d4.j
    public final boolean d(float f10) {
        if (f10 == g.f34069a) {
            return false;
        }
        h();
        ((NestedScrollView) this.f18690b).j((int) f10);
        return true;
    }

    @Override // l.b0
    public final boolean e(o oVar) {
        Object obj = this.f18690b;
        if (oVar == ((m.n) obj).f25633c) {
            return false;
        }
        ((m.n) obj).f25655y = ((i0) oVar).A.f23663a;
        b0 b0Var = ((m.n) obj).f25635e;
        if (b0Var == null) {
            return false;
        }
        return b0Var.e(oVar);
    }

    @Override // ek.x
    public final w f(c0 c0Var) {
        switch (this.f18689a) {
            case 27:
                return new f((t9.c) this.f18690b, 1);
            case 28:
                return new a0((Resources) this.f18690b, c0Var.a(Uri.class, InputStream.class));
            default:
                return new fk.a((u) this.f18690b);
        }
    }

    @Override // d4.j
    public final float g() {
        return -((NestedScrollView) this.f18690b).getVerticalScrollFactorCompat();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.f18689a) {
            case 21:
                ((p0) this.f18690b).getClass();
                HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, 0 == true ? 1 : 0);
                httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.NONE);
                return httpLoggingInterceptor;
            default:
                s0 s0Var = (s0) this.f18690b;
                s0Var.getClass();
                return new v(s0Var.f15277a);
        }
    }

    @Override // d4.j
    public final void h() {
        ((NestedScrollView) this.f18690b).f1520d.abortAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Typeface i(android.content.Context r9, t3.f r10, android.content.res.Resources r11, int r12) {
        /*
            r8 = this;
            t9.c r0 = new t9.c
            r1 = 10
            r0.<init>(r8, r1)
            t3.g[] r1 = r10.f35302a
            java.lang.Object r0 = o(r1, r12, r0)
            t3.g r0 = (t3.g) r0
            if (r0 != 0) goto L13
            r9 = 0
            return r9
        L13:
            int r6 = r0.f35308f
            java.lang.String r7 = r0.f35303a
            hr.c r0 = u3.e.f36710a
            r1 = r9
            r2 = r11
            r3 = r6
            r4 = r7
            r5 = r12
            android.graphics.Typeface r9 = r0.m(r1, r2, r3, r4, r5)
            if (r9 == 0) goto L2e
            r0 = 0
            java.lang.String r11 = u3.e.b(r11, r6, r7, r0, r12)
            t.q r12 = u3.e.f36711b
            r12.put(r11, r9)
        L2e:
            java.lang.String r11 = "Could not retrieve font from family."
            java.lang.String r12 = "TypefaceCompatBaseImpl"
            r0 = 0
            if (r9 != 0) goto L38
        L36:
            r11 = r0
            goto L5b
        L38:
            java.lang.Class<android.graphics.Typeface> r2 = android.graphics.Typeface.class
            java.lang.String r3 = "native_instance"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.IllegalAccessException -> L4f java.lang.NoSuchFieldException -> L51
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.IllegalAccessException -> L4f java.lang.NoSuchFieldException -> L51
            java.lang.Object r2 = r2.get(r9)     // Catch: java.lang.IllegalAccessException -> L4f java.lang.NoSuchFieldException -> L51
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.IllegalAccessException -> L4f java.lang.NoSuchFieldException -> L51
            long r11 = r2.longValue()     // Catch: java.lang.IllegalAccessException -> L4f java.lang.NoSuchFieldException -> L51
            goto L5b
        L4f:
            r2 = move-exception
            goto L53
        L51:
            r2 = move-exception
            goto L57
        L53:
            android.util.Log.e(r12, r11, r2)
            goto L36
        L57:
            android.util.Log.e(r12, r11, r2)
            goto L36
        L5b:
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r8.f18690b
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r0.put(r11, r10)
        L6a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: hr.c.i(android.content.Context, t3.f, android.content.res.Resources, int):android.graphics.Typeface");
    }

    @Override // sk.a
    public final Object j() {
        switch (this.f18689a) {
            case 24:
                a4 a4Var = (a4) this.f18690b;
                return new ak.v((dk.c) a4Var.f25481b, (dk.c) a4Var.f25482c, (dk.c) a4Var.f25483d, (dk.c) a4Var.f25484e, (ak.w) a4Var.f25485f, (y) a4Var.f25486g, (c4.e) a4Var.f25487h);
            default:
                try {
                    return new ck.j(MessageDigest.getInstance("SHA-256"));
                } catch (NoSuchAlgorithmException e10) {
                    throw new RuntimeException(e10);
                }
        }
    }

    public Typeface k(Context context, z3.h[] hVarArr, int i10) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (hVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(p(i10, hVarArr).f41998a);
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Typeface l10 = l(context, inputStream);
            hl.f.G(inputStream);
            return l10;
        } catch (IOException unused2) {
            hl.f.G(inputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            inputStream2 = inputStream;
            hl.f.G(inputStream2);
            throw th;
        }
    }

    public Typeface l(Context context, InputStream inputStream) {
        File p02 = hl.f.p0(context);
        if (p02 == null) {
            return null;
        }
        try {
            if (!hl.f.O(inputStream, p02)) {
                return null;
            }
            return Typeface.createFromFile(p02.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            p02.delete();
        }
    }

    public Typeface m(Context context, Resources resources, int i10, String str, int i11) {
        File p02 = hl.f.p0(context);
        if (p02 == null) {
            return null;
        }
        try {
            if (!hl.f.N(p02, resources, i10)) {
                return null;
            }
            return Typeface.createFromFile(p02.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            p02.delete();
        }
    }

    @Override // l.m
    public final void n(o oVar) {
        switch (this.f18689a) {
            case 1:
                if (((h.s0) this.f18690b).f17738g.f25780a.q()) {
                    ((h.s0) this.f18690b).f17739h.onPanelClosed(108, oVar);
                    return;
                } else {
                    if (((h.s0) this.f18690b).f17739h.onPreparePanel(0, null, oVar)) {
                        ((h.s0) this.f18690b).f17739h.onMenuOpened(108, oVar);
                        return;
                    }
                    return;
                }
            default:
                return;
        }
    }

    public z3.h p(int i10, z3.h[] hVarArr) {
        return (z3.h) o(hVarArr, i10, new l(this, 9));
    }

    public final w0 q(b1 loadType) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int ordinal = loadType.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return ((t0) ((q.h) this.f18690b).f31451c).f17061b;
            }
            throw new IllegalArgumentException("invalid load type for hints");
        }
        return ((t0) ((q.h) this.f18690b).f31450b).f17061b;
    }

    public final void r(Exception exc) {
        e5.m.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        tr.e eVar = ((h0) this.f18690b).X0;
        Handler handler = (Handler) eVar.f36361b;
        if (handler != null) {
            handler.post(new k5.h(eVar, exc, 1));
        }
    }

    @Override // l.m
    public final boolean v(o oVar, MenuItem menuItem) {
        switch (this.f18689a) {
            case 1:
                return false;
            default:
                p2 p2Var = (p2) ((m.w) this.f18690b).f25764e;
                if (p2Var == null) {
                    return false;
                }
                return p2Var.onMenuItemClick(menuItem);
        }
    }

    public c(t3.b bVar) {
        this.f18689a = 6;
        this.f18690b = bVar;
    }

    public c(int i10) {
        this.f18689a = i10;
        if (i10 == 5) {
            this.f18690b = new float[64];
            return;
        }
        if (i10 == 7) {
            this.f18690b = new ConcurrentHashMap();
            return;
        }
        int i11 = 29;
        if (i10 == 27) {
            this.f18690b = new t9.c(this, i11);
            return;
        }
        if (i10 == 29) {
            this.f18690b = new u();
            return;
        }
        if (i10 == 17) {
            this.f18690b = new q.h(this);
        } else if (i10 != 18) {
            this.f18690b = new HashSet();
        } else {
            this.f18690b = new HashMap();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [d4.m0, d4.k0, java.lang.Object] */
    public c(View view) {
        this.f18689a = 9;
        if (Build.VERSION.SDK_INT >= 30) {
            ?? k0Var = new k0(view);
            k0Var.f13779d = view;
            this.f18690b = k0Var;
            return;
        }
        this.f18690b = new k0(view);
    }

    public c(TextView textView) {
        this.f18689a = 12;
        if (textView != null) {
            this.f18690b = new r4.h(textView);
            return;
        }
        throw new NullPointerException("textView cannot be null");
    }

    public c(Context context, GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        this.f18689a = 8;
        this.f18690b = new GestureDetector(context, simpleOnGestureListener, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(n5.g gVar) {
        this(gVar, 15);
        this.f18689a = 15;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(h0 h0Var) {
        this(h0Var, 13);
        this.f18689a = 13;
    }
}
