package t9;

import ak.q;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.res.AssetManager;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.t0;
import androidx.media3.common.ParserException;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.viewpager2.widget.ViewPager2;
import bk.h;
import c4.e;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import d4.e3;
import d4.g;
import d4.h3;
import e4.y;
import e5.p;
import eb.f;
import ek.c0;
import ek.w;
import ek.x;
import h.e0;
import h.s0;
import hk.v;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l.b0;
import l.m;
import l.o;
import m.a1;
import m.n;
import m.u3;
import okhttp3.HttpUrl;
import u3.k;
import vt.p0;
import yk.j;
import z5.a0;
import z5.t;

/* loaded from: classes.dex */
public class c implements b0, u3, a1, m, k, g, i7.c, y, yj.g, sk.a, x, ek.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35632a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f35633b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f35632a = i10;
        this.f35633b = obj;
    }

    public static ByteArrayInputStream r(String str) {
        if (str.startsWith("data:image")) {
            int indexOf = str.indexOf(44);
            if (indexOf != -1) {
                if (str.substring(0, indexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        throw new IllegalArgumentException("Not a valid image data URL.");
    }

    public static String s(String str, b bVar, boolean z10) {
        StringBuilder sb2 = new StringBuilder("lottie_cache_");
        sb2.append(str.replaceAll("\\W+", HttpUrl.FRAGMENT_ENCODE_SET));
        String str2 = bVar.f35631a;
        if (z10) {
            str2 = ".temp" + str2;
        }
        sb2.append(str2);
        return sb2.toString();
    }

    public final void A(j5.a aVar) {
        Object obj = this.f35633b;
        Iterator it = ((CopyOnWriteArrayList) obj).iterator();
        while (it.hasNext()) {
            v5.b bVar = (v5.b) it.next();
            if (bVar.f37700b == aVar) {
                bVar.f37701c = true;
                ((CopyOnWriteArrayList) obj).remove(bVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, o6.c] */
    public final void B(int i10, long j10, long j11) {
        o6.d dVar = (o6.d) this.f35633b;
        j.I0(dVar.f29729b0);
        if (i10 != 160) {
            int i11 = 1;
            if (i10 != 174) {
                if (i10 != 187) {
                    if (i10 != 19899) {
                        if (i10 != 20533) {
                            if (i10 != 21968) {
                                if (i10 != 408125543) {
                                    if (i10 != 475249515) {
                                        if (i10 == 524531317 && !dVar.f29749v) {
                                            if (dVar.f29731d && dVar.f29753z != -1) {
                                                dVar.f29752y = true;
                                                return;
                                            } else {
                                                dVar.f29729b0.d(new t(dVar.f29747t));
                                                dVar.f29749v = true;
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    dVar.C = new f(i11);
                                    dVar.D = new f(i11);
                                    return;
                                }
                                long j12 = dVar.f29744q;
                                if (j12 != -1 && j12 != j10) {
                                    throw ParserException.a("Multiple Segment elements not supported", null);
                                }
                                dVar.f29744q = j10;
                                dVar.f29743p = j11;
                                return;
                            }
                            dVar.b(i10);
                            dVar.f29748u.f29717x = true;
                            return;
                        }
                        dVar.b(i10);
                        dVar.f29748u.f29701h = true;
                        return;
                    }
                    dVar.f29750w = -1;
                    dVar.f29751x = -1L;
                    return;
                }
                dVar.E = false;
                return;
            }
            ?? obj = new Object();
            obj.f29706m = -1;
            obj.f29707n = -1;
            obj.f29708o = -1;
            obj.f29709p = -1;
            obj.f29710q = 0;
            obj.f29711r = -1;
            obj.f29712s = s0.g.f34069a;
            obj.f29713t = s0.g.f34069a;
            obj.f29714u = s0.g.f34069a;
            obj.f29715v = null;
            obj.f29716w = -1;
            obj.f29717x = false;
            obj.f29718y = -1;
            obj.f29719z = -1;
            obj.A = -1;
            obj.B = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
            obj.C = 200;
            obj.D = -1.0f;
            obj.E = -1.0f;
            obj.F = -1.0f;
            obj.G = -1.0f;
            obj.H = -1.0f;
            obj.I = -1.0f;
            obj.J = -1.0f;
            obj.K = -1.0f;
            obj.L = -1.0f;
            obj.M = -1.0f;
            obj.O = 1;
            obj.P = -1;
            obj.Q = 8000;
            obj.R = 0L;
            obj.S = 0L;
            obj.V = true;
            obj.W = "eng";
            dVar.f29748u = obj;
            return;
        }
        dVar.Q = false;
        dVar.R = 0L;
    }

    public final void C(int i10, String str) {
        o6.d dVar = (o6.d) this.f35633b;
        dVar.getClass();
        if (i10 != 134) {
            if (i10 != 17026) {
                if (i10 != 21358) {
                    if (i10 == 2274716) {
                        dVar.b(i10);
                        dVar.f29748u.W = str;
                        return;
                    }
                    return;
                }
                dVar.b(i10);
                dVar.f29748u.f29694a = str;
                return;
            }
            if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw ParserException.a("DocType " + str + " not supported", null);
            }
            return;
        }
        dVar.b(i10);
        dVar.f29748u.f29695b = str;
    }

    public final File D(String str, InputStream inputStream, b bVar) {
        File file = new File(w(), s(str, bVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                }
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        } finally {
            inputStream.close();
        }
    }

    @Override // d4.g
    public final ClipData a() {
        return a4.c.c((ContentInfo) this.f35633b);
    }

    @Override // l.b0
    public final void b(o oVar, boolean z10) {
        ((e0) this.f35633b).q(oVar);
    }

    @Override // yj.g
    public final void c() {
        ((v) this.f35633b).release();
    }

    @Override // e4.y
    public final boolean d(View view) {
        a8.j jVar = (a8.j) this.f35633b;
        int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
        ViewPager2 viewPager2 = jVar.f274f;
        if (viewPager2.f2526r) {
            viewPager2.d(currentItem, true);
        }
        return true;
    }

    @Override // l.b0
    public final boolean e(o oVar) {
        Window.Callback callback = ((e0) this.f35633b).f17634l.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, oVar);
            return true;
        }
        return true;
    }

    @Override // ek.x
    public final w f(c0 c0Var) {
        return new ek.b((AssetManager) this.f35633b, this);
    }

    @Override // i7.c
    public final void g() {
        i7.d.f19711a.g();
    }

    @Override // i7.c
    public final void h(int i10, Object obj) {
        i7.d.f19711a.h(i10, obj);
        ((ProfileInstallReceiver) this.f35633b).setResultCode(i10);
    }

    public void i(int i10) {
    }

    @Override // sk.a
    public final Object j() {
        l0.j jVar = (l0.j) this.f35633b;
        return new ak.m((q) jVar.f23774b, (e) jVar.f23775c);
    }

    @Override // d4.g
    public final int k() {
        return a4.c.b((ContentInfo) this.f35633b);
    }

    @Override // yj.g
    public final Object l() {
        v vVar = (v) this.f35633b;
        vVar.reset();
        return vVar;
    }

    @Override // d4.g
    public final ContentInfo m() {
        return (ContentInfo) this.f35633b;
    }

    @Override // l.m
    public final void n(o oVar) {
        Toolbar toolbar = (Toolbar) this.f35633b;
        n nVar = toolbar.f1107a.f981t;
        if (nVar == null || !nVar.h()) {
            Iterator it = toolbar.G.f13845b.iterator();
            while (it.hasNext()) {
                ((t0) ((d4.x) it.next())).f1831a.s(oVar);
            }
        }
        m mVar = toolbar.f1120i0;
        if (mVar != null) {
            mVar.n(oVar);
        }
    }

    public void o(int i10) {
    }

    @Override // m.u3
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return ((s0) this.f35633b).f17739h.onMenuItemSelected(0, menuItem);
    }

    @Override // d4.g
    public final int p() {
        return a4.c.C((ContentInfo) this.f35633b);
    }

    public final void q(int i10, int i11, z5.q qVar) {
        o6.c cVar;
        o6.c cVar2;
        o6.c cVar3;
        long j10;
        int i12;
        int i13;
        int i14;
        int i15;
        o6.d dVar = (o6.d) this.f35633b;
        SparseArray sparseArray = dVar.f29730c;
        int i16 = 4;
        int i17 = 1;
        int i18 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 != 165) {
                if (i10 != 16877) {
                    if (i10 != 16981) {
                        if (i10 != 18402) {
                            if (i10 != 21419) {
                                if (i10 != 25506) {
                                    if (i10 == 30322) {
                                        dVar.b(i10);
                                        o6.c cVar4 = dVar.f29748u;
                                        byte[] bArr = new byte[i11];
                                        cVar4.f29715v = bArr;
                                        qVar.readFully(bArr, 0, i11);
                                        return;
                                    }
                                    throw ParserException.a("Unexpected id: " + i10, null);
                                }
                                dVar.b(i10);
                                o6.c cVar5 = dVar.f29748u;
                                byte[] bArr2 = new byte[i11];
                                cVar5.f29704k = bArr2;
                                qVar.readFully(bArr2, 0, i11);
                                return;
                            }
                            p pVar = dVar.f29736i;
                            Arrays.fill(pVar.f15036a, (byte) 0);
                            qVar.readFully(pVar.f15036a, 4 - i11, i11);
                            pVar.F(0);
                            dVar.f29750w = (int) pVar.v();
                            return;
                        }
                        byte[] bArr3 = new byte[i11];
                        qVar.readFully(bArr3, 0, i11);
                        dVar.b(i10);
                        dVar.f29748u.f29703j = new a0(1, bArr3, 0, 0);
                        return;
                    }
                    dVar.b(i10);
                    o6.c cVar6 = dVar.f29748u;
                    byte[] bArr4 = new byte[i11];
                    cVar6.f29702i = bArr4;
                    qVar.readFully(bArr4, 0, i11);
                    return;
                }
                dVar.b(i10);
                o6.c cVar7 = dVar.f29748u;
                int i19 = cVar7.f29700g;
                if (i19 != 1685485123 && i19 != 1685480259) {
                    qVar.j(i11);
                    return;
                }
                byte[] bArr5 = new byte[i11];
                cVar7.N = bArr5;
                qVar.readFully(bArr5, 0, i11);
                return;
            }
            if (dVar.G == 2) {
                o6.c cVar8 = (o6.c) sparseArray.get(dVar.M);
                if (dVar.P == 4 && "V_VP9".equals(cVar8.f29695b)) {
                    p pVar2 = dVar.f29741n;
                    pVar2.C(i11);
                    qVar.readFully(pVar2.f15036a, 0, i11);
                    return;
                }
                qVar.j(i11);
                return;
            }
            return;
        }
        int i20 = dVar.G;
        p pVar3 = dVar.f29734g;
        if (i20 == 0) {
            o6.e eVar = dVar.f29728b;
            dVar.M = (int) eVar.c(qVar, false, true, 8);
            dVar.N = eVar.f29757c;
            dVar.I = -9223372036854775807L;
            dVar.G = 1;
            pVar3.C(0);
        }
        o6.c cVar9 = (o6.c) sparseArray.get(dVar.M);
        if (cVar9 == null) {
            qVar.j(i11 - dVar.N);
            dVar.G = 0;
            return;
        }
        cVar9.X.getClass();
        if (dVar.G == 1) {
            dVar.i(qVar, 3);
            int i21 = (pVar3.f15036a[2] & 6) >> 1;
            byte b10 = 255;
            if (i21 == 0) {
                dVar.K = 1;
                int[] iArr = dVar.L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.L = iArr;
                iArr[0] = (i11 - dVar.N) - 3;
            } else {
                dVar.i(qVar, 4);
                int i22 = (pVar3.f15036a[3] & 255) + 1;
                dVar.K = i22;
                int[] iArr2 = dVar.L;
                if (iArr2 == null) {
                    iArr2 = new int[i22];
                } else if (iArr2.length < i22) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i22)];
                }
                dVar.L = iArr2;
                if (i21 == 2) {
                    int i23 = (i11 - dVar.N) - 4;
                    int i24 = dVar.K;
                    Arrays.fill(iArr2, 0, i24, i23 / i24);
                } else if (i21 == 1) {
                    int i25 = 0;
                    int i26 = 0;
                    while (true) {
                        i12 = dVar.K - 1;
                        if (i25 >= i12) {
                            break;
                        }
                        dVar.L[i25] = 0;
                        while (true) {
                            i13 = i16 + 1;
                            dVar.i(qVar, i13);
                            int i27 = pVar3.f15036a[i16] & 255;
                            int[] iArr3 = dVar.L;
                            i14 = iArr3[i25] + i27;
                            iArr3[i25] = i14;
                            if (i27 != 255) {
                                break;
                            } else {
                                i16 = i13;
                            }
                        }
                        i26 += i14;
                        i25++;
                        i16 = i13;
                    }
                    dVar.L[i12] = ((i11 - dVar.N) - i16) - i26;
                } else {
                    if (i21 == 3) {
                        int i28 = 0;
                        int i29 = 0;
                        while (true) {
                            int i30 = dVar.K - i17;
                            if (i28 < i30) {
                                dVar.L[i28] = i18;
                                int i31 = i16 + 1;
                                dVar.i(qVar, i31);
                                if (pVar3.f15036a[i16] != 0) {
                                    int i32 = i18;
                                    while (true) {
                                        if (i32 < 8) {
                                            int i33 = i17 << (7 - i32);
                                            if ((pVar3.f15036a[i16] & i33) != 0) {
                                                int i34 = i31 + i32;
                                                dVar.i(qVar, i34);
                                                cVar3 = cVar9;
                                                j10 = pVar3.f15036a[i16] & b10 & (~i33);
                                                while (i31 < i34) {
                                                    j10 = (j10 << 8) | (pVar3.f15036a[i31] & 255);
                                                    i31++;
                                                    i34 = i34;
                                                }
                                                int i35 = i34;
                                                if (i28 > 0) {
                                                    j10 -= (1 << ((i32 * 7) + 6)) - 1;
                                                }
                                                i16 = i35;
                                            } else {
                                                i32++;
                                                b10 = 255;
                                                i17 = 1;
                                            }
                                        } else {
                                            cVar3 = cVar9;
                                            j10 = 0;
                                            i16 = i31;
                                            break;
                                        }
                                    }
                                    if (j10 < -2147483648L || j10 > 2147483647L) {
                                        break;
                                    }
                                    int i36 = (int) j10;
                                    int[] iArr4 = dVar.L;
                                    if (i28 != 0) {
                                        i36 += iArr4[i28 - 1];
                                    }
                                    iArr4[i28] = i36;
                                    i29 += i36;
                                    i28++;
                                    cVar9 = cVar3;
                                    b10 = 255;
                                    i17 = 1;
                                    i18 = 0;
                                } else {
                                    throw ParserException.a("No valid varint length mask found", null);
                                }
                            } else {
                                cVar2 = cVar9;
                                dVar.L[i30] = ((i11 - dVar.N) - i16) - i29;
                                break;
                            }
                        }
                        throw ParserException.a("EBML lacing sample size out of range.", null);
                    }
                    throw ParserException.a("Unexpected lacing value: " + i21, null);
                }
            }
            cVar2 = cVar9;
            byte[] bArr6 = pVar3.f15036a;
            dVar.H = dVar.k((bArr6[1] & 255) | (bArr6[0] << 8)) + dVar.B;
            cVar = cVar2;
            if (cVar.f29697d != 2 && (i10 != 163 || (pVar3.f15036a[2] & 128) != 128)) {
                i15 = 0;
            } else {
                i15 = 1;
            }
            dVar.O = i15;
            dVar.G = 2;
            dVar.J = 0;
        } else {
            cVar = cVar9;
        }
        if (i10 == 163) {
            while (true) {
                int i37 = dVar.J;
                if (i37 < dVar.K) {
                    dVar.c(cVar, ((dVar.J * cVar.f29698e) / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT) + dVar.H, dVar.O, dVar.l(qVar, cVar, dVar.L[i37], false), 0);
                    dVar.J++;
                    cVar = cVar;
                } else {
                    dVar.G = 0;
                    return;
                }
            }
        } else {
            o6.c cVar10 = cVar;
            while (true) {
                int i38 = dVar.J;
                if (i38 < dVar.K) {
                    int[] iArr5 = dVar.L;
                    iArr5[i38] = dVar.l(qVar, cVar10, iArr5[i38], true);
                    dVar.J++;
                } else {
                    return;
                }
            }
        }
    }

    public final void t(int i10, double d10) {
        o6.d dVar = (o6.d) this.f35633b;
        if (i10 != 181) {
            if (i10 != 17545) {
                switch (i10) {
                    case 21969:
                        dVar.b(i10);
                        dVar.f29748u.D = (float) d10;
                        return;
                    case 21970:
                        dVar.b(i10);
                        dVar.f29748u.E = (float) d10;
                        return;
                    case 21971:
                        dVar.b(i10);
                        dVar.f29748u.F = (float) d10;
                        return;
                    case 21972:
                        dVar.b(i10);
                        dVar.f29748u.G = (float) d10;
                        return;
                    case 21973:
                        dVar.b(i10);
                        dVar.f29748u.H = (float) d10;
                        return;
                    case 21974:
                        dVar.b(i10);
                        dVar.f29748u.I = (float) d10;
                        return;
                    case 21975:
                        dVar.b(i10);
                        dVar.f29748u.J = (float) d10;
                        return;
                    case 21976:
                        dVar.b(i10);
                        dVar.f29748u.K = (float) d10;
                        return;
                    case 21977:
                        dVar.b(i10);
                        dVar.f29748u.L = (float) d10;
                        return;
                    case 21978:
                        dVar.b(i10);
                        dVar.f29748u.M = (float) d10;
                        return;
                    default:
                        switch (i10) {
                            case 30323:
                                dVar.b(i10);
                                dVar.f29748u.f29712s = (float) d10;
                                return;
                            case 30324:
                                dVar.b(i10);
                                dVar.f29748u.f29713t = (float) d10;
                                return;
                            case 30325:
                                dVar.b(i10);
                                dVar.f29748u.f29714u = (float) d10;
                                return;
                            default:
                                dVar.getClass();
                                return;
                        }
                }
            }
            dVar.f29746s = (long) d10;
            return;
        }
        dVar.b(i10);
        dVar.f29748u.Q = (int) d10;
    }

    public final String toString() {
        switch (this.f35632a) {
            case 12:
                return "ContentInfoCompat{" + ((ContentInfo) this.f35633b) + UrlTreeKt.componentParamSuffix;
            default:
                return super.toString();
        }
    }

    public final void u(int i10, long j10) {
        o6.d dVar = (o6.d) this.f35633b;
        dVar.getClass();
        if (i10 != 20529) {
            if (i10 != 20530) {
                boolean z10 = false;
                switch (i10) {
                    case 131:
                        dVar.b(i10);
                        dVar.f29748u.f29697d = (int) j10;
                        return;
                    case 136:
                        dVar.b(i10);
                        o6.c cVar = dVar.f29748u;
                        if (j10 == 1) {
                            z10 = true;
                        }
                        cVar.V = z10;
                        return;
                    case 155:
                        dVar.I = dVar.k(j10);
                        return;
                    case 159:
                        dVar.b(i10);
                        dVar.f29748u.O = (int) j10;
                        return;
                    case 176:
                        dVar.b(i10);
                        dVar.f29748u.f29706m = (int) j10;
                        return;
                    case 179:
                        dVar.a(i10);
                        dVar.C.h(dVar.k(j10));
                        return;
                    case 186:
                        dVar.b(i10);
                        dVar.f29748u.f29707n = (int) j10;
                        return;
                    case 215:
                        dVar.b(i10);
                        dVar.f29748u.f29696c = (int) j10;
                        return;
                    case 231:
                        dVar.B = dVar.k(j10);
                        return;
                    case 238:
                        dVar.P = (int) j10;
                        return;
                    case 241:
                        if (!dVar.E) {
                            dVar.a(i10);
                            dVar.D.h(j10);
                            dVar.E = true;
                            return;
                        }
                        return;
                    case 251:
                        dVar.Q = true;
                        return;
                    case 16871:
                        dVar.b(i10);
                        dVar.f29748u.f29700g = (int) j10;
                        return;
                    case 16980:
                        if (j10 != 3) {
                            throw ParserException.a("ContentCompAlgo " + j10 + " not supported", null);
                        }
                        return;
                    case 17029:
                        if (j10 < 1 || j10 > 2) {
                            throw ParserException.a("DocTypeReadVersion " + j10 + " not supported", null);
                        }
                        return;
                    case 17143:
                        if (j10 != 1) {
                            throw ParserException.a("EBMLReadVersion " + j10 + " not supported", null);
                        }
                        return;
                    case 18401:
                        if (j10 != 5) {
                            throw ParserException.a("ContentEncAlgo " + j10 + " not supported", null);
                        }
                        return;
                    case 18408:
                        if (j10 != 1) {
                            throw ParserException.a("AESSettingsCipherMode " + j10 + " not supported", null);
                        }
                        return;
                    case 21420:
                        dVar.f29751x = j10 + dVar.f29744q;
                        return;
                    case 21432:
                        int i11 = (int) j10;
                        dVar.b(i10);
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 != 3) {
                                    if (i11 == 15) {
                                        dVar.f29748u.f29716w = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f29748u.f29716w = 1;
                                return;
                            }
                            dVar.f29748u.f29716w = 2;
                            return;
                        }
                        dVar.f29748u.f29716w = 0;
                        return;
                    case 21680:
                        dVar.b(i10);
                        dVar.f29748u.f29708o = (int) j10;
                        return;
                    case 21682:
                        dVar.b(i10);
                        dVar.f29748u.f29710q = (int) j10;
                        return;
                    case 21690:
                        dVar.b(i10);
                        dVar.f29748u.f29709p = (int) j10;
                        return;
                    case 21930:
                        dVar.b(i10);
                        o6.c cVar2 = dVar.f29748u;
                        if (j10 == 1) {
                            z10 = true;
                        }
                        cVar2.U = z10;
                        return;
                    case 21998:
                        dVar.b(i10);
                        dVar.f29748u.f29699f = (int) j10;
                        return;
                    case 22186:
                        dVar.b(i10);
                        dVar.f29748u.R = j10;
                        return;
                    case 22203:
                        dVar.b(i10);
                        dVar.f29748u.S = j10;
                        return;
                    case 25188:
                        dVar.b(i10);
                        dVar.f29748u.P = (int) j10;
                        return;
                    case 30114:
                        dVar.R = j10;
                        return;
                    case 30321:
                        dVar.b(i10);
                        int i12 = (int) j10;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 == 3) {
                                        dVar.f29748u.f29711r = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f29748u.f29711r = 2;
                                return;
                            }
                            dVar.f29748u.f29711r = 1;
                            return;
                        }
                        dVar.f29748u.f29711r = 0;
                        return;
                    case 2352003:
                        dVar.b(i10);
                        dVar.f29748u.f29698e = (int) j10;
                        return;
                    case 2807729:
                        dVar.f29745r = j10;
                        return;
                    default:
                        switch (i10) {
                            case 21945:
                                dVar.b(i10);
                                int i13 = (int) j10;
                                if (i13 != 1) {
                                    if (i13 == 2) {
                                        dVar.f29748u.A = 1;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f29748u.A = 2;
                                return;
                            case 21946:
                                dVar.b(i10);
                                int c10 = b5.n.c((int) j10);
                                if (c10 != -1) {
                                    dVar.f29748u.f29719z = c10;
                                    return;
                                }
                                return;
                            case 21947:
                                dVar.b(i10);
                                dVar.f29748u.f29717x = true;
                                int b10 = b5.n.b((int) j10);
                                if (b10 != -1) {
                                    dVar.f29748u.f29718y = b10;
                                    return;
                                }
                                return;
                            case 21948:
                                dVar.b(i10);
                                dVar.f29748u.B = (int) j10;
                                return;
                            case 21949:
                                dVar.b(i10);
                                dVar.f29748u.C = (int) j10;
                                return;
                            default:
                                return;
                        }
                }
            }
            if (j10 != 1) {
                throw ParserException.a("ContentEncodingScope " + j10 + " not supported", null);
            }
            return;
        }
        if (j10 == 0) {
            return;
        }
        throw ParserException.a("ContentEncodingOrder " + j10 + " not supported", null);
    }

    @Override // l.m
    public final boolean v(o oVar, MenuItem menuItem) {
        Object obj = this.f35633b;
        if (((Toolbar) obj).f1120i0 != null && ((Toolbar) obj).f1120i0.v(oVar, menuItem)) {
            return true;
        }
        return false;
    }

    public final File w() {
        b8.f fVar = (b8.f) this.f35633b;
        fVar.getClass();
        File file = new File(fVar.f4092a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // u3.k
    public final int x(Object obj) {
        return ((t3.g) obj).f35304b;
    }

    @Override // ek.a
    public final yj.k y(AssetManager assetManager, String str) {
        return new yj.k(assetManager, str, 1);
    }

    @Override // u3.k
    public final boolean z(Object obj) {
        return ((t3.g) obj).f35305c;
    }

    public c(InputStream inputStream, h hVar) {
        this.f35632a = 25;
        v vVar = new v(inputStream, hVar);
        this.f35633b = vVar;
        vVar.mark(5242880);
    }

    public c(int i10) {
        this.f35632a = i10;
        if (i10 != 20) {
            this.f35633b = new ArrayList(32);
        } else {
            this.f35633b = new CopyOnWriteArrayList();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(b5.g gVar, int i10) {
        this(gVar);
        this.f35632a = 17;
    }

    public c(b5.g gVar) {
        this.f35632a = 17;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(gVar.f3298a).setFlags(gVar.f3299b).setUsage(gVar.f3300c);
        int i10 = e5.x.f15050a;
        if (i10 >= 29) {
            b5.c.a(usage, gVar.f3301d);
        }
        if (i10 >= 32) {
            b5.e.a(usage, gVar.f3302e);
        }
        this.f35633b = usage.build();
    }

    public c(y8.n nVar) {
        this.f35632a = 24;
        this.f35633b = p0.m(nVar.f41405a);
    }

    public c(Window window, View view) {
        this.f35632a = 14;
        new hr.c(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f35633b = new h3(window);
        } else if (i10 >= 26) {
            this.f35633b = new e3(window);
        } else {
            this.f35633b = new e3(window);
        }
    }

    public c(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f35632a = 15;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f35633b = new g4.f(uri, clipDescription, uri2);
        } else {
            this.f35633b = new h.c(8, uri, clipDescription, uri2);
        }
    }

    public c(Context context, Uri uri) {
        this.f35632a = 11;
        this.f35633b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public c(ContentInfo contentInfo) {
        this.f35632a = 12;
        contentInfo.getClass();
        this.f35633b = a4.c.g(contentInfo);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(n5.g gVar) {
        this(gVar, 19);
        this.f35632a = 19;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(l5.h hVar) {
        this(hVar, 18);
        this.f35632a = 18;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(o6.d dVar) {
        this(dVar, 21);
        this.f35632a = 21;
    }
}
