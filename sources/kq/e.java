package kq;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.MediaDrmException;
import android.os.Build;
import androidx.cardview.widget.CardView;
import at.l;
import com.appsflyer.AppsFlyerConversionListener;
import com.assetgro.stockgro.data.model.IntroModel;
import com.assetgro.stockgro.data.model.ShowInfoData;
import g7.t4;
import j2.g0;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k6.j;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lf.i0;
import n1.j0;
import n1.n;
import n1.u;
import n1.v;
import n5.w;
import o2.r;
import o5.q;
import t0.q2;
import t0.t;
import t0.x1;
import t0.y1;
import w2.k;
import w8.m;
import xj.i;
import z5.y;

/* loaded from: classes2.dex */
public final class e implements y4.b, q, t4, AppsFlyerConversionListener, w, p5.a, pj.a, r6.h, m, m9.b, x8.g, i {
    public e(int[] iArr, ValueAnimator valueAnimator) {
    }

    public static final float[] C() {
        float[] fArr = w.w.f38703s;
        if (fArr != null) {
            return fArr;
        }
        float[] fArr2 = new float[91];
        w.w.f38703s = fArr2;
        return fArr2;
    }

    public static void D(q2 q2Var, List list, y1 y1Var) {
        Object obj;
        x1 x1Var;
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                int c10 = q2Var.c((t0.d) list.get(i10));
                int G = q2Var.G(q2Var.f35144b, q2Var.o(c10));
                if (G < q2Var.f(q2Var.f35144b, q2Var.o(c10 + 1))) {
                    obj = q2Var.f35145c[q2Var.g(G)];
                } else {
                    obj = t0.m.f35080a;
                }
                if (obj instanceof x1) {
                    x1Var = (x1) obj;
                } else {
                    x1Var = null;
                }
                if (x1Var != null) {
                    x1Var.f35243b = y1Var;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [n1.u, n1.v] */
    public static v E(float[] fArr) {
        ?? uVar = new u(new ColorMatrixColorFilter(fArr));
        uVar.f28200b = fArr;
        return uVar;
    }

    public static k0.b G(k0.b bVar, k kVar, g0 g0Var, w2.b bVar2, r rVar) {
        if (bVar != null && kVar == bVar.f21810a && Intrinsics.a(g0Var, bVar.f21811b) && bVar2.b() == bVar.f21812c.b() && rVar == bVar.f21813d) {
            return bVar;
        }
        k0.b bVar3 = k0.b.f21809h;
        if (bVar3 != null && kVar == bVar3.f21810a && Intrinsics.a(g0Var, bVar3.f21811b) && bVar2.b() == bVar3.f21812c.b() && rVar == bVar3.f21813d) {
            return bVar3;
        }
        k0.b bVar4 = new k0.b(kVar, hl.f.M0(g0Var, kVar), bVar2, rVar);
        k0.b.f21809h = bVar4;
        return bVar4;
    }

    public static j0 I(List list) {
        return new j0(list, t.g(s0.g.f34069a, s0.g.f34069a), t.g(Float.POSITIVE_INFINITY, s0.g.f34069a), 0);
    }

    public static j0 K(List list, long j10, long j11) {
        return new j0(list, j10, j11, 0);
    }

    public static i0 L(ShowInfoData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        i0 i0Var = new i0();
        i0Var.setArguments(hl.f.y(new Pair("DATA", data)));
        return i0Var;
    }

    public static za.d M(IntroModel introModel) {
        Intrinsics.checkNotNullParameter(introModel, "introModel");
        za.d dVar = new za.d();
        dVar.setArguments(hl.f.y(new Pair("INTRO_DATA", introModel)));
        return dVar;
    }

    public static n1.m P(int i10, long j10) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            porterDuffColorFilter = n.f28156a.a(j10, i10);
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(androidx.compose.ui.graphics.a.y(j10), androidx.compose.ui.graphics.a.A(i10));
        }
        return new n1.m(j10, i10, porterDuffColorFilter);
    }

    public static j0 R(List list, float f10, int i10) {
        if ((i10 & 4) != 0) {
            f10 = Float.POSITIVE_INFINITY;
        }
        return new j0(list, t.g(s0.g.f34069a, s0.g.f34069a), t.g(s0.g.f34069a, f10), 0);
    }

