package iq;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import d7.i0;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class f implements fq.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f20483f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final fq.c f20484g;

    /* renamed from: h, reason: collision with root package name */
    public static final fq.c f20485h;

    /* renamed from: i, reason: collision with root package name */
    public static final hq.a f20486i;

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f20487a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f20488b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f20489c;

    /* renamed from: d, reason: collision with root package name */
    public final fq.d f20490d;

    /* renamed from: e, reason: collision with root package name */
    public final h f20491e = new h(this);

    static {
        i0 a10 = fq.c.a("key");
        eb.f q10 = eb.f.q();
        q10.f15308a = 1;
        f20484g = da.e.j(q10, a10);
        i0 a11 = fq.c.a(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        eb.f q11 = eb.f.q();
        q11.f15308a = 2;
        f20485h = da.e.j(q11, a11);
        f20486i = new hq.a(1);
    }

    public f(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, fq.d dVar) {
        this.f20487a = byteArrayOutputStream;
        this.f20488b = map;
        this.f20489c = map2;
        this.f20490d = dVar;
    }

    public static int i(fq.c cVar) {
        e eVar = (e) ((Annotation) cVar.f16206b.get(e.class));
        if (eVar != null) {
            return ((a) eVar).tag();
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override // fq.e
    public final fq.e a(fq.c cVar, boolean z10) {
        e(cVar, z10 ? 1 : 0, true);
        return this;
    }

    @Override // fq.e
    public final fq.e b(fq.c cVar, long j10) {
        f(cVar, j10, true);
        return this;
    }

    @Override // fq.e
    public final fq.e c(fq.c cVar, int i10) {
        e(cVar, i10, true);
        return this;
    }

    @Override // fq.e
    public final fq.e d(fq.c cVar, Object obj) {
        g(cVar, obj, true);
        return this;
    }

    public final void e(fq.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.f16206b.get(e.class));
        if (eVar != null) {
            a aVar = (a) eVar;
            int ordinal = aVar.intEncoding().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        j((aVar.tag() << 3) | 5);
                        this.f20487a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i10).array());
                        return;
                    }
                    return;
                }
                j(aVar.tag() << 3);
                j((i10 << 1) ^ (i10 >> 31));
                return;
            }
            j(aVar.tag() << 3);
            j(i10);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void f(fq.c cVar, long j10, boolean z10) {
        if (z10 && j10 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.f16206b.get(e.class));
        if (eVar != null) {
            a aVar = (a) eVar;
            int ordinal = aVar.intEncoding().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        j((aVar.tag() << 3) | 1);
                        this.f20487a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j10).array());
                        return;
                    }
                    return;
                }
                j(aVar.tag() << 3);
                k((j10 >> 63) ^ (j10 << 1));
                return;
            }
            j(aVar.tag() << 3);
            k(j10);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void g(fq.c cVar, Object obj, boolean z10) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return;
            }
            j((i(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f20483f);
            j(bytes.length);
            this.f20487a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                g(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                h(f20486i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (!z10 || doubleValue != 0.0d) {
                j((i(cVar) << 3) | 1);
                this.f20487a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
                return;
            }
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (!z10 || floatValue != s0.g.f34069a) {
                j((i(cVar) << 3) | 5);
                this.f20487a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                return;
            }
            return;
        }
        if (obj instanceof Number) {
            f(cVar, ((Number) obj).longValue(), z10);
            return;
        }
        if (obj instanceof Boolean) {
            e(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return;
            }
            j((i(cVar) << 3) | 2);
            j(bArr.length);
            this.f20487a.write(bArr);
            return;
        }
        fq.d dVar = (fq.d) this.f20488b.get(obj.getClass());
        if (dVar != null) {
            h(dVar, cVar, obj, z10);
            return;
        }
        fq.f fVar = (fq.f) this.f20489c.get(obj.getClass());
        if (fVar != null) {
            h hVar = this.f20491e;
            hVar.f20493a = false;
            hVar.f20495c = cVar;
            hVar.f20494b = z10;
            fVar.encode(obj, hVar);
            return;
        }
        if (obj instanceof c) {
            e(cVar, ((c) obj).a(), true);
        } else if (obj instanceof Enum) {
            e(cVar, ((Enum) obj).ordinal(), true);
        } else {
            h(this.f20490d, cVar, obj, z10);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, iq.b] */
    public final void h(fq.d dVar, fq.c cVar, Object obj, boolean z10) {
        ?? outputStream = new OutputStream();
        outputStream.f20480a = 0L;
        try {
            OutputStream outputStream2 = this.f20487a;
            this.f20487a = outputStream;
            try {
                dVar.encode(obj, this);
                this.f20487a = outputStream2;
                long j10 = outputStream.f20480a;
                outputStream.close();
                if (z10 && j10 == 0) {
                    return;
                }
                j((i(cVar) << 3) | 2);
                k(j10);
                dVar.encode(obj, this);
            } catch (Throwable th2) {
                this.f20487a = outputStream2;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                outputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void j(int i10) {
        while ((i10 & (-128)) != 0) {
            this.f20487a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f20487a.write(i10 & 127);
    }

    public final void k(long j10) {
        while (((-128) & j10) != 0) {
            this.f20487a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f20487a.write(((int) j10) & 127);
    }
}
