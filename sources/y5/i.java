package y5;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil$GlException;
import b5.v;
import e5.p;
import e5.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import n5.b0;
import x5.m;

/* loaded from: classes.dex */
public final class i implements m, a {

    /* renamed from: i, reason: collision with root package name */
    public int f41191i;

    /* renamed from: j, reason: collision with root package name */
    public SurfaceTexture f41192j;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f41195m;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f41183a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f41184b = new AtomicBoolean(true);

    /* renamed from: c, reason: collision with root package name */
    public final g f41185c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final b0 f41186d = new b0();

    /* renamed from: e, reason: collision with root package name */
    public final e.j f41187e = new e.j();

    /* renamed from: f, reason: collision with root package name */
    public final e.j f41188f = new e.j();

    /* renamed from: g, reason: collision with root package name */
    public final float[] f41189g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    public final float[] f41190h = new float[16];

    /* renamed from: k, reason: collision with root package name */
    public volatile int f41193k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f41194l = -1;

    @Override // y5.a
    public final void a(long j10, float[] fArr) {
        ((e.j) this.f41186d.f28250e).a(j10, fArr);
    }

    @Override // y5.a
    public final void b() {
        this.f41187e.b();
        b0 b0Var = this.f41186d;
        ((e.j) b0Var.f28250e).b();
        b0Var.f28247b = false;
        this.f41184b.set(true);
    }

    public final SurfaceTexture c() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            e5.a.f();
            this.f41185c.a();
            e5.a.f();
            e5.a.g("No current context", !x.a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT));
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            e5.a.f();
            int i10 = iArr[0];
            e5.a.b(36197, i10);
            this.f41191i = i10;
        } catch (GlUtil$GlException e10) {
            e5.m.d("SceneRenderer", "Failed to initialize the renderer", e10);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f41191i);
        this.f41192j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: y5.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                i.this.f41183a.set(true);
            }
        });
        return this.f41192j;
    }

    @Override // x5.m
    public final void d(long j10, long j11, v vVar, MediaFormat mediaFormat) {
        float f10;
        int i10;
        float[] fArr;
        int i11;
        ArrayList arrayList;
        int g10;
        this.f41187e.a(j11, Long.valueOf(j10));
        byte[] bArr = vVar.f3662v;
        int i12 = vVar.f3663w;
        byte[] bArr2 = this.f41195m;
        int i13 = this.f41194l;
        this.f41195m = bArr;
        if (i12 == -1) {
            i12 = this.f41193k;
        }
        this.f41194l = i12;
        if (i13 != i12 || !Arrays.equals(bArr2, this.f41195m)) {
            byte[] bArr3 = this.f41195m;
            f fVar = null;
            if (bArr3 != null) {
                int i14 = this.f41194l;
                p pVar = new p(bArr3);
                try {
                    pVar.G(4);
                    g10 = pVar.g();
                    pVar.F(0);
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
                if (g10 == 1886547818) {
                    pVar.G(8);
                    int i15 = pVar.f15037b;
                    int i16 = pVar.f15038c;
                    while (i15 < i16) {
                        int g11 = pVar.g() + i15;
                        if (g11 <= i15 || g11 > i16) {
                            break;
                        }
                        int g12 = pVar.g();
                        if (g12 != 2037673328 && g12 != 1836279920) {
                            pVar.F(g11);
                            i15 = g11;
                        }
                        pVar.E(g11);
                        arrayList = vl.b.Z(pVar);
                        break;
                    }
                    arrayList = null;
                } else {
                    arrayList = vl.b.Z(pVar);
                }
                if (arrayList != null) {
                    int size = arrayList.size();
                    if (size != 1) {
                        if (size == 2) {
                            fVar = new f((e) arrayList.get(0), (e) arrayList.get(1), i14);
                        }
                    } else {
                        e eVar = (e) arrayList.get(0);
                        fVar = new f(eVar, eVar, i14);
                    }
                }
            }
            if (fVar == null || !g.b(fVar)) {
                int i17 = this.f41194l;
                float radians = (float) Math.toRadians(180.0f);
                float radians2 = (float) Math.toRadians(360.0f);
                float f11 = radians / 36;
                float f12 = radians2 / 72;
                float[] fArr2 = new float[15984];
                float[] fArr3 = new float[10656];
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                for (int i21 = 36; i18 < i21; i21 = 36) {
                    float f13 = radians / 2.0f;
                    float f14 = (i18 * f11) - f13;
                    int i22 = i18 + 1;
                    float f15 = (i22 * f11) - f13;
                    int i23 = 0;
                    while (i23 < 73) {
                        float f16 = f15;
                        int i24 = i22;
                        float f17 = f14;
                        int i25 = i19;
                        int i26 = i20;
                        int i27 = 2;
                        int i28 = 0;
                        while (i28 < i27) {
                            if (i28 == 0) {
                                f10 = f17;
                            } else {
                                f10 = f16;
                            }
                            float f18 = i23 * f12;
                            float f19 = f12;
                            int i29 = i23;
                            double d10 = 50.0f;
                            int i30 = i17;
                            double d11 = (3.1415927f + f18) - (radians2 / 2.0f);
                            float f20 = radians;
                            double d12 = f10;
                            int i31 = i28;
                            float f21 = f11;
                            fArr2[i25] = -((float) (Math.cos(d12) * Math.sin(d11) * d10));
                            float[] fArr4 = fArr3;
                            int i32 = i18;
                            fArr2[i25 + 1] = (float) (Math.sin(d12) * d10);
                            int i33 = i25 + 3;
                            fArr2[i25 + 2] = (float) (Math.cos(d12) * Math.cos(d11) * d10);
                            fArr4[i26] = f18 / radians2;
                            int i34 = i26 + 2;
                            fArr4[i26 + 1] = ((i32 + i31) * f21) / f20;
                            if (i29 != 0 || i31 != 0) {
                                i10 = i29;
                                if (i10 == 72) {
                                    i11 = i31;
                                    if (i11 != 1) {
                                        fArr = fArr4;
                                    }
                                } else {
                                    fArr = fArr4;
                                    i11 = i31;
                                }
                                i27 = 2;
                                i26 = i34;
                                i25 = i33;
                                int i35 = i11 + 1;
                                i23 = i10;
                                fArr3 = fArr;
                                f12 = f19;
                                i17 = i30;
                                radians = f20;
                                i18 = i32;
                                f11 = f21;
                                i28 = i35;
                            } else {
                                i11 = i31;
                                i10 = i29;
                            }
                            System.arraycopy(fArr2, i25, fArr2, i33, 3);
                            i25 += 6;
                            fArr = fArr4;
                            i27 = 2;
                            System.arraycopy(fArr, i26, fArr, i34, 2);
                            i26 += 4;
                            int i352 = i11 + 1;
                            i23 = i10;
                            fArr3 = fArr;
                            f12 = f19;
                            i17 = i30;
                            radians = f20;
                            i18 = i32;
                            f11 = f21;
                            i28 = i352;
                        }
                        i23++;
                        i19 = i25;
                        i20 = i26;
                        f15 = f16;
                        i22 = i24;
                        f14 = f17;
                        i17 = i17;
                    }
                    i18 = i22;
                }
                e eVar2 = new e(new e.j(0, 1, fArr2, fArr3));
                fVar = new f(eVar2, eVar2, i17);
            }
            this.f41188f.a(j11, fVar);
        }
    }
}