    @Override // n5.w
    public boolean A(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // r6.h
    public long B(z5.q qVar) {
        return -1L;
    }

    public al.d F(b5.v vVar) {
        String str = vVar.f3652l;
        if (str != null) {
            str.hashCode();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return new g6.b(0);
                case 1:
                    return new j6.a();
                case 2:
                    return new j(null);
                case 3:
                    return new g6.b(1);
                case 4:
                    return new m6.c();
            }
        }
        throw new IllegalArgumentException(a3.a.f("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public int H(int i10) {
        return i10 == 7 ? 6 : 3;
    }

    public l J() {
        l lVar = st.e.f34775c;
        Intrinsics.checkNotNullExpressionValue(lVar, "io(...)");
        return lVar;
    }

    public void N(tr.e eVar, float f10) {
        s.a aVar = (s.a) ((Drawable) eVar.f36361b);
        boolean useCompatPadding = ((CardView) eVar.f36362c).getUseCompatPadding();
        boolean w10 = eVar.w();
        if (f10 != aVar.f34012e || aVar.f34013f != useCompatPadding || aVar.f34014g != w10) {
            aVar.f34012e = f10;
            aVar.f34013f = useCompatPadding;
            aVar.f34014g = w10;
            aVar.b(null);
            aVar.invalidateSelf();
        }
        if (!((CardView) eVar.f36362c).getUseCompatPadding()) {
            eVar.C(0, 0, 0, 0);
            return;
        }
        s.a aVar2 = (s.a) ((Drawable) eVar.f36361b);
        float f11 = aVar2.f34012e;
        float f12 = aVar2.f34008a;
        int ceil = (int) Math.ceil(s.b.a(f11, f12, eVar.w()));
        int ceil2 = (int) Math.ceil(s.b.b(f11, f12, eVar.w()));
        eVar.C(ceil, ceil2, ceil, ceil2);
    }

    public boolean O(b5.v vVar) {
        String str = vVar.f3652l;
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
            return false;
        }
        return true;
    }

    public l Q() {
        l lVar = bt.c.f7311a;
        if (lVar != null) {
            Intrinsics.checkNotNullExpressionValue(lVar, "mainThread(...)");
            return lVar;
        }
        throw new NullPointerException("scheduler == null");
    }

    @Override // w8.m
    public void a(int i10) {
    }

    @Override // w8.m
    public w8.d b(w8.c cVar) {
        return null;
    }

    @Override // n5.w
    public Map c(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // xj.i
    public void d(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }

    @Override // x8.g
    public boolean e() {
        return true;
    }

    @Override // n5.w
    public n5.v f() {
        throw new IllegalStateException();
    }

    @Override // m9.b
    public boolean g(float f10) {
        throw new IllegalStateException("not implemented");
    }

    @Override // m9.b
    public x9.a h() {
        throw new IllegalStateException("not implemented");
    }

    @Override // m9.b
    public boolean i(float f10) {
        return false;
    }

    @Override // m9.b
    public boolean isEmpty() {
        return true;
    }

    @Override // n5.w
    public void j(t9.c cVar) {
    }

    @Override // g7.t4
    public void k() {
    }

    @Override // n5.w
    public h5.b m(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // n5.w
    public byte[] n() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // n5.w
    public void o(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(Map map) {
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(String str) {
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(String str) {
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(Map map) {
    }

    @Override // o5.q
    public List p(String mimeType, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        List e10 = o5.u.e(mimeType, z10, false);
        Intrinsics.checkNotNullExpressionValue(e10, "getDecoderInfos(...)");
        if (z11) {
            e10 = o5.u.e(mimeType, z10, false);
            Intrinsics.checkNotNullExpressionValue(e10, "getDecoderInfos(...)");
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : e10) {
            if (((o5.m) obj).f29637h) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // n5.w
    public void q(byte[] bArr) {
    }

    @Override // r6.h
    public y r() {
        return new z5.t(-9223372036854775807L);
    }

    @Override // n5.w
    public void release() {
    }

    @Override // n5.w
    public byte[] s(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // x8.g
    public void shutdown() {
    }

    @Override // m9.b
    public float t() {
        return 1.0f;
    }

    @Override // n5.w
    public void u(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // n5.w
    public n5.u v(byte[] bArr, List list, int i10, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override // m9.b
    public float w() {
        return s0.g.f34069a;
    }

    @Override // n5.w
    public int x() {
        return 1;
    }

    @Override // w8.m
    public void y(w8.c cVar, Bitmap bitmap, Map map, int i10) {
    }

    @Override // r6.h
    public void z(long j10) {
    }
}
