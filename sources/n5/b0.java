package n5;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28246a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f28247b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f28248c;

    /* renamed from: d, reason: collision with root package name */
    public Object f28249d;

    /* renamed from: e, reason: collision with root package name */
    public Object f28250e;

    public b0() {
        this.f28246a = 2;
        this.f28248c = new float[16];
        this.f28249d = new float[16];
        this.f28250e = new e.j();
    }

    public static void d(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        float f12 = fArr2[10];
        fArr[0] = f12 / sqrt;
        float f13 = fArr2[8];
        fArr[2] = f13 / sqrt;
        fArr[8] = (-f13) / sqrt;
        fArr[10] = f12 / sqrt;
    }

    public static byte[] g(g5.e eVar, String str, byte[] bArr, Map map) {
        Map map2;
        List list;
        g5.t tVar = new g5.t(eVar.a());
        Collections.emptyMap();
        Uri parse = Uri.parse(str);
        yk.j.J0(parse, "The uri must be set.");
        g5.i iVar = new g5.i(parse, 0L, 2, bArr, map, 0L, -1L, null, 1, null);
        int i10 = 0;
        while (true) {
            try {
                g5.g gVar = new g5.g(tVar, iVar);
                try {
                    int i11 = e5.x.f15050a;
                    byte[] bArr2 = new byte[4096];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int read = gVar.read(bArr2);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        gVar.close();
                    } catch (IOException unused) {
                    }
                    return byteArray;
                } catch (HttpDataSource$InvalidResponseCodeException e10) {
                    int i12 = e10.f2058d;
                    String str2 = null;
                    if ((i12 == 307 || i12 == 308) && i10 < 5 && (map2 = e10.f2059e) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                        str2 = (String) list.get(0);
                    }
                    if (str2 != null) {
                        i10++;
                        g5.h a10 = iVar.a();
                        a10.f16558a = Uri.parse(str2);
                        iVar = a10.a();
                        try {
                            gVar.close();
                        } catch (IOException unused2) {
                        }
                    } else {
                        throw e10;
                    }
                } finally {
                    int i13 = e5.x.f15050a;
                    try {
                        gVar.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (Exception e11) {
                tVar.f16627c.getClass();
                tVar.f16625a.h();
                throw new IOException(e11);
            }
        }
    }

    public final void a() {
        switch (this.f28246a) {
            case 3:
                c(false);
                return;
            default:
                vj.e.a((vj.e) this.f28250e, this, false);
                return;
        }
    }

    public final boolean b(b5.g gVar, b5.v vVar) {
        boolean canBeSpatialized;
        boolean equals = "audio/eac3-joc".equals(vVar.f3652l);
        int i10 = vVar.f3665y;
        if (equals && i10 == 16) {
            i10 = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(e5.x.n(i10));
        int i11 = vVar.f3666z;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        canBeSpatialized = ((Spatializer) this.f28248c).canBeSpatialized((AudioAttributes) gVar.a().f35633b, channelMask.build());
        return canBeSpatialized;
    }

    public final void c(boolean z10) {
        Object obj = this.f28250e;
        q8.h hVar = (q8.h) obj;
        q8.h hVar2 = (q8.h) obj;
        synchronized (hVar) {
            try {
                if (!this.f28247b) {
                    if (Intrinsics.a(((q8.d) this.f28248c).f31836g, this)) {
                        q8.h.a(hVar2, this, z10);
                    }
                    this.f28247b = true;
                    Unit unit = Unit.f23355a;
                } else {
                    throw new IllegalStateException("editor is closed".toString());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(u5.p pVar, Looper looper) {
        if (((Spatializer$OnSpatializerStateChangedListener) this.f28250e) == null && ((Handler) this.f28249d) == null) {
            this.f28250e = new u5.k(pVar);
            Handler handler = new Handler(looper);
            this.f28249d = handler;
            ((Spatializer) this.f28248c).addOnSpatializerStateChangedListener(new k5.b0(handler, 1), (Spatializer$OnSpatializerStateChangedListener) this.f28250e);
        }
    }

    public final byte[] f(UUID uuid, u uVar) {
        String str;
        String str2 = uVar.f28320b;
        if (this.f28247b || TextUtils.isEmpty(str2)) {
            str2 = (String) this.f28249d;
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = b5.l.f3403e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (b5.l.f3401c.equals(uuid)) {
                str = "application/json";
            } else {
                str = "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (((Map) this.f28250e)) {
                hashMap.putAll((Map) this.f28250e);
            }
            return g((g5.e) this.f28248c, str2, uVar.f28319a, hashMap);
        }
        Map emptyMap = Collections.emptyMap();
        Uri uri = Uri.EMPTY;
        yk.j.J0(uri, "The uri must be set.");
        new g5.i(uri, 0L, 1, null, emptyMap, 0L, -1L, null, 0, null);
        throw new IOException(new IllegalStateException("No license URL"));
    }

    public final byte[] h(v vVar) {
        return g((g5.e) this.f28248c, vVar.f28322b + "&signedRequest=" + e5.x.m(vVar.f28321a), null, Collections.emptyMap());
    }

    public final bv.b0 i(int i10) {
        bv.b0 b0Var;
        q8.h hVar = (q8.h) this.f28250e;
        synchronized (hVar) {
            if (!this.f28247b) {
                ((boolean[]) this.f28249d)[i10] = true;
                Object obj = ((q8.d) this.f28248c).f31833d.get(i10);
                q8.f fVar = hVar.f31860p;
                bv.b0 file = (bv.b0) obj;
                if (!fVar.f(file)) {
                    Intrinsics.checkNotNullParameter(file, "file");
                    d9.e.a(fVar.k(file));
                }
                b0Var = (bv.b0) obj;
            } else {
                throw new IllegalStateException("editor is closed".toString());
            }
        }
        return b0Var;
    }

    public final File j() {
        File file;
        synchronized (((vj.e) this.f28250e)) {
            try {
                Object obj = this.f28248c;
                if (((vj.c) obj).f38114f == this) {
                    if (!((vj.c) obj).f38113e) {
                        ((boolean[]) this.f28249d)[0] = true;
                    }
                    file = ((vj.c) obj).f38112d[0];
                    if (!((vj.e) this.f28250e).f38122a.exists()) {
                        ((vj.e) this.f28250e).f38122a.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return file;
    }

    public b0(String str, boolean z10, g5.l lVar) {
        this.f28246a = 0;
        yk.j.E0((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f28248c = lVar;
        this.f28249d = str;
        this.f28247b = z10;
        this.f28250e = new HashMap();
    }

    public b0(q8.h hVar, q8.d dVar) {
        this.f28246a = 3;
        this.f28250e = hVar;
        this.f28248c = dVar;
        hVar.getClass();
        this.f28249d = new boolean[2];
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(vj.e eVar, vj.c cVar, int i10) {
        this(eVar, cVar);
        this.f28246a = 4;
    }

    public b0(vj.e eVar, vj.c cVar) {
        this.f28246a = 4;
        this.f28250e = eVar;
        this.f28248c = cVar;
        this.f28249d = cVar.f38113e ? null : new boolean[eVar.f38128g];
    }

    public b0(Spatializer spatializer) {
        int immersiveAudioLevel;
        this.f28246a = 1;
        this.f28248c = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        this.f28247b = immersiveAudioLevel != 0;
    }
}
